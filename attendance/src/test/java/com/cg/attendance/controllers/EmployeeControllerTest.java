package com.cg.attendance.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.cg.attendance.entities.Employee;
import com.cg.attendance.services.EmployeeService;

public class EmployeeControllerTest {
	
	MockMvc mockMvc;
	
	@Autowired
	EmployeeService employeeService;

	@Test
	void test_getEmployeeDetailById() throws Exception{
		
		BDDMockito.given(employeeService.findEmployeeDetailById(Mockito.anyString())).willReturn(new Employee(46045146,"Aswitha","7032127711","aswi123@gmail.com","Banglore",45046123));
		
		mockMvc.perform(MockMvcRequestBuilders.get("/projects/First Project"))
		.andExpect(status().isOk()) 
		.andExpect(jsonPath("name").value("Aswitha"))
		.andExpect(jsonPath("empId").value("46045146"));
}
}
