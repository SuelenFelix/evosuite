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
     Object term178017;
     Object term178021;

    public Vertex_compareTo_39497630110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term178019 = new Double(0.07090667811865614);
        term178017 = newInstance(Class.forName("org.graph4j.Vertex"));
        setIntField(term178017, term178017.getClass(), "vertex", 342580466);
        setField(term178017, term178017.getClass(), "weight", term178019);
        setField(term178017, term178017.getClass(), "label", null);
        Double term178023 = new Double(0.9401936369740241);
        term178021 = newInstance(Class.forName("org.graph4j.Vertex"));
        setIntField(term178021, term178021.getClass(), "vertex", 1861918338);
        setField(term178021, term178021.getClass(), "weight", term178023);
        setField(term178021, term178021.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Vertex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Vertex");
        Object[] args = new Object[1];
        args[0] = term178021;
        callMethod(klass, "compareTo", argTypes, term178017, args);
    }

};


