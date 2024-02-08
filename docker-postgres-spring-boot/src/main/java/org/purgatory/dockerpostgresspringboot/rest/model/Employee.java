package org.purgatory.dockerpostgresspringboot.rest.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    String firstName;
    String lastName;
    String email;
    String department;
    String position;
    double salary;
}
