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

public class Valid_init_3007771941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14908;

    public Valid_init_3007771941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14945 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term14944 = ((Class) term14945).getDeclaredField((String) "WARNING");
        ((Field) term14944).setAccessible(true);
        Object enum20 = ((Field) term14944).get((Object) null);
        term14908 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term14908, term14908.getClass(), "severity", enum20);
        setField(term14908, term14908.getClass(), "description", "vQVyKLdtaz");
        setField(term14908, term14908.getClass(), "failureMessage", "OWKQODBLzb");
        setField(term14908, term14908.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Valid");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        Object[] args = new Object[1];
        args[0] = term14908;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


