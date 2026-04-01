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

public class ValidationRule_getSeverity_1689805823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11535;

    public ValidationRule_getSeverity_1689805823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11572 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term11571 = ((Class) term11572).getDeclaredField((String) "WARNING");
        ((Field) term11571).setAccessible(true);
        Object enum12 = ((Field) term11571).get((Object) null);
        term11535 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term11535, term11535.getClass(), "severity", enum12);
        setField(term11535, term11535.getClass(), "description", "YRHGsAkhxb");
        setField(term11535, term11535.getClass(), "failureMessage", "ffYhPOzlUs");
        setField(term11535, term11535.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeverity", argTypes, term11535, args);
    }

};


