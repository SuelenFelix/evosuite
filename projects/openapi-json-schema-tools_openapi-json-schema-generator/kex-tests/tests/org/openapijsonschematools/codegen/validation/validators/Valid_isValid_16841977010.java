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

public class Valid_isValid_16841977010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14498;

    public Valid_isValid_16841977010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14536 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term14535 = ((Class) term14536).getDeclaredField((String) "WARNING");
        ((Field) term14535).setAccessible(true);
        Object enum19 = ((Field) term14535).get((Object) null);
        term14498 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Valid"));
        Object term14499 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term14499, term14499.getClass(), "severity", enum19);
        setField(term14499, term14499.getClass(), "description", "MAcUBcBckh");
        setField(term14499, term14499.getClass(), "failureMessage", "oVgzLbrsFr");
        setField(term14499, term14499.getClass(), "test", null);
        setField(term14498, term14498.getClass(), "rule", term14499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Valid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term14498, args);
    }

};


