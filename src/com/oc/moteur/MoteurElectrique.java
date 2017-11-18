package com.oc.moteur;

public class MoteurElectrique extends Moteur {

	
	
	//Constructeur avec parameteres
	public MoteurElectrique(String cylindre, Double prix) {
		super(cylindre, prix);
	}

	public TypeMoteur getTypeMoteur(){
		return TypeMoteur.ELECTRIQUE;
	}
	

		
	
}
