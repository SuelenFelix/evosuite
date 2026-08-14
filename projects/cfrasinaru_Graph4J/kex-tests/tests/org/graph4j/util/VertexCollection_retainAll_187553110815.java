package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VertexCollection_retainAll_187553110815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10406;

    public VertexCollection_retainAll_187553110815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10406 = (int[]) newIntArray(8);
        setIntElement(term10406, 0, 2002762153);
        setIntElement(term10406, 1, -531666058);
        setIntElement(term10406, 2, -1659995523);
        setIntElement(term10406, 3, -1384058110);
        setIntElement(term10406, 4, -109584269);
        setIntElement(term10406, 5, -682334474);
        setIntElement(term10406, 6, -666332937);
        setIntElement(term10406, 7, 1661615099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10406;
        callMethod(klass, "retainAll", argTypes, null, args);
    }

};


