package org.soujava.samples.mongodb.products;

import jakarta.json.bind.annotation.JsonbVisibility;
import jakarta.nosql.Column;
import jakarta.nosql.Entity;
import jakarta.nosql.Id;
import org.soujava.samples.mongodb.products.infra.FieldVisibilityStrategy;

import java.util.List;
import java.util.Set;

@Entity
@JsonbVisibility(FieldVisibilityStrategy.class)
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
