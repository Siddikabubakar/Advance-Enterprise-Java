package com.city.ui;

import com.city.Employee;
import com.city.Programmer;

public class App {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e);
		e.setId(100);
		e.setName("Richard");
		System.out.println(e);
		e.setSalary(5000);
		
		System.out.println(e);
		
		Programmer p = new Programmer();
		p.setId(200);
		p.setName("A");
		p.setSalary(3000);
		p.setBonous(300);
		System.out.println(p);
		
		p.totalSalary();
	}

}
