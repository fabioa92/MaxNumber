package com.numers;

import com.model.AnalizzaVettore;

public class MaxNumber {

	public static void main(String[] args) {

		int mioVettore[] = { 1, 2, 30, 9, 1, 30, 13, 31, 20, 11, 14, 13 };


		AnalizzaVettore vett = new AnalizzaVettore();
		boolean a = vett.valoreMaggiore(mioVettore, 0);

		if (a)
			System.out.println("presenza di numero più grandeeee");
		else
			System.out.println("nessun numero più grande");

	}

}
