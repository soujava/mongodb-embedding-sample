package org.soujava.samples.mongodb.products;

import jakarta.json.bind.annotation.JsonbVisibility;
import jakarta.nosql.Column;
import jakarta.nosql.Embeddable;
import org.soujava.samples.mongodb.products.infra.FieldVisibilityStrategy;

@Embeddable(Embeddable.EmbeddableType.GROUPING)
@JsonbVisibility(FieldVisibilityStrategy.class)
public class Manufacturer {

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String contactNumber;
}
