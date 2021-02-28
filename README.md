# solid-principle-demo
This repository consist of the packages which will show the design principles SOLID with examples 

This repo is demonstrating the below SOLID principles with code example to understand in details with example
SOLID design principles encourage us to create more maintainable, understandable, and flexible software. Consequently, as our applications grow in size, we can reduce their complexity and save ourselves a lot of code/design hurdles in future.
The following 5 concepts make up our SOLID principles:
1.	Single Responsibility
2.	Open/Closed
3.	Liskov Substitution
4.	Interface Segregation
5.	Dependency Inversion

1. solid/singleresponsibility:
 - This package consist the general practice without single responsibility principle and with single responsibility solid principle how one code will look like.

Normal Coding - com.javatech.solid.singleresponsibility.wrongapproach 
  -This shows how the Employee got over burdend with muliple responsibilities 
   a) As a POJO -having getters and setters for all attributes
   b) As calculateSalary activity
   c) As generateReport activity 
   Ideally calculateSalary,generateReport should not be responsibility of Employee object.Thses must be independent class so that can be used for anoty other Entity as well.
   
With singleresponsibility - com.javatech.solid.singleresponsibility.correctapproach
  a) Employee- Only responsible for OPJO ( Getters and Setters of Employee object)
  b)SalaryCalculator - Seperate object thats contains method like calculateSalary by having 2 argummants i.e. parameterized.
  c)ReportGenerator - Seperate object thats contains method like generateReport by having 2 argummants i.e. parameterized.
  
 2.Open/Closed : Yet To Come...

