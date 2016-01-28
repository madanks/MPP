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
		System.out.printf("Number of Employee with last name B are : %d\n",
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

		list.stream().filter(e -> e.getLastName().startsWith("B")).sorted(sortby).forEach(System.out::println);

		// question 3
		//list.stream().filter(e -> e.getLastName().startsWith("B")).forEach(System.out::println);

	}

}
