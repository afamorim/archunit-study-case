package br.com.afamorim.archunitstudycase.domain.archUnitTests;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchUnitRunner;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.GeneralCodingRules;
import org.junit.runner.RunWith;


@RunWith(ArchUnitRunner.class)
@AnalyzeClasses(packages = "..br.com.afamorim..")
public class ExceptionsTest {

    @ArchTest
    static final ArchRule naoLanceExcecoesGenericas = GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS;
}
