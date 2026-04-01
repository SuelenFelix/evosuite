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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class GenericValidator_init_16170131920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GenericValidator_init_16170131920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90 = Class.forName((String) "org.openapijsonschematools.codegen.validation.validators.Severity");
        Field term89 = ((Class) term90).getDeclaredField((String) "WARNING");
        ((Field) term89).setAccessible(true);
        Object enum0 = ((Field) term89).get((Object) null);
        Object term4 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term4, term4.getClass(), "severity", enum0);
        setField(term4, term4.getClass(), "description", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "failureMessage", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "test", null);
        Object term33 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term33, term33.getClass(), "severity", enum0);
        setField(term33, term33.getClass(), "description", "");
        setField(term33, term33.getClass(), "failureMessage", "");
        setField(term33, term33.getClass(), "test", null);
        Object term37 = newInstance(Class.forName("org.openapijsonschematools.codegen.validation.validators.ValidationRule"));
        setField(term37, term37.getClass(), "severity", enum0);
        setField(term37, term37.getClass(), "description", null);
        setField(term37, term37.getClass(), "failureMessage", null);
        setField(term37, term37.getClass(), "test", null);
        term1 = new LinkedList();
        ((LinkedList) term1).add(term4);
        ((LinkedList) term1).add(term33);
        ((LinkedList) term1).add(term37);
        ((LinkedList) term1).add((Object)null);
        ((LinkedList) term1).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.validation.validators.GenericValidator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


