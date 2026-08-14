package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DiameterCalculator_selectVertexMaxUB_8714866255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10298;

    public DiameterCalculator_selectVertexMaxUB_8714866255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10298 = newInstance(Class.forName("org.graph4j.metrics.DiameterCalculator"));
        int[] term10301 = (int[]) newIntArray(5);
        int[] term10307 = (int[]) newIntArray(5);
        int[] term10313 = (int[]) newIntArray(5);
        Object term10319 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term10320 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term10321 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term10325 = (int[]) newIntArray(4);
        Object term10332 = newInstance(Class.forName("java.util.BitSet"));
        long[] term10333 = (long[]) newLongArray(1);
        setIntField(term10298, term10298.getClass(), "diamUB", -1592307668);
        setIntField(term10298, term10298.getClass(), "diamLB", -203832871);
        setIntElement(term10301, 0, 1151963130);
        setIntElement(term10301, 1, -1855819749);
        setIntElement(term10301, 2, 1059048043);
        setIntElement(term10301, 3, 537273345);
        setIntElement(term10301, 4, -346107257);
        setField(term10298, term10298.getClass(), "eccLB", term10301);
        setIntElement(term10307, 0, -1577393360);
        setIntElement(term10307, 1, 1112256038);
        setIntElement(term10307, 2, -441333794);
        setIntElement(term10307, 3, 1504698817);
        setIntElement(term10307, 4, -2018333791);
        setField(term10298, term10298.getClass(), "eccUB", term10307);
        setIntElement(term10313, 0, -742476678);
        setIntElement(term10313, 1, -824369460);
        setIntElement(term10313, 2, -1573760035);
        setIntElement(term10313, 3, -1147965121);
        setIntElement(term10313, 4, -867099093);
        setField(term10298, term10298.getClass(), "dist", term10313);
        setField(term10320, term10320.getClass(), "table", term10321);
        setIntField(term10320, term10320.getClass(), "count", -1091199008);
        setIntField(term10320, term10320.getClass(), "threshold", 15);
        setFloatField(term10320, term10320.getClass(), "loadFactor", 0.75F);
        setField(term10319, term10319.getClass(), "posMap", term10320);
        setField(term10319, term10319.getClass(), "graph", null);
        setIntElement(term10325, 0, 1837886253);
        setIntElement(term10325, 1, -269528550);
        setIntElement(term10325, 2, 2108571355);
        setIntElement(term10325, 3, 1909966089);
        setField(term10319, term10319.getClass(), "vertices", term10325);
        setIntField(term10319, term10319.getClass(), "numVertices", 1827255916);
        setIntField(term10319, term10319.getClass(), "first", 2039815750);
        setField(term10332, term10332.getClass(), "words", term10333);
        setIntField(term10332, term10332.getClass(), "wordsInUse", 2079590265);
        setBooleanField(term10332, term10332.getClass(), "sizeIsSticky", true);
        setField(term10319, term10319.getClass(), "bitset", term10332);
        setField(term10298, term10298.getClass(), "candidates", term10319);
        setBooleanField(term10298, term10298.getClass(), "selector", false);
        setField(term10298, term10298.getClass(), "graph", null);
        setBooleanField(term10298, term10298.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DiameterCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMaxUB", argTypes, term10298, args);
    }

};


