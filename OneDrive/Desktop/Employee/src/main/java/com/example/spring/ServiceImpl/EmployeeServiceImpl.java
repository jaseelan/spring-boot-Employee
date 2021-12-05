package com.example.spring.ServiceImpl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.spring.Execption.ResourceNotFoundExecption;
import com.example.spring.Repository.EmployeeRepository;
import com.example.spring.Service.EmployeeService;
import com.example.spring.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {

		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExecption("Employee", "Id", id));
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {

		// we need to check weather employee with given id is exist in db or not
		Employee existingemployee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExecption("Employee", "Id", id));
		existingemployee.setFirstName(employee.getFirstName());
		existingemployee.setLastName(employee.getLastName());
		existingemployee.setEmail(employee.getEmail());
// save existing employee to db
		employeeRepository.save(existingemployee);

		return existingemployee;
	}

	@Override
	public void deleteEmployee(long id) {
		// check weathr a employee
		employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundExecption("Employee", "Id", id));
		employeeRepository.deleteById(id);

	}

}
