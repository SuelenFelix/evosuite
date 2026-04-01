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

public class VertexHeap_iterator_9422887805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59978;

    public VertexHeap_iterator_9422887805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59978 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term59979 = (int[]) newIntArray(9);
        int[] term59989 = (int[]) newIntArray(4);
        setField(term59978, term59978.getClass(), "graph", null);
        setField(term59978, term59978.getClass(), "comparator", null);
        setIntElement(term59979, 0, -2118312702);
        setIntElement(term59979, 1, -15464500);
        setIntElement(term59979, 2, -1951940945);
        setIntElement(term59979, 3, 1618129338);
        setIntElement(term59979, 4, -421041491);
        setIntElement(term59979, 5, 1531630551);
        setIntElement(term59979, 6, -1293247427);
        setIntElement(term59979, 7, -2110112489);
        setIntElement(term59979, 8, 911599446);
        setField(term59978, term59978.getClass(), "keys", term59979);
        setIntElement(term59989, 0, -307818529);
        setIntElement(term59989, 1, 700090526);
        setIntElement(term59989, 2, 8095828);
        setIntElement(term59989, 3, 491999819);
        setField(term59978, term59978.getClass(), "positions", term59989);
        setIntField(term59978, term59978.getClass(), "size", 594900088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term59978, args);
    }

};


