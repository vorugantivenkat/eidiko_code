package com.eidiko.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the STAFFG database table.
 * 
 */
@Entity
@NamedQuery(name="Staffg.findAll", query="SELECT s FROM Staffg s")
public class Staffg implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"COMM\"")
	private BigDecimal comm;

	private short dept;

	@Id
	@Column(name="\"ID\"")
	private short id;

	private String job;

	@Column(name="\"NAME\"")
	private String name;

	private BigDecimal salary;

	@Column(name="\"YEARS\"")
	private short years;

	public Staffg() {
	}

	public BigDecimal getComm() {
		return this.comm;
	}

	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}

	public short getDept() {
		return this.dept;
	}

	public void setDept(short dept) {
		this.dept = dept;
	}

	public short getId() {
		return this.id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public short getYears() {
		return this.years;
	}

	public void setYears(short years) {
		this.years = years;
	}

}