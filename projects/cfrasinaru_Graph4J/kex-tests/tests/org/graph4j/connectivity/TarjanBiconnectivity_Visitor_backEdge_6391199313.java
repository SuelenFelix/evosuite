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

public class TarjanBiconnectivity_Visitor_backEdge_6391199313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2450;
     Object term2469;
     Object term2494;

    public TarjanBiconnectivity_Visitor_backEdge_6391199313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2450 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor"));
        Object term2452 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term2453 = (int[]) newIntArray(2);
        Object term2458 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2459 = (long[]) newLongArray(1);
        boolean[] term2463 = (boolean[]) newBooleanArray(5);
        setBooleanField(term2450, term2450.getClass(), "checkOnly", true);
        setField(term2452, term2452.getClass(), "graph", null);
        setIntElement(term2453, 0, -374887532);
        setIntElement(term2453, 1, -165487736);
        setField(term2452, term2452.getClass(), "vertices", term2453);
        setIntField(term2452, term2452.getClass(), "numVertices", -608393431);
        setIntField(term2452, term2452.getClass(), "first", 298082829);
        setField(term2458, term2458.getClass(), "words", term2459);
        setIntField(term2458, term2458.getClass(), "wordsInUse", -1494372780);
        setBooleanField(term2458, term2458.getClass(), "sizeIsSticky", true);
        setField(term2452, term2452.getClass(), "bitset", term2458);
        setField(term2450, term2450.getClass(), "stack", term2452);
        setBooleanElement(term2463, 3, true);
        setField(term2450, term2450.getClass(), "instack", term2463);
        setField(term2450, term2450.getClass(), "this$0", null);
        term2469 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2474 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2479 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2484 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2489 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2469, term2469.getClass(), "component", 703799187);
        setIntField(term2469, term2469.getClass(), "vertex", -1305898281);
        setIntField(term2469, term2469.getClass(), "level", 140501130);
        setIntField(term2469, term2469.getClass(), "order", -1458890291);
        setIntField(term2474, term2474.getClass(), "component", 1016087323);
        setIntField(term2474, term2474.getClass(), "vertex", 1957748979);
        setIntField(term2474, term2474.getClass(), "level", -1290093259);
        setIntField(term2474, term2474.getClass(), "order", -1200934890);
        setIntField(term2479, term2479.getClass(), "component", 1765633108);
        setIntField(term2479, term2479.getClass(), "vertex", 1312888741);
        setIntField(term2479, term2479.getClass(), "level", -1443680397);
        setIntField(term2479, term2479.getClass(), "order", -1331169079);
        setIntField(term2484, term2484.getClass(), "component", 1109050836);
        setIntField(term2484, term2484.getClass(), "vertex", 1978065000);
        setIntField(term2484, term2484.getClass(), "level", -2121133707);
        setIntField(term2484, term2484.getClass(), "order", -1005498887);
        setIntField(term2489, term2489.getClass(), "component", 1329150584);
        setIntField(term2489, term2489.getClass(), "vertex", -1825382367);
        setIntField(term2489, term2489.getClass(), "level", -1791371074);
        setIntField(term2489, term2489.getClass(), "order", -1151122332);
        setField(term2489, term2489.getClass(), "parent", null);
        setField(term2484, term2484.getClass(), "parent", term2489);
        setField(term2479, term2479.getClass(), "parent", term2484);
        setField(term2474, term2474.getClass(), "parent", term2479);
        setField(term2469, term2469.getClass(), "parent", term2474);
        term2494 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2499 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2504 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2509 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2514 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2494, term2494.getClass(), "component", 848113442);
        setIntField(term2494, term2494.getClass(), "vertex", 793974213);
        setIntField(term2494, term2494.getClass(), "level", 722546287);
        setIntField(term2494, term2494.getClass(), "order", -2060284160);
        setIntField(term2499, term2499.getClass(), "component", -568450686);
        setIntField(term2499, term2499.getClass(), "vertex", 1314660281);
        setIntField(term2499, term2499.getClass(), "level", -126399768);
        setIntField(term2499, term2499.getClass(), "order", 318982923);
        setIntField(term2504, term2504.getClass(), "component", -154210001);
        setIntField(term2504, term2504.getClass(), "vertex", 621910137);
        setIntField(term2504, term2504.getClass(), "level", 241533020);
        setIntField(term2504, term2504.getClass(), "order", 2081679151);
        setIntField(term2509, term2509.getClass(), "component", -1030167086);
        setIntField(term2509, term2509.getClass(), "vertex", -434230943);
        setIntField(term2509, term2509.getClass(), "level", 698633875);
        setIntField(term2509, term2509.getClass(), "order", 548468113);
        setIntField(term2514, term2514.getClass(), "component", 1701819905);
        setIntField(term2514, term2514.getClass(), "vertex", 1721418943);
        setIntField(term2514, term2514.getClass(), "level", -111082612);
        setIntField(term2514, term2514.getClass(), "order", 1253334988);
        setField(term2514, term2514.getClass(), "parent", null);
        setField(term2509, term2509.getClass(), "parent", term2514);
        setField(term2504, term2504.getClass(), "parent", term2509);
        setField(term2499, term2499.getClass(), "parent", term2504);
        setField(term2494, term2494.getClass(), "parent", term2499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term2469;
        args[1] = term2494;
        callMethod(klass, "backEdge", argTypes, term2450, args);
    }

};


