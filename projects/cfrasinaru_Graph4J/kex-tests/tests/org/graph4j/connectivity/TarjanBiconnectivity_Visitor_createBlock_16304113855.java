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

public class TarjanBiconnectivity_Visitor_createBlock_16304113855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2608;
     Object term2629;

    public TarjanBiconnectivity_Visitor_createBlock_16304113855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2608 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor"));
        Object term2610 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term2611 = (int[]) newIntArray(7);
        Object term2621 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2622 = (long[]) newLongArray(1);
        boolean[] term2626 = (boolean[]) newBooleanArray(2);
        setBooleanField(term2608, term2608.getClass(), "checkOnly", false);
        setField(term2610, term2610.getClass(), "graph", null);
        setIntElement(term2611, 0, 301438568);
        setIntElement(term2611, 1, -1667908453);
        setIntElement(term2611, 2, 315910438);
        setIntElement(term2611, 3, -1673157821);
        setIntElement(term2611, 4, 1217804703);
        setIntElement(term2611, 5, -1981494102);
        setIntElement(term2611, 6, -2064148945);
        setField(term2610, term2610.getClass(), "vertices", term2611);
        setIntField(term2610, term2610.getClass(), "numVertices", 494400151);
        setIntField(term2610, term2610.getClass(), "first", 1588058685);
        setField(term2621, term2621.getClass(), "words", term2622);
        setIntField(term2621, term2621.getClass(), "wordsInUse", 1677707412);
        setBooleanField(term2621, term2621.getClass(), "sizeIsSticky", false);
        setField(term2610, term2610.getClass(), "bitset", term2621);
        setField(term2608, term2608.getClass(), "stack", term2610);
        setBooleanElement(term2626, 0, true);
        setField(term2608, term2608.getClass(), "instack", term2626);
        setField(term2608, term2608.getClass(), "this$0", null);
        term2629 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2634 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2639 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2644 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2649 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2629, term2629.getClass(), "component", -297367861);
        setIntField(term2629, term2629.getClass(), "vertex", -1133541490);
        setIntField(term2629, term2629.getClass(), "level", 942412391);
        setIntField(term2629, term2629.getClass(), "order", 751596480);
        setIntField(term2634, term2634.getClass(), "component", 1971485144);
        setIntField(term2634, term2634.getClass(), "vertex", 2059603512);
        setIntField(term2634, term2634.getClass(), "level", -1308902065);
        setIntField(term2634, term2634.getClass(), "order", 605255795);
        setIntField(term2639, term2639.getClass(), "component", 1743438307);
        setIntField(term2639, term2639.getClass(), "vertex", -1122596893);
        setIntField(term2639, term2639.getClass(), "level", -2147297900);
        setIntField(term2639, term2639.getClass(), "order", 539095138);
        setIntField(term2644, term2644.getClass(), "component", 1462297654);
        setIntField(term2644, term2644.getClass(), "vertex", 1009915858);
        setIntField(term2644, term2644.getClass(), "level", 500127209);
        setIntField(term2644, term2644.getClass(), "order", -1482530168);
        setIntField(term2649, term2649.getClass(), "component", -432987116);
        setIntField(term2649, term2649.getClass(), "vertex", 1483499310);
        setIntField(term2649, term2649.getClass(), "level", -1516568587);
        setIntField(term2649, term2649.getClass(), "order", 1537690170);
        setField(term2649, term2649.getClass(), "parent", null);
        setField(term2644, term2644.getClass(), "parent", term2649);
        setField(term2639, term2639.getClass(), "parent", term2644);
        setField(term2634, term2634.getClass(), "parent", term2639);
        setField(term2629, term2629.getClass(), "parent", term2634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term2629;
        callMethod(klass, "createBlock", argTypes, term2608, args);
    }

};


