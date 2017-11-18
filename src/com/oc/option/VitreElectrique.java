package com.oc.option;

public class VitreElectrique implements Option {

	
	
	public VitreElectrique() {
		
		
	}

	@Override
	public Double getPrix() {
		
		return 600.9;
	}

	   public String toString(){
			
			
			return " Vitre Electrique";
		}
	   public boolean equals(VitreElectrique other){
			return this.equals(other.getPrix());
			
		}
}
