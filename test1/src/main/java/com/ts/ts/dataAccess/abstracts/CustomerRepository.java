package com.ts.ts.dataAccess.abstracts;

import com.ts.ts.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
