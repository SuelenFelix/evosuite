package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VertexSeparator_separator_185721645215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79029;

    public VertexSeparator_separator_185721645215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79029 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        setField(term79029, term79029.getClass(), "graph", null);
        setField(term79029, term79029.getClass(), "separator", null);
        setField(term79029, term79029.getClass(), "leftShore", null);
        setField(term79029, term79029.getClass(), "rightShore", null);
        setIntField(term79029, term79029.getClass(), "maxShoreSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "separator", argTypes, term79029, args);
    }

};


