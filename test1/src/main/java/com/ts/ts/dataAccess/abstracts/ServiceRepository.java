package com.ts.ts.dataAccess.abstracts;

import com.ts.ts.entities.concretes.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
