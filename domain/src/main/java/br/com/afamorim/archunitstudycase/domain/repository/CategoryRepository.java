package br.com.afamorim.archunitstudycase.domain.repository;

import br.com.afamorim.archunitstudycase.domain.model.Category;

import java.util.List;

public interface CategoryRepository {

    public List<Category> findAll();

    public Category insert(Category category);
}
