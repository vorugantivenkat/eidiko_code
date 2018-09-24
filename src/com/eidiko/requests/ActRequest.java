package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class ActRequest {

	@JsonbProperty
	private short actno;

	public short getActno() {
		return actno;
	}

	public void setActno(short actno) {
		this.actno = actno;
	}

	
}
