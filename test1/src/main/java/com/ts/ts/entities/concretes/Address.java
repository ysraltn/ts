package com.ts.ts.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customer_addresses")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", insertable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "address")
    private String address;
}
