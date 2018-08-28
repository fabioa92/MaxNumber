package com.model;

public class AnalizzaVettore {
	
	private int v[];
	
	public AnalizzaVettore() {
		
	}
	
	public int trovaMassimo(int mioV[]) {
		int i = 0;
		 v = mioV;
		 int max = 0;
		 int dub = 0;
		
		 for ( i = 0; i < v.length; i++) {
			 if (v[i] == max) {
				 dub = 1;
			 }
			 if (v[i]>max) {
				 dub = 0;
				 max = v[i];
			 }
		 }
		 
		 if(dub == 1) {
			 IllegalArgumentException exception
			 = new IllegalArgumentException(
			 "doppio max " + max);
			 throw exception; 
		 }
		 
		return max;
	}

	public boolean valoreMaggiore(int mioV[], int val) {
		
		
		int a = trovaMassimo(mioV);
		
		if (a > val) {
			return true;
		}
		else 
		{
			return false;
		}
	}

	
	

}
