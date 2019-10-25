package br.com.afamorim.archunitstudycase.domain.achunitTests;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.runner.RunWith;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "br.com.afamorim.archunitstudycase.application")
public class ArchunitAccessRules {

//    @Test
//    public void portImplementsRules(){
//        JavaClasses importedClasses = new ClassFileImporter().importPackages("br.com.afamorim.archunitstudycase.application");
//        ArchRule rule = classes().that().resideInAPackage("..repository..").should().onlyBeAccessed().byAnyPackage("..adapter..");
//
//        rule.check(importedClasses);
//    }

    @ArchTest
    public static final ArchRule repository_acced_by_service_annoted =
            classes().that().resideInAPackage("..h2Repository..").should(ArchUnitExtensoes.metodoService());
}
