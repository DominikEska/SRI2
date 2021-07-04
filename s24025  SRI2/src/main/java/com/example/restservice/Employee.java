package com.example.restservice;

import java.util.ArrayList;

class Employee {
	public static ArrayList<Employee> lista = new ArrayList<Employee>();

	private Long id;
	private String name;
	private String jobPosition;

	Employee() {
	}

	Employee(String name, String jobPosition) {

		this.name = name;
		this.jobPosition = jobPosition;
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getJobPosition() {
		return this.jobPosition;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.jobPosition + '\''
				+ '}';
	}

	public static Employee findById(Long id2) {
		for (Employee e : lista)
			if (e.id == id2)
				return e;
		return null;
	}

	public static void delete(Long id2) {
		Employee e = null;

		for (Employee e1 : lista)
			if (e1.id == id2)
				e = e1;
		lista.remove(e);
	}
}
