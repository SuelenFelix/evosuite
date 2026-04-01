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
     Object term60362;

    public VertexHeap_toString_198085039120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60362 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term60363 = (int[]) newIntArray(4);
        int[] term60368 = (int[]) newIntArray(2);
        setField(term60362, term60362.getClass(), "graph", null);
        setField(term60362, term60362.getClass(), "comparator", null);
        setIntElement(term60363, 0, 1537010523);
        setIntElement(term60363, 1, -661143608);
        setIntElement(term60363, 2, -605823310);
        setIntElement(term60363, 3, -1277195157);
        setField(term60362, term60362.getClass(), "keys", term60363);
        setIntElement(term60368, 0, 1132183912);
        setIntElement(term60368, 1, 1444602079);
        setField(term60362, term60362.getClass(), "positions", term60368);
        setIntField(term60362, term60362.getClass(), "size", 1644507567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term60362, args);
    }

};


