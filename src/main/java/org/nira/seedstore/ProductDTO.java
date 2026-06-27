package org.nira.seedstore;

public record ProductDTO(
    Long id,
    String name,
    String description,
    String imageUrl,
    Double price,
    String categoryName
) {}