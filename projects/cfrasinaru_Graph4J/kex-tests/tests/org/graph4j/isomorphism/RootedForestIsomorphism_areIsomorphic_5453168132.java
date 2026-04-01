package org.graph4j.isomorphism;

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
import static org.graph4j.isomorphism.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Boolean;

public class RootedForestIsomorphism_areIsomorphic_5453168132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3496;

    public RootedForestIsomorphism_areIsomorphic_5453168132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3552 = new HashMap();
        Boolean term3558 = new Boolean(true);
        term3496 = newInstance(Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism"));
        Object term3497 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3498 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3499 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3503 = (int[]) newIntArray(4);
        Object term3510 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3511 = (long[]) newLongArray(1);
        Object term3515 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3516 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3517 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3521 = (int[]) newIntArray(9);
        Object term3533 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3534 = (long[]) newLongArray(1);
        Object term3538 = newInstance(Class.forName("org.graph4j.isomorphism.RootedTreeIsomorphism"));
        int[] term3541 = (int[]) newIntArray(6);
        int[] term3548 = (int[]) newIntArray(3);
        Object term3560 = newInstance(Class.forName("org.graph4j.isomorphism.Isomorphism"));
        setField(term3496, term3496.getClass(), "forest1", null);
        setField(term3496, term3496.getClass(), "forest2", null);
        setField(term3498, term3498.getClass(), "table", term3499);
        setIntField(term3498, term3498.getClass(), "count", 532588266);
        setIntField(term3498, term3498.getClass(), "threshold", 15);
        setFloatField(term3498, term3498.getClass(), "loadFactor", 0.75F);
        setField(term3497, term3497.getClass(), "posMap", term3498);
        setField(term3497, term3497.getClass(), "graph", null);
        setIntElement(term3503, 0, -1286686332);
        setIntElement(term3503, 1, -284885486);
        setIntElement(term3503, 2, 1791984446);
        setIntElement(term3503, 3, 804070622);
        setField(term3497, term3497.getClass(), "vertices", term3503);
        setIntField(term3497, term3497.getClass(), "numVertices", 1850364894);
        setIntField(term3497, term3497.getClass(), "first", 915367534);
        setField(term3510, term3510.getClass(), "words", term3511);
        setIntField(term3510, term3510.getClass(), "wordsInUse", 1949983666);
        setBooleanField(term3510, term3510.getClass(), "sizeIsSticky", false);
        setField(term3497, term3497.getClass(), "bitset", term3510);
        setField(term3496, term3496.getClass(), "roots1", term3497);
        setField(term3516, term3516.getClass(), "table", term3517);
        setIntField(term3516, term3516.getClass(), "count", 154111854);
        setIntField(term3516, term3516.getClass(), "threshold", 15);
        setFloatField(term3516, term3516.getClass(), "loadFactor", 0.75F);
        setField(term3515, term3515.getClass(), "posMap", term3516);
        setField(term3515, term3515.getClass(), "graph", null);
        setIntElement(term3521, 0, 710986341);
        setIntElement(term3521, 1, -873958002);
        setIntElement(term3521, 2, -1780848958);
        setIntElement(term3521, 3, 1235045850);
        setIntElement(term3521, 4, -75143033);
        setIntElement(term3521, 5, 797015478);
        setIntElement(term3521, 6, 717574276);
        setIntElement(term3521, 7, 1795369860);
        setIntElement(term3521, 8, -570164389);
        setField(term3515, term3515.getClass(), "vertices", term3521);
        setIntField(term3515, term3515.getClass(), "numVertices", 43200329);
        setIntField(term3515, term3515.getClass(), "first", 998679955);
        setField(term3533, term3533.getClass(), "words", term3534);
        setIntField(term3533, term3533.getClass(), "wordsInUse", 953741504);
        setBooleanField(term3533, term3533.getClass(), "sizeIsSticky", true);
        setField(term3515, term3515.getClass(), "bitset", term3533);
        setField(term3496, term3496.getClass(), "roots2", term3515);
        setField(term3538, term3538.getClass(), "tree1", null);
        setField(term3538, term3538.getClass(), "tree2", null);
        setIntField(term3538, term3538.getClass(), "root1", 1389452261);
        setIntField(term3538, term3538.getClass(), "root2", 1615957955);
        setIntElement(term3541, 0, 1779370220);
        setIntElement(term3541, 1, -1716046610);
        setIntElement(term3541, 2, 65264024);
        setIntElement(term3541, 3, -252449812);
        setIntElement(term3541, 4, -1885268968);
        setIntElement(term3541, 5, 277855691);
        setField(term3538, term3538.getClass(), "labels1", term3541);
        setIntElement(term3548, 0, 675891483);
        setIntElement(term3548, 1, -317900470);
        setIntElement(term3548, 2, -979568);
        setField(term3538, term3538.getClass(), "labels2", term3548);
        setField(term3538, term3538.getClass(), "labelListToInt", term3552);
        setIntField(term3538, term3538.getClass(), "maxLabel", -1422131197);
        setField(term3538, term3538.getClass(), "isomorphic", term3558);
        setField(term3560, term3560.getClass(), "graph1", null);
        setField(term3560, term3560.getClass(), "graph2", null);
        setField(term3560, term3560.getClass(), "mapping", null);
        setField(term3560, term3560.getClass(), "inverse", null);
        setField(term3538, term3538.getClass(), "isomorphism", term3560);
        setField(term3538, term3538.getClass(), "sortingAlgorithm", null);
        setField(term3496, term3496.getClass(), "rootedTreeAlg", term3538);
        setField(term3496, term3496.getClass(), "tree1", null);
        setField(term3496, term3496.getClass(), "tree2", null);
        setIntField(term3496, term3496.getClass(), "root1", 0);
        setIntField(term3496, term3496.getClass(), "root2", 0);
        setField(term3496, term3496.getClass(), "isomorphic", null);
        setField(term3496, term3496.getClass(), "isomorphism", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.isomorphism.RootedForestIsomorphism");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "areIsomorphic", argTypes, term3496, args);
    }

};


