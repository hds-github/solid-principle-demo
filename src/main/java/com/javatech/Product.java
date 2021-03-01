package com.javatech.solid.openclose.correctpproach;

public abstract class Product {

	private double productBasePrice;

	public double getProductBasePrice() {
		return productBasePrice;
	}

	public void setProductBasePrice(double productBasePrice) {
		this.productBasePrice = productBasePrice;
	}

	public abstract double calculateProceWithTax();

}
