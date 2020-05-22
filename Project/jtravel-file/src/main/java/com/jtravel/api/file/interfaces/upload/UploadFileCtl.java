package com.jtravel.api.file.interfaces.upload;


import com.jtravel.api.file.application.photo.UploadFileAps;
import com.jtravel.api.file.domain.upload.entity.valueobject.FileMessage;
import com.jtravel.api.file.domain.upload.entity.valueobject.RespondFile;
import com.jtravel.api.file.domain.upload.service.UploadFileService;
import com.jtravel.common.model.ResultJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author ziy
 */
@Slf4j
@RestController
@RequestMapping("/v1/file")
@Api(tags = "图片凭证上传")
public class UploadFileCtl {

    private static final Logger logger = LoggerFactory.getLogger(UploadFileCtl.class);

    private UploadFileAps uploadFileAps;
    private UploadFileService uploadFileService;

    @Autowired
    public void setUploadFileCtl(UploadFileAps uploadFileAps,UploadFileService uploadFileService) {
        this.uploadFileAps = uploadFileAps;
        this.uploadFileService = uploadFileService;
    }
    /**
     * 实现凭证图片文件上传
     */
    @PostMapping
    @ApiOperation(value = "凭证图片上传")
    public RespondFile photoFileUpload(@RequestParam("fileImage") MultipartFile uploadFile, @RequestParam("companyId") Integer companyId, @RequestParam("accountId") Integer accountId) {
        return null;
    }



    @PostMapping("excelUpload")
    @ApiOperation(value = "Excel表文件上传")
    public ResultJson<FileMessage> excelFileUpload(@RequestParam("fileExcel") MultipartFile uploadFile) {
        return ResultJson.ok(uploadFileAps.ExcelFileUpload(uploadFile));
    }


    @PostMapping("fileUpload")
    @ApiOperation(value = "文件上传")
    public ResultJson<FileMessage> fileFileUpload(@RequestParam("file") MultipartFile uploadFile) {
        //uploadFileAps.ExcelFileUpload(uploadFile)
        return ResultJson.ok(uploadFileAps.uploadFile(uploadFile));
    }



    @PostMapping("uploadTest")
    @ApiOperation(value = "上传测试")
    public String file(@RequestParam("fileImage") MultipartFile fileImage, @RequestParam("em") String em) throws IllegalStateException, IOException {
        File fileDir = new File("D:/JT-SOFTWARE/images");
        if(!fileDir.exists()) {
            //如果没有目录应该先创建目录
            fileDir.mkdirs();
        }
        //获取图片名称
        String fileName = fileImage.getOriginalFilename();
        String path = "D:/JT-SOFTWARE/images/"+fileName;
        //文件实现上传
        fileImage.transferTo(new File(path));
        return "文件上传成功!!!!";
    }


}
