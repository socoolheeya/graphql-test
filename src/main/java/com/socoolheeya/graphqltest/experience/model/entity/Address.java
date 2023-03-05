package com.socoolheeya.graphqltest.experience.model.entity;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Embeddable
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {
    String city;
    String region;
    String country;
    String zipCode;
    String defaultAddress;
    String detailAddress;

}
