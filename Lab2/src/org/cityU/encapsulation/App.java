package org.cityU.encapsulation;

public class App {

	public static void main(String[] args) {
		Student shawon = new Student();
		shawon.setStdId(100);
		shawon.setStdname("Shawon");
		shawon.setCgpa(3.9);
		System.out.println(shawon);
		
		Student s1 = new Student();
		s1.setStdId(200);
		s1.setStdname("S");
		s1.setCgpa(4);
		
		System.out.println(s1);
	}

}
