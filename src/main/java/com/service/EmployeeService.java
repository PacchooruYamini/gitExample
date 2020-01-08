package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
 public void saveEmployeeData(Employee employee);

public List<Employee> getAllEmployees(Employee employee);

public void deleteEmployee(int id);
}
