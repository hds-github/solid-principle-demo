package com.javatech.solid.openclose.correctpproach;

public class EatableProduct extends Product {

	@Override
	public double calculateProceWithTax() {
		return getProductBasePrice() * 0.88;
	}

}
