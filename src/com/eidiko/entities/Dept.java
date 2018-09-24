package com.eidiko.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DEPT database table.
 * 
 */
@Entity
@NamedQuery(name="Dept.findAll", query="SELECT d FROM Dept d")
public class Dept implements Serializable {
	private static final long serialVersionUID = 1L;

	private String admrdept;

	private String deptname;

	@Id
	private String deptno;

	@Column(name="\"LOCATION\"")
	private String location;

	private String mgrno;

	public Dept() {
	}

	public String getAdmrdept() {
		return this.admrdept;
	}

	public void setAdmrdept(String admrdept) {
		this.admrdept = admrdept;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptno() {
		return this.deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMgrno() {
		return this.mgrno;
	}

	public void setMgrno(String mgrno) {
		this.mgrno = mgrno;
	}

}