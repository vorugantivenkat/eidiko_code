package com.eidiko.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ORG database table.
 * 
 */
@Entity
@NamedQuery(name="Org.findAll", query="SELECT o FROM Org o")
public class Org implements Serializable {
	private static final long serialVersionUID = 1L;

	private String deptname;

	@Id
	private short deptnumb;

	private String division;

	@Column(name="\"LOCATION\"")
	private String location;

	private short manager;

	public Org() {
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public short getDeptnumb() {
		return this.deptnumb;
	}

	public void setDeptnumb(short deptnumb) {
		this.deptnumb = deptnumb;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public short getManager() {
		return this.manager;
	}

	public void setManager(short manager) {
		this.manager = manager;
	}

}