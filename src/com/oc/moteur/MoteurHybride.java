package com.oc.moteur;

public class MoteurHybride extends Moteur{

		
	//Constructeur avec parameteres
	public MoteurHybride(String cylindre, Double prix) {
	 super(cylindre, prix);
	}
	
	public TypeMoteur getTypeMoteur(){
		return TypeMoteur.HYBRIDE;
	}


}
