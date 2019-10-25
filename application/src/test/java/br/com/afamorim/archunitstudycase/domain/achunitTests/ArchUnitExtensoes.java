package br.com.afamorim.archunitstudycase.domain.achunitTests;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaMethod;
import com.tngtech.archunit.core.domain.JavaMethodCall;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;
import org.springframework.security.access.annotation.Secured;

public class ArchUnitExtensoes {

    public static ArchCondition<JavaClass> metodoSeguro(){
        return new ArchCondition<JavaClass>("only be accessed by @Secured methods") {
            @Override
            public void check(JavaClass item, ConditionEvents events) {
//                for (JavaMethodCall call : item.getMethodCallsToSelf()) {
//                    if (!call.getOrigin().isAnnotatedWith(Secured.class)) {
//                        String message = String.format(
//                                 "Method %s is not @Secured", call.getOrigin().getFullName());
//                        events.add(SimpleConditionEvent.violated(call, message));
//                    }
//                }
                for (JavaMethod method : item.getMethods()) {
                    if (!method.isAnnotatedWith(Secured.class)) {
                        String message = String.format(
                                 "Method %s is not @Secured", method.getFullName());
                        events.add(SimpleConditionEvent.violated(method, message));
                    }
                }
            }
        };
    }
}
