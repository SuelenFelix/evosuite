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

public class VertexHeap_grow_138846351918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739;

    public VertexHeap_grow_138846351918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term740 = (int[]) newIntArray(1);
        int[] term742 = (int[]) newIntArray(7);
        setField(term739, term739.getClass(), "graph", null);
        setField(term739, term739.getClass(), "comparator", null);
        setIntElement(term740, 0, 479531250);
        setField(term739, term739.getClass(), "keys", term740);
        setIntElement(term742, 0, 1320570890);
        setIntElement(term742, 1, -130649791);
        setIntElement(term742, 2, 534834644);
        setIntElement(term742, 3, 1959097203);
        setIntElement(term742, 4, -209654048);
        setIntElement(term742, 5, 477625804);
        setIntElement(term742, 6, 252575029);
        setField(term739, term739.getClass(), "positions", term742);
        setIntField(term739, term739.getClass(), "size", 57189932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "grow", argTypes, term739, args);
    }

};


