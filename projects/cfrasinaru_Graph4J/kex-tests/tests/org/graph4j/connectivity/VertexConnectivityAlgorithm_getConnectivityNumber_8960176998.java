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

public class VertexConnectivityAlgorithm_getConnectivityNumber_8960176998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634;

    public VertexConnectivityAlgorithm_getConnectivityNumber_8960176998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term657 = new Integer(-1456670397);
        term634 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term635 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term636 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term637 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term641 = (int[]) newIntArray(8);
        Object term652 = newInstance(Class.forName("java.util.BitSet"));
        long[] term653 = (long[]) newLongArray(1);
        setField(term634, term634.getClass(), "network", null);
        setField(term636, term636.getClass(), "table", term637);
        setIntField(term636, term636.getClass(), "count", 1358829571);
        setIntField(term636, term636.getClass(), "threshold", 15);
        setFloatField(term636, term636.getClass(), "loadFactor", 0.75F);
        setField(term635, term635.getClass(), "posMap", term636);
        setField(term635, term635.getClass(), "graph", null);
        setIntElement(term641, 0, 991356662);
        setIntElement(term641, 1, -506958186);
        setIntElement(term641, 2, -507387516);
        setIntElement(term641, 3, -1970452551);
        setIntElement(term641, 4, -1896376975);
        setIntElement(term641, 5, 729658803);
        setIntElement(term641, 6, 114754804);
        setIntElement(term641, 7, 1687361082);
        setField(term635, term635.getClass(), "vertices", term641);
        setIntField(term635, term635.getClass(), "numVertices", 584893196);
        setIntField(term635, term635.getClass(), "first", 497269071);
        setField(term652, term652.getClass(), "words", term653);
        setIntField(term652, term652.getClass(), "wordsInUse", -1899301124);
        setBooleanField(term652, term652.getClass(), "sizeIsSticky", true);
        setField(term635, term635.getClass(), "bitset", term652);
        setField(term634, term634.getClass(), "globalMinCut", term635);
        setField(term634, term634.getClass(), "connectivityNumber", term657);
        setBooleanField(term634, term634.getClass(), "computed", false);
        setField(term634, term634.getClass(), "graph", null);
        setBooleanField(term634, term634.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnectivityNumber", argTypes, term634, args);
    }

};


