package org.soujava.samples.mongodb.products;

import jakarta.nosql.Column;
import jakarta.nosql.Embeddable;

@Embeddable(Embeddable.EmbeddableType.GROUPING)
public class Category {

    @Column
    private String name;

    @Column
    private String description;
}
