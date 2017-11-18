package com.oc.option;

public class BarreDeToit implements Option{

	
	public BarreDeToit() {
		
	}

		public Double getPrix() {
		
		return 99.9;
	}
	
	public String toString(){
		
		
		return " Barre De Toit";
	}
	
	public boolean equals(BarreDeToit other){
		return this.equals(other.getPrix());
		
	}
	
	
}
