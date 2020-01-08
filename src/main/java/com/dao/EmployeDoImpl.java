package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.repository.EmployeeRepository;
@Repository
public class EmployeDoImpl implements EmployeDao {
@Autowired
EmployeeRepository employeeRepository;
	
	public void saveEmployeeData(Employee employee) {
		employeeRepository.save(employee); 
		
	}

	@Override
	public List<Employee> getAllEmployees(Employee employee) {
		
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(int id) {
	employeeRepository.delete(id);
		
	}

}
