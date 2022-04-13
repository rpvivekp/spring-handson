package com.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private String empName;
	
/*You can use @Autowired annotation on setter methods to 
 * get rid of the <property> element in XML configuration file. 
 * When Spring finds an @Autowired annotation used with setter methods,
 *  it tries to perform byType autowiring on the method.
 * 
 */
	@Autowired
	private Passport passObj;

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

	public Passport getPassObj() {
		return passObj;
	}

	public void setPassObj(Passport passObj) {
		this.passObj = passObj;
	}

}
