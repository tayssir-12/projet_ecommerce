package com.tekup.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tekup.ecommerce.model.Commentaire;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire,Long>{
}

