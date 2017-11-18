package com.oc.garage;

import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

import com.oc.moteur.Moteur;
import com.oc.option.Climatisation;
import com.oc.option.Gps;
import com.oc.option.Option;

abstract class Vehicule implements Serializable {

	 // Declarations des attributs
	protected Double prix;
	protected String nom;
	protected List <Option> options = new ArrayList<>();
	protected Marque nomMarque;
	protected Moteur moteur ;

	
	//Constructeur de défault
	public Vehicule(){
		
	}
	//Constructeur avec paramétres
	public Vehicule(Double prix, String nom, List<Option>options,Marque nomMarque, Moteur moteur){
		
		this.prix = prix;
		this.nom= nom;
		this.options = options;
		this.nomMarque = nomMarque;
		this.moteur= moteur;
	
	}
	
	//Déclaration des methodes 

	public Marque getMarque(){
    	return nomMarque;
    }
    
    public List<Option> getOptions(){
    	
       	return options;
    }
    
    
	public Double getPrix(){
				
		return prix;
	}
	public String getNom(){
		return nom;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	public void addOption(Option opt){
		options.add(opt);
	}

public String toString(){
		
		String str = "\n"+" Nom de Voiture " + getNom()+ " Marque " +getMarque()+ "  Type Moteur  "+
				       moteur.getTypeMoteur().toString() + "  Cylindre " +moteur.getCylindre()+ " Prix "+ moteur.getPrix()+"\n"; 
		for(int i= 0; i<options.size(); i++){
			str+= options.get(i)+ "  " +"("+ options.get(i).getPrix() +" €)";
			
		}
		return str;
	}	
    
}