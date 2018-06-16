package com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model;

import java.util.List;

public class DashboardBirthdays {

	private String total;
	private String month;
	private String count;
	private List<String> birthdayslist;
	private List<Integer> birthdaysCount;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public List<String> getBirthdaysList() {
		return birthdayslist;
	}

	public void setBirthdaysList(List<String> birthdayslist) {
		this.birthdayslist = birthdayslist;
	}

	public List<Integer> getBirthdaysCount() {
		return birthdaysCount;
	}

	public void setBirthdaysCount(List<Integer> birthdaysCount) {
		this.birthdaysCount = birthdaysCount;
	}
}
