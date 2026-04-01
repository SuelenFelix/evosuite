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

public class VertexSeparator_toString_88882953710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78958;

    public VertexSeparator_toString_88882953710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78958 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term78959 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78960 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78961 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78965 = (int[]) newIntArray(9);
        Object term78977 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78978 = (long[]) newLongArray(1);
        Object term78982 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78983 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78984 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78988 = (int[]) newIntArray(1);
        Object term78992 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78993 = (long[]) newLongArray(1);
        Object term78997 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78998 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78999 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term79003 = (int[]) newIntArray(1);
        Object term79007 = newInstance(Class.forName("java.util.BitSet"));
        long[] term79008 = (long[]) newLongArray(1);
        setField(term78958, term78958.getClass(), "graph", null);
        setField(term78960, term78960.getClass(), "table", term78961);
        setIntField(term78960, term78960.getClass(), "count", 95434101);
        setIntField(term78960, term78960.getClass(), "threshold", 15);
        setFloatField(term78960, term78960.getClass(), "loadFactor", 0.75F);
        setField(term78959, term78959.getClass(), "posMap", term78960);
        setField(term78959, term78959.getClass(), "graph", null);
        setIntElement(term78965, 0, 1578254763);
        setIntElement(term78965, 1, -1197972603);
        setIntElement(term78965, 2, 82035733);
        setIntElement(term78965, 3, -815104311);
        setIntElement(term78965, 4, -323574733);
        setIntElement(term78965, 5, -1600567927);
        setIntElement(term78965, 6, -1051157170);
        setIntElement(term78965, 7, 1267890763);
        setIntElement(term78965, 8, -354908388);
        setField(term78959, term78959.getClass(), "vertices", term78965);
        setIntField(term78959, term78959.getClass(), "numVertices", -1823173740);
        setIntField(term78959, term78959.getClass(), "first", 711565551);
        setField(term78977, term78977.getClass(), "words", term78978);
        setIntField(term78977, term78977.getClass(), "wordsInUse", 1808622233);
        setBooleanField(term78977, term78977.getClass(), "sizeIsSticky", false);
        setField(term78959, term78959.getClass(), "bitset", term78977);
        setField(term78958, term78958.getClass(), "separator", term78959);
        setField(term78983, term78983.getClass(), "table", term78984);
        setIntField(term78983, term78983.getClass(), "count", -1854319585);
        setIntField(term78983, term78983.getClass(), "threshold", 15);
        setFloatField(term78983, term78983.getClass(), "loadFactor", 0.75F);
        setField(term78982, term78982.getClass(), "posMap", term78983);
        setField(term78982, term78982.getClass(), "graph", null);
        setIntElement(term78988, 0, 548084080);
        setField(term78982, term78982.getClass(), "vertices", term78988);
        setIntField(term78982, term78982.getClass(), "numVertices", 1744825642);
        setIntField(term78982, term78982.getClass(), "first", -1372443184);
        setField(term78992, term78992.getClass(), "words", term78993);
        setIntField(term78992, term78992.getClass(), "wordsInUse", -360453538);
        setBooleanField(term78992, term78992.getClass(), "sizeIsSticky", true);
        setField(term78982, term78982.getClass(), "bitset", term78992);
        setField(term78958, term78958.getClass(), "leftShore", term78982);
        setField(term78998, term78998.getClass(), "table", term78999);
        setIntField(term78998, term78998.getClass(), "count", -1878105251);
        setIntField(term78998, term78998.getClass(), "threshold", 15);
        setFloatField(term78998, term78998.getClass(), "loadFactor", 0.75F);
        setField(term78997, term78997.getClass(), "posMap", term78998);
        setField(term78997, term78997.getClass(), "graph", null);
        setIntElement(term79003, 0, 269733901);
        setField(term78997, term78997.getClass(), "vertices", term79003);
        setIntField(term78997, term78997.getClass(), "numVertices", -736927476);
        setIntField(term78997, term78997.getClass(), "first", 1853113749);
        setField(term79007, term79007.getClass(), "words", term79008);
        setIntField(term79007, term79007.getClass(), "wordsInUse", -586438860);
        setBooleanField(term79007, term79007.getClass(), "sizeIsSticky", true);
        setField(term78997, term78997.getClass(), "bitset", term79007);
        setField(term78958, term78958.getClass(), "rightShore", term78997);
        setIntField(term78958, term78958.getClass(), "maxShoreSize", -1602722865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term78958, args);
    }

};


