package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeDao;
import com.model.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeDao employeDao ;
	
@Override
public void saveEmployeeData(Employee employee) {
employeDao.saveEmployeeData(employee);
	
}

@Override
public List<Employee> getAllEmployees(Employee employee) {
	
	return employeDao.getAllEmployees(employee);
}

@Override
public void deleteEmployee(int id) {
	employeDao.deleteEmployee(id);
	
}
	
}
