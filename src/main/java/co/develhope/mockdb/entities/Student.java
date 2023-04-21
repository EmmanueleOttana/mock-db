package co.develhope.mockdb.entities;

import javax.persistence.*;
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String fistName;
    private String lastName;
    @Column(unique = true)
    private String email;
}