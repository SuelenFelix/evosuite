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
import java.lang.Boolean;

public class TestMethod_setHasSmell_47414993711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501;
     Object term503;

    public TestMethod_setHasSmell_47414993711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestMethod"));
        setField(term501, term501.getClass(), "methodName", null);
        setBooleanField(term501, term501.getClass(), "hasSmell", false);
        setField(term501, term501.getClass(), "begin", null);
        setField(term501, term501.getClass(), "end", null);
        setField(term501, term501.getClass(), "range", null);
        term503 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestMethod");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term503;
        callMethod(klass, "setHasSmell", argTypes, term501, args);
    }

};


