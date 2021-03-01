package com.javatech.solid.openclose.correctpproach;

public class HomeApplianceProduct extends Product {

	@Override
	public double calculateProceWithTax() {

		return getProductBasePrice() * .80;

	}

}
