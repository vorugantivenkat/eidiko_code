package com.eidiko.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PROJ database table.
 * 
 */
@Entity
@NamedQuery(name="Proj.findAll", query="SELECT p FROM Proj p")
public class Proj implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String deptno;

	private String majproj;

	@Temporal(TemporalType.DATE)
	private Date prendate;

	private String projname;

	@Id
	private String projno;

	private BigDecimal prstaff;

	@Temporal(TemporalType.DATE)
	private Date prstdate;

	private String respemp;

	public Proj() {
	}

	public String getDeptno() {
		return this.deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getMajproj() {
		return this.majproj;
	}

	public void setMajproj(String majproj) {
		this.majproj = majproj;
	}

	public Date getPrendate() {
		return this.prendate;
	}

	public void setPrendate(Date prendate) {
		this.prendate = prendate;
	}

	public String getProjname() {
		return this.projname;
	}

	public void setProjname(String projname) {
		this.projname = projname;
	}

	public String getProjno() {
		return this.projno;
	}

	public void setProjno(String projno) {
		this.projno = projno;
	}

	public BigDecimal getPrstaff() {
		return this.prstaff;
	}

	public void setPrstaff(BigDecimal prstaff) {
		this.prstaff = prstaff;
	}

	public Date getPrstdate() {
		return this.prstdate;
	}

	public void setPrstdate(Date prstdate) {
		this.prstdate = prstdate;
	}

	public String getRespemp() {
		return this.respemp;
	}

	public void setRespemp(String respemp) {
		this.respemp = respemp;
	}

}