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
import java.lang.Object;

public class VertexStack_peek_9764196033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10573;

    public VertexStack_peek_9764196033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10573 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term10574 = (int[]) newIntArray(7);
        Object term10584 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10585 = (long[]) newLongArray(1);
        setField(term10573, term10573.getClass(), "graph", null);
        setIntElement(term10574, 0, 1941438128);
        setIntElement(term10574, 1, -418002301);
        setIntElement(term10574, 2, 2067599442);
        setIntElement(term10574, 3, -335577660);
        setIntElement(term10574, 4, 1488144730);
        setIntElement(term10574, 5, -1075257608);
        setIntElement(term10574, 6, -693529847);
        setField(term10573, term10573.getClass(), "vertices", term10574);
        setIntField(term10573, term10573.getClass(), "numVertices", -325187625);
        setIntField(term10573, term10573.getClass(), "first", -317484961);
        setField(term10584, term10584.getClass(), "words", term10585);
        setIntField(term10584, term10584.getClass(), "wordsInUse", 418080259);
        setBooleanField(term10584, term10584.getClass(), "sizeIsSticky", true);
        setField(term10573, term10573.getClass(), "bitset", term10584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexStack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term10573, args);
    }

};


