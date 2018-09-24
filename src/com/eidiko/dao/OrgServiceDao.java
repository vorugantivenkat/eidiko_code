package com.eidiko.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.Org;
import com.eidiko.requests.OrgRequest;

public class OrgServiceDao {

	public JSONObject getAllOrg() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("Select e from Org e");
			List<Org> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Org e : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("DeptNo", e.getDeptnumb());
				subJsonData.put("DeptName", e.getDeptname());
				subJsonData.put("Manger", e.getManager());
				subJsonData.put("Division", e.getDivision());
				subJsonData.put("Location", e.getLocation());
				aList.add(subJsonData);

			}
			jsonData.put("Org", aList);
			return jsonData;

		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}

		return null;

	}

	public JSONObject findOrg(OrgRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Org e = eManager.find(Org.class , reqBody.getDeptnumb());
			JSONObject subJsonData = new JSONObject();
			subJsonData.put("DeptNo", e.getDeptnumb());
			subJsonData.put("DeptName", e.getDeptname());
			subJsonData.put("Manger", e.getManager());
			subJsonData.put("Division", e.getDivision());
			subJsonData.put("Location", e.getLocation());
			jsonData.put("Org", subJsonData);

			return jsonData;

		} catch (Exception e) {
			System.out.println("EXCEPTION : " + e);
		}
		return null;

	}

}
