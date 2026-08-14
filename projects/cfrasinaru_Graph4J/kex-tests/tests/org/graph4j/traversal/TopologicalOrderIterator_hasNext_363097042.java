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

public class TopologicalOrderIterator_hasNext_363097042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2226;

    public TopologicalOrderIterator_hasNext_363097042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2226 = newInstance(Class.forName("org.graph4j.traversal.TopologicalOrderIterator"));
        int[] term2228 = (int[]) newIntArray(6);
        int[] term2235 = (int[]) newIntArray(7);
        Object term2243 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term2244 = (int[]) newIntArray(0);
        Object term2247 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2248 = (long[]) newLongArray(1);
        setField(term2226, term2226.getClass(), "graph", null);
        setBooleanField(term2226, term2226.getClass(), "computeLevels", false);
        setIntElement(term2228, 0, -111082612);
        setIntElement(term2228, 1, 1253334988);
        setIntElement(term2228, 2, 1086709736);
        setIntElement(term2228, 3, -1606698075);
        setIntElement(term2228, 4, 90996421);
        setIntElement(term2228, 5, -1805802783);
        setField(term2226, term2226.getClass(), "indegrees", term2228);
        setIntElement(term2235, 0, -529831900);
        setIntElement(term2235, 1, 1574493440);
        setIntElement(term2235, 2, 1854694585);
        setIntElement(term2235, 3, -1260562836);
        setIntElement(term2235, 4, 694100722);
        setIntElement(term2235, 5, -680529431);
        setIntElement(term2235, 6, 212698793);
        setField(term2226, term2226.getClass(), "levels", term2235);
        setField(term2243, term2243.getClass(), "graph", null);
        setField(term2243, term2243.getClass(), "vertices", term2244);
        setIntField(term2243, term2243.getClass(), "numVertices", 1169519385);
        setIntField(term2243, term2243.getClass(), "first", 1846078344);
        setField(term2247, term2247.getClass(), "words", term2248);
        setIntField(term2247, term2247.getClass(), "wordsInUse", 1692543802);
        setBooleanField(term2247, term2247.getClass(), "sizeIsSticky", true);
        setField(term2243, term2243.getClass(), "bitset", term2247);
        setField(term2226, term2226.getClass(), "queue", term2243);
        setIntField(term2226, term2226.getClass(), "currentVertex", 376341151);
        setIntField(term2226, term2226.getClass(), "counter", -1607267243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.TopologicalOrderIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term2226, args);
    }

};


