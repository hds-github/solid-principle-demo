package com.javatech.solid.openclose.correctpproach;

public class BikeProduct extends Product {

	@Override
	public double calculateProceWithTax() {
		return getProductBasePrice()*0.60;
	}

}
