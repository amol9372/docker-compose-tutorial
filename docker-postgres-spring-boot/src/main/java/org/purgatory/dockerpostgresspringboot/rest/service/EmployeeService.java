package org.purgatory.dockerpostgresspringboot.rest.service;

import org.purgatory.dockerpostgresspringboot.persistence.entity.EEmployee;
import org.purgatory.dockerpostgresspringboot.rest.model.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EEmployee getEmployee(String email);

    void addEmployee(Employee request);
}
