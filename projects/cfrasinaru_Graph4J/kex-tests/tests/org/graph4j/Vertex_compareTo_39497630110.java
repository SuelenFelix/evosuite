package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Vertex_compareTo_39497630110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178020;
     Object term178024;

    public Vertex_compareTo_39497630110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term178022 = new Double(0.07090667811865614);
        term178020 = newInstance(Class.forName("org.graph4j.Vertex"));
        setIntField(term178020, term178020.getClass(), "vertex", 342580466);
        setField(term178020, term178020.getClass(), "weight", term178022);
        setField(term178020, term178020.getClass(), "label", null);
        Double term178026 = new Double(0.9401936369740241);
        term178024 = newInstance(Class.forName("org.graph4j.Vertex"));
        setIntField(term178024, term178024.getClass(), "vertex", 1861918338);
        setField(term178024, term178024.getClass(), "weight", term178026);
        setField(term178024, term178024.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Vertex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Vertex");
        Object[] args = new Object[1];
        args[0] = term178024;
        callMethod(klass, "compareTo", argTypes, term178020, args);
    }

};


