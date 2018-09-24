package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class ProjRequest {

	@JsonbProperty
	private String projno;

	public String getProjno() {
		return projno;
	}

	public void setProjno(String projno) {
		this.projno = projno;
	}
}
