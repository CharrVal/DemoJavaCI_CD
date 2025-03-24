package demo.service;

import demo.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class ArticleService {

    public List<Article> getAll() {
        // Récupérer tout les articles et les retourner
        List<Article> articles = new ArrayList<>();
        articles.add(new Article(1L,"Chocolatine"));
        articles.add(new Article(2L,"Beurre Doux"));
        articles.add(new Article(3L,"Beurre Salé"));
        articles.add(new Article(4L,"Pain au chocolat"));
        return articles;
    }
}
