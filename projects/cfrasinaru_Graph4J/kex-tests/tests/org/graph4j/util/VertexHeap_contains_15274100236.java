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

public class VertexHeap_contains_15274100236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60008;
     Object term60024;

    public VertexHeap_contains_15274100236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60008 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60009 = (int[]) newIntArray(8);
        int[] term60018 = (int[]) newIntArray(4);
        setField(term60008, term60008.getClass(), "graph", null);
        setField(term60008, term60008.getClass(), "comparator", null);
        setIntElement(term60009, 0, 1012824901);
        setIntElement(term60009, 1, 953916253);
        setIntElement(term60009, 2, -972613566);
        setIntElement(term60009, 3, 423167476);
        setIntElement(term60009, 4, -918637899);
        setIntElement(term60009, 5, -47058112);
        setIntElement(term60009, 6, 2073925569);
        setIntElement(term60009, 7, 1903299320);
        setField(term60008, term60008.getClass(), "keys", term60009);
        setIntElement(term60018, 0, 496281999);
        setIntElement(term60018, 1, -129667876);
        setIntElement(term60018, 2, -1081751617);
        setIntElement(term60018, 3, -1698342837);
        setField(term60008, term60008.getClass(), "positions", term60018);
        setIntField(term60008, term60008.getClass(), "size", -508110901);
        term60024 = new Integer(2086708952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60024;
        callMethod(klass, "contains", argTypes, term60008, args);
    }

};


