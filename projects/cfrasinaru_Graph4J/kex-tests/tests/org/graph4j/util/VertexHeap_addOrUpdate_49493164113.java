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

public class VertexHeap_addOrUpdate_49493164113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60190;
     Object term60212;

    public VertexHeap_addOrUpdate_49493164113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60190 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60191 = (int[]) newIntArray(9);
        int[] term60201 = (int[]) newIntArray(9);
        setField(term60190, term60190.getClass(), "graph", null);
        setField(term60190, term60190.getClass(), "comparator", null);
        setIntElement(term60191, 0, 955822338);
        setIntElement(term60191, 1, -1756659503);
        setIntElement(term60191, 2, 1965003991);
        setIntElement(term60191, 3, -1725442005);
        setIntElement(term60191, 4, 2026681061);
        setIntElement(term60191, 5, -1893031586);
        setIntElement(term60191, 6, -1605006859);
        setIntElement(term60191, 7, -555520867);
        setIntElement(term60191, 8, -55584715);
        setField(term60190, term60190.getClass(), "keys", term60191);
        setIntElement(term60201, 0, -1140026535);
        setIntElement(term60201, 1, 1380376071);
        setIntElement(term60201, 2, 1236068241);
        setIntElement(term60201, 3, -1800680295);
        setIntElement(term60201, 4, 2033032621);
        setIntElement(term60201, 5, -415169558);
        setIntElement(term60201, 6, 415633287);
        setIntElement(term60201, 7, 859754541);
        setIntElement(term60201, 8, 1970843205);
        setField(term60190, term60190.getClass(), "positions", term60201);
        setIntField(term60190, term60190.getClass(), "size", -741942103);
        term60212 = new Integer(-917429711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term60212;
        callMethod(klass, "addOrUpdate", argTypes, term60190, args);
    }

};


