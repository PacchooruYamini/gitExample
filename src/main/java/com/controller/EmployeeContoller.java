package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeService;
@Controller
public class EmployeeContoller {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping(value="/")
  public ModelAndView create(){
	  return new ModelAndView("index");
  }
	@RequestMapping(value="/addEmployee")
	  public ModelAndView loadPage(@ModelAttribute("employee") Employee employee){
		  return new ModelAndView("AddEmployee");
	  }
	@RequestMapping(value="/save")
	  public ModelAndView saveData(@ModelAttribute("employee") Employee employee){
		employeeService.saveEmployeeData(employee);
		  return new ModelAndView("redirect:/viewEmployee");
	  }
	@RequestMapping(value="/viewEmployee")
	  public ModelAndView viewPage(@ModelAttribute("employee") Employee employee){
		List<Employee> empList=employeeService.getAllEmployees(employee);
		  return new ModelAndView("ViewEmployee","listofemployees",empList);
	  }
	@RequestMapping(value="/deleteEmployee")
	  public ModelAndView deleteData(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(id);
		return new ModelAndView("redirect:/viewEmployee");
	  }
}
