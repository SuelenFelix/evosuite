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

public class VertexHeap_add_157638292928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60392;
     Object term60394;

    public VertexHeap_add_157638292928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60392 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        setField(term60392, term60392.getClass(), "graph", null);
        setField(term60392, term60392.getClass(), "comparator", null);
        setField(term60392, term60392.getClass(), "keys", null);
        setField(term60392, term60392.getClass(), "positions", null);
        setIntField(term60392, term60392.getClass(), "size", 0);
        term60394 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60394;
        callMethod(klass, "add", argTypes, term60392, args);
    }

};


