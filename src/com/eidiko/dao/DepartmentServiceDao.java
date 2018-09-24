package com.eidiko.dao;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.Department;
import com.eidiko.entities.Dept;
import com.eidiko.requests.DepartmentRequest;

public class DepartmentServiceDao {

	public JSONObject getAllDepartment() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("Select e from Department e");
			List<Department> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Department e : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("DeptNo", e.getDeptno());
				subJsonData.put("DeptName", e.getDeptname());
				subJsonData.put("Location", e.getLocation());
				aList.add(subJsonData);

			}
			jsonData.put("Departments", aList);
			return jsonData;

		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}

		return null;

	}
	
	public JSONObject findDepartment(DepartmentRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Department e = eManager.find(Department.class, reqBody.getDeptno());
			JSONObject subJsonData = new JSONObject();
			subJsonData.put("DeptNo", e.getDeptno());
			subJsonData.put("DeptName", e.getDeptname());
			subJsonData.put("Location", e.getLocation());
			jsonData.put("Department", subJsonData);
			
			return jsonData;
			
		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}
		return null;

	}
	
	
	
	
	
	public JSONObject getAllDept() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("Select e from Dept e");
			List<Dept> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Dept e : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("DeptNo", e.getDeptno());
				subJsonData.put("DeptName", e.getDeptname());
				subJsonData.put("Location", e.getLocation());
				aList.add(subJsonData);

			}
			jsonData.put("Departments", aList);
			return jsonData;

		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}

		return null;

	}
	
	public JSONObject findDept(DepartmentRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Dept e = eManager.find(Dept.class, reqBody.getDeptno());
			JSONObject subJsonData = new JSONObject();
			subJsonData.put("DeptNo", e.getDeptno());
			subJsonData.put("DeptName", e.getDeptname());
			subJsonData.put("Location", e.getLocation());
			jsonData.put("Department", subJsonData);
			
			return jsonData;
			
		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}
		return null;

	}
	
}
