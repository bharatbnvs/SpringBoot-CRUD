package com.angular.sprinboot.angularspringbootcrud.controller;

import com.angular.sprinboot.angularspringbootcrud.entity.Employee;
import com.angular.sprinboot.angularspringbootcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/v1/service/emp")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;


    @PostMapping("/saveEmp")
    public Employee saveEmployee(@RequestBody Employee employee) {


        return employeeService.save(employee);
    }
    @GetMapping("/getAll")
    public List<Employee> getEmployee() {
        System.out.println(employeeService.getAllEmployee());
        return employeeService.getAllEmployee();
    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/{id}")
    public Employee getById(@PathVariable long id) {

        return employeeService.getByEmployeeId(id);
    }
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id,employee);

    }
    @DeleteMapping("/{id}")
    public void updateEmployee(@PathVariable long id) {
         employeeService.deleteById(id);

    }


}
