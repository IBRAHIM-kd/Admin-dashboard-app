package com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model;

import java.util.List;

public class DashboardPositions {

	private String total;
	private String month;
	private String count;
	private List<String> positions;
	private List<Integer> positionsPercentage;

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

	public List<String> getPositions() {
		return positions;
	}

	public void setPositions(List<String> positions) {
		this.positions = positions;
	}

	public List<Integer> getPositionsPercentage() {
		return positionsPercentage;
	}

	public void setPositionsPercentage(List<Integer> positionsPercentage) {
		this.positionsPercentage = positionsPercentage;
	}

}
