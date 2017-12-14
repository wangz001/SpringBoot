package com.example.springroot.controller;

import com.example.springroot.domain.Article;
import com.example.springroot.repository.ArticleReposity;
import com.example.springroot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleReposity articleReposity;
    @GetMapping("/article/{id}")
    public Article GetArticle(@PathVariable("id") Integer id) {
        return articleReposity.findOne(id);
    }
}
