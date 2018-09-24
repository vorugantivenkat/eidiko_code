package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class ClSchedRequest {

	@JsonbProperty
	private String classCode;

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

		
	
}
