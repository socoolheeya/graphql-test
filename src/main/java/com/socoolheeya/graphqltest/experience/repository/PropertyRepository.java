package com.socoolheeya.graphqltest.experience.repository;


import com.socoolheeya.graphqltest.experience.model.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface PropertyRepository extends JpaRepository<Property, BigInteger> {
}
