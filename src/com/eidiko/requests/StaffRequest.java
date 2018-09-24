package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class StaffRequest {

	@JsonbProperty
	private short id;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	
	
}
