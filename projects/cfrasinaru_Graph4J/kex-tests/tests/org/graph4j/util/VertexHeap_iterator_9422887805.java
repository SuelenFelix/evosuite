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
     Object term485;

    public VertexHeap_iterator_9422887805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term485 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term486 = (int[]) newIntArray(1);
        int[] term488 = (int[]) newIntArray(2);
        setField(term485, term485.getClass(), "graph", null);
        setField(term485, term485.getClass(), "comparator", null);
        setIntElement(term486, 0, 53410913);
        setField(term485, term485.getClass(), "keys", term486);
        setIntElement(term488, 0, -375014958);
        setIntElement(term488, 1, 1107176718);
        setField(term485, term485.getClass(), "positions", term488);
        setIntField(term485, term485.getClass(), "size", 480137250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term485, args);
    }

};


