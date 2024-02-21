package com.ts.ts.dataAccess.abstracts;

import com.ts.ts.entities.concretes.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
