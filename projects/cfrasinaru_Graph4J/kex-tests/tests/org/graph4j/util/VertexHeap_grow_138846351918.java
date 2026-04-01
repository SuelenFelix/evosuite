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

public class VertexHeap_grow_138846351918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60328;

    public VertexHeap_grow_138846351918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60328 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60329 = (int[]) newIntArray(4);
        int[] term60334 = (int[]) newIntArray(4);
        setField(term60328, term60328.getClass(), "graph", null);
        setField(term60328, term60328.getClass(), "comparator", null);
        setIntElement(term60329, 0, -385959598);
        setIntElement(term60329, 1, -1919082628);
        setIntElement(term60329, 2, 1097362886);
        setIntElement(term60329, 3, 1976963675);
        setField(term60328, term60328.getClass(), "keys", term60329);
        setIntElement(term60334, 0, 1318525762);
        setIntElement(term60334, 1, -1657759952);
        setIntElement(term60334, 2, -1302867740);
        setIntElement(term60334, 3, -74421758);
        setField(term60328, term60328.getClass(), "positions", term60334);
        setIntField(term60328, term60328.getClass(), "size", -1715609258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "grow", argTypes, term60328, args);
    }

};


