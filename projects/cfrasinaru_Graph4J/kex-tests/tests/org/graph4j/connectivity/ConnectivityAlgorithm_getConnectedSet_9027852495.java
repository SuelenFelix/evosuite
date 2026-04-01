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

public class ConnectivityAlgorithm_getConnectedSet_9027852495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3077;
     Object term3203;

    public ConnectivityAlgorithm_getConnectedSet_9027852495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term3078 = new Boolean(true);
        Object term3082 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3083 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3087 = (int[]) newIntArray(1);
        Object term3091 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3083, term3083.getClass(), "table", null);
        setIntField(term3083, term3083.getClass(), "count", 1302075623);
        setIntField(term3083, term3083.getClass(), "threshold", 15);
        setFloatField(term3083, term3083.getClass(), "loadFactor", 0.75F);
        setField(term3082, term3082.getClass(), "posMap", term3083);
        setField(term3082, term3082.getClass(), "graph", null);
        setIntElement(term3087, 0, 1238707613);
        setField(term3082, term3082.getClass(), "vertices", term3087);
        setIntField(term3082, term3082.getClass(), "numVertices", 1961351136);
        setIntField(term3082, term3082.getClass(), "first", -1546528470);
        setField(term3091, term3091.getClass(), "words", null);
        setIntField(term3091, term3091.getClass(), "wordsInUse", -1518971561);
        setBooleanField(term3091, term3091.getClass(), "sizeIsSticky", false);
        setField(term3082, term3082.getClass(), "bitset", term3091);
        Object term3094 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3095 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3099 = (int[]) newIntArray(2);
        Object term3104 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3095, term3095.getClass(), "table", null);
        setIntField(term3095, term3095.getClass(), "count", 1513663171);
        setIntField(term3095, term3095.getClass(), "threshold", 15);
        setFloatField(term3095, term3095.getClass(), "loadFactor", 0.75F);
        setField(term3094, term3094.getClass(), "posMap", term3095);
        setField(term3094, term3094.getClass(), "graph", null);
        setIntElement(term3099, 0, 1527034193);
        setIntElement(term3099, 1, 1309545946);
        setField(term3094, term3094.getClass(), "vertices", term3099);
        setIntField(term3094, term3094.getClass(), "numVertices", -1457812682);
        setIntField(term3094, term3094.getClass(), "first", -161850441);
        setField(term3104, term3104.getClass(), "words", null);
        setIntField(term3104, term3104.getClass(), "wordsInUse", 1486351894);
        setBooleanField(term3104, term3104.getClass(), "sizeIsSticky", false);
        setField(term3094, term3094.getClass(), "bitset", term3104);
        Object term3107 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3108 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3112 = (int[]) newIntArray(4);
        Object term3119 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3108, term3108.getClass(), "table", null);
        setIntField(term3108, term3108.getClass(), "count", 1352463113);
        setIntField(term3108, term3108.getClass(), "threshold", 15);
        setFloatField(term3108, term3108.getClass(), "loadFactor", 0.75F);
        setField(term3107, term3107.getClass(), "posMap", term3108);
        setField(term3107, term3107.getClass(), "graph", null);
        setIntElement(term3112, 0, 897269648);
        setIntElement(term3112, 1, -1020664075);
        setIntElement(term3112, 2, -1412100145);
        setIntElement(term3112, 3, -1702355599);
        setField(term3107, term3107.getClass(), "vertices", term3112);
        setIntField(term3107, term3107.getClass(), "numVertices", -1477091217);
        setIntField(term3107, term3107.getClass(), "first", 2023226154);
        setField(term3119, term3119.getClass(), "words", null);
        setIntField(term3119, term3119.getClass(), "wordsInUse", 2111611214);
        setBooleanField(term3119, term3119.getClass(), "sizeIsSticky", false);
        setField(term3107, term3107.getClass(), "bitset", term3119);
        Object term3122 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3123 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3127 = (int[]) newIntArray(4);
        Object term3134 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3123, term3123.getClass(), "table", null);
        setIntField(term3123, term3123.getClass(), "count", -2031129784);
        setIntField(term3123, term3123.getClass(), "threshold", 15);
        setFloatField(term3123, term3123.getClass(), "loadFactor", 0.75F);
        setField(term3122, term3122.getClass(), "posMap", term3123);
        setField(term3122, term3122.getClass(), "graph", null);
        setIntElement(term3127, 0, 251039122);
        setIntElement(term3127, 1, 459471826);
        setIntElement(term3127, 2, -1054011286);
        setIntElement(term3127, 3, -1640361091);
        setField(term3122, term3122.getClass(), "vertices", term3127);
        setIntField(term3122, term3122.getClass(), "numVertices", -1908164516);
        setIntField(term3122, term3122.getClass(), "first", -1343269854);
        setField(term3134, term3134.getClass(), "words", null);
        setIntField(term3134, term3134.getClass(), "wordsInUse", -731459309);
        setBooleanField(term3134, term3134.getClass(), "sizeIsSticky", false);
        setField(term3122, term3122.getClass(), "bitset", term3134);
        Object term3137 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3138 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3142 = (int[]) newIntArray(8);
        Object term3153 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3138, term3138.getClass(), "table", null);
        setIntField(term3138, term3138.getClass(), "count", -913468095);
        setIntField(term3138, term3138.getClass(), "threshold", 15);
        setFloatField(term3138, term3138.getClass(), "loadFactor", 0.75F);
        setField(term3137, term3137.getClass(), "posMap", term3138);
        setField(term3137, term3137.getClass(), "graph", null);
        setIntElement(term3142, 0, 38489871);
        setIntElement(term3142, 1, -1667787735);
        setIntElement(term3142, 2, 1841765799);
        setIntElement(term3142, 3, 72160200);
        setIntElement(term3142, 4, -1870567623);
        setIntElement(term3142, 5, -1442923471);
        setIntElement(term3142, 6, -434247549);
        setIntElement(term3142, 7, 1246505552);
        setField(term3137, term3137.getClass(), "vertices", term3142);
        setIntField(term3137, term3137.getClass(), "numVertices", -1456497810);
        setIntField(term3137, term3137.getClass(), "first", 61954667);
        setField(term3153, term3153.getClass(), "words", null);
        setIntField(term3153, term3153.getClass(), "wordsInUse", -919022885);
        setBooleanField(term3153, term3153.getClass(), "sizeIsSticky", true);
        setField(term3137, term3137.getClass(), "bitset", term3153);
        Object term3156 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3157 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term3161 = (int[]) newIntArray(7);
        Object term3171 = newInstance(Class.forName("java.util.BitSet"));
        setField(term3157, term3157.getClass(), "table", null);
        setIntField(term3157, term3157.getClass(), "count", -1836286878);
        setIntField(term3157, term3157.getClass(), "threshold", 15);
        setFloatField(term3157, term3157.getClass(), "loadFactor", 0.75F);
        setField(term3156, term3156.getClass(), "posMap", term3157);
        setField(term3156, term3156.getClass(), "graph", null);
        setIntElement(term3161, 0, 276336694);
        setIntElement(term3161, 1, 1627938506);
        setIntElement(term3161, 2, 386284750);
        setIntElement(term3161, 3, 906856023);
        setIntElement(term3161, 4, 198857801);
        setIntElement(term3161, 5, 1342884142);
        setIntElement(term3161, 6, -1454325068);
        setField(term3156, term3156.getClass(), "vertices", term3161);
        setIntField(term3156, term3156.getClass(), "numVertices", 346714653);
        setIntField(term3156, term3156.getClass(), "first", 2121928697);
        setField(term3171, term3171.getClass(), "words", null);
        setIntField(term3171, term3171.getClass(), "wordsInUse", -1741056571);
        setBooleanField(term3171, term3171.getClass(), "sizeIsSticky", true);
        setField(term3156, term3156.getClass(), "bitset", term3171);
        ArrayList term3080 = new ArrayList();
        ((ArrayList) term3080).add(term3082);
        ((ArrayList) term3080).add(term3094);
        ((ArrayList) term3080).add(term3107);
        ((ArrayList) term3080).add(term3122);
        ((ArrayList) term3080).add(term3137);
        ((ArrayList) term3080).add(term3156);
        HashMap term3176 = new HashMap();
        ArrayList term3189 = new ArrayList();
        ((ArrayList) term3189).add((Object)null);
        ((ArrayList) term3189).add((Object)null);
        ((ArrayList) term3189).add((Object)null);
        ((ArrayList) term3189).add((Object)null);
        ((ArrayList) term3189).add((Object)null);
        HashMap term3193 = new HashMap();
        term3077 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term3077, term3077.getClass(), "connected", term3078);
        setField(term3077, term3077.getClass(), "connectedSets", term3080);
        setField(term3077, term3077.getClass(), "vertexSetMap", term3176);
        setField(term3077, term3077.getClass(), "components", term3189);
        setField(term3077, term3077.getClass(), "componentMap", term3193);
        setField(term3077, term3077.getClass(), "graph", null);
        term3203 = new Integer(918882916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3203;
        callMethod(klass, "getConnectedSet", argTypes, term3077, args);
    }

};


