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

public class Invalid_getRule_12053716857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4898;

    public Invalid_getRule_12053716857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4968 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term4967 = ((Class) term4968).getDeclaredField((String) "ERROR");
        ((Field) term4967).setAccessible(true);
        Object enum7 = ((Field) term4967).get((Object) null);
        term4898 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid"));
        Object term4911 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term4898, term4898.getClass(), "message", "xrwlQZdwCp");
        setField(term4911, term4911.getClass(), "severity", enum7);
        setField(term4911, term4911.getClass(), "description", "IDCWpPLRkE");
        setField(term4911, term4911.getClass(), "failureMessage", "nyiiPDVjAc");
        setField(term4911, term4911.getClass(), "test", null);
        setField(term4898, term4898.getClass(), "rule", term4911);
        setField(term4898, term4898.getClass(), "details", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRule", argTypes, term4898, args);
    }

};


