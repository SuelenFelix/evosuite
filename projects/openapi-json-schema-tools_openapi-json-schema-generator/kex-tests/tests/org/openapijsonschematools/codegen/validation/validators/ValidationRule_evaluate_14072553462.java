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

public class ValidationRule_evaluate_14072553462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11133;
     Object term11167;

    public ValidationRule_evaluate_14072553462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11169 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term11168 = ((Class) term11169).getDeclaredField((String) "ERROR");
        ((Field) term11168).setAccessible(true);
        Object enum11 = ((Field) term11168).get((Object) null);
        term11133 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term11133, term11133.getClass(), "severity", enum11);
        setField(term11133, term11133.getClass(), "description", "JDswTTCZHV");
        setField(term11133, term11133.getClass(), "failureMessage", "onpbIeEKoi");
        setField(term11133, term11133.getClass(), "test", null);
        term11167 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11167;
        callMethod(klass, "evaluate", argTypes, term11133, args);
    }

};


