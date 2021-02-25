package com.javatech.solid.singleresponsibility.correctapproach;

public class ReportGenerator {

	public void generateReport(Employee emp, String reportType) {
		if (reportType.equalsIgnoreCase("CSV")) {
			System.out.println("Generate CSV report");
		}
		if (reportType.equalsIgnoreCase("XML")) {
			System.out.println("Generate XML report");
		}

	}

}
