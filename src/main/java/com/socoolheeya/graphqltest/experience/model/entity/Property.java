package com.socoolheeya.graphqltest.experience.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;
import java.time.LocalTime;
import java.util.List;

@Getter
@Builder
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Property {
    @Id
    @Column(name = "property_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    BigInteger id;
    String name;
    @Embedded
    Address address;
    String introduce;
    String notice;
    String description;
    @JsonFormat(pattern = "mm:dd")
    LocalTime checkIn;
    @JsonFormat(pattern = "mm:dd")
    LocalTime checkout;
    List<com.socoolheeya.graphqltest.experience.model.enums.Property.Facility> facilities;
    List<com.socoolheeya.graphqltest.experience.model.enums.Property.Service> services;
    @OneToOne
    Supplier supplier;

}
