package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
//	Recupero dall'utente i km che vuole percorrere
	System.out.println("Quanti km vuoi percorrere?");
	float km = in.nextFloat();
	
//	Recupero dall'utente la sua età
;	System.out.println("Quanti anni hai?");
	int age = in.nextInt();
	
//	Dichiaro prezzo al km e sconti vari in base all'età
	float priceKm = 0.21F;
	float minorsDiscount = 0.2F;
	float elderlyDiscount = 0.4F;
	
//	Calcolo il prezzo senza sconti
	float price = km * priceKm;
	
	
	float discountedPrice = 0F;
	
//	Controllo l'età e applico lo sconto al prezzo
	if (age < 18) {
		discountedPrice = price - (price * minorsDiscount);
	} else if (age > 65) {
		discountedPrice = price - (price * elderlyDiscount);
	} else discountedPrice = price;
	
//	Formatto il prezzo e stampo
	String formatDiscountedPrice = String.format("%.2f", discountedPrice);
	System.out.println("Il prezzo del tuo biglietto è " + formatDiscountedPrice + "€");
}
}
