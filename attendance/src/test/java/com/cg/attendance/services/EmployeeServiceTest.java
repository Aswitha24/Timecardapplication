package com.cg.attendance.services;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.attendance.entities.Employee;
import com.cg.attendance.repositories.EmployeeRepository;

public class EmployeeServiceTest {
	
			@MockBean
			private EmployeeRepository employeeRepository;
			@Autowired
			private IEmployeeService customerService;
			
			@Test
			public  void testGetEmployeeById(){
				Employee employee1=new Employee(46045146,"Aswitha","7032127711","aswi123@gmail.com","Banglore",45046123);
				
			    Mockito.when(employeeRepository.GetEmployeeById(46045146)).thenReturn(employee1);
			    assertThat(customerService.listGetEmployeeById(46045146)).isEqualTo(employee1);
			}

}