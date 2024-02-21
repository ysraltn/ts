package com.ts.ts.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "customer_products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", insertable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Customer owner;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Customer user;

    @Column(name = "serial_no", unique = true)
    private int serialNo;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @OneToMany(mappedBy = "product")
    private List<Service> services;


}
