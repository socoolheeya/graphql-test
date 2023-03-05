package com.socoolheeya.graphqltest.experience.controller;

import com.socoolheeya.graphqltest.experience.model.entity.Property;
import com.socoolheeya.graphqltest.experience.service.PropertyService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.math.BigInteger;

@Controller
@RequiredArgsConstructor
public class PropertyController {
    private final PropertyService propertyService;

    @QueryMapping
    public Property getProperty(@Argument BigInteger id) {
        return propertyService.getProperty(id);
    }

    @MutationMapping
    public Property saveProperty(@Argument Property property) {
        return propertyService.saveProperty(property);
    }

    @MutationMapping
    public void deleteProperty(@Argument BigInteger id) {
        propertyService.deleteProperty(id);
    }
}
