package com.oc.garage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



import com.oc.moteur.Moteur;
import com.oc.option.Option;

public class Garage implements Serializable {
	
	
	
  List<Vehicule> voiture = new ArrayList<Vehicule>() ;
  ObjectOutput oos;
  ObjectInputStream ois;
  

  
  
  public Garage(){
	  
	  System.out.println("*************************************************");
		System.out.println(" *  Garage OpenClassrooms *");
		System.out.println("*************************************************");
    }


public void addVoiture(Vehicule voit){
	
	if(! voiture.contains(voit) && ! voiture.equals(voit)){
	
		voiture.add(voit);
	}		
	System.out.println(" Nom de Voiture " + voit.getNom()+ " Marque " +voit.getMarque()+ " prix  " +"("+ voit.getPrix()+" €)" +" Type Moteur  " +"("+ voit.moteur.getTypeMoteur()+")" + "  Cylindre  "+ "("+voit.moteur.getCylindre()+")"+"   Prix " +"("+ voit.moteur.getPrix() +" €)");
		 
	 // Ecriture des voitures
	 try{
		 
		 oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("garage.txt"))));
			
		
	       oos.writeObject(voiture);
	   	 oos.close();
	// Lecture des voitures	     
		  ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("garage.txt"))));
	        
	      try {
	    	 Object obj = ois.readObject();
			voiture = (List<Vehicule>) obj;
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
	 }catch(IOException e){
		 e.printStackTrace();
	 }
	 
	 finally {
		 try {
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }		
	 
}

public String toString() {
	 
	String str= " ";
	
		for(Vehicule v : voiture){
			if(!voiture.equals(v)){
			  str +=  v;
			}
					
		}
	return "Garage : " +str ;
	
  }

}
