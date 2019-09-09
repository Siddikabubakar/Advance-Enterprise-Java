package com.city;

public class Programmer extends Employee {

	private double bonous;
	
	

	public double getBonous() {
		return bonous;
	}

	public void setBonous(double bonous) {
		this.bonous = bonous;
	}

	@Override
	public String toString() {
		return "Programmer [bonous=" + bonous + ", toString()=" + super.toString() + "]";
	}

	public void totalSalary() {
		System.out.println(getSalary()+bonous);
	}


}
