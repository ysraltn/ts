package com.ts.ts.entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="customers")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", insertable = false, updatable = false)
    private int id;

    @Column(name = "customer_no", insertable = false,
            nullable = false, unique = true)
    private long customerNo;

    @Column(name = "customer_title")
    private String title;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;

    @OneToMany(mappedBy = "owner")
    private List<Product> ownProducts;

    @OneToMany(mappedBy = "user")
    private List<Product> useProducts;

    public Customer(String title) {
        this.title = title;
    }

    public Customer() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customer no='" + customerNo + '\'' +
                ", title='" + title +
                '}';
    }


}
