package org.nira.seedstore;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo productRepo;


    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


    public List<Product> getAllProductsByCategory(Long categoryId) {
        return productRepo.findByCategoryId(categoryId);
    }
}

