package br.com.afamorim.archunitstudycase.domain.archUnitTests;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ConstructorPatternTests {

    @Test
    public void modelImplementsConstructorRules(){
        JavaClasses importedClasses = new ClassFileImporter().importPackages("br.com.afamorim.archunitstudycase.domain");
        ArchRule rule = classes()
                .that()
                .resideInAPackage("..model..")
                .should(ArchunitExtensoes.temConstrutorPadrao());

        rule.check(importedClasses);
    }
}
