package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TopologicalOrderIterator_next_6560598743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2268;

    public TopologicalOrderIterator_next_6560598743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2268 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        int[] term2270 = (int[]) newIntArray(7);
        int[] term2278 = (int[]) newIntArray(1);
        Object term2280 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term2281 = (int[]) newIntArray(6);
        Object term2290 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2291 = (long[]) newLongArray(1);
        setField(term2268, term2268.getClass(), "graph", null);
        setBooleanField(term2268, term2268.getClass(), "computeLevels", false);
        setIntElement(term2270, 0, 1641377218);
        setIntElement(term2270, 1, 1235375204);
        setIntElement(term2270, 2, 258334639);
        setIntElement(term2270, 3, 1432187207);
        setIntElement(term2270, 4, -91068927);
        setIntElement(term2270, 5, 680714112);
        setIntElement(term2270, 6, 385297023);
        setField(term2268, term2268.getClass(), "indegrees", term2270);
        setIntElement(term2278, 0, -134092543);
        setField(term2268, term2268.getClass(), "levels", term2278);
        setField(term2280, term2280.getClass(), "graph", null);
        setIntElement(term2281, 0, -1703642288);
        setIntElement(term2281, 1, 2075139747);
        setIntElement(term2281, 2, 2092881418);
        setIntElement(term2281, 3, 1732410866);
        setIntElement(term2281, 4, 1084102599);
        setIntElement(term2281, 5, -1743503755);
        setField(term2280, term2280.getClass(), "vertices", term2281);
        setIntField(term2280, term2280.getClass(), "numVertices", 1641342112);
        setIntField(term2280, term2280.getClass(), "first", -1551790945);
        setField(term2290, term2290.getClass(), "words", term2291);
        setIntField(term2290, term2290.getClass(), "wordsInUse", 2039538484);
        setBooleanField(term2290, term2290.getClass(), "sizeIsSticky", false);
        setField(term2280, term2280.getClass(), "bitset", term2290);
        setField(term2268, term2268.getClass(), "queue", term2280);
        setIntField(term2268, term2268.getClass(), "currentVertex", 1235736068);
        setIntField(term2268, term2268.getClass(), "counter", 329424176);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term2268, args);
    }

};


