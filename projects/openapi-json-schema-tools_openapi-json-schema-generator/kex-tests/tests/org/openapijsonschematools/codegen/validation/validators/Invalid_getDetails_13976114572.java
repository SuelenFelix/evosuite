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

public class Invalid_getDetails_13976114572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3986;

    public Invalid_getDetails_13976114572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4056 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term4055 = ((Class) term4056).getDeclaredField((String) "ERROR");
        ((Field) term4055).setAccessible(true);
        Object enum5 = ((Field) term4055).get((Object) null);
        term3986 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid"));
        Object term3999 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term3986, term3986.getClass(), "message", "IoAlmYsBwc");
        setField(term3999, term3999.getClass(), "severity", enum5);
        setField(term3999, term3999.getClass(), "description", "TEParAifyi");
        setField(term3999, term3999.getClass(), "failureMessage", "OWDIEULEFu");
        setField(term3999, term3999.getClass(), "test", null);
        setField(term3986, term3986.getClass(), "rule", term3999);
        setField(term3986, term3986.getClass(), "details", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetails", argTypes, term3986, args);
    }

};


