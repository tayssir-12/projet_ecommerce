package com.tekup.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.ecommerce.model.Utilisateur;
import com.tekup.ecommerce.service.AccountServiceImpl;

@RestController
@CrossOrigin("*")
public class AccountController {

	@Autowired
	AccountServiceImpl accountServiceImpl;
	
	
//	http://localhost:8088/login
	 @PostMapping("/login")
	  Utilisateur login(@RequestBody LoginForm loginForm) {
		
		 System.out.println(loginForm);
	    return  accountServiceImpl.signIn(loginForm.getMail(), loginForm.getMdp());
	  }
	 
	 @PostMapping("/newUser")
	  Utilisateur enregister(@RequestBody Utilisateur utilisateur) {
		
	    return  accountServiceImpl.signUp(utilisateur);
	  }
	 
	 //oBject for RequestBody loginMethode


}

