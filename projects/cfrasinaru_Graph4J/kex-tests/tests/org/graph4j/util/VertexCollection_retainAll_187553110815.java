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
     Object term183000;

    public VertexCollection_retainAll_187553110815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183000 = (int[]) newIntArray(8);
        setIntElement(term183000, 0, 1235649413);
        setIntElement(term183000, 1, -1420590238);
        setIntElement(term183000, 2, 1920667124);
        setIntElement(term183000, 3, 2145562941);
        setIntElement(term183000, 4, -2017955478);
        setIntElement(term183000, 5, -1971071333);
        setIntElement(term183000, 6, -348935557);
        setIntElement(term183000, 7, 1238137747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexCollection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term183000;
        callMethod(klass, "retainAll", argTypes, null, args);
    }

};


