package com.eidiko.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.Staff;
import com.eidiko.requests.StaffRequest;

public class StaffServiceDao {
	public JSONObject getAllStaff() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("select s from Staff s");
			List<Staff> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Staff s : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("Id", s.getId());
				subJsonData.put("Name", s.getName());
				subJsonData.put("Deparment", s.getDept());
				subJsonData.put("Job", s.getJob());
				subJsonData.put("Years", s.getYears());
				subJsonData.put("Salary", s.getSalary());
				subJsonData.put("Comm", s.getComm());
				aList.add(subJsonData);

			}
			jsonData.put("staff", aList);

			return jsonData;

		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}

		return null;

	}

	public JSONObject findStaff(StaffRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Staff s = eManager.find(Staff.class, reqBody.getId());
			JSONObject subJsonData = new JSONObject();
			subJsonData.put("Id", s.getId());
			subJsonData.put("Name", s.getName());
			subJsonData.put("Deparment", s.getDept());
			subJsonData.put("Job", s.getJob());
			subJsonData.put("Years", s.getYears());
			subJsonData.put("Salary", s.getSalary());
			subJsonData.put("Comm", s.getComm());
			jsonData.put("staff", subJsonData);
			return jsonData;
		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}
		return null;

	}
}
