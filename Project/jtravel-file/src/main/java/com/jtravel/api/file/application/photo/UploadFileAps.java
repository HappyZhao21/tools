package com.jtravel.api.file.application.photo;


import com.jtravel.api.file.domain.upload.entity.valueobject.FileMessage;
import com.jtravel.api.file.domain.upload.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author ziy
 */
@Service
public class UploadFileAps {

    UploadFileService uploadFileService;

    @Autowired
    public void setUploadFileService(UploadFileService uploadFileService) {
        this.uploadFileService = uploadFileService;
    }


    /**
     * 上传Excel文件
     * @param uploadFile
     * @return
     */
    public FileMessage ExcelFileUpload(MultipartFile uploadFile) {
        return uploadFileService.ExcelFileUpload(uploadFile);
    }

    /**
     * 文件上传
     * @param uploadFile
     * @return
     */
    public FileMessage uploadFile(MultipartFile uploadFile) {
        return uploadFileService.uploadFile(uploadFile);
    }
}
