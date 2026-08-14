package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class BacktrackVertexSeparator_getSeparator_3539658422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term724;

    public BacktrackVertexSeparator_getSeparator_3539658422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term789 = new ArrayList();
        term724 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term804 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term805 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term806 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term807 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term811 = (int[]) newIntArray(9);
        Object term823 = newInstance(Class.forName("java.util.BitSet"));
        long[] term824 = (long[]) newLongArray(1);
        Object term828 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term829 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term830 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term834 = (int[]) newIntArray(6);
        Object term843 = newInstance(Class.forName("java.util.BitSet"));
        long[] term844 = (long[]) newLongArray(1);
        Object term848 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term849 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term850 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setLongField(term724, term724.getClass(), "timeLimit", 6855071767938501807L);
        setLongField(term724, term724.getClass(), "startTime", -5892135042702373494L);
        setBooleanField(term724, term724.getClass(), "timeExpired", true);
        setField(term804, term804.getClass(), "graph", null);
        setField(term806, term806.getClass(), "table", term807);
        setIntField(term806, term806.getClass(), "count", 787278105);
        setIntField(term806, term806.getClass(), "threshold", 15);
        setFloatField(term806, term806.getClass(), "loadFactor", 0.75F);
        setField(term805, term805.getClass(), "posMap", term806);
        setField(term805, term805.getClass(), "graph", null);
        setIntElement(term811, 0, -2063843486);
        setIntElement(term811, 1, 833762980);
        setIntElement(term811, 2, 320711637);
        setIntElement(term811, 3, 1241164745);
        setIntElement(term811, 4, 1723148410);
        setIntElement(term811, 5, -920797484);
        setIntElement(term811, 6, -1631697577);
        setIntElement(term811, 7, 765731371);
        setIntElement(term811, 8, -1703035419);
        setField(term805, term805.getClass(), "vertices", term811);
        setIntField(term805, term805.getClass(), "numVertices", 765766290);
        setIntField(term805, term805.getClass(), "first", -1284825282);
        setField(term823, term823.getClass(), "words", term824);
        setIntField(term823, term823.getClass(), "wordsInUse", -1941343035);
        setBooleanField(term823, term823.getClass(), "sizeIsSticky", false);
        setField(term805, term805.getClass(), "bitset", term823);
        setField(term804, term804.getClass(), "separator", term805);
        setField(term829, term829.getClass(), "table", term830);
        setIntField(term829, term829.getClass(), "count", 947897214);
        setIntField(term829, term829.getClass(), "threshold", 15);
        setFloatField(term829, term829.getClass(), "loadFactor", 0.75F);
        setField(term828, term828.getClass(), "posMap", term829);
        setField(term828, term828.getClass(), "graph", null);
        setIntElement(term834, 0, 1496340209);
        setIntElement(term834, 1, -1748391876);
        setIntElement(term834, 2, 43258317);
        setIntElement(term834, 3, 1707220033);
        setIntElement(term834, 4, -1792504217);
        setIntElement(term834, 5, 1824538861);
        setField(term828, term828.getClass(), "vertices", term834);
        setIntField(term828, term828.getClass(), "numVertices", 499519708);
        setIntField(term828, term828.getClass(), "first", 1501165033);
        setField(term843, term843.getClass(), "words", term844);
        setIntField(term843, term843.getClass(), "wordsInUse", 0);
        setBooleanField(term843, term843.getClass(), "sizeIsSticky", false);
        setField(term828, term828.getClass(), "bitset", term843);
        setField(term804, term804.getClass(), "leftShore", term828);
        setField(term849, term849.getClass(), "table", term850);
        setIntField(term849, term849.getClass(), "count", 0);
        setIntField(term849, term849.getClass(), "threshold", 15);
        setFloatField(term849, term849.getClass(), "loadFactor", 0.75F);
        setField(term848, term848.getClass(), "posMap", term849);
        setField(term848, term848.getClass(), "graph", null);
        setField(term848, term848.getClass(), "vertices", null);
        setIntField(term848, term848.getClass(), "numVertices", 0);
        setIntField(term848, term848.getClass(), "first", 0);
        setField(term848, term848.getClass(), "bitset", null);
        setField(term804, term804.getClass(), "rightShore", term848);
        setIntField(term804, term804.getClass(), "maxShoreSize", 510162332);
        setField(term724, term724.getClass(), "solution", term804);
        setField(term724, term724.getClass(), "workers", term789);
        setLongField(term724, term724.getClass(), "nodesExplored", 5262507301787091109L);
        setIntField(term724, term724.getClass(), "minSepSize", 977862393);
        setIntField(term724, term724.getClass(), "vertexConnectivity", 301401782);
        setIntField(term724, term724.getClass(), "greedySepSize", 1988605357);
        setIntField(term724, term724.getClass(), "LEFT", 808203320);
        setIntField(term724, term724.getClass(), "RIGHT", -544382127);
        setIntField(term724, term724.getClass(), "SEP", -1830198043);
        setIntField(term724, term724.getClass(), "UNKNOWN", -439048495);
        setIntField(term724, term724.getClass(), "FAILURE", -1849105286);
        setIntField(term724, term724.getClass(), "POTENTIAL_SOLUTION", 1334483645);
        setIntField(term724, term724.getClass(), "maxShoreSize", 917513193);
        setField(term724, term724.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeparator", argTypes, term724, args);
    }

};


