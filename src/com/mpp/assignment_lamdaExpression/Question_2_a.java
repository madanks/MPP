package com.mpp.assignment_lamdaExpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question_2_a {
	public static void main(String[] args) {
		Employee[] employees = { new Employee("Jason", "Red", 5000, "IT"), new Employee("Ashley", "Green", 7600, "IT"),
				new Employee("Matthew", "Indigo", 3587.5, "Sales"),
				new Employee("James", "Indigo", 4700.77, "Marketing"), new Employee("Luke", "Indigo", 6200, "IT"),
				new Employee("xason", "Blue", 3200, "Sales"), new Employee("Wendy", "Brown", 4236.4, "Marketing") };

		// get List view of the Employees
		List<Employee> list = Arrays.asList(employees);

		// question 1
		// here {e -> e.getLastName().charAt(0) == 'R'} is a predicate
		System.out.printf("1. Number of Employee with last name B are : %d\n",
				list.stream().filter(e -> e.getLastName().startsWith("B")).count());

		// question 2
		// sort method is not overriding so here employee is directly sorted by
		// first name
		Function<Employee, String> byFirstName = Employee::getFirstName;
		Function<Employee, String> byLastName = Employee::getLastName;
		Function<Employee, String> byDepartment = Employee::getDepartment;
		Function<Employee, Double> bySalary = Employee::getSalary;
		Comparator<Employee> sortby = Comparator.comparing(byLastName).thenComparing(byFirstName)
				.thenComparing(byLastName).thenComparing(byDepartment).thenComparing(bySalary);
		System.out.printf("\n2. Display Employee Object in sorted order:\n");
		list.stream().filter(e -> e.getLastName().startsWith("B")).sorted(sortby).forEach(System.out::println);

		// question 3
		System.out.printf("\n3. Display Employee Object with firstname and lastname to uppercase:\n");
		list.stream().filter(e -> e.getLastName().startsWith("B")).map(e -> new Employee(e.getFirstName().toUpperCase(),
				e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment())).forEach(System.out::println);

		// question 4
		System.out.printf("\n4. Display Employee Object with and lastname to uppercase if lastname starts with B:\n");
		list.stream().forEach(e -> {
			if (e.getLastName().startsWith("B")) {
				System.out.println(new Employee(e.getFirstName(), e.getLastName().toUpperCase(), e.getSalary(),
						e.getDepartment()));
			} else {
				System.out.println(new Employee(e.getFirstName(), e.getLastName(), e.getSalary(), e.getDepartment()));
			}
		});

		System.out.printf(
				"\n5. Display all Employees whose last name begains with letter I in sorted order and remove all duplicate:\n\n");
		list.stream().filter(e -> e.getLastName().startsWith("I")).map(e -> e.getLastName()).sorted().distinct()
				.forEach(System.out::println);
		System.out.printf("\n6. Display the average salary of all employee : %,.2f\n",
				list.stream().mapToDouble(Employee::getSalary).average().getAsDouble());

		System.out.printf("\n7. Display the total salary of all employee using reduce : %,.2f\n\n",
				list.stream().mapToDouble(Employee::getSalary).reduce(0, (value1, value2) -> value1 + value2));
		System.out.println("8. Print first name of all employee :");

		list.stream().map(e -> e.getFirstName()).forEach(System.out::println);
		
		
	}

}
