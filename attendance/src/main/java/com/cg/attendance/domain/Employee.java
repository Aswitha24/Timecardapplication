package com.cg.attendance.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * This Java class contains all the employee details
 * @author Suparna Arya & Aswitha
 *
 */
@Entity(name="employees")
public class Employee {
	//empId is primary key for employees entity
	@Id
	@NotEmpty(message="Id cannot be empty")
	private long empId;
	@NotNull(message="Employee Name is required")
	private String empName;
	@NotNull(message="Phone Number is required")
	private String phoneNumber;
	@NotNull(message="Mail ID is required")
	private String empEmail;
	@NotNull(message="Employee Location is required")
	private String empLocation;
	@NotEmpty(message="Id cannot be empty")
	private long supervisiorId;
	
	//Employee details has one to many relationship with Attendance Detail entity using empId
	@OneToMany(mappedBy = "employee")
	private List<AttendanceDetails> attendance = new ArrayList<>();

	//setters and getters for Employee to access outside this class
	public long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String emp_Name) {
		this.empName = emp_Name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public List<AttendanceDetails> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<AttendanceDetails> attendance) {
		this.attendance = attendance;
	}

	public long getSupervisiorId() {
		return supervisiorId;
	}

	public void setSupervisiorId(long supervisiorId) {
		this.supervisiorId = supervisiorId;

	}

}