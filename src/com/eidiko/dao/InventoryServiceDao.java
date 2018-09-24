package com.eidiko.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.json.simple.JSONObject;

import com.eidiko.entities.Inventory;
import com.eidiko.requests.InventoryRequest;

public class InventoryServiceDao {

	public JSONObject getAllInventory() {

		JSONObject jsonData = new JSONObject();

		try {

			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Query query = eManager.createQuery("select i from Inventory i");
			List<Inventory> list = query.getResultList();
			ArrayList<JSONObject> aList = new ArrayList<>();
			for (Inventory s : list) {
				JSONObject subJsonData = new JSONObject();
				subJsonData.put("Pid", s.getPid());
				subJsonData.put("Quantity", s.getQuantity());
				subJsonData.put("Location", s.getLocation());
				aList.add(subJsonData);

			}
			jsonData.put("inventory", aList);

			return jsonData;

		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}

		return null;

	}

	public JSONObject findInventory(InventoryRequest reqBody) {
		JSONObject jsonData = new JSONObject();
		try {
			EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("eidiko");
			EntityManager eManager = emFactory.createEntityManager();
			Inventory s = eManager.find(Inventory.class, reqBody.getPid());

			JSONObject subJsonData = new JSONObject();
			subJsonData.put("Pid", s.getPid());
			subJsonData.put("Quantity", s.getQuantity());
			subJsonData.put("Location", s.getLocation());
			jsonData.put("inventory", subJsonData);
			return jsonData;
		} catch (Exception e) {
			System.out.println("EXECPTION : " + e);
		}
		return null;

	}
}
