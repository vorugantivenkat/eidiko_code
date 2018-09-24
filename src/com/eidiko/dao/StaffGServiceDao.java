package com.eidiko.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.Staffg;
import com.eidiko.requests.StaffGRequest;

public class StaffGServiceDao {

	public JSONObject getAllStaffg() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("select s from Staffg s");
			List<Staffg> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Staffg s : list) {
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
			jsonData.put("staffg", aList);

			return jsonData;

		} catch (Exception e) {
			System.out.println("EXCEPTION : " + e);
		}

		return null;

	}

	public JSONObject findStaffg(StaffGRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Staffg s = eManager.find(Staffg.class, reqBody.getId());

			JSONObject subJsonData = new JSONObject();
			subJsonData.put("Id", s.getId());
			subJsonData.put("Name", s.getName());
			subJsonData.put("Deparment", s.getDept());
			subJsonData.put("Job", s.getJob());
			subJsonData.put("Years", s.getYears());
			subJsonData.put("Salary", s.getSalary());
			subJsonData.put("Comm", s.getComm());
			jsonData.put("staffg", subJsonData);
			return jsonData;
		} catch (Exception e) {
			System.out.println("EXCEPTION : " + e);
		}
		return null;

	}
	
}
