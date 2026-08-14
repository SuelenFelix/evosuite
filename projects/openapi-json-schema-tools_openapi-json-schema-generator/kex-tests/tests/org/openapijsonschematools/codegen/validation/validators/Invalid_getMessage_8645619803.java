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

public class Invalid_getMessage_8645619803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4432;

    public Invalid_getMessage_8645619803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4504 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term4503 = ((Class) term4504).getDeclaredField((String) "WARNING");
        ((Field) term4503).setAccessible(true);
        Object enum6 = ((Field) term4503).get((Object) null);
        term4432 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid"));
        Object term4445 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term4432, term4432.getClass(), "message", "AijpHYOFuy");
        setField(term4445, term4445.getClass(), "severity", enum6);
        setField(term4445, term4445.getClass(), "description", "SbAoxhfrkn");
        setField(term4445, term4445.getClass(), "failureMessage", "kuTXqwMtDB");
        setField(term4445, term4445.getClass(), "test", null);
        setField(term4432, term4432.getClass(), "rule", term4445);
        setField(term4432, term4432.getClass(), "details", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMessage", argTypes, term4432, args);
    }

};


