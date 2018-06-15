package com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model;

import java.util.List;

public class DashboardEmployees {

	private String total;
	private String month;
	private String employeesCount;
	private List<String> employees;
	private List<Integer> employeesAmount;

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

	public String getEmployeesCount() {
		return employeesCount;
	}

	public void setEmployeesCount(String employeesCount) {
		this.employeesCount = employeesCount;
	}

	public List<String> getEmployees() {
		return employees;
	}

	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}

	public List<Integer> getEmployeesAmount() {
		return employeesAmount;
	}

	public void setEmployeesAmount(List<Integer> employeesAmount) {
		this.employeesAmount = employeesAmount;
	}


}
