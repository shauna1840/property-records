package com.crowdstreet.property.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private int phone;

    @Column(name = "address")
    private String address;




}
