package br.ufba.jnose.core.testsmelldetector.testsmell.smell;

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
import static br.ufba.jnose.core.testsmelldetector.testsmell.smell.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DependentTest_CalledMethod_getName_8159897081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;

    public DependentTest_CalledMethod_getName_8159897081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.smell.DependentTest$CalledMethod"));
        setIntField(term25, term25.getClass(), "totalArguments", 1162663216);
        setField(term25, term25.getClass(), "name", "sjlJAEtRrb");
        setField(term25, term25.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.smell.DependentTest$CalledMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term25, args);
    }

};


