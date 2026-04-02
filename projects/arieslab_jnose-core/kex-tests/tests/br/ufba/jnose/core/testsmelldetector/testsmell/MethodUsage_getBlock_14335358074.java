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

public class MethodUsage_getBlock_14335358074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term940;

    public MethodUsage_getBlock_14335358074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term940 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.MethodUsage"));
        setField(term940, term940.getClass(), "testMethodName", "IDCWpPLRkE");
        setField(term940, term940.getClass(), "productionMethodName", "nyiiPDVjAc");
        setField(term940, term940.getClass(), "range", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.MethodUsage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlock", argTypes, term940, args);
    }

};


