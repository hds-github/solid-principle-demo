package com.javatech.solid.singleresponsibility.correctapproach;

import java.util.List;

public class Employee {

	private String name;
	private int age;
	private long salary;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	private List<Deals> depts;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Deals> getDepts() {
		return depts;
	}

	public void setDepts(List<Deals> depts) {
		this.depts = depts;
	}

	// calculateSalary should not be responsibility of employee
	/*
	 * public long calculateSalary() { for (Depts department : depts) { salary +=
	 * department.getDeptNo(); } this.setSalary(salary); ; return salary; }
	 */
	 //Report generation should not be responsibility of Employee
	public void generateReport(String reportType) {
		if (reportType.equalsIgnoreCase("CSV")) {
			System.out.println("Generate CSV report");
		}
		if (reportType.equalsIgnoreCase("XML")) {
			System.out.println("Generate XML report");
		}

	}

}
