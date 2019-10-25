package br.com.afamorim.archunitstudycase.domain.archUnitTests;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaConstructor;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class ArchunitExtensoes {

    public static ArchCondition<JavaClass> temConstrutorPadrao(){
        return new ArchCondition<JavaClass>("Tem Construtor padão") {
            @Override
            public void check(JavaClass javaClass, ConditionEvents conditionEvents) {
                Optional<JavaConstructor> defaultConstructor = javaClass.getAllConstructors()
                        .stream()
                        .filter(Constructor -> javaClass.equals(Constructor.getOwner()))
                        .filter(this::naoTemParametros)
                        .filter(this::podeSerInstaciado)
                        .findAny();

                conditionEvents.add(new SimpleConditionEvent(javaClass, defaultConstructor.isPresent(),
                        String.format("Não encontrato construtor padrão %s", javaClass.getName())));
            }

            private boolean naoTemParametros(JavaConstructor jc){
                return jc.getRawParameterTypes().isEmpty();
            }

            private boolean podeSerInstaciado(JavaConstructor jc){
                try {
                    jc.reflect().newInstance();
                    return true;
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        };
    }
}
