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
import java.lang.Object;
import java.lang.String;

public class Valid_getMessage_5734377292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15317;

    public Valid_getMessage_5734377292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15355 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term15354 = ((Class) term15355).getDeclaredField((String) "WARNING");
        ((Field) term15354).setAccessible(true);
        Object enum21 = ((Field) term15354).get((Object) null);
        term15317 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Valid"));
        Object term15318 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term15318, term15318.getClass(), "severity", enum21);
        setField(term15318, term15318.getClass(), "description", "wGmYcqUkgE");
        setField(term15318, term15318.getClass(), "failureMessage", "idgaQsnJpQ");
        setField(term15318, term15318.getClass(), "test", null);
        setField(term15317, term15317.getClass(), "rule", term15318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Valid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term15317, args);
    }

};


