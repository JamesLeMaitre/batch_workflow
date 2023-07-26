package com.mtj.batchworkflow.services.impls;

import com.mtj.batchworkflow.repositories.EmployeeRepository;
import com.mtj.batchworkflow.services.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class EmployeeImpl implements EmployeeService {
    private final EmployeeRepository repository;
}
