 package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.EmployeeDao;
import com.app.entities.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
//dep :
	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return empDao.findAll();
	}

	@Override
	public Employee addEmpDetails(Employee newEmp) {
		// TODO Auto-generated method stub
		return empDao.save(newEmp); // persistent
	} // rets detached entity to the caller

	@Override
	public String deleteEmpDetails(Long empId) {
		if(empDao.existsById(empId)) {
			empDao.deleteById(empId);
			return "Deleted emp details....";
		}
		return "Invalid emp id !!!!!!";
	}

	@Override
	public Employee getEmpDetails(Long empId) {
		
		return empDao.findById(empId).orElseThrow(() -> 
		new ResourceNotFoundException("Invalid Emp ID !!!!"));
	}
	/*
	 * in case of success : method rets detached emp pojo
	 * in case failure : throws : ResourceNotFoundException
	 */

	@Override
	public Employee updateEmpDetails(Employee emp) {
		// TODO Auto-generated method stub
		return empDao.save(emp);
	}
	
	
	
	
	

}
