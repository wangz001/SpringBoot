package com.example.springroot.repository;

import com.example.springroot.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleReposity extends JpaRepository<Article, Integer> {


}
