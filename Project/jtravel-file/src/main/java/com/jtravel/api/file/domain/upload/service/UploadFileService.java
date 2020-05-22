package com.jtravel.api.file.domain.upload.service;


import com.jtravel.api.file.domain.upload.entity.valueobject.FileMessage;
import com.jtravel.api.file.domain.upload.entity.valueobject.MultipartFileToFile;
import com.jtravel.api.file.domain.upload.mapper.AuditRechargeDao;
import com.jtravel.api.file.infrastructure.util.ExcelUtils;
import com.jtravel.api.file.infrastructure.util.OSSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author ziy
 */
@Service
public class UploadFileService {

    private AuditRechargeDao auditRechargeDao;

    @Autowired
    public void setAuditRechargeDao(AuditRechargeDao auditRechargeDao) {
        this.auditRechargeDao = auditRechargeDao;
    }


    public FileMessage ExcelFileUpload(MultipartFile uploadFile) {
        try {
            //表单解析
            LinkedHashMap<String,String> stringStringLinkedHashMap = ExcelUtils.excel2json(uploadFile);

            System.out.println(stringStringLinkedHashMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public FileMessage uploadFile(MultipartFile file)
    {
        String url = null;
        try {
            //文件上传
            url = OSSUtils.upload(MultipartFileToFile.multipartFileToFile(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("file_src", url);
        return new FileMessage("success", data);

    }


}
