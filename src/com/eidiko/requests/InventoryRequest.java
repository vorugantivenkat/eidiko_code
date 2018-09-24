package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class InventoryRequest {

	@JsonbProperty
	private String pid;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	

}
