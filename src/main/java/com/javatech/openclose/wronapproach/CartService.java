package com.javatech.solid.openclose.wronapproach;

import java.util.List;

public class CartService {
	public double calculateTotalOrder(List<Product> products) {

		double orderTotal = 0;

		for (Product product : products) {

			if ("EATABLE".equals(product.getProductType())) {
				orderTotal += product.getProductPrice() * 0.88;
			} else if ("BIKE".equals(product.getProductType())) {
				orderTotal += product.getProductPrice() * 0.60;
			} else if ("HOMEAPPLIANCE".equals(product.getProductType())) {
				orderTotal += product.getProductPrice() * 0.80;
			}
		}

		return orderTotal;
	}
}
