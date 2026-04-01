package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BFSSinglePairShortestPath_compute_11293740046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119927;

    public BFSSinglePairShortestPath_compute_11293740046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119927 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term119930 = (int[]) newIntArray(6);
        Object term119937 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term119939 = (int[]) newIntArray(0);
        Object term119942 = newInstance(Class.forName("java.util.BitSet"));
        long[] term119943 = (long[]) newLongArray(1);
        setIntField(term119927, term119927.getClass(), "source", 891292443);
        setIntField(term119927, term119927.getClass(), "target", 1458335309);
        setIntElement(term119930, 0, 937402469);
        setIntElement(term119930, 1, -351951887);
        setIntElement(term119930, 2, -739675359);
        setIntElement(term119930, 3, 1286392985);
        setIntElement(term119930, 4, -1644414353);
        setIntElement(term119930, 5, 1296237710);
        setField(term119927, term119927.getClass(), "forbiddenVertices", term119930);
        setIntField(term119937, term119937.getClass(), "numEdges", 2008810809);
        setField(term119937, term119937.getClass(), "graph", null);
        setField(term119937, term119937.getClass(), "vertices", term119939);
        setIntField(term119937, term119937.getClass(), "numVertices", -1045846254);
        setIntField(term119937, term119937.getClass(), "first", 1655389198);
        setField(term119942, term119942.getClass(), "words", term119943);
        setIntField(term119942, term119942.getClass(), "wordsInUse", 108735158);
        setBooleanField(term119942, term119942.getClass(), "sizeIsSticky", false);
        setField(term119937, term119937.getClass(), "bitset", term119942);
        setField(term119927, term119927.getClass(), "bestPath", term119937);
        setDoubleField(term119927, term119927.getClass(), "bestWeight", 0.9708546389754252);
        setField(term119927, term119927.getClass(), "graph", null);
        setBooleanField(term119927, term119927.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "compute", argTypes, term119927, args);
    }

};


