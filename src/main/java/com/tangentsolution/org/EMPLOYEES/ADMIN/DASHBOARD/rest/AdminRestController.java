package com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model.DashboardBirthdays;
import com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model.DashboardEmployees;
import com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model.DashboardCount;
import com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model.DashboardPositions;
import com.tangentsolution.org.EMPLOYEES.ADMIN.DASHBOARD.model.DashboardEmployeesReviews;

@RestController
public class AdminRestController {

	@RequestMapping(value = "/dashboardcount", method = RequestMethod.GET)
	public DashboardCount dashboardCount() {
		DashboardCount dashboardCount = new DashboardCount();
		dashboardCount.setBirthdays("55");
		dashboardCount.setEmployees("155");
		dashboardCount.setPositions("81");
		dashboardCount.setReviews("75");
		return dashboardCount;
	}
	
	@RequestMapping(value = "/dashboardemployees", method = RequestMethod.GET)
	public DashboardEmployees dashboardEmployees() {
		DashboardEmployees dashboardEmployees = new DashboardEmployees();
		dashboardEmployees.setCount("100");
		dashboardEmployees.setMonth("July 2018");
		dashboardEmployees.setTotal("8900");
		List<String> employees = new ArrayList<>();
		employees.add("Mr Ibrahim Abdullahi");
		employees.add("Mr Ernest Dauda");
		employees.add("Mr Denials Goodlucks");
		employees.add("Mrs Vicky Diamonds");
		employees.add("Mr  Mark Copers");
		employees.add("Engineer Bills Capsis");
		employees.add("Engineer Prinsloo Gills");
		employees.add("Mr James Tupacs");
		employees.add("Mrs Tebogo Frieds");
		employees.add("Engineer Musa Abu");
		dashboardEmployees.setEmployees(employees);
		List<Integer> employeesAmount = new ArrayList<>();
		employeesAmount.add(8900);
		employeesAmount.add(6700);
		employeesAmount.add(1000);
		employeesAmount.add(4500);
		employeesAmount.add(3500);
		employeesAmount.add(9000);
		employeesAmount.add(5500);
		employeesAmount.add(7100);
		employeesAmount.add(9500);
		employeesAmount.add(8800);
		dashboardEmployees.setEmployeesAmount(employeesAmount);
		return dashboardEmployees;
	}

	@RequestMapping(value = "/dashboardbirthdays", method = RequestMethod.GET)
	public DashboardBirthdays dashboardBirthdays() {
		DashboardBirthdays dashboardBirthdays= new DashboardBirthdays();
		dashboardBirthdays.setCount("23");
		dashboardBirthdays.setMonth("JUNE 2017");
		dashboardBirthdays.setTotal("67");
		
		List<String> birthdays = new ArrayList<>();
		birthdays.add("JUNE");
		birthdays.add("JUNE");
		birthdays.add("JUNE");
		birthdays.add("JUNE");
		dashboardBirthdays.setBirthdays(birthdays);

		List<Integer> birthsCount = new ArrayList<>();
		birthsCount.add(20);
		birthsCount.add(10);
		birthsCount.add(30);
		birthsCount.add(7);
		dashboardBirthdays.setBirthdaysCount(birthsCount);
		return dashboardBirthdays;
	}
	
	@RequestMapping(value = "/dashboardpositions", method = RequestMethod.GET)
	public DashboardPositions dashboardPositions() {
		DashboardPositions dashboardPositions = new DashboardPositions();
		dashboardPositions.setCount("+21%");
		dashboardPositions.setMonth("JUNE 2018");
		dashboardPositions.setTotal("80%");

		List<String> positions = new ArrayList<>();
		positions.add("Java Software Engineerin");
		positions.add("Java/Devops Engineering");
		positions.add("Python Developer");
		positions.add("Front-end Developer");
		positions.add("Javascripts Developer");
		positions.add("Website designer");
		positions.add("ETL Developer");
		positions.add("Cloud Platform Engineer");
		positions.add("Intergration Developer");
		positions.add(".NET Developer");
		dashboardPositions.setPositions(positions);

		List<Integer> positionsPercentage = new ArrayList<>();
		positionsPercentage.add(88);
		positionsPercentage.add(95);
		positionsPercentage.add(55);
		positionsPercentage.add(90);
		positionsPercentage.add(35);
		positionsPercentage.add(45);
		positionsPercentage.add(100);
		positionsPercentage.add(67);
		positionsPercentage.add(89);
		positionsPercentage.add(71);

		dashboardPositions.setPositionsPercentage(positionsPercentage);

		return dashboardPositions;
	}

	@RequestMapping(value = "/employeereviews", method = RequestMethod.GET)
	public List<DashboardEmployeesReviews> employeereviews() {
		List<DashboardEmployeesReviews> employeereviewslist = new ArrayList<>();

		DashboardEmployeesReviews dashboardDashboardEmployeeReviews1 = new DashboardEmployeesReviews();
		dashboardDashboardEmployeeReviews1.setId("1");
		dashboardDashboardEmployeeReviews1.setDepartmentName("JAVA ENGINEER DEPARTMENT");
		dashboardDashboardEmployeeReviews1.setPosition("JAVA ENGINEER DEPARTMENT");
		dashboardDashboardEmployeeReviews1.setPerformanceIncrease("R 9500");
		dashboardDashboardEmployeeReviews1.setStartingSalary("R 60000");
		dashboardDashboardEmployeeReviews1.setAnnualIncrease("80%");
		employeereviewslist.add(dashboardDashboardEmployeeReviews1);

		DashboardEmployeesReviews dashboardDashboardEmployeeReviews2 = new DashboardEmployeesReviews();
		dashboardDashboardEmployeeReviews2.setId("1");
		dashboardDashboardEmployeeReviews1.setDepartmentName("CLOUD ENGINEERING DEPARTMENT");
		dashboardDashboardEmployeeReviews1.setPosition("CLOUD PLATFORM ENGINEER");
		dashboardDashboardEmployeeReviews2.setPerformanceIncrease("R 6500");
		dashboardDashboardEmployeeReviews2.setStartingSalary("R 55000");
		dashboardDashboardEmployeeReviews2.setAnnualIncrease("75%");
		employeereviewslist.add(dashboardDashboardEmployeeReviews2);


		DashboardEmployeesReviews dashboardDashboardEmployeeReviews3 = new DashboardEmployeesReviews();
		dashboardDashboardEmployeeReviews3.setId("1");
		dashboardDashboardEmployeeReviews1.setDepartmentName("DEV-OPS ENGINEERING DEPARTMENT");
		dashboardDashboardEmployeeReviews1.setPosition("DEV-OPS ENGINEER ");
		dashboardDashboardEmployeeReviews3.setPerformanceIncrease("R4500 ");
		dashboardDashboardEmployeeReviews3.setStartingSalary("R 35000");
		dashboardDashboardEmployeeReviews3.setAnnualIncrease("65%");
		employeereviewslist.add(dashboardDashboardEmployeeReviews3);

		return employeereviewslist;
	}

}
