package com.tekup.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.ecommerce.dao.UtilisateurRepository;
import com.tekup.ecommerce.model.Utilisateur;

@Service
public class AccountServiceImpl implements IAcountService {

	@Autowired
	UtilisateurRepository utilisateurRepo;
	
	@Override
	public Utilisateur signIn(String mail, String pwd) {

		// TODO Auto-generated method stub
		
		//verifier si le mail et pwd existe ou non 
		Utilisateur u = utilisateurRepo.findByMailAndMdp(mail, pwd);
		
		return u;
	}

	@Override
	public Utilisateur signUp(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
//		verifier si l'email exist 
		Utilisateur u = utilisateurRepo.findByMail(utilisateur.getMail());
		
		if (u == null)
		return utilisateurRepo.save(utilisateur);
		return null ;
	}

}
