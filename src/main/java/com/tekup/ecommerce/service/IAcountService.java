package com.tekup.ecommerce.service;

import com.tekup.ecommerce.model.Utilisateur;

public interface IAcountService {

	public Utilisateur signIn(String mail, String pwd);
	
	public Utilisateur signUp (Utilisateur utilisateur);
}
