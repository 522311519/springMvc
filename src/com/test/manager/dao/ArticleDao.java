package com.test.manager.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.test.manager.entity.ArticleModel;

@Mapper
public interface ArticleDao {

    List<ArticleModel> getArticle(@Param("articleId") String id);

    int delete(String id);

    int add(ArticleModel entity);

    int update(ArticleModel entity);

}
