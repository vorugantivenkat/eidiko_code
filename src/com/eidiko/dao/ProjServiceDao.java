package com.eidiko.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.Proj;
import com.eidiko.requests.ProjRequest;

public class ProjServiceDao {

	public JSONObject getAllProj() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("select p from Proj p");
			List<Proj> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Proj s : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("Project_No", s.getProjno());
				subJsonData.put("Project_Name", s.getProjname());
				subJsonData.put("Department_No", s.getDeptno());
				subJsonData.put("RespEmp", s.getRespemp());
				subJsonData.put("PRStaff", s.getPrstaff());
				subJsonData.put("PRSTDate", s.getPrstdate());
				subJsonData.put("PRENDate", s.getPrendate());
				subJsonData.put("MAJProj", s.getMajproj());
				aList.add(subJsonData);

			}
			jsonData.put("proj", aList);

			return jsonData;

		} catch (Exception e) {
			System.out.println("EXCEPTION : " + e);
		}

		return null;

	}

	public JSONObject findProj(ProjRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Proj s = eManager.find(Proj.class, reqBody.getProjno());

			JSONObject subJsonData = new JSONObject();
			subJsonData.put("Project_No", s.getProjno());
			subJsonData.put("Project_Name", s.getProjname());
			subJsonData.put("Department_No", s.getDeptno());
			subJsonData.put("RespEmp", s.getRespemp());
			subJsonData.put("PRStaff", s.getPrstaff());
			subJsonData.put("PRSTDate", s.getPrstdate());
			subJsonData.put("PRENDate", s.getPrendate());
			subJsonData.put("MAJProj", s.getMajproj());
			jsonData.put("proj", subJsonData);
			return jsonData;
		} catch (Exception e) {
			System.out.println("EXCEPTION : " + e);
		}
		return null;

	}
	
}
