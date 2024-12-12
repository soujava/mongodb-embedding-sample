package org.soujava.samples.mongodb.products;

import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;

import java.util.List;
import java.util.Set;

@Entity
public class Product {

    @Id
    private String id;

    @Column
    private String name;

    @Column
    private Manufacturer manufacturer;

    @Column
    private List<String> tags;

    @Column
    private Set<Category> categories;
}
