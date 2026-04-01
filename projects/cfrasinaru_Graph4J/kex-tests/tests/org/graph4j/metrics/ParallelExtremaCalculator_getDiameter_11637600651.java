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
import java.lang.Integer;
import java.lang.String;

public class ParallelExtremaCalculator_getDiameter_11637600651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645;

    public ParallelExtremaCalculator_getDiameter_11637600651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term676 = new Integer(568599855);
        Integer term678 = new Integer(1162663216);
        Class<? extends Object> term747 = Class.forName((String) "org.graph4j.metrics.ParallelExtremaCalculator$Type");
        Field term746 = ((Class) term747).getDeclaredField((String) "RADIUS");
        ((Field) term746).setAccessible(true);
        Object enum2 = ((Field) term746).get((Object) null);
        term645 = newInstance(Class.forName("org.graph4j.metrics.ParallelExtremaCalculator"));
        int[] term650 = (int[]) newIntArray(3);
        int[] term654 = (int[]) newIntArray(4);
        Object term659 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term660 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term661 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term665 = (int[]) newIntArray(1);
        Object term669 = newInstance(Class.forName("java.util.BitSet"));
        long[] term670 = (long[]) newLongArray(1);
        Object term680 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term681 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term682 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term686 = (int[]) newIntArray(6);
        Object term695 = newInstance(Class.forName("java.util.BitSet"));
        long[] term696 = (long[]) newLongArray(1);
        Object term700 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term701 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term702 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term706 = (int[]) newIntArray(2);
        Object term711 = newInstance(Class.forName("java.util.BitSet"));
        long[] term712 = (long[]) newLongArray(1);
        setIntField(term645, term645.getClass(), "radiusLB", -616727354);
        setIntField(term645, term645.getClass(), "radiusUB", -1955890973);
        setIntField(term645, term645.getClass(), "diamLB", -2038273078);
        setIntField(term645, term645.getClass(), "diamUB", 1227103734);
        setIntElement(term650, 0, -1339778481);
        setIntElement(term650, 1, 1725571209);
        setIntElement(term650, 2, -522618178);
        setField(term645, term645.getClass(), "eccLB", term650);
        setIntElement(term654, 0, 1134449235);
        setIntElement(term654, 1, -883034806);
        setIntElement(term654, 2, 1585847225);
        setIntElement(term654, 3, 597278769);
        setField(term645, term645.getClass(), "eccUB", term654);
        setField(term660, term660.getClass(), "table", term661);
        setIntField(term660, term660.getClass(), "count", -1685132342);
        setIntField(term660, term660.getClass(), "threshold", 15);
        setFloatField(term660, term660.getClass(), "loadFactor", 0.75F);
        setField(term659, term659.getClass(), "posMap", term660);
        setField(term659, term659.getClass(), "graph", null);
        setIntElement(term665, 0, -1456670397);
        setField(term659, term659.getClass(), "vertices", term665);
        setIntField(term659, term659.getClass(), "numVertices", 1622346318);
        setIntField(term659, term659.getClass(), "first", 1048535127);
        setField(term669, term669.getClass(), "words", term670);
        setIntField(term669, term669.getClass(), "wordsInUse", -655067527);
        setBooleanField(term669, term669.getClass(), "sizeIsSticky", false);
        setField(term659, term659.getClass(), "bitset", term669);
        setField(term645, term645.getClass(), "candidates", term659);
        setBooleanField(term645, term645.getClass(), "selector", false);
        setBooleanField(term645, term645.getClass(), "connected", false);
        setField(term645, term645.getClass(), "radius", term676);
        setField(term645, term645.getClass(), "diameter", term678);
        setField(term681, term681.getClass(), "table", term682);
        setIntField(term681, term681.getClass(), "count", -6029667);
        setIntField(term681, term681.getClass(), "threshold", 15);
        setFloatField(term681, term681.getClass(), "loadFactor", 0.75F);
        setField(term680, term680.getClass(), "posMap", term681);
        setField(term680, term680.getClass(), "graph", null);
        setIntElement(term686, 0, -2068769794);
        setIntElement(term686, 1, -117576464);
        setIntElement(term686, 2, -1007160944);
        setIntElement(term686, 3, 1135664017);
        setIntElement(term686, 4, 590364439);
        setIntElement(term686, 5, 865208305);
        setField(term680, term680.getClass(), "vertices", term686);
        setIntField(term680, term680.getClass(), "numVertices", -1275173084);
        setIntField(term680, term680.getClass(), "first", -244121226);
        setField(term695, term695.getClass(), "words", term696);
        setIntField(term695, term695.getClass(), "wordsInUse", -203030934);
        setBooleanField(term695, term695.getClass(), "sizeIsSticky", true);
        setField(term680, term680.getClass(), "bitset", term695);
        setField(term645, term645.getClass(), "center", term680);
        setField(term701, term701.getClass(), "table", term702);
        setIntField(term701, term701.getClass(), "count", -1179120542);
        setIntField(term701, term701.getClass(), "threshold", 15);
        setFloatField(term701, term701.getClass(), "loadFactor", 0.75F);
        setField(term700, term700.getClass(), "posMap", term701);
        setField(term700, term700.getClass(), "graph", null);
        setIntElement(term706, 0, -73683645);
        setIntElement(term706, 1, -226514366);
        setField(term700, term700.getClass(), "vertices", term706);
        setIntField(term700, term700.getClass(), "numVertices", 1193880199);
        setIntField(term700, term700.getClass(), "first", -1087774327);
        setField(term711, term711.getClass(), "words", term712);
        setIntField(term711, term711.getClass(), "wordsInUse", -1530420153);
        setBooleanField(term711, term711.getClass(), "sizeIsSticky", true);
        setField(term700, term700.getClass(), "bitset", term711);
        setField(term645, term645.getClass(), "periphery", term700);
        setField(term645, term645.getClass(), "extremaType", enum2);
        setField(term645, term645.getClass(), "graph", null);
        setBooleanField(term645, term645.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.ParallelExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiameter", argTypes, term645, args);
    }

};


