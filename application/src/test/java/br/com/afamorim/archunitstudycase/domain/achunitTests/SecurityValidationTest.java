package br.com.afamorim.archunitstudycase.domain.achunitTests;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class SecurityValidationTest {

    @Test
    public void controlleSecuredRules(){
        JavaClasses importedClasses = new ClassFileImporter().importPackages("br.com.afamorim.archunitstudycase.application");
        ArchRule rule = classes()
                .that()
                .resideInAPackage("..controller..")
                .should(ArchUnitExtensoes.metodoSeguro());

        rule.check(importedClasses);
    }
}
