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

public class VertexHeap_compareTo_208495325638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847;
     Object term849;
     Object term851;

    public VertexHeap_compareTo_208495325638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term847 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        setField(term847, term847.getClass(), "graph", null);
        setField(term847, term847.getClass(), "comparator", null);
        setField(term847, term847.getClass(), "keys", null);
        setField(term847, term847.getClass(), "positions", null);
        setIntField(term847, term847.getClass(), "size", 0);
        term849 = new Integer(0);
        term851 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term849;
        args[1] = term851;
        callMethod(klass, "compareTo", argTypes, term847, args);
    }

};


