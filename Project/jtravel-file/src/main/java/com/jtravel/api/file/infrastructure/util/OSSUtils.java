package com.jtravel.api.file.infrastructure.util;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.CreateBucketRequest;
import com.aliyun.oss.model.PutObjectResult;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ThinkPad
 */
public class OSSUtils {

    static String endpoint = "http://oss-cn-beijing.aliyuncs.com";
    static String accessKeyId  ="LTAI4G4sZrQ1Uyj3X3NHMcgL";
    static String accessKeySecret = "5f6l0TlpTmYkTF4aGgN9lCG9UZLxPU";
    static String bucketName = "xiqing";


    private static OSS ossClient ;
    private  static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    public static String upload(File file){
        ossClient =  new OSSClientBuilder().build(endpoint,accessKeyId,accessKeySecret);
        System.out.println("accessKeyId2:"+accessKeyId);

        if(file == null){
            return null;
        }
        String dateStr = sdf.format(new Date());
        try{
            //容器不存在就创建
            if(!ossClient.doesBucketExist(bucketName)){
                ossClient.createBucket(bucketName);
                CreateBucketRequest cbr = new
                        CreateBucketRequest(bucketName);
                cbr.setCannedACL(
                        CannedAccessControlList.Private
                );
                ossClient.createBucket(cbr);
            }

            //获取文件的原始名字
            String originalfileName = file.getName();
            // 按日期存储
            //String fileAddress = new Date().toString();
            //重新命名文件
            String suffix = originalfileName.substring(originalfileName.lastIndexOf(".") + 1);
            String fileName = new Date().getTime() + "-Excel." + suffix;


            //上传文件
            InputStream is = new FileInputStream(file);
            PutObjectResult result = ossClient.putObject(bucketName,fileName,file);

            // 设置这个文件地址的有效时间
            Date expiration = new Date(new Date().getTime() + 3600l * 1000 * 24 * 365 * 10);
            //返回上传文件下载路径
            String url = ossClient.generatePresignedUrl(bucketName, fileName, expiration).toString();
            //去掉加密信息，因为已经开放了读权限
            System.out.println("object:"+fileName+"存入成功");
            System.out.println("上传路径："+url);
            url = url.substring(0,url.indexOf("?"));
            return url;
        }catch (OSSException oe){
            oe.printStackTrace();
        }catch (Exception ce){
            ce.printStackTrace();
        }finally{
            ossClient.shutdown();
        }
        return null;
    }
}
