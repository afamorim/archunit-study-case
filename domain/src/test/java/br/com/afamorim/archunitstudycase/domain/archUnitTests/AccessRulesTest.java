package br.com.afamorim.archunitstudycase.domain.archUnitTests;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class AccessRulesTest {

    @Test
    public void portImplementsRules(){
        JavaClasses importedClasses = new ClassFileImporter().importPackages("br.com.afamorim.archunitstudycase.domain");
        ArchRule rule = classes().that().resideInAPackage("..repository..").should().onlyBeAccessed().byAnyPackage("..adapter..");

        rule.check(importedClasses);
    }
}
