package com.rays.inject_literals;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("${emp.id}")
	private int empId;
	@Value("${emp.Name}")
	private String empName;
	@Value("${emp.Address}")
	private String empAddress;
public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public void showDetails() {
		System.out.println("empId"+empId);
		System.out.println("empName"+empName);
		System.out.println("empAddress"+empAddress);
	}

}
