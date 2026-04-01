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

public class TarjanBiconnectivity_Visitor_upward_5294105104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2527;
     Object term2548;
     Object term2573;

    public TarjanBiconnectivity_Visitor_upward_5294105104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2527 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor"));
        Object term2529 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term2530 = (int[]) newIntArray(1);
        Object term2534 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2535 = (long[]) newLongArray(1);
        boolean[] term2539 = (boolean[]) newBooleanArray(8);
        setBooleanField(term2527, term2527.getClass(), "checkOnly", false);
        setField(term2529, term2529.getClass(), "graph", null);
        setIntElement(term2530, 0, -91068927);
        setField(term2529, term2529.getClass(), "vertices", term2530);
        setIntField(term2529, term2529.getClass(), "numVertices", 680714112);
        setIntField(term2529, term2529.getClass(), "first", 385297023);
        setField(term2534, term2534.getClass(), "words", term2535);
        setIntField(term2534, term2534.getClass(), "wordsInUse", -134092543);
        setBooleanField(term2534, term2534.getClass(), "sizeIsSticky", false);
        setField(term2529, term2529.getClass(), "bitset", term2534);
        setField(term2527, term2527.getClass(), "stack", term2529);
        setBooleanElement(term2539, 0, true);
        setBooleanElement(term2539, 3, true);
        setBooleanElement(term2539, 4, true);
        setBooleanElement(term2539, 6, true);
        setBooleanElement(term2539, 7, true);
        setField(term2527, term2527.getClass(), "instack", term2539);
        setField(term2527, term2527.getClass(), "this$0", null);
        term2548 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2553 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2558 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2563 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2568 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2548, term2548.getClass(), "component", -1703642288);
        setIntField(term2548, term2548.getClass(), "vertex", 2075139747);
        setIntField(term2548, term2548.getClass(), "level", 2092881418);
        setIntField(term2548, term2548.getClass(), "order", 1732410866);
        setIntField(term2553, term2553.getClass(), "component", 1084102599);
        setIntField(term2553, term2553.getClass(), "vertex", -1743503755);
        setIntField(term2553, term2553.getClass(), "level", 1641342112);
        setIntField(term2553, term2553.getClass(), "order", -1551790945);
        setIntField(term2558, term2558.getClass(), "component", 2039538484);
        setIntField(term2558, term2558.getClass(), "vertex", 1235736068);
        setIntField(term2558, term2558.getClass(), "level", 329424176);
        setIntField(term2558, term2558.getClass(), "order", -1897199214);
        setIntField(term2563, term2563.getClass(), "component", -1016478729);
        setIntField(term2563, term2563.getClass(), "vertex", -206889003);
        setIntField(term2563, term2563.getClass(), "level", 638046409);
        setIntField(term2563, term2563.getClass(), "order", 427274898);
        setIntField(term2568, term2568.getClass(), "component", -1654552020);
        setIntField(term2568, term2568.getClass(), "vertex", -1049546692);
        setIntField(term2568, term2568.getClass(), "level", 1397781598);
        setIntField(term2568, term2568.getClass(), "order", -44720365);
        setField(term2568, term2568.getClass(), "parent", null);
        setField(term2563, term2563.getClass(), "parent", term2568);
        setField(term2558, term2558.getClass(), "parent", term2563);
        setField(term2553, term2553.getClass(), "parent", term2558);
        setField(term2548, term2548.getClass(), "parent", term2553);
        term2573 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2578 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2583 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2588 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2593 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2573, term2573.getClass(), "component", -82417507);
        setIntField(term2573, term2573.getClass(), "vertex", -511400358);
        setIntField(term2573, term2573.getClass(), "level", -742178468);
        setIntField(term2573, term2573.getClass(), "order", 694989162);
        setIntField(term2578, term2578.getClass(), "component", -65504209);
        setIntField(term2578, term2578.getClass(), "vertex", 1745199030);
        setIntField(term2578, term2578.getClass(), "level", -1440013173);
        setIntField(term2578, term2578.getClass(), "order", -288126597);
        setIntField(term2583, term2583.getClass(), "component", -218831961);
        setIntField(term2583, term2583.getClass(), "vertex", 826765055);
        setIntField(term2583, term2583.getClass(), "level", 1358117317);
        setIntField(term2583, term2583.getClass(), "order", 229989439);
        setIntField(term2588, term2588.getClass(), "component", -1620126913);
        setIntField(term2588, term2588.getClass(), "vertex", -1095121979);
        setIntField(term2588, term2588.getClass(), "level", -1674851914);
        setIntField(term2588, term2588.getClass(), "order", -1891353352);
        setIntField(term2593, term2593.getClass(), "component", 113007640);
        setIntField(term2593, term2593.getClass(), "vertex", 1782226794);
        setIntField(term2593, term2593.getClass(), "level", 1115327577);
        setIntField(term2593, term2593.getClass(), "order", 840704993);
        setField(term2593, term2593.getClass(), "parent", null);
        setField(term2588, term2588.getClass(), "parent", term2593);
        setField(term2583, term2583.getClass(), "parent", term2588);
        setField(term2578, term2578.getClass(), "parent", term2583);
        setField(term2573, term2573.getClass(), "parent", term2578);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term2548;
        args[1] = term2573;
        callMethod(klass, "upward", argTypes, term2527, args);
    }

};


