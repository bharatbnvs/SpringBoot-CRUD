package com.angular.sprinboot.angularspringbootcrud.service;

import com.angular.sprinboot.angularspringbootcrud.entity.Employee;
import com.angular.sprinboot.angularspringbootcrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
       return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<Employee>();
        for (Employee emp : employeeRepository.findAll()) {

            employees.add(emp);
        }
        return employees;
    }

    public Employee getByEmployeeId(long id) {
        return employeeRepository.findById(id).get();
    }

    public Employee updateEmployee(long id, Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteById(long id) {
     employeeRepository.deleteById(id);
    }
}
