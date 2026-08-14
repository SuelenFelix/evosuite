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

public class Validated_valid_17753910743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14097;

    public Validated_valid_17753910743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14132 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term14131 = ((Class) term14132).getDeclaredField((String) "ERROR");
        ((Field) term14131).setAccessible(true);
        Object enum18 = ((Field) term14131).get((Object) null);
        term14097 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term14097, term14097.getClass(), "severity", enum18);
        setField(term14097, term14097.getClass(), "description", "KoyGrUJeJW");
        setField(term14097, term14097.getClass(), "failureMessage", "HqBOwkVqjD");
        setField(term14097, term14097.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Validated");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        Object[] args = new Object[1];
        args[0] = term14097;
        callMethod(klass, "valid", argTypes, null, args);
    }

};


