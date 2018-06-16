package com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model;

public class DashboardEmployeesReviews {

	private String id;
	private String departmentName;
	private String position;
	private String performanceIncrease;
	private String startingSalary;
	private String annualIncrease;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPerformanceIncrease() {
		return performanceIncrease;
	}

	public void setPerformanceIncrease(String performanceIncrease) {
		this.performanceIncrease = performanceIncrease;
	}

	public String getStartingSalary() {
		return startingSalary;
	}

	public void setStartingSalary(String startingSalary) {
		this.startingSalary = startingSalary;
	}

	public String getAnnualIncrease() {
		return annualIncrease;
	}

	public void setAnnualIncrease(String annualIncrease) {
		this.annualIncrease = annualIncrease;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
		
		
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
		
	}

}
