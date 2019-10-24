package br.com.afamorim.archunitsutdycase.application.adapter;


import br.com.afamorim.archunitsutdycase.application.exception.BusinessException;
import br.com.afamorim.archunitsutdycase.application.model.Category;
import br.com.afamorim.archunitsutdycase.application.ports.CategoryPort;
import br.com.afamorim.archunitsutdycase.application.repository.CategoryRepository;

import java.util.List;

public class CategoryPortAdapter implements CategoryPort {

    private CategoryRepository  categoryRepository;

    public CategoryPortAdapter(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category insert(Category aCategory) throws BusinessException{
        if (aCategory.getName() == null || "".equals(aCategory.getName().trim())){
            throw new BusinessException("O campo nome não pode ser vazio");
        }
        return categoryRepository.insert(aCategory);
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }
}
