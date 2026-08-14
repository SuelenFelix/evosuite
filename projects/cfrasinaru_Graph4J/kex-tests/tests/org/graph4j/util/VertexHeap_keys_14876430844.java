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

public class VertexHeap_keys_14876430844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467;

    public VertexHeap_keys_14876430844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term467 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term468 = (int[]) newIntArray(6);
        int[] term475 = (int[]) newIntArray(1);
        setField(term467, term467.getClass(), "graph", null);
        setField(term467, term467.getClass(), "comparator", null);
        setIntElement(term468, 0, -1963434938);
        setIntElement(term468, 1, 906181092);
        setIntElement(term468, 2, 1045657203);
        setIntElement(term468, 3, 1386130016);
        setIntElement(term468, 4, 1072005683);
        setIntElement(term468, 5, 1861318859);
        setField(term467, term467.getClass(), "keys", term468);
        setIntElement(term475, 0, 1474524152);
        setField(term467, term467.getClass(), "positions", term475);
        setIntField(term467, term467.getClass(), "size", 568954359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexHeap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keys", argTypes, term467, args);
    }

};


