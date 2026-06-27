package org.nira.seedstore;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;

    public List<ProductDTO> getAllProducts() {
        return productRepo.findAll().stream()
                .map(p -> new ProductDTO(
                        p.getId(),
                        p.getName(),
                        p.getDescription(),
                        p.getImageUrl(),
                        p.getPrice(),
                        p.getCategory().getName()
                ))
                .toList();
    }

    public List<ProductDTO> getAllProductsByCategory(Long categoryId) {
        return productRepo.findByCategoryId(categoryId).stream()
                .map(p -> new ProductDTO(
                        p.getId(),
                        p.getName(),
                        p.getDescription(),
                        p.getImageUrl(),
                        p.getPrice(),
                        p.getCategory().getName()
                ))
                .toList();
    }
}


