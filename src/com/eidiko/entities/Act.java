package com.eidiko.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ACT database table.
 * 
 */
@Entity
@NamedQuery(name="Act.findAll", query="SELECT a FROM Act a")
public class Act implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private short actno;

	private String actdesc;

	private String actkwd;

	//bi-directional one-to-one association to Act
	@OneToOne
	@JoinColumn(name="ACTNO", insertable=false, updatable=false)
	private Act act1;

	//bi-directional one-to-one association to Act
	@OneToOne(mappedBy="act1")
	private Act act2;

	public Act() {
	}

	public short getActno() {
		return this.actno;
	}

	public void setActno(short actno) {
		this.actno = actno;
	}

	public String getActdesc() {
		return this.actdesc;
	}

	public void setActdesc(String actdesc) {
		this.actdesc = actdesc;
	}

	public String getActkwd() {
		return this.actkwd;
	}

	public void setActkwd(String actkwd) {
		this.actkwd = actkwd;
	}

	public Act getAct1() {
		return this.act1;
	}

	public void setAct1(Act act1) {
		this.act1 = act1;
	}

	public Act getAct2() {
		return this.act2;
	}

	public void setAct2(Act act2) {
		this.act2 = act2;
	}

}