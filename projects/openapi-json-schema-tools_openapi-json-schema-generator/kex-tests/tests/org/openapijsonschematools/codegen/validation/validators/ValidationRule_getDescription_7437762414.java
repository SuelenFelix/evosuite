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

public class ValidationRule_getDescription_7437762414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11944;

    public ValidationRule_getDescription_7437762414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11981 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term11980 = ((Class) term11981).getDeclaredField((String) "WARNING");
        ((Field) term11980).setAccessible(true);
        Object enum13 = ((Field) term11980).get((Object) null);
        term11944 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term11944, term11944.getClass(), "severity", enum13);
        setField(term11944, term11944.getClass(), "description", "MLqYREekMl");
        setField(term11944, term11944.getClass(), "failureMessage", "ytSBIKXogI");
        setField(term11944, term11944.getClass(), "test", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term11944, args);
    }

};


