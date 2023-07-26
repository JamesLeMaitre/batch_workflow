package com.mtj.batchworkflow.repositories;

import com.mtj.batchworkflow.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
