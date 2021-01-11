package com.tekup.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.tekup.ecommerce.dao.ArticleRepository;
import com.tekup.ecommerce.model.Article;
import com.tekup.ecommerce.model.Category;

@SpringBootApplication
public class ProjetEcommerceApplication {

	@Autowired
	ArticleRepository articleRepository;
	
	@Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetEcommerceApplication.class, args);
		
		
	}
	@Bean
	   public CommandLineRunner demo() {
	      return (args) -> {
	    	  // exposé id 
	          repositoryRestConfiguration.exposeIdsFor(Article.class,Category.class);
	         // save a couple of customers
	    	  Category c =new Category();
	    	  c.setNom("Pc");
	    	  
	    	  
	    	  Article a =new Article();
	    	  a.setLibelle("Assus");
	    	  a.setDescription("16GO Ram");
	    	  a.setDisponible(true);
	    	  a.setPrix(2500);

	    	  
	    	  Article a2 =new Article();
	    	  a2.setLibelle("HP");
	    	  a2.setDescription("16GO Ram");
	    	  a2.setDisponible(true);
	    	  a2.setPrix(3500);
	    	  a2.setCategorie(c);
	    	 
	    	
	    	  
	    	  articleRepository.save(a);
	    	  articleRepository.save(a2);
	    	  
	    	  
	    	  
	      };
	 

	}}
