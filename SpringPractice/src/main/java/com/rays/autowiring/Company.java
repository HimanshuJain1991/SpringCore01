package com.rays.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
	//@Autowired and @Qualifier directly use kar sakte hai reference variable pe comment out kiya setter and constructor
	@Autowired
	@Qualifier("deptObj2")
	Dept dept;
// public Company(@Qualifier("deptObj1")HRDept dept) {
//	 this.dept =dept;
// }
// @Autowired
//	public void setDept(HRDept dept) {
//		this.dept=dept;
//		System.out.println("setter run via autowired");
//		
//	}
 public void  companyWork() {
	 if(dept==null)
		 System.out.println("No Client No Work");
	 else
		 dept.work();
 }

}
