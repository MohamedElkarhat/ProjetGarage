package com.oc.option;

public class Climatisation implements Option{

	public Climatisation() {
		
	}

		public Double getPrix() {
		
		return 250.9;
		
	}
	
		public String toString(){
			
			
			return " Climatisation";
		}
		public boolean equals(Climatisation other){
			return this.equals(other.getPrix());
			
		}
	}


