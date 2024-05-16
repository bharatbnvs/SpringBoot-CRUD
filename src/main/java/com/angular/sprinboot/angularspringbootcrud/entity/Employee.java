package com.angular.sprinboot.angularspringbootcrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "emp2")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String name;
    int age;
    double salary;
    String address;
    String phone;
    String email;
    String department;
}
