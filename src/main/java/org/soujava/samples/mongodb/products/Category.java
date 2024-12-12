package org.soujava.samples.mongodb.products;

import jakarta.nosql.Column;
import jakarta.nosql.Embeddable;

@Embeddable(Embeddable.EmbeddableType.GROUPING)
public record Category(@Column String name, @Column String description) {
}
