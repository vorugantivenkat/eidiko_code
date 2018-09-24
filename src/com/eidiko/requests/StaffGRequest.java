package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class StaffGRequest {

	@JsonbProperty
	private short id;

	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	
}
