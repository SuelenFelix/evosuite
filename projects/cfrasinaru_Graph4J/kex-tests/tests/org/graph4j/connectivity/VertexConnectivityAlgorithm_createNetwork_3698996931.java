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

public class VertexConnectivityAlgorithm_createNetwork_3698996931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404;

    public VertexConnectivityAlgorithm_createNetwork_3698996931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term423 = new Integer(1725571209);
        term404 = newInstance(Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm"));
        Object term405 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term406 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term407 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term411 = (int[]) newIntArray(4);
        Object term418 = newInstance(Class.forName("java.util.BitSet"));
        long[] term419 = (long[]) newLongArray(1);
        setField(term404, term404.getClass(), "network", null);
        setField(term406, term406.getClass(), "table", term407);
        setIntField(term406, term406.getClass(), "count", -1476117762);
        setIntField(term406, term406.getClass(), "threshold", 15);
        setFloatField(term406, term406.getClass(), "loadFactor", 0.75F);
        setField(term405, term405.getClass(), "posMap", term406);
        setField(term405, term405.getClass(), "graph", null);
        setIntElement(term411, 0, -341962980);
        setIntElement(term411, 1, 1532716628);
        setIntElement(term411, 2, -1801760683);
        setIntElement(term411, 3, 1141317871);
        setField(term405, term405.getClass(), "vertices", term411);
        setIntField(term405, term405.getClass(), "numVertices", 890669485);
        setIntField(term405, term405.getClass(), "first", 691577392);
        setField(term418, term418.getClass(), "words", term419);
        setIntField(term418, term418.getClass(), "wordsInUse", -893623680);
        setBooleanField(term418, term418.getClass(), "sizeIsSticky", true);
        setField(term405, term405.getClass(), "bitset", term418);
        setField(term404, term404.getClass(), "globalMinCut", term405);
        setField(term404, term404.getClass(), "connectivityNumber", term423);
        setBooleanField(term404, term404.getClass(), "computed", true);
        setField(term404, term404.getClass(), "graph", null);
        setBooleanField(term404, term404.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.VertexConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createNetwork", argTypes, term404, args);
    }

};


