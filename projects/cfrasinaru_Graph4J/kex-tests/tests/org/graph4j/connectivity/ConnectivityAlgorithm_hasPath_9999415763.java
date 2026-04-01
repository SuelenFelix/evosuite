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
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class ConnectivityAlgorithm_hasPath_9999415763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2935;
     Object term2982;
     Object term2984;

    public ConnectivityAlgorithm_hasPath_9999415763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2936 = new Boolean(true);
        Object term2940 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2941 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2945 = (int[]) newIntArray(2);
        Object term2950 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2941, term2941.getClass(), "table", null);
        setIntField(term2941, term2941.getClass(), "count", 256028547);
        setIntField(term2941, term2941.getClass(), "threshold", 15);
        setFloatField(term2941, term2941.getClass(), "loadFactor", 0.75F);
        setField(term2940, term2940.getClass(), "posMap", term2941);
        setField(term2940, term2940.getClass(), "graph", null);
        setIntElement(term2945, 0, -750603024);
        setIntElement(term2945, 1, 1255234202);
        setField(term2940, term2940.getClass(), "vertices", term2945);
        setIntField(term2940, term2940.getClass(), "numVertices", -223786928);
        setIntField(term2940, term2940.getClass(), "first", 1703103733);
        setField(term2950, term2950.getClass(), "words", null);
        setIntField(term2950, term2950.getClass(), "wordsInUse", 1057562436);
        setBooleanField(term2950, term2950.getClass(), "sizeIsSticky", false);
        setField(term2940, term2940.getClass(), "bitset", term2950);
        ArrayList term2938 = new ArrayList();
        ((ArrayList) term2938).add(term2940);
        HashMap term2955 = new HashMap();
        ArrayList term2968 = new ArrayList();
        ((ArrayList) term2968).add((Object)null);
        ((ArrayList) term2968).add((Object)null);
        ((ArrayList) term2968).add((Object)null);
        HashMap term2972 = new HashMap();
        term2935 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term2935, term2935.getClass(), "connected", term2936);
        setField(term2935, term2935.getClass(), "connectedSets", term2938);
        setField(term2935, term2935.getClass(), "vertexSetMap", term2955);
        setField(term2935, term2935.getClass(), "components", term2968);
        setField(term2935, term2935.getClass(), "componentMap", term2972);
        setField(term2935, term2935.getClass(), "graph", null);
        term2982 = new Integer(-1858635791);
        term2984 = new Integer(1919079331);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2982;
        args[1] = term2984;
        callMethod(klass, "hasPath", argTypes, term2935, args);
    }

};


