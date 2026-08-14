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

public class ConnectivityAlgorithm_isConnected_16899329681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2676;

    public ConnectivityAlgorithm_isConnected_16899329681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2677 = new Boolean(true);
        Object term2681 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2682 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2686 = (int[]) newIntArray(8);
        Object term2697 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2682, term2682.getClass(), "table", null);
        setIntField(term2682, term2682.getClass(), "count", 346282818);
        setIntField(term2682, term2682.getClass(), "threshold", 15);
        setFloatField(term2682, term2682.getClass(), "loadFactor", 0.75F);
        setField(term2681, term2681.getClass(), "posMap", term2682);
        setField(term2681, term2681.getClass(), "graph", null);
        setIntElement(term2686, 0, -857876056);
        setIntElement(term2686, 1, 1392910876);
        setIntElement(term2686, 2, 1086383182);
        setIntElement(term2686, 3, 1425319286);
        setIntElement(term2686, 4, 1729919228);
        setIntElement(term2686, 5, 872351195);
        setIntElement(term2686, 6, -1664328399);
        setIntElement(term2686, 7, 1422430512);
        setField(term2681, term2681.getClass(), "vertices", term2686);
        setIntField(term2681, term2681.getClass(), "numVertices", 1796581482);
        setIntField(term2681, term2681.getClass(), "first", 1286440081);
        setField(term2697, term2697.getClass(), "words", null);
        setIntField(term2697, term2697.getClass(), "wordsInUse", -928538452);
        setBooleanField(term2697, term2697.getClass(), "sizeIsSticky", true);
        setField(term2681, term2681.getClass(), "bitset", term2697);
        Object term2700 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term2701 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2705 = (int[]) newIntArray(5);
        Object term2713 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2701, term2701.getClass(), "table", null);
        setIntField(term2701, term2701.getClass(), "count", -1313207353);
        setIntField(term2701, term2701.getClass(), "threshold", 15);
        setFloatField(term2701, term2701.getClass(), "loadFactor", 0.75F);
        setField(term2700, term2700.getClass(), "posMap", term2701);
        setField(term2700, term2700.getClass(), "graph", null);
        setIntElement(term2705, 0, 402612318);
        setIntElement(term2705, 1, -1628481565);
        setIntElement(term2705, 2, -217226756);
        setIntElement(term2705, 3, 1608000247);
        setIntElement(term2705, 4, 1354560887);
        setField(term2700, term2700.getClass(), "vertices", term2705);
        setIntField(term2700, term2700.getClass(), "numVertices", -749474542);
        setIntField(term2700, term2700.getClass(), "first", -47907780);
        setField(term2713, term2713.getClass(), "words", null);
        setIntField(term2713, term2713.getClass(), "wordsInUse", 1131462369);
        setBooleanField(term2713, term2713.getClass(), "sizeIsSticky", false);
        setField(term2700, term2700.getClass(), "bitset", term2713);
        ArrayList term2679 = new ArrayList();
        ((ArrayList) term2679).add(term2681);
        ((ArrayList) term2679).add(term2700);
        HashMap term2718 = new HashMap();
        ArrayList term2731 = new ArrayList();
        ((ArrayList) term2731).add((Object)null);
        ((ArrayList) term2731).add((Object)null);
        ((ArrayList) term2731).add((Object)null);
        ((ArrayList) term2731).add((Object)null);
        ((ArrayList) term2731).add((Object)null);
        ((ArrayList) term2731).add((Object)null);
        HashMap term2735 = new HashMap();
        term2676 = newInstance(Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm"));
        setField(term2676, term2676.getClass(), "connected", term2677);
        setField(term2676, term2676.getClass(), "connectedSets", term2679);
        setField(term2676, term2676.getClass(), "vertexSetMap", term2718);
        setField(term2676, term2676.getClass(), "components", term2731);
        setField(term2676, term2676.getClass(), "componentMap", term2735);
        setField(term2676, term2676.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.ConnectivityAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isConnected", argTypes, term2676, args);
    }

};


