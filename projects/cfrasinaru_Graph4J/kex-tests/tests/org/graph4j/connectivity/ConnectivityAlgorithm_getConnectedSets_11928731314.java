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

public class ConnectivityAlgorithm_getConnectedSets_11928731314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2988;

    public ConnectivityAlgorithm_getConnectedSets_11928731314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2989 = new Boolean(false);
        Object term2993 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2994 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2998 = (int[]) newIntArray(4);
        Object term3005 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2994, term2994.getClass(), "table", null);
        setIntField(term2994, term2994.getClass(), "count", 144872711);
        setIntField(term2994, term2994.getClass(), "threshold", 15);
        setFloatField(term2994, term2994.getClass(), "loadFactor", 0.75F);
        setField(term2993, term2993.getClass(), "posMap", term2994);
        setField(term2993, term2993.getClass(), "graph", null);
        setIntElement(term2998, 0, -720037395);
        setIntElement(term2998, 1, 1232105469);
        setIntElement(term2998, 2, -1547322575);
        setIntElement(term2998, 3, -61444233);
        setField(term2993, term2993.getClass(), "vertices", term2998);
        setIntField(term2993, term2993.getClass(), "numVertices", -400720912);
        setIntField(term2993, term2993.getClass(), "first", 1266192397);
        setField(term3005, term3005.getClass(), "words", null);
        setIntField(term3005, term3005.getClass(), "wordsInUse", 218346781);
        setBooleanField(term3005, term3005.getClass(), "sizeIsSticky", true);
        setField(term2993, term2993.getClass(), "bitset", term3005);
        Object term3008 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3009 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3013 = (int[]) newIntArray(6);
        Object term3022 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3009, term3009.getClass(), "table", null);
        setIntField(term3009, term3009.getClass(), "count", -984660976);
        setIntField(term3009, term3009.getClass(), "threshold", 15);
        setFloatField(term3009, term3009.getClass(), "loadFactor", 0.75F);
        setField(term3008, term3008.getClass(), "posMap", term3009);
        setField(term3008, term3008.getClass(), "graph", null);
        setIntElement(term3013, 0, -1419341969);
        setIntElement(term3013, 1, -89522625);
        setIntElement(term3013, 2, 1475906894);
        setIntElement(term3013, 3, -2004794532);
        setIntElement(term3013, 4, 1232958763);
        setIntElement(term3013, 5, -1702132549);
        setField(term3008, term3008.getClass(), "vertices", term3013);
        setIntField(term3008, term3008.getClass(), "numVertices", -1786136772);
        setIntField(term3008, term3008.getClass(), "first", -1510967747);
        setField(term3022, term3022.getClass(), "words", null);
        setIntField(term3022, term3022.getClass(), "wordsInUse", -2014792457);
        setBooleanField(term3022, term3022.getClass(), "sizeIsSticky", true);
        setField(term3008, term3008.getClass(), "bitset", term3022);
        Object term3025 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3026 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3030 = (int[]) newIntArray(1);
        Object term3034 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3026, term3026.getClass(), "table", null);
        setIntField(term3026, term3026.getClass(), "count", 1957633116);
        setIntField(term3026, term3026.getClass(), "threshold", 15);
        setFloatField(term3026, term3026.getClass(), "loadFactor", 0.75F);
        setField(term3025, term3025.getClass(), "posMap", term3026);
        setField(term3025, term3025.getClass(), "graph", null);
        setIntElement(term3030, 0, 1428598210);
        setField(term3025, term3025.getClass(), "vertices", term3030);
        setIntField(term3025, term3025.getClass(), "numVertices", 1071776561);
        setIntField(term3025, term3025.getClass(), "first", 1846399918);
        setField(term3034, term3034.getClass(), "words", null);
        setIntField(term3034, term3034.getClass(), "wordsInUse", 35388821);
        setBooleanField(term3034, term3034.getClass(), "sizeIsSticky", true);
        setField(term3025, term3025.getClass(), "bitset", term3034);
        ArrayList term2991 = new ArrayList();
        ((ArrayList) term2991).add(term2993);
        ((ArrayList) term2991).add(term3008);
        ((ArrayList) term2991).add(term3025);
        HashMap term3039 = new HashMap();
        ArrayList term3052 = new ArrayList();
        HashMap term3056 = new HashMap();
        term2988 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term2988, term2988.getClass(), "connected", term2989);
        setField(term2988, term2988.getClass(), "connectedSets", term2991);
        setField(term2988, term2988.getClass(), "vertexSetMap", term3039);
        setField(term2988, term2988.getClass(), "components", term3052);
        setField(term2988, term2988.getClass(), "componentMap", term3056);
        setField(term2988, term2988.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConnectedSets", argTypes, term2988, args);
    }

};


