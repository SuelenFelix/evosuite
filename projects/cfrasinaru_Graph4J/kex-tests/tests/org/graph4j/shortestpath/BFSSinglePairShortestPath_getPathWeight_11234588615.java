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

public class BFSSinglePairShortestPath_getPathWeight_11234588615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119904;

    public BFSSinglePairShortestPath_getPathWeight_11234588615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119904 = newInstance(Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath"));
        int[] term119907 = (int[]) newIntArray(2);
        Object term119910 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term119912 = (int[]) newIntArray(1);
        Object term119916 = newInstance(Class.forName("java.util.BitSet"));
        long[] term119917 = (long[]) newLongArray(1);
        setIntField(term119904, term119904.getClass(), "source", 74697655);
        setIntField(term119904, term119904.getClass(), "target", 967013185);
        setIntElement(term119907, 0, 472032103);
        setIntElement(term119907, 1, 1003610620);
        setField(term119904, term119904.getClass(), "forbiddenVertices", term119907);
        setIntField(term119910, term119910.getClass(), "numEdges", 676152405);
        setField(term119910, term119910.getClass(), "graph", null);
        setIntElement(term119912, 0, 1562834301);
        setField(term119910, term119910.getClass(), "vertices", term119912);
        setIntField(term119910, term119910.getClass(), "numVertices", 1823659119);
        setIntField(term119910, term119910.getClass(), "first", -1957633022);
        setField(term119916, term119916.getClass(), "words", term119917);
        setIntField(term119916, term119916.getClass(), "wordsInUse", -1701071523);
        setBooleanField(term119916, term119916.getClass(), "sizeIsSticky", false);
        setField(term119910, term119910.getClass(), "bitset", term119916);
        setField(term119904, term119904.getClass(), "bestPath", term119910);
        setDoubleField(term119904, term119904.getClass(), "bestWeight", 0.32824708542791914);
        setField(term119904, term119904.getClass(), "graph", null);
        setBooleanField(term119904, term119904.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.BFSSinglePairShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeight", argTypes, term119904, args);
    }

};


