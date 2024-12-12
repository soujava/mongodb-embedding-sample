package org.soujava.samples.mongodb.products;

import jakarta.nosql.Column;
import jakarta.nosql.Embeddable;

@Embeddable(Embeddable.EmbeddableType.GROUPING)
public class Manufacturer {

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String contactNumber;
}
