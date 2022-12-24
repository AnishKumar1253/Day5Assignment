package com.masai.app;

import java.time.LocalDate;
import java.util.List;

import com.masai.app.entity.Car;
import com.masai.app.entity.Employee;
import com.masai.app.service.CarServiceImpl;
import com.masai.app.service.EmployeeServiceImpl;

public class App {
	public static void main(String args[]) {
		CarServiceImpl carServiceImpl=new CarServiceImpl();
		EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
		employeeServiceImpl.EmployeeDelete(3);
	}
}
