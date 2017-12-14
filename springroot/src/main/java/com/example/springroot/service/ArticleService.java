package com.example.springroot.service;

import com.example.springroot.domain.Article;
import com.example.springroot.repository.ArticleReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class ArticleService {
    @Autowired
    private ArticleReposity articleReposity;

    public Article getLists(Integer articleId){
        Article article=articleReposity.findOne(articleId);
        return article;
    }

}
