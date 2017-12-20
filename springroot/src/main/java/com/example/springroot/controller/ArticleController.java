package com.example.springroot.controller;

import com.example.springroot.domain.Article;
import com.example.springroot.domain.Result;
import com.example.springroot.repository.ArticleReposity;
import com.example.springroot.service.ArticleService;
import com.example.springroot.urils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    private static final Logger logger= LoggerFactory.getLogger(ArticleController.class);


    @GetMapping("/article/{id}")
    public Result GetArticle(@PathVariable("id") Integer id) {

        Article article= articleService.getArticle(id);
        logger.info("looooog");
        Integer aa=Integer.parseInt("aa");
        return ResultUtil.success(article);
    }


}
