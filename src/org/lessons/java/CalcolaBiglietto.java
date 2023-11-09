package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Quanti km vuoi percorrere?");
	float km = in.nextFloat();
;	System.out.println("Quanti anni hai?");
	int age = in.nextInt();
	
	float priceKm = 0.21F;
	float minorsDiscount = 0.2F;
	float elderlyDiscount = 0.4F;
	
	
	float price = km * priceKm;
	
	float discountedPrice = 0F;
	
	if (age < 18) {
		discountedPrice = price - (price * minorsDiscount);
	} else if (age > 65) {
		discountedPrice = price - (price * elderlyDiscount);
	} else discountedPrice = price;
	
	String formatDiscountedPrice = String.format("%.2f", discountedPrice);
	
	System.out.println(formatDiscountedPrice + "€");
}
}
