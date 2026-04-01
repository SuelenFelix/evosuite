package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ParallelFilterKruskal_getTree_6402073724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149381;

    public ParallelFilterKruskal_getTree_6402073724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149381 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term149382 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term149385 = (int[]) newIntArray(1);
        Object[] term149388 = (Object[]) newArray("org.graph4j.Edge", 0);
        Object term149390 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term149381, term149381.getClass(), "tree", null);
        setIntField(term149382, term149382.getClass(), "numVertices", -949189415);
        setBooleanField(term149382, term149382.getClass(), "pathCompression", false);
        setIntElement(term149385, 0, -1252799932);
        setField(term149382, term149382.getClass(), "parent", term149385);
        setIntField(term149382, term149382.getClass(), "numSets", 659069538);
        setField(term149381, term149381.getClass(), "unionFind", term149382);
        setField(term149381, term149381.getClass(), "edges", term149388);
        setLongField(term149381, term149381.getClass(), "finalNrOfEdges", -4058686252500969842L);
        setDoubleField(term149390, term149390.getClass(), "value", 0.607330533231564);
        setField(term149390, term149390.getClass(), "this$0", null);
        setField(term149381, term149381.getClass(), "totalWeight", term149390);
        setBooleanField(term149381, term149381.getClass(), "calculated", true);
        setField(term149381, term149381.getClass(), "graph", null);
        setBooleanField(term149381, term149381.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTree", argTypes, term149381, args);
    }

};


