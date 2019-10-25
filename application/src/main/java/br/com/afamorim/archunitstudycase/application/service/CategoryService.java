package br.com.afamorim.archunitstudycase.application.service;

import br.com.afamorim.archunitstudycase.domain.model.Category;
import br.com.afamorim.archunitstudycase.domain.repository.CategoryRepository;

public class CategoryService {

    private CategoryRepository  categoryRepository;

    public Category insert(Category aCategory){
        return categoryRepository.insert(aCategory);
    }

}
