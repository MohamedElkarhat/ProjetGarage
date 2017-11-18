package com.oc.moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable{

	protected TypeMoteur type;
	protected String cylindre;
	protected Double prix;
	
	
	public Moteur(){}
	
	
	public Moteur(String cylindre, Double prix){
		this.cylindre= cylindre;
		this.prix = prix;
		
	
	}
	
	public void setMoteur(String cylindre, Double prix){
		
		this.cylindre = cylindre;
		this.prix = prix;
		
	}
	
	
	
	public String getCylindre(){
		return cylindre;
	}
	
	public Double getPrix(){
		return prix;
	}
	
	public TypeMoteur getTypeMoteur(){
		return type;
		}
	
	
	
	
public String toString() {
		
		String str = "Type Moteur : " + getTypeMoteur() +"  Cylindre : "+ getCylindre() +" Prix:"+ getPrix(); 
		
		return str;
	
	

	
}
	
	
	
	
	
	
	
	
	
	
	
}