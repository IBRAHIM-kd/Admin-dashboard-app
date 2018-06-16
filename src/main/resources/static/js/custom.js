$(document)
		.ready(
				function() {
					$.ajax({
						url : "/dashboardcount",
						success : function(result) {
							$("#employeesCount").html(result.employees);
							$("#birthdaysCount").html(result.birthdays);
							$("#positionsCount").html(result.positions);
							$("#reviewscount").html(result.reviews);
						}
					});

					$
							.ajax({
								url : "/dashboardemployees",
								success : function(result) {
									$("#employeesHTML")
											.html(
													'<strong class="d-block dashtext-3">'
															+ result.total
															+ '</strong><span class="d-block">'
															+ result.month
															+ '</span><small class="d-block"><div>'
															+ result.Count
															+ 'Employees </div></small>');
									
									var BARCHART1 = $('#visitPieChart');
									var barChartHome = new Chart(BARCHART1, {
										type : 'bar',
										options : {
											scales : {
												xAxes : [ {
													display : false,
													barPercentage : 0.2
												} ],
												yAxes : [ {
													display : false
												} ],
											},
											legend : {
												display : false
											}
										},
										data : {
											labels : result.employees,
											datasets : [ {
												label : "Employees in",
												backgroundColor : [ '#EF8C99',
														'#EF8C99', '#EF8C99',
														'#EF8C99', '#EF8C99',
														'#EF8C99', '#EF8C99',
														'#EF8C99', '#EF8C99',
														'#EF8C99', '#EF8C99' ],
												borderColor : [ '#EF8C99',
														'#EF8C99', '#EF8C99',
														'#EF8C99', '#EF8C99',
														'#EF8C99', '#EF8C99',
														'#EF8C99', '#EF8C99',
														'#EF8C99', '#EF8C99' ],
												borderWidth : 0.2,
												data : result.employeesAmount
											} ]
										}
									});

								}
							});

					$
							.ajax({
								url : "/dashboardbirthdays",
								success : function(result) {
									$("#birthdaysHTML")
											.html(
													'<strong class="d-block dashtext-3">'
													+ result.total
													+ '</strong><span class="d-block">'
													+ result.month
													+ '</span><small class="d-block"><div>'
													+ result.Count
													+ 'Birthdays </div></small>');

									var PIECHARTEXMPLE = $('#visitPieChart');
									var pieChartExample = new Chart(
											PIECHARTEXMPLE,
											{
												type : 'pie',
												options : {
													legend : {
														display : false
													}
												},
												data : {
													labels : result.birthdays,
													datasets : [ {
														data : result.birthdaysCount,
														borderWidth : 0,
														backgroundColor : [
																'#723ac3',
																"#864DD9",
																"#9762e6",
																"#a678eb" ],
														hoverBackgroundColor : [
																'#723ac3',
																"#864DD9",
																"#9762e6",
																"#a678eb" ]
													} ]
												}
											});

								}
							});

					$
							.ajax({
								url : "/dashboardpositions",
								success : function(result) {
									$("#positionsHTML")
											.html(
													'<strong class="d-block dashtext-3">'
													+ result.total
													+ '</strong><span class="d-block">'
													+ result.month
													+ '</span><small class="d-block"><div>'
													+ result.Count
													+ 'Positions </div></small>');

									var BARCHART1 = $('#salesBarChart2');
									var barChartHome = new Chart(BARCHART1, {
										type : 'bar',
										options : {
											scales : {
												xAxes : [ {
													display : false,
													barPercentage : 0.2
												} ],
												yAxes : [ {
													display : false
												} ],
											},
											legend : {
												display : false
											}
										},
										data : {
											labels : result.position,
											datasets : [ {
												label : "Position in %",
												backgroundColor : [ '#CF53F9',
														'#CF53F9', '#CF53F9',
														'#CF53F9', '#CF53F9',
														'#CF53F9', '#CF53F9',
														'#CF53F9', '#CF53F9',
														'#CF53F9', '#CF53F9' ],
												borderColor : [ '#CF53F9',
														'#CF53F9', '#CF53F9',
														'#CF53F9', '#CF53F9',
														'#CF53F9', '#CF53F9',
														'#CF53F9', '#CF53F9',
														'#CF53F9', '#CF53F9' ],
												borderWidth : 0.2,
												data : result.positionsPercentage
											} ]
										}
									});

								}
							});

					$.ajax({
						url : "/employeereviews",
						success : function(result) {
							for (var i = 0; i < result.length; i++) {

								var htmlcontent = '<tr><th scope="row">'
										+ result[i].id + '</th><td>'
										+ result[i].performanceIncrease + '</td><td>'
										+ result[i].startingSalary + '</td><td>'
										+ result[i].annualIncrease + '</td></tr>';

								$('#tableBodyHTML').append(htmlcontent);
							}
						}
					});

					

				});