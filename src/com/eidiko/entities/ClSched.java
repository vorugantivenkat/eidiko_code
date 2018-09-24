package com.eidiko.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the CL_SCHED database table.
 * 
 */
@Entity
@Table(name="CL_SCHED")
@NamedQuery(name="ClSched.findAll", query="SELECT c FROM ClSched c")
public class ClSched implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CLASS_CODE")
	private String classCode;

	@Column(name="\"DAY\"")
	private short day;

	@Column(name="\"ENDING\"")
	private Time ending;

	@Column(name="\"STARTING\"")
	private Time starting;

	public ClSched() {
	}

	public String getClassCode() {
		return this.classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public short getDay() {
		return this.day;
	}

	public void setDay(short day) {
		this.day = day;
	}

	public Time getEnding() {
		return this.ending;
	}

	public void setEnding(Time ending) {
		this.ending = ending;
	}

	public Time getStarting() {
		return this.starting;
	}

	public void setStarting(Time starting) {
		this.starting = starting;
	}

}