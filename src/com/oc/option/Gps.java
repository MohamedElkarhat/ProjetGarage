package com.oc.option;

public class Gps implements Option{

	
	
	//Constructeur de d�fault
	public Gps() {
		
	}

			public Double getPrix() {
		
	   return 150.9;
	}
    
    public String toString(){
		
		
		return " Gps";
	}

    public boolean equals(Gps other){
		return this.equals(other.getPrix());
		
	}
}
