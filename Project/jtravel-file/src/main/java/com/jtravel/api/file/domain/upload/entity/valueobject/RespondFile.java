package com.jtravel.api.file.domain.upload.entity.valueobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ThinkPad
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespondFile {

    /**
     * //判断是否有误
     */
    private Integer error=0;
    /**
     * //图片存储地址
     */
    private String url;
    /**
     * //图片宽度
     */
    private Integer width;

    /**
     * //图片高度
     */
    private Integer height;

    /**
     * //为了简化操作,可以提供静态方法
     * @return
     */
    public static RespondFile file() {
        return new RespondFile(1, null, null, null);
    }
}
