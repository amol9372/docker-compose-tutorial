package org.purgatory.dockerpostgresspringboot.persistence.repository;

import java.util.Optional;
import org.purgatory.dockerpostgresspringboot.persistence.entity.EEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EEmployee, Integer> {
    Optional<EEmployee> findByEmail(String email);
}
