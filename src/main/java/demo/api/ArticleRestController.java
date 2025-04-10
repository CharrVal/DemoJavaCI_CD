package demo.api;

import demo.entity.Article;
import demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleRestController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/articles")
    public List<Article> getAll() {
        List<Article> articles = articleService.getAll();
        return articles;
    }
}
