package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class VertexConnectivityAlgorithm_countMaximumDisjointPaths_17469970086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70611;
     Object term70630;

    public VertexConnectivityAlgorithm_countMaximumDisjointPaths_17469970086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70626 = new Integer(-2131181468);
        term70611 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term70612 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term70613 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term70614 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term70618 = (int[]) newIntArray(0);
        Object term70621 = newInstance(Class.forName("java.util.BitSet"));
        long[] term70622 = (long[]) newLongArray(1);
        setField(term70611, term70611.getClass(), "network", null);
        setField(term70613, term70613.getClass(), "table", term70614);
        setIntField(term70613, term70613.getClass(), "count", -1236558524);
        setIntField(term70613, term70613.getClass(), "threshold", 15);
        setFloatField(term70613, term70613.getClass(), "loadFactor", 0.75F);
        setField(term70612, term70612.getClass(), "posMap", term70613);
        setField(term70612, term70612.getClass(), "graph", null);
        setField(term70612, term70612.getClass(), "vertices", term70618);
        setIntField(term70612, term70612.getClass(), "numVertices", -290487304);
        setIntField(term70612, term70612.getClass(), "first", 938576013);
        setField(term70621, term70621.getClass(), "words", term70622);
        setIntField(term70621, term70621.getClass(), "wordsInUse", -1555416747);
        setBooleanField(term70621, term70621.getClass(), "sizeIsSticky", false);
        setField(term70612, term70612.getClass(), "bitset", term70621);
        setField(term70611, term70611.getClass(), "globalMinCut", term70612);
        setField(term70611, term70611.getClass(), "connectivityNumber", term70626);
        setBooleanField(term70611, term70611.getClass(), "computed", false);
        setField(term70611, term70611.getClass(), "graph", null);
        setBooleanField(term70611, term70611.getClass(), "directed", true);
        term70630 = new Integer(135588064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70630;
        callMethod(klass, "countMaximumDisjointPaths", argTypes, term70611, args);
    }

};


