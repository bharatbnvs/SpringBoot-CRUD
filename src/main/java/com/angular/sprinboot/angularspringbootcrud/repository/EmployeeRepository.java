package com.angular.sprinboot.angularspringbootcrud.repository;

import com.angular.sprinboot.angularspringbootcrud.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
