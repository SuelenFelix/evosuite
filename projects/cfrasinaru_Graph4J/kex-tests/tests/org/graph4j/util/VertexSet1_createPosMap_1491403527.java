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

public class VertexSet1_createPosMap_1491403527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71818;

    public VertexSet1_createPosMap_1491403527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71818 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        setField(term71818, term71818.getClass(), "posMap", null);
        setField(term71818, term71818.getClass(), "graph", null);
        setField(term71818, term71818.getClass(), "vertices", null);
        setIntField(term71818, term71818.getClass(), "numVertices", 0);
        setIntField(term71818, term71818.getClass(), "first", 0);
        setField(term71818, term71818.getClass(), "bitset", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPosMap", argTypes, term71818, args);
    }

};


