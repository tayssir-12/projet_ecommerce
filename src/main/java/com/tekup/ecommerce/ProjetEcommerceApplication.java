package com.tekup.ecommerce;

import com.tekup.ecommerce.dao.CategoryRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.tekup.ecommerce.dao.ArticleRepository;
import com.tekup.ecommerce.model.Article;
import com.tekup.ecommerce.model.Category;

import java.util.Random;

@SpringBootApplication
public class ProjetEcommerceApplication {

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;


    public static void main(String[] args) {
        SpringApplication.run(ProjetEcommerceApplication.class, args);


    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            // exposé id
            repositoryRestConfiguration.exposeIdsFor(Article.class, Category.class);
            // save a couple of customers
            categoryRepository.save(new Category("Computers"));
            categoryRepository.save(new Category("Printers"));
            categoryRepository.save(new Category("Smart phones"));
            System.out.println(categoryRepository.findAll());

            Random rnd = new Random();
            categoryRepository.findAll().forEach(c -> {
                for (int i = 0; i < 10; i++) {
                    Article a = new Article();
                    a.setLibelle(RandomString.make(8));
                    a.setDescription(RandomString.make(18));
                    a.setDisponible(rnd.nextBoolean());
                    a.setPrix(100+rnd.nextInt(10000));
                    a.setCategorie(c);
                    a.setImage("https://picsum.photos/200/300?random="+rnd.nextInt(20));
                    articleRepository.save(a);
                }
            });
        };
    }
}
