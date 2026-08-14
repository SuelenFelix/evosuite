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

public class VertexHeap_toString_198085039120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term779;

    public VertexHeap_toString_198085039120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term779 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term780 = (int[]) newIntArray(5);
        int[] term786 = (int[]) newIntArray(1);
        setField(term779, term779.getClass(), "graph", null);
        setField(term779, term779.getClass(), "comparator", null);
        setIntElement(term780, 0, 267763294);
        setIntElement(term780, 1, -1497710478);
        setIntElement(term780, 2, 49950830);
        setIntElement(term780, 3, -525257914);
        setIntElement(term780, 4, 147209682);
        setField(term779, term779.getClass(), "keys", term780);
        setIntElement(term786, 0, 34470066);
        setField(term779, term779.getClass(), "positions", term786);
        setIntField(term779, term779.getClass(), "size", 2058711405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term779, args);
    }

};


