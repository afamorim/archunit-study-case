package br.com.afamorim.archunitsutdycase.application.service;


import br.com.afamorim.archunitsutdycase.application.model.Category;
import br.com.afamorim.archunitsutdycase.application.repository.CategoryRepository;

import java.util.List;

public class CategoryService {

    private CategoryRepository  categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
}
