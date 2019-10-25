package br.com.afamorim.archunitstudycase.domain.ports;

import br.com.afamorim.archunitstudycase.domain.model.Category;
import br.com.afamorim.archunitstudycase.domain.repository.CategoryRepository;

import java.util.List;

public class TestePort {

    private CategoryRepository categoryRepository;

    public void fazendoAlgumaCoisa(){
        List<Category> retorno = categoryRepository.findAll();
        
    }
}
