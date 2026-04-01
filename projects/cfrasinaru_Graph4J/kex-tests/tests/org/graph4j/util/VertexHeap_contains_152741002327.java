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

public class VertexHeap_contains_152741002327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60388;
     Object term60390;

    public VertexHeap_contains_152741002327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60388 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        setField(term60388, term60388.getClass(), "graph", null);
        setField(term60388, term60388.getClass(), "comparator", null);
        setField(term60388, term60388.getClass(), "keys", null);
        setField(term60388, term60388.getClass(), "positions", null);
        setIntField(term60388, term60388.getClass(), "size", 0);
        term60390 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60390;
        callMethod(klass, "contains", argTypes, term60388, args);
    }

};


