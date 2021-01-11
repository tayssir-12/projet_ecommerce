package com.tekup.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.ecommerce.model.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long>{
	
	
//	http://localhost:8088/articles/search/findArticlesByLibelle?libelle=Assus
	public Article findArticlesByLibelle(String libelle); 

}
