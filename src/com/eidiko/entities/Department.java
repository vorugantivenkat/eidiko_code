package com.eidiko.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DEPARTMENT database table.
 * 
 */
@Entity
@NamedQuery(name="Department.findAll", query="SELECT d FROM Department d")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String deptno;

	private String deptname;

	@Column(name="\"LOCATION\"")
	private String location;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="MGRNO")
	private Employee employee;

	//bi-directional many-to-one association to Department
	@ManyToOne
	@JoinColumn(name="ADMRDEPT")
	private Department department;

	//bi-directional many-to-one association to Department
	@OneToMany(mappedBy="department")
	private List<Department> departments;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="department")
	private List<Employee> employees;

	public Department() {
	}

	public String getDeptno() {
		return this.deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return this.deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Department> getDepartments() {
		return this.departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Department addDepartment(Department department) {
		getDepartments().add(department);
		department.setDepartment(this);

		return department;
	}

	public Department removeDepartment(Department department) {
		getDepartments().remove(department);
		department.setDepartment(null);

		return department;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee addEmployee(Employee employee) {
		getEmployees().add(employee);
		employee.setDepartment(this);

		return employee;
	}

	public Employee removeEmployee(Employee employee) {
		getEmployees().remove(employee);
		employee.setDepartment(null);

		return employee;
	}

}