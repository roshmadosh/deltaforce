package com.roshmadosh.deltaforce.controllers;


import com.roshmadosh.deltaforce.models.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArticleController {

    @GetMapping("/article")
    public List<Article> getArticles() {
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1, "First Article Evar", "This is so great"));
        articles.add(new Article(1, "Second Article Evar", "This is okay"));
        return articles;
    }
}