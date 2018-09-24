package com.eidiko.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.Emp;
import com.eidiko.entities.Employee;
import com.eidiko.requests.EmployeeRequest;

public class EmployeeServiceDao {

	public JSONObject getAllEmployees() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("Select e from Employee e");
			List<Employee> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Employee e : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("EmpNo", e.getEmpno());
				subJsonData.put("EmpName", e.getFirstnme() + " " + e.getLastname());
				subJsonData.put("Job", e.getJob());
				subJsonData.put("Salary", e.getSalary());
				aList.add(subJsonData);

			}
			jsonData.put("Employees", aList);
			return jsonData;

		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}

		return null;

	}
	
	public JSONObject findEmployee(EmployeeRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Employee e = eManager.find(Employee.class, reqBody.getEmpno());
			JSONObject subJsonData = new JSONObject();
			subJsonData.put("EmpNo", e.getEmpno());
			subJsonData.put("EmpName", e.getFirstnme() + " " + e.getLastname());
			subJsonData.put("Job", e.getJob());
			subJsonData.put("Salary", e.getSalary());
			jsonData.put("Employee", subJsonData);
			
			return jsonData;
			
		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}
		return null;

	}
	
	
	
	
	
	public JSONObject getAllEmp() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("Select e from Emp e");
			List<Emp> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Emp e : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("EmpNo", e.getEmpno());
				subJsonData.put("EmpName", e.getFirstnme()+" "+e.getLastname());
				subJsonData.put("HireDate", e.getHiredate());
				subJsonData.put("Job",e.getJob());
				subJsonData.put("Salary",e.getSalary());
				subJsonData.put("WorkDept",e.getWorkdept());
				subJsonData.put("Sex",e.getSex());
				subJsonData.put("Phone",e.getPhoneno());
				aList.add(subJsonData);

			}
			jsonData.put("Emp", aList);
			return jsonData;

		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}

		return null;

	}
	
	public JSONObject findEmp(EmployeeRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Emp e = eManager.find(Emp.class, reqBody.getEmpno());
			JSONObject subJsonData = new JSONObject();
			subJsonData.put("EmpNo", e.getEmpno());
			subJsonData.put("EmpName", e.getFirstnme()+" "+e.getLastname());
			subJsonData.put("HireDate", e.getHiredate());
			subJsonData.put("Job",e.getJob());
			subJsonData.put("Salary",e.getSalary());
			subJsonData.put("WorkDept",e.getWorkdept());
			subJsonData.put("Sex",e.getSex());
			subJsonData.put("Phone",e.getPhoneno());
			jsonData.put("Employee", subJsonData);
			return jsonData;
			
		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}
		return null;

	}
	
}
