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
import java.lang.Double;

public class ParallelFilterKruskal_MutableDouble_init_8783223990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2307;
     Object term2323;

    public ParallelFilterKruskal_MutableDouble_init_8783223990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2307 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal"));
        Object term2308 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term2311 = (int[]) newIntArray(4);
        Object[] term2317 = (Object[]) newArray("org.graph4j.Edge", 0);
        Object term2319 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setField(term2307, term2307.getClass(), "tree", null);
        setIntField(term2308, term2308.getClass(), "numVertices", 1289741214);
        setBooleanField(term2308, term2308.getClass(), "pathCompression", true);
        setIntElement(term2311, 0, 243280944);
        setIntElement(term2311, 1, -726681073);
        setIntElement(term2311, 2, -1724487863);
        setIntElement(term2311, 3, -128490829);
        setField(term2308, term2308.getClass(), "parent", term2311);
        setIntField(term2308, term2308.getClass(), "numSets", 202214133);
        setField(term2307, term2307.getClass(), "unionFind", term2308);
        setField(term2307, term2307.getClass(), "edges", term2317);
        setLongField(term2307, term2307.getClass(), "finalNrOfEdges", -2813493605142626659L);
        setDoubleField(term2319, term2319.getClass(), "value", 0.4569171842750229);
        setField(term2319, term2319.getClass(), "this$0", null);
        setField(term2307, term2307.getClass(), "totalWeight", term2319);
        setBooleanField(term2307, term2307.getClass(), "calculated", false);
        setField(term2307, term2307.getClass(), "graph", null);
        setBooleanField(term2307, term2307.getClass(), "directed", true);
        term2323 = new Double(0.8598297828918529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term2307;
        args[1] = term2323;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


