package br.com.afamorim.archunitstudycase.domain.ports;

import br.com.afamorim.archunitstudycase.domain.exception.BusinessException;
import br.com.afamorim.archunitstudycase.domain.model.Category;

import java.util.List;

public interface CategoryPort {

    public Category insert(Category aCategory) throws BusinessException;

    public List<Category> findAll();
}
