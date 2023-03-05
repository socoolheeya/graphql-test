package com.socoolheeya.graphqltest.experience.service;


import com.socoolheeya.graphqltest.experience.model.entity.Property;
import com.socoolheeya.graphqltest.experience.repository.PropertyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class PropertyService {
    private final PropertyRepository propertyRepository;


    public Property getProperty(BigInteger id) {
        return propertyRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 숙소 입니다."));
    }

    public Property saveProperty(Property property) {
        return propertyRepository.save(property);
    }

    public void deleteProperty(BigInteger id) {
        propertyRepository.deleteById(id);
    }
}
