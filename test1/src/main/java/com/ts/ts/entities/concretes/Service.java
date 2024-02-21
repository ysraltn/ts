package com.ts.ts.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "services")
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", insertable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "status")
    private String status;

    @Column(name = "process")
    private String process;


}
