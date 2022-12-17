package com.eaiesb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="akhil01230")
public class Employee {

	@Id
	public String id;
	
	private String empNum;
	private String empFirstName;
	private String empLastName;
	private int empSalary;
	
	public Employee(String id, String empNum, String empFirstName, String empLastName, int empSalary) {
		this.id = id;
		this.empNum = empNum;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
	}
}
	
	


