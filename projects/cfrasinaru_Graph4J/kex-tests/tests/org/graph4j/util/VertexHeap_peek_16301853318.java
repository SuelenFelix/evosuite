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

public class VertexHeap_peek_16301853318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;

    public VertexHeap_peek_16301853318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term548 = (int[]) newIntArray(7);
        int[] term556 = (int[]) newIntArray(1);
        setField(term547, term547.getClass(), "graph", null);
        setField(term547, term547.getClass(), "comparator", null);
        setIntElement(term548, 0, -1498296052);
        setIntElement(term548, 1, 2098647989);
        setIntElement(term548, 2, 1598895173);
        setIntElement(term548, 3, 1830648570);
        setIntElement(term548, 4, -227365013);
        setIntElement(term548, 5, 11724947);
        setIntElement(term548, 6, 1953277050);
        setField(term547, term547.getClass(), "keys", term548);
        setIntElement(term556, 0, 1283079251);
        setField(term547, term547.getClass(), "positions", term556);
        setIntField(term547, term547.getClass(), "size", -523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term547, args);
    }

};


