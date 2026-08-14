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

public class Invalid_getSeverity_6106752045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5332;

    public Invalid_getSeverity_6106752045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5404 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term5403 = ((Class) term5404).getDeclaredField((String) "WARNING");
        ((Field) term5403).setAccessible(true);
        Object enum8 = ((Field) term5403).get((Object) null);
        term5332 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid"));
        Object term5345 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term5332, term5332.getClass(), "message", "wSQxaModmm");
        setField(term5345, term5345.getClass(), "severity", enum8);
        setField(term5345, term5345.getClass(), "description", "UlajhuVLaP");
        setField(term5345, term5345.getClass(), "failureMessage", "gGSMzuGICf");
        setField(term5345, term5345.getClass(), "test", null);
        setField(term5332, term5332.getClass(), "rule", term5345);
        setField(term5332, term5332.getClass(), "details", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeverity", argTypes, term5332, args);
    }

};


