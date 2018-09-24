package com.eidiko.requests;

import javax.json.bind.annotation.JsonbProperty;

public class OrgRequest {

	@JsonbProperty
	private short deptnumb;

	public short getDeptnumb() {
		return deptnumb;
	}

	public void setDeptnumb(short deptnumb) {
		this.deptnumb = deptnumb;
	}
	
	
}
