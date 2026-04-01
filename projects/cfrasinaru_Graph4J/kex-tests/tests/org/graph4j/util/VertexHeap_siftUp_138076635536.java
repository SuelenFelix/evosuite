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

public class VertexHeap_siftUp_138076635536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60422;
     Object term60424;

    public VertexHeap_siftUp_138076635536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60422 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        setField(term60422, term60422.getClass(), "graph", null);
        setField(term60422, term60422.getClass(), "comparator", null);
        setField(term60422, term60422.getClass(), "keys", null);
        setField(term60422, term60422.getClass(), "positions", null);
        setIntField(term60422, term60422.getClass(), "size", 0);
        term60424 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60424;
        callMethod(klass, "siftUp", argTypes, term60422, args);
    }

};


