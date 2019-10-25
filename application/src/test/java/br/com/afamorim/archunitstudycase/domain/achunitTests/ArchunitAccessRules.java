package br.com.afamorim.archunitstudycase.domain.achunitTests;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.Test;

public class ArchunitAccessRules {

    @Test
    public void portImplementsRules(){
        JavaClasses importedClasses = new ClassFileImporter().importPackages("br.com.afamorim.archunitstudycase.application");
    }
}
