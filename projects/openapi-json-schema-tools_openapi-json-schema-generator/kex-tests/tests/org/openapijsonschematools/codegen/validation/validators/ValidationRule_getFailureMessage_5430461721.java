package org.openapijsonschematools.codegen.validation.validators;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openapijsonschematools.codegen.validation.validators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ValidationRule_getFailureMessage_5430461721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10732;

    public ValidationRule_getFailureMessage_5430461721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10767 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term10766 = ((Class) term10767).getDeclaredField((String) "ERROR");
        ((Field) term10766).setAccessible(true);
        Object enum10 = ((Field) term10766).get((Object) null);
        term10732 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term10732, term10732.getClass(), "severity", enum10);
        setField(term10732, term10732.getClass(), "description", "UiUYnPrcCi");
        setField(term10732, term10732.getClass(), "failureMessage", "UoYtihxVaS");
        setField(term10732, term10732.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFailureMessage", argTypes, term10732, args);
    }

};


