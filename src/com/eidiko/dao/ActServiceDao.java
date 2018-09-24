package com.eidiko.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.Act;
import com.eidiko.requests.ActRequest;

public class ActServiceDao {

	public JSONObject getAllAct() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("select a from Act a");
			List<Act> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Act s : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("Act_No", s.getActno());
				subJsonData.put("ActKWD", s.getActkwd());
				subJsonData.put("ActDesc", s.getActdesc());
				aList.add(subJsonData);

			}
			jsonData.put("act", aList);

			return jsonData;

		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}

		return null;

	}

	public JSONObject findAct(ActRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Act s = eManager.find(Act.class, reqBody.getActno());

			JSONObject subJsonData = new JSONObject();
			subJsonData.put("Act_No", s.getActno());
			subJsonData.put("ActKWD", s.getActkwd());
			subJsonData.put("ActDesc", s.getActdesc());
			jsonData.put("act", subJsonData);
			return jsonData;
		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}
		return null;

	}
}
