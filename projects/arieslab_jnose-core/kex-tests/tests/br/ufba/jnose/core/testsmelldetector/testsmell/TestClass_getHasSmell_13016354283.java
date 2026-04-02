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

public class TestClass_getHasSmell_13016354283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1942;

    public TestClass_getHasSmell_13016354283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1942 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestClass"));
        setField(term1942, term1942.getClass(), "className", "OWKQODBLzb");
        setBooleanField(term1942, term1942.getClass(), "hasSmell", false);
        setField(term1942, term1942.getClass(), "range", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestClass");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHasSmell", argTypes, term1942, args);
    }

};


