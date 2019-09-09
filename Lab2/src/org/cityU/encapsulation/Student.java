package org.cityU.encapsulation;

public class Student {

	private long stdId;
	private String stdname;
	private double cgpa;

	public long getStdId() {
		return stdId;
	}

	public void setStdId(long stdId) {
		this.stdId = stdId;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdname=" + stdname + ", cgpa=" + cgpa + "]";
	}

}
