package com.oc.garage;


import java.util.List;

import com.oc.moteur.Moteur;
import com.oc.moteur.MoteurDiesel;
import com.oc.moteur.MoteurElectrique;
import com.oc.moteur.MoteurEssence;
import com.oc.moteur.MoteurHybride;
import com.oc.option.BarreDeToit;
import com.oc.option.Climatisation;
import com.oc.option.Gps;
import com.oc.option.Option;
import com.oc.option.SiegeChauffant;
import com.oc.option.VitreElectrique;

public class MainClient {

	public static void main(String[] args) {
		
		
		
		Garage garage = new Garage();
		
		
		System.out.println(garage);
		
       Vehicule lag1 = new Lagouna();
       lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
       lag1.addOption(new Gps());
       lag1.addOption(new SiegeChauffant());
       lag1.addOption(new VitreElectrique());
       garage.addVoiture(lag1);
       
		
		
		Vehicule A300B_2 = new A300B();
		A300B_2.setMoteur(new MoteurElectrique("1500 w", 1234d));
		A300B_2.addOption(new Climatisation());
		A300B_2.addOption(new BarreDeToit());
		A300B_2.addOption(new SiegeChauffant());
		garage.addVoiture(A300B_2);
	
	    
	   Vehicule d4_1 = new D4();
	   d4_1 .setMoteur(new MoteurDiesel("200 Hdi ", 456987d));
	   d4_1.addOption(new BarreDeToit());
	   d4_1.addOption(new Climatisation());
	   d4_1.addOption(new Gps());
	   garage.addVoiture(d4_1);
	 
	   Vehicule lag2 = new Lagouna();
       lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
	    garage.addVoiture(lag2);
	    
	    
	    Vehicule A300B_1 = new A300B();
	    A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));        
	   	A300B_1.addOption(new VitreElectrique());
	   	A300B_1.addOption(new BarreDeToit());
	   	 garage.addVoiture(A300B_1);
	   	 
	   	Vehicule d4_2 = new D4();
	  	 d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
	  	 d4_2.addOption(new SiegeChauffant());
	  	 d4_2.addOption(new BarreDeToit());
	  	 d4_2.addOption(new Climatisation());
	  	 d4_2.addOption(new Gps());
	  	 d4_2.addOption(new VitreElectrique());
	  	 garage.addVoiture(d4_2);  
		
	    
	    
	    
	    
	    
	    
	}
	 
}
