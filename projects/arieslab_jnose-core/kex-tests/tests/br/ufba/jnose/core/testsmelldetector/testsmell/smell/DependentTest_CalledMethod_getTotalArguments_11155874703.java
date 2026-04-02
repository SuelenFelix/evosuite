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

public class DependentTest_CalledMethod_getTotalArguments_11155874703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public DependentTest_CalledMethod_getTotalArguments_11155874703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.smell.DependentTest$CalledMethod"));
        setIntField(term73, term73.getClass(), "totalArguments", 0);
        setField(term73, term73.getClass(), "name", null);
        setField(term73, term73.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.smell.DependentTest$CalledMethod");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalArguments", argTypes, term73, args);
    }

};


