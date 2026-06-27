package org.nira.seedstore;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepo categoryRepo;

    public List<CategoryDTO> getAllCategories() {
        return categoryRepo.findAll().stream()
                .map(c -> new CategoryDTO(c.getId(), c.getName()))
                .toList();
    }
}
