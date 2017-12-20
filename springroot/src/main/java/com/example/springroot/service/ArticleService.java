package com.example.springroot.service;

import com.example.springroot.domain.Article;
import com.example.springroot.repository.ArticleReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleReposity articleReposity;

    public Article getArticle(Integer articleId){
        Article article=articleReposity.findOne(articleId);

        return article;
    }

}
