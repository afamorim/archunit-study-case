package br.com.afamorim.archunitstudycase.application.controller;

import br.com.afamorim.archunitstudycase.domain.model.Category;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/catories")
@Slf4j
public class CategoryController {


    @Secured("")
    public ResponseEntity<Category> criar(@RequestBody Category category, HttpServletResponse response) {

        return null;
    }
}
