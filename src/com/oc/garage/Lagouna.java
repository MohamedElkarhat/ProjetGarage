package com.oc.garage;

import java.util.List;

import com.oc.moteur.Moteur;
import com.oc.option.Option;
import com.oc.garage.Marque;

public class Lagouna extends Vehicule{

	public Lagouna() {
		
	}
	
    public Marque getMarque(){
    	return Marque.RENO;
    }
	public String getNom(){
		return "Lagouna";
	}
	
	public Double getPrix(){
		return 15698d;
	}

}