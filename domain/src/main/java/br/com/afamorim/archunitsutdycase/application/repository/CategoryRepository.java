package br.com.afamorim.archunitsutdycase.application.repository;

import br.com.afamorim.archunitsutdycase.application.model.Category;

import java.util.List;

public interface CategoryRepository {

    public List<Category> findAll();
}
