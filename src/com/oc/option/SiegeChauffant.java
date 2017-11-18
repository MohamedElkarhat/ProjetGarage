package com.oc.option;

public class SiegeChauffant implements Option{

		
	
	public SiegeChauffant() {
		
	}

	@Override
	public Double getPrix() {
		
		return 199.9;
	}

	   public String toString(){
			
			return " Siege Chauffant";
		}
	   public boolean equals(SiegeChauffant other){
			return this.equals(other.getPrix());
			
		}
}
