package com.javatech.solid.openclose.correctpproach;

import java.util.List;

public class CartService {
	public double calculateTotalOrder(List<Product> products) {

		double orderTotal = 0;

		for (Product product : products) {
			orderTotal+=product.calculateProceWithTax();
		}

		return orderTotal;
	}
}
