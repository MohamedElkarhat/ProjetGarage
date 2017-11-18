package com.oc.moteur;

public class MoteurDiesel extends Moteur{
	

	//Constructeur avec parameteres
	public MoteurDiesel(String cylindre, Double prix){
		super(cylindre,prix);
		
	}
	
		
	public TypeMoteur getTypeMoteur(){
		return TypeMoteur.DIESEL;
	}
	
	
	}
	
	

