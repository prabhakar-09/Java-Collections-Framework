package com.collections.framework.arrayList;

import java.util.*;

public class EmployeeSort {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // Creating custom objects & performing sorting on that

        employees.add(new Employee(1, "Ramu", 24, 33000));
        employees.add(new Employee(2, "Prbhu", 25, 44000));
        employees.add(new Employee(5, "Shambu", 29, 20000));
        employees.add(new Employee(7, "Shetty", 32, 31000));
        employees.add(new Employee(9, "Kumar", 28, 30000));
        employees.add(new Employee(11, "Kartik", 33, 53000));

        System.out.println("List before sort : " + employees);

        // to sort the custom objects we can use an in-build method Comparators

        Collections.sort(employees, new SortEmp());
        
        System.out.println("List after sorting wrt salary.." + employees);
        
//        Implementing the same logic using lambda expressions
        
        Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (int) (o1.getSalary() - o2.getSalary());
				
			}
        	
        	
		});
        
//        Lambda expressions 
        Collections.sort(employees, (o1,o2)->(int)(o1.getSalary() - o2.getSalary()));
        
        System.out.println("Sorted using lambda expressions " + employees);
        
//        sorting using employees names
        Collections.sort(employees, (o1,o2)->(o1.getName().compareTo(o1.getName())));
        System.out.println("Sorted using name  asc " + employees);
    }

    static class SortEmp implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {

            return (int) (o1.getSalary() - o2.getSalary()); // Sorting employees w.r.t salaries in ascending order
            
//            return (int) (o2.getSalary() - o1.getSalary()); this'll sort in descending order 
        }

    }
}
