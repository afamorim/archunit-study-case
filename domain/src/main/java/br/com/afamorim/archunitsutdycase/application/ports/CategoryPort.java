package br.com.afamorim.archunitsutdycase.application.ports;

import br.com.afamorim.archunitsutdycase.application.exception.BusinessException;
import br.com.afamorim.archunitsutdycase.application.model.Category;

import java.util.List;

public interface CategoryPort {

    public Category insert(Category aCategory) throws BusinessException;

    public List<Category> findAll();
}
