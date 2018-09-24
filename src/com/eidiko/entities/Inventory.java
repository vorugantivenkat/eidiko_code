package com.eidiko.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the INVENTORY database table.
 * 
 */
@Entity
@NamedQuery(name="Inventory.findAll", query="SELECT i FROM Inventory i")
public class Inventory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String pid;

	@Column(name="\"LOCATION\"")
	private String location;

	private int quantity;

	public Inventory() {
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}