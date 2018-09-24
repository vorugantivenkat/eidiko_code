package com.eidiko.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

import com.eidiko.dao.ActServiceDao;
import com.eidiko.dao.ClSchedDao;
import com.eidiko.dao.DepartmentServiceDao;
import com.eidiko.dao.EmployeeServiceDao;
import com.eidiko.dao.InventoryServiceDao;
import com.eidiko.dao.OrgServiceDao;
import com.eidiko.dao.ProjServiceDao;
import com.eidiko.dao.StaffGServiceDao;
import com.eidiko.dao.StaffServiceDao;
import com.eidiko.requests.ActRequest;
import com.eidiko.requests.ClSchedRequest;
import com.eidiko.requests.DepartmentRequest;
import com.eidiko.requests.EmployeeRequest;
import com.eidiko.requests.InventoryRequest;
import com.eidiko.requests.OrgRequest;
import com.eidiko.requests.ProjRequest;
import com.eidiko.requests.StaffGRequest;
import com.eidiko.requests.StaffRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@Path("/dbservice")
@Api(value = "dbservice")
public class DBService {

	@GET
	@ApiOperation(value = "get String value",  code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allStaff")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allStaff() {

		StaffServiceDao dao = new StaffServiceDao();
		JSONObject obj = dao.getAllStaff();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findStaff")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findStaff(StaffRequest reqBody) {

		StaffServiceDao dao = new StaffServiceDao();
		JSONObject obj = dao.findStaff(reqBody);
		return obj;
	}

	@GET
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allStaffg")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allStaffg() {

		StaffGServiceDao dao = new StaffGServiceDao();
		JSONObject obj = dao.getAllStaffg();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findStaffg")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findStaffg(StaffGRequest reqBody) {

		StaffGServiceDao dao = new StaffGServiceDao();
		JSONObject obj = dao.findStaffg(reqBody);
		return obj;
	}

	@GET
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allAct")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allAct() {

		ActServiceDao dao = new ActServiceDao();
		JSONObject obj = dao.getAllAct();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findAct")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findAct(ActRequest reqBody) {

		ActServiceDao dao = new ActServiceDao();
		JSONObject obj = dao.findAct(reqBody);
		return obj;
	}

	@GET
	@ApiOperation(value = "get String value",  code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allInventory")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allInventory() {

		InventoryServiceDao dao = new InventoryServiceDao();
		JSONObject obj = dao.getAllInventory();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findInventory")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findInventory(InventoryRequest reqBody) {

		InventoryServiceDao dao = new InventoryServiceDao();
		JSONObject obj = dao.findInventory(reqBody);
		return obj;
	}

	@GET
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allProj")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allProj() {

		ProjServiceDao dao = new ProjServiceDao();
		JSONObject obj = dao.getAllProj();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findProj")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findProj(ProjRequest reqBody) {

		ProjServiceDao dao = new ProjServiceDao();
		JSONObject obj = dao.findProj(reqBody);
		return obj;
	}

	@GET
	@ApiOperation(value = "get String value",code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allClsched")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allClsched() {

		ClSchedDao dao = new ClSchedDao();
		JSONObject obj = dao.getAllClSched();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findClsched")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findClsched(ClSchedRequest reqBody) {

		ClSchedDao dao = new ClSchedDao();
		JSONObject obj = dao.findClSched(reqBody);
		return obj;
	}

	@GET
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allDepartment")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allDepartment() {
		DepartmentServiceDao dao = new DepartmentServiceDao();
		JSONObject obj = dao.getAllDepartment();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findDepartment")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findDepartment(DepartmentRequest reqBody) {
		DepartmentServiceDao dao = new DepartmentServiceDao();
		JSONObject obj = dao.findDepartment(reqBody);
		return obj;
	}

	@GET
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allDept")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allDept() {
		DepartmentServiceDao dao = new DepartmentServiceDao();
		JSONObject obj = dao.getAllDept();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findDept")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findDept(DepartmentRequest reqBody) {
		DepartmentServiceDao dao = new DepartmentServiceDao();
		JSONObject obj = dao.findDept(reqBody);
		return obj;
	}

	/*------------ Employee---------------*/

	@GET
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allEmployees")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allEmployees() {
		EmployeeServiceDao dao = new EmployeeServiceDao();
		JSONObject obj = dao.getAllEmployees();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findEmployee(EmployeeRequest reqBody) {
		EmployeeServiceDao dao = new EmployeeServiceDao();
		JSONObject obj = dao.findEmployee(reqBody);
		return obj;
	}

	@GET
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allEmp")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allEmp() {
		EmployeeServiceDao dao = new EmployeeServiceDao();
		JSONObject obj = dao.getAllEmp();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findEmp")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findEmp(EmployeeRequest reqBody) {
		EmployeeServiceDao dao = new EmployeeServiceDao();
		JSONObject obj = dao.findEmp(reqBody);
		return obj;
	}

	/*-------------Org---------*/

	@GET
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/allOrg")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject allOrg() {
		OrgServiceDao dao = new OrgServiceDao();
		JSONObject obj = dao.getAllOrg();
		return obj;
	}

	@POST
	@ApiOperation(value = "get String value", code = 200)
	@ApiResponse(code = 200, message = "Success")
	@Path("/findOrg")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public JSONObject findOrg(OrgRequest reqBody) {
		OrgServiceDao dao = new OrgServiceDao();
		JSONObject obj = dao.findOrg(reqBody);
		return obj;
	}

}
