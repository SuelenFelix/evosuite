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

public class Invalid_getRule_12053716854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4886;

    public Invalid_getRule_12053716854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4956 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term4955 = ((Class) term4956).getDeclaredField((String) "ERROR");
        ((Field) term4955).setAccessible(true);
        Object enum7 = ((Field) term4955).get((Object) null);
        term4886 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid"));
        Object term4899 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term4886, term4886.getClass(), "message", "xrwlQZdwCp");
        setField(term4899, term4899.getClass(), "severity", enum7);
        setField(term4899, term4899.getClass(), "description", "IDCWpPLRkE");
        setField(term4899, term4899.getClass(), "failureMessage", "nyiiPDVjAc");
        setField(term4899, term4899.getClass(), "test", null);
        setField(term4886, term4886.getClass(), "rule", term4899);
        setField(term4886, term4886.getClass(), "details", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.Invalid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRule", argTypes, term4886, args);
    }

};


