package com.eidiko.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.ClSched;
import com.eidiko.requests.ClSchedRequest;

public class ClSchedDao {

	public JSONObject getAllClSched() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("select c from ClSched c");
			List<ClSched> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (ClSched s : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("Class_Code", s.getClassCode());
				subJsonData.put("Day", s.getDay());
				subJsonData.put("Starting", s.getStarting());
				subJsonData.put("Ending", s.getEnding());
				aList.add(subJsonData);

			}
			jsonData.put("cl_sched", aList);

			return jsonData;

		} catch (Exception e) {
			System.out.println("EXCEPTION : " + e);
		}

		return null;

	}

	public JSONObject findClSched(ClSchedRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			ClSched s = eManager.find(ClSched.class, reqBody.getClassCode());

			JSONObject subJsonData = new JSONObject();
			subJsonData.put("Class_Code", s.getClassCode());
			subJsonData.put("Day", s.getDay());
			subJsonData.put("Starting", s.getStarting());
			subJsonData.put("Ending", s.getEnding());
			jsonData.put("cl_sched", subJsonData);
			return jsonData;
		} catch (Exception e) {
			System.out.println("EXCEPTION : " + e);
		}
		return null;

	}
}
