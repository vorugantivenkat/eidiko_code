package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class EmployeeRequest {

	@JsonbProperty
	private String empno;

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}
}
