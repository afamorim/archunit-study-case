package br.com.afamorim.archunitstudycase.domain.achunitTests;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import com.tngtech.archunit.library.GeneralCodingRules;
import org.junit.runner.RunWith;
import org.slf4j.Logger;

@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "..br.com.afamorim..")
public class CodingRulesTests {

    @ArchTest
    static final ArchRule naoLanceExcecoesGenericas = GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS;

}
