package com.javatech.solid.singleresponsibility.correctapproach;

import java.util.List;

public class SalaryCalculator {

	// calculateSalary should not be responsibility of employee
		public long calculateSalary(Employee emp,  List<Deals> deals) {
			long salary=5000;
			salary = salary +deals.size()*5;
			emp.setSalary(salary);
			return salary;
		}
}
