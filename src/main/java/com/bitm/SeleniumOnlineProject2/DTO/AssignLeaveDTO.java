package com.bitm.SeleniumOnlineProject2.DTO;

public class AssignLeaveDTO {

	private String employeename;
	private String leavetype;
	private String fromdatemonth;
	private String fromdateyear;
	private String fromdatedate;
	private String todatemonth;
	private String todateyear;
	private String todatedate;
	private String comment;

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getLeavetype() {
		return leavetype;
	}

	public void setLeavetype(String leavetype) {
		this.leavetype = leavetype;
	}

	public String getFromdatemonth() {
		return fromdatemonth;
	}

	public void setFromdatemonth(String fromdatemonth) {
		this.fromdatemonth = fromdatemonth;
	}

	public String getFromdateyear() {
		return fromdateyear;
	}

	public void setFromdateyear(String fromdateyear) {
		this.fromdateyear = fromdateyear;
	}

	public String getFromdatedate() {
		return fromdatedate;
	}

	public void setFromdatedate(String fromdatedate) {
		this.fromdatedate = fromdatedate;
	}

	public String getTodatemonth() {
		return todatemonth;
	}

	public void setTodatemonth(String todatemonth) {
		this.todatemonth = todatemonth;
	}

	public String getTodateyear() {
		return todateyear;
	}

	public void setTodateyear(String todateyear) {
		this.todateyear = todateyear;
	}

	public String getTodatedate() {
		return todatedate;
	}

	public void setTodatedate(String todatedate) {
		this.todatedate = todatedate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "AssignLeaveDTO [employeename=" + employeename + ", leavetype=" + leavetype + ", fromdatemonth="
				+ fromdatemonth + ", fromdateyear=" + fromdateyear + ", fromdatedate=" + fromdatedate + ", todatemonth="
				+ todatemonth + ", todateyear=" + todateyear + ", todatedate=" + todatedate + ", comment=" + comment
				+ "]";
	}

}
