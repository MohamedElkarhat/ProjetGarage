package com.oc.moteur;

public class MoteurEssence extends Moteur {

	
	
	//Constructeur avec parameteres
	public MoteurEssence(String cylindre, Double prix) {
		super(cylindre, prix);
	}

	public TypeMoteur getTypeMoteur(){
		return TypeMoteur.ESSENCE;
	}
	
	
	
}
