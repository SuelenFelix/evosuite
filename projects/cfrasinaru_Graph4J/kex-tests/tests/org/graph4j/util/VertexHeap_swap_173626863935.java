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
import java.lang.Integer;

public class VertexHeap_swap_173626863935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60416;
     Object term60418;
     Object term60420;

    public VertexHeap_swap_173626863935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60416 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        setField(term60416, term60416.getClass(), "graph", null);
        setField(term60416, term60416.getClass(), "comparator", null);
        setField(term60416, term60416.getClass(), "keys", null);
        setField(term60416, term60416.getClass(), "positions", null);
        setIntField(term60416, term60416.getClass(), "size", 0);
        term60418 = new Integer(0);
        term60420 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term60418;
        args[1] = term60420;
        callMethod(klass, "swap", argTypes, term60416, args);
    }

};


