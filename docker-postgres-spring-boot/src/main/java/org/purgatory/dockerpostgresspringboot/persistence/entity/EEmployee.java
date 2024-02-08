package org.purgatory.dockerpostgresspringboot.persistence.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee")
public class EEmployee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "first_name", nullable = false, length = 50)
    String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    String lastName;

    @Column(name = "email", nullable = false, length = 100)
    String email;

    @Column(name = "department", nullable = false, length = 100)
    String department;

    @Column(name = "position", nullable = false, length = 100)
    String position;

    @Column(name = "salary", nullable = false)
    double salary;

    @Column(name = "hire_date", nullable = false)
    LocalDate hireDate;

}
