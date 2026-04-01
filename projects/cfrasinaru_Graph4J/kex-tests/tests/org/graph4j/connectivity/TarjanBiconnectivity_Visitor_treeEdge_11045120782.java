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

public class TarjanBiconnectivity_Visitor_treeEdge_11045120782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2377;
     Object term2394;
     Object term2419;

    public TarjanBiconnectivity_Visitor_treeEdge_11045120782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2377 = newInstance(Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor"));
        Object term2379 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term2380 = (int[]) newIntArray(2);
        Object term2385 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2386 = (long[]) newLongArray(1);
        boolean[] term2390 = (boolean[]) newBooleanArray(3);
        setBooleanField(term2377, term2377.getClass(), "checkOnly", false);
        setField(term2379, term2379.getClass(), "graph", null);
        setIntElement(term2380, 0, -147055177);
        setIntElement(term2380, 1, 1979044375);
        setField(term2379, term2379.getClass(), "vertices", term2380);
        setIntField(term2379, term2379.getClass(), "numVertices", 961252909);
        setIntField(term2379, term2379.getClass(), "first", 1455842357);
        setField(term2385, term2385.getClass(), "words", term2386);
        setIntField(term2385, term2385.getClass(), "wordsInUse", 1349806561);
        setBooleanField(term2385, term2385.getClass(), "sizeIsSticky", false);
        setField(term2379, term2379.getClass(), "bitset", term2385);
        setField(term2377, term2377.getClass(), "stack", term2379);
        setBooleanElement(term2390, 0, true);
        setBooleanElement(term2390, 1, true);
        setField(term2377, term2377.getClass(), "instack", term2390);
        setField(term2377, term2377.getClass(), "this$0", null);
        term2394 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2399 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2404 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2409 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2414 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2394, term2394.getClass(), "component", 923905351);
        setIntField(term2394, term2394.getClass(), "vertex", 428360161);
        setIntField(term2394, term2394.getClass(), "level", 631528579);
        setIntField(term2394, term2394.getClass(), "order", -1652091834);
        setIntField(term2399, term2399.getClass(), "component", -282021579);
        setIntField(term2399, term2399.getClass(), "vertex", -1652588127);
        setIntField(term2399, term2399.getClass(), "level", -1902823385);
        setIntField(term2399, term2399.getClass(), "order", -784924879);
        setIntField(term2404, term2404.getClass(), "component", -1062027102);
        setIntField(term2404, term2404.getClass(), "vertex", 1763217806);
        setIntField(term2404, term2404.getClass(), "level", 1644949396);
        setIntField(term2404, term2404.getClass(), "order", -2017073245);
        setIntField(term2409, term2409.getClass(), "component", 522440332);
        setIntField(term2409, term2409.getClass(), "vertex", 1516598327);
        setIntField(term2409, term2409.getClass(), "level", 82353584);
        setIntField(term2409, term2409.getClass(), "order", -758778797);
        setIntField(term2414, term2414.getClass(), "component", 765680355);
        setIntField(term2414, term2414.getClass(), "vertex", -1012090049);
        setIntField(term2414, term2414.getClass(), "level", -2025214553);
        setIntField(term2414, term2414.getClass(), "order", -154750730);
        setField(term2414, term2414.getClass(), "parent", null);
        setField(term2409, term2409.getClass(), "parent", term2414);
        setField(term2404, term2404.getClass(), "parent", term2409);
        setField(term2399, term2399.getClass(), "parent", term2404);
        setField(term2394, term2394.getClass(), "parent", term2399);
        term2419 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2424 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2429 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2434 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term2439 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term2419, term2419.getClass(), "component", 1611620166);
        setIntField(term2419, term2419.getClass(), "vertex", 249657454);
        setIntField(term2419, term2419.getClass(), "level", 1734630901);
        setIntField(term2419, term2419.getClass(), "order", -703815246);
        setIntField(term2424, term2424.getClass(), "component", 157300746);
        setIntField(term2424, term2424.getClass(), "vertex", -1600748613);
        setIntField(term2424, term2424.getClass(), "level", -1509192782);
        setIntField(term2424, term2424.getClass(), "order", -867925573);
        setIntField(term2429, term2429.getClass(), "component", 478422495);
        setIntField(term2429, term2429.getClass(), "vertex", 1727771237);
        setIntField(term2429, term2429.getClass(), "level", 2033663549);
        setIntField(term2429, term2429.getClass(), "order", 1766479154);
        setIntField(term2434, term2434.getClass(), "component", 533171496);
        setIntField(term2434, term2434.getClass(), "vertex", 1369020869);
        setIntField(term2434, term2434.getClass(), "level", -1428947021);
        setIntField(term2434, term2434.getClass(), "order", -134324004);
        setIntField(term2439, term2439.getClass(), "component", -1813266173);
        setIntField(term2439, term2439.getClass(), "vertex", -1201819537);
        setIntField(term2439, term2439.getClass(), "level", 2135922049);
        setIntField(term2439, term2439.getClass(), "order", -263876378);
        setField(term2439, term2439.getClass(), "parent", null);
        setField(term2434, term2434.getClass(), "parent", term2439);
        setField(term2429, term2429.getClass(), "parent", term2434);
        setField(term2424, term2424.getClass(), "parent", term2429);
        setField(term2419, term2419.getClass(), "parent", term2424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanBiconnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term2394;
        args[1] = term2419;
        callMethod(klass, "treeEdge", argTypes, term2377, args);
    }

};


