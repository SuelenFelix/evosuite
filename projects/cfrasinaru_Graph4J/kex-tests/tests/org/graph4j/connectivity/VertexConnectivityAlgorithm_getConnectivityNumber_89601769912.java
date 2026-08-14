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

public class VertexConnectivityAlgorithm_getConnectivityNumber_89601769912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70766;

    public VertexConnectivityAlgorithm_getConnectivityNumber_89601769912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term70789 = new Integer(-159494544);
        term70766 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term70767 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term70768 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term70769 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term70773 = (int[]) newIntArray(8);
        Object term70784 = newInstance(Class.forName("java.util.BitSet"));
        long[] term70785 = (long[]) newLongArray(1);
        setField(term70766, term70766.getClass(), "network", null);
        setField(term70768, term70768.getClass(), "table", term70769);
        setIntField(term70768, term70768.getClass(), "count", -2086380060);
        setIntField(term70768, term70768.getClass(), "threshold", 15);
        setFloatField(term70768, term70768.getClass(), "loadFactor", 0.75F);
        setField(term70767, term70767.getClass(), "posMap", term70768);
        setField(term70767, term70767.getClass(), "graph", null);
        setIntElement(term70773, 0, -1408519554);
        setIntElement(term70773, 1, -110536575);
        setIntElement(term70773, 2, 1514991810);
        setIntElement(term70773, 3, 1319465985);
        setIntElement(term70773, 4, 1160620517);
        setIntElement(term70773, 5, -1359383108);
        setIntElement(term70773, 6, -1158968060);
        setIntElement(term70773, 7, 1523461403);
        setField(term70767, term70767.getClass(), "vertices", term70773);
        setIntField(term70767, term70767.getClass(), "numVertices", -1777057164);
        setIntField(term70767, term70767.getClass(), "first", -2007323764);
        setField(term70784, term70784.getClass(), "words", term70785);
        setIntField(term70784, term70784.getClass(), "wordsInUse", 965628804);
        setBooleanField(term70784, term70784.getClass(), "sizeIsSticky", true);
        setField(term70767, term70767.getClass(), "bitset", term70784);
        setField(term70766, term70766.getClass(), "globalMinCut", term70767);
        setField(term70766, term70766.getClass(), "connectivityNumber", term70789);
        setBooleanField(term70766, term70766.getClass(), "computed", true);
        setField(term70766, term70766.getClass(), "graph", null);
        setBooleanField(term70766, term70766.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnectivityNumber", argTypes, term70766, args);
    }

};


