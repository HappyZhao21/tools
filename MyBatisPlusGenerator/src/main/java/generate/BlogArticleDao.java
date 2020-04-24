package generate;

import generate.BlogArticle;

public interface BlogArticleDao {
    int deleteByPrimaryKey(Long id);

    int insert(BlogArticle record);

    int insertSelective(BlogArticle record);

    BlogArticle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BlogArticle record);

    int updateByPrimaryKey(BlogArticle record);
}