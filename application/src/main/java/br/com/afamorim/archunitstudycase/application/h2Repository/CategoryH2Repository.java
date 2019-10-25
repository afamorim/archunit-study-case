package br.com.afamorim.archunitstudycase.application.h2Repository;

import br.com.afamorim.archunitstudycase.domain.model.Category;
import br.com.afamorim.archunitstudycase.domain.repository.CategoryRepository;

import java.util.List;

public class CategoryH2Repository implements CategoryRepository {
    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category insert(Category category) {
        return null;
    }
}
