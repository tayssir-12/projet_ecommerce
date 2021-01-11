package com.tekup.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tekup.ecommerce.model.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	
	
	public Utilisateur findByMailAndMdp(String mail, String mdp);
	public Utilisateur findByMail(String mail);
	
}