package br.ufba.jnose.core.testsmelldetector.testsmell;

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
import static br.ufba.jnose.core.testsmelldetector.testsmell.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class TestMethod_setHasSmell_4741499371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term53;

    public TestMethod_setHasSmell_4741499371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term37 = new Integer(568599855);
        Integer term39 = new Integer(1162663216);
        term23 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestMethod"));
        setField(term23, term23.getClass(), "methodName", "sjlJAEtRrb");
        setBooleanField(term23, term23.getClass(), "hasSmell", false);
        setField(term23, term23.getClass(), "begin", term37);
        setField(term23, term23.getClass(), "end", term39);
        setField(term23, term23.getClass(), "range", "MuLcgQHgqz");
        term53 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term53;
        callMethod(klass, "setHasSmell", argTypes, term23, args);
    }

};


