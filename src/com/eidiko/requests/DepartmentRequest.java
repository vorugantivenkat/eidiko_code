package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class DepartmentRequest {

	@JsonbProperty
	private String deptno;

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
}
