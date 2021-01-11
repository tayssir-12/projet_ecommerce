package com.tekup.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tekup.ecommerce.model.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long>{
}
