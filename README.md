# intiveFDV - Java exercise


## Context

A company rents bikes under following options:
	
	1. Rental by hour, charging $5 per hour
	2. Rental by day, charging $20 a day
	3. Rental by week, changing $60 a week
	4. Family Rental, is a promotion that can include from 3 to 5 Rentals (of any type) with a discount of 30% of the total price


## Solution design

![](https://github.com/lucasditz/intiveFDV-java/blob/master/Diagramadeclase.png)

## Solution explaining

The problem was solved by a simple heritage design. It is an small problem and i didn't see the necessity of using design patterns.
I use an abstract class for all property shared by the three rentals types (hourly, dayly and weekly), an all simple rental inherit from this abstract class.

For this problem there is no need of model the three type of rental because they only have different prices, with a singleton class "Price" it would be enough. But if we think it as a real problem, modeling them as diferent clases make the design more flexible and escalable for futher feactures.

Family rental discount was modeled in a class that has a hashmap of the abstract class, making it posible to have the three types of rental by the concept of polymorphism.

Finally an interface was modeling for having all properties that all type of rental must have.
The family rental class wasn't modeled as a composite design patter because i considered that a family rental could not include another family rental.

I use JUnit 4 for the unit tests. To do the test just run "JUnitTestSuite.java". 
