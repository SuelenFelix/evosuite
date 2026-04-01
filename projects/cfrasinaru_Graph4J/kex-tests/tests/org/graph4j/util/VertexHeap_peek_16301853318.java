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
     Object term60068;

    public VertexHeap_peek_16301853318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60068 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60069 = (int[]) newIntArray(9);
        int[] term60079 = (int[]) newIntArray(1);
        setField(term60068, term60068.getClass(), "graph", null);
        setField(term60068, term60068.getClass(), "comparator", null);
        setIntElement(term60069, 0, 2085104036);
        setIntElement(term60069, 1, 136979507);
        setIntElement(term60069, 2, -27834494);
        setIntElement(term60069, 3, -470460903);
        setIntElement(term60069, 4, -1476214738);
        setIntElement(term60069, 5, -1898771379);
        setIntElement(term60069, 6, -1950750332);
        setIntElement(term60069, 7, 98744131);
        setIntElement(term60069, 8, 1076913386);
        setField(term60068, term60068.getClass(), "keys", term60069);
        setIntElement(term60079, 0, -1266016022);
        setField(term60068, term60068.getClass(), "positions", term60079);
        setIntField(term60068, term60068.getClass(), "size", -1417549926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term60068, args);
    }

};


