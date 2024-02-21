package com.ts.ts.dataAccess.abstracts;

import com.ts.ts.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
