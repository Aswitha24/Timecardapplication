package com.cg.attendance.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * This Java class contains all the attendance details
 * @author Suparna Arya & Aswitha
 *
 */
@Entity
public class AttendanceDetails {
	//attendanceId is primary key for attendance detail entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Creates  auto generated values for attendanceId
	private int attendanceId;
	@JsonFormat(pattern = "HH:MM")
	private String inTime;
	@JsonFormat(pattern = "HH:MM")
	private String outTime;
	@JsonFormat(pattern = "DD:MM:YYYY")
	private String date;
	@NotNull(message="Reason is required")
	private String reason;
	@NotNull(message="Type Id is required")
	private String typeId;
	@NotNull(message="Status: Pending")
	private String status;
	
	//Attendance details has many to one relationship with Employees entity using empId
	@ManyToOne
	@JoinColumn(name = "empId")
	private Employee employee;
	
    //setters and getters for Attendance details to access outside this class
	public int getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}
	
	/**
     * It returns the desired output for object
     */
	@Override
	public String toString() {
		return "AttendanceDetails [attendanceId=" + attendanceId + ", inTime=" + inTime + ", outTime=" + outTime
				+ ", date=" + date + ", reason=" + reason + ", typeId=" + typeId + ", status=" + status + ", employee="
				+ employee + "]";
	}
}
