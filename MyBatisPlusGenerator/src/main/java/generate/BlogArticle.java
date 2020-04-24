package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * blog_article
 * @author 
 */
@Data
public class BlogArticle implements Serializable {
    private Long id;

    /**
     * 发表文章的用户id
     */
    private Long userid;

    /**
     * 文章详情页链接
     */
    private String url;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章描述
     */
    private String description;

    /**
     * 文章的预览图片
     */
    private String image;

    /**
     * 文章内容
     */
    private String content;

    /**
     *  Markdown格式的文章内容
     */
    private String contentMd;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 发表时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 文章是否置顶  0：否  1：是
     */
    private Byte isTop;

    /**
     * 是否开启评论 0：关闭 1：开启
     */
    private Byte isComment;

    /**
     * 是否为原创文章 0：转载 1：原创
     */
    private Byte isOriginal;

    /**
     * 原文链接，转载文章才需填写
     */
    private String sourceUrl;

    /**
     * 访问量
     */
    private Integer visits;

    /**
     * 状态 0：草稿 1：已发布 2：回收站 3：自定义文章
     */
    private Byte status;

    private static final long serialVersionUID = 1L;
}