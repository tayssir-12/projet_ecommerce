package com.tekup.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tekup.ecommerce.model.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture,Long>{
}
