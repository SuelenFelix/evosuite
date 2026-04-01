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

public class Invalid_getSeverity_6106752048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5344;

    public Invalid_getSeverity_6106752048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5416 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term5415 = ((Class) term5416).getDeclaredField((String) "WARNING");
        ((Field) term5415).setAccessible(true);
        Object enum8 = ((Field) term5415).get((Object) null);
        term5344 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid"));
        Object term5357 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term5344, term5344.getClass(), "message", "wSQxaModmm");
        setField(term5357, term5357.getClass(), "severity", enum8);
        setField(term5357, term5357.getClass(), "description", "UlajhuVLaP");
        setField(term5357, term5357.getClass(), "failureMessage", "gGSMzuGICf");
        setField(term5357, term5357.getClass(), "test", null);
        setField(term5344, term5344.getClass(), "rule", term5357);
        setField(term5344, term5344.getClass(), "details", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeverity", argTypes, term5344, args);
    }

};


