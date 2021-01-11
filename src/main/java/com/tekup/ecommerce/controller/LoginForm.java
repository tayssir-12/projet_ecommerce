package com.tekup.ecommerce.controller;

public class LoginForm {
	private String mail;
	private String mdp;
	public String getMail() {
		return mail;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public LoginForm(){
		
	}
	@Override
	public String toString() {
		return "LoginForm [mail=" + mail + ", mdp=" + mdp + "]";
	}
	
}
