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

public class GraphExtremaCalculator_getRadius_20910284892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6749;

    public GraphExtremaCalculator_getRadius_20910284892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6805 = new Integer(-226514366);
        Integer term6807 = new Integer(1193880199);
        Class<? extends Object> term6914 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term6913 = ((Class) term6914).getDeclaredField((String) "DIAMETER");
        ((Field) term6913).setAccessible(true);
        Object enum13 = ((Field) term6913).get((Object) null);
        term6749 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term6754 = (int[]) newIntArray(8);
        int[] term6763 = (int[]) newIntArray(9);
        int[] term6773 = (int[]) newIntArray(7);
        Object term6781 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6782 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6783 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6787 = (int[]) newIntArray(8);
        Object term6798 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6799 = (long[]) newLongArray(1);
        Object term6809 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6810 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6811 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6815 = (int[]) newIntArray(9);
        Object term6827 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6828 = (long[]) newLongArray(1);
        Object term6832 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6833 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term6834 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term6838 = (int[]) newIntArray(5);
        Object term6846 = newInstance(Class.forName("java.util.BitSet"));
        long[] term6847 = (long[]) newLongArray(1);
        setIntField(term6749, term6749.getClass(), "radiusLB", -1511130237);
        setIntField(term6749, term6749.getClass(), "radiusUB", 452088587);
        setIntField(term6749, term6749.getClass(), "diamLB", -1630069454);
        setIntField(term6749, term6749.getClass(), "diamUB", 1499735894);
        setIntElement(term6754, 0, 716486048);
        setIntElement(term6754, 1, -466708718);
        setIntElement(term6754, 2, 1038029515);
        setIntElement(term6754, 3, 1137154606);
        setIntElement(term6754, 4, -100681578);
        setIntElement(term6754, 5, 296568835);
        setIntElement(term6754, 6, 1431951992);
        setIntElement(term6754, 7, -1608123016);
        setField(term6749, term6749.getClass(), "eccLB", term6754);
        setIntElement(term6763, 0, -896473214);
        setIntElement(term6763, 1, 401203924);
        setIntElement(term6763, 2, -1212399479);
        setIntElement(term6763, 3, 2107679041);
        setIntElement(term6763, 4, 2040965507);
        setIntElement(term6763, 5, -1281083262);
        setIntElement(term6763, 6, 1059930704);
        setIntElement(term6763, 7, -1967153290);
        setIntElement(term6763, 8, -1397251956);
        setField(term6749, term6749.getClass(), "eccUB", term6763);
        setIntElement(term6773, 0, -796934571);
        setIntElement(term6773, 1, 405295896);
        setIntElement(term6773, 2, -814977075);
        setIntElement(term6773, 3, 808614267);
        setIntElement(term6773, 4, 1611734632);
        setIntElement(term6773, 5, 868908117);
        setIntElement(term6773, 6, 1789351397);
        setField(term6749, term6749.getClass(), "dist", term6773);
        setField(term6782, term6782.getClass(), "table", term6783);
        setIntField(term6782, term6782.getClass(), "count", 2145528170);
        setIntField(term6782, term6782.getClass(), "threshold", 15);
        setFloatField(term6782, term6782.getClass(), "loadFactor", 0.75F);
        setField(term6781, term6781.getClass(), "posMap", term6782);
        setField(term6781, term6781.getClass(), "graph", null);
        setIntElement(term6787, 0, -585773976);
        setIntElement(term6787, 1, 852806940);
        setIntElement(term6787, 2, 698551724);
        setIntElement(term6787, 3, -1631048635);
        setIntElement(term6787, 4, 1342808731);
        setIntElement(term6787, 5, -64893740);
        setIntElement(term6787, 6, -222012928);
        setIntElement(term6787, 7, -146564963);
        setField(term6781, term6781.getClass(), "vertices", term6787);
        setIntField(term6781, term6781.getClass(), "numVertices", -83178716);
        setIntField(term6781, term6781.getClass(), "first", -1292704466);
        setField(term6798, term6798.getClass(), "words", term6799);
        setIntField(term6798, term6798.getClass(), "wordsInUse", 1991858584);
        setBooleanField(term6798, term6798.getClass(), "sizeIsSticky", true);
        setField(term6781, term6781.getClass(), "bitset", term6798);
        setField(term6749, term6749.getClass(), "candidates", term6781);
        setBooleanField(term6749, term6749.getClass(), "selector", true);
        setBooleanField(term6749, term6749.getClass(), "connected", false);
        setField(term6749, term6749.getClass(), "radius", term6805);
        setField(term6749, term6749.getClass(), "diameter", term6807);
        setField(term6810, term6810.getClass(), "table", term6811);
        setIntField(term6810, term6810.getClass(), "count", -1300947782);
        setIntField(term6810, term6810.getClass(), "threshold", 15);
        setFloatField(term6810, term6810.getClass(), "loadFactor", 0.75F);
        setField(term6809, term6809.getClass(), "posMap", term6810);
        setField(term6809, term6809.getClass(), "graph", null);
        setIntElement(term6815, 0, 188512644);
        setIntElement(term6815, 1, 1851127634);
        setIntElement(term6815, 2, 783730213);
        setIntElement(term6815, 3, 1815951606);
        setIntElement(term6815, 4, 1105016932);
        setIntElement(term6815, 5, -365784998);
        setIntElement(term6815, 6, -1893236300);
        setIntElement(term6815, 7, -1858909368);
        setIntElement(term6815, 8, -280113263);
        setField(term6809, term6809.getClass(), "vertices", term6815);
        setIntField(term6809, term6809.getClass(), "numVertices", 529625347);
        setIntField(term6809, term6809.getClass(), "first", 1409095253);
        setField(term6827, term6827.getClass(), "words", term6828);
        setIntField(term6827, term6827.getClass(), "wordsInUse", 315179039);
        setBooleanField(term6827, term6827.getClass(), "sizeIsSticky", false);
        setField(term6809, term6809.getClass(), "bitset", term6827);
        setField(term6749, term6749.getClass(), "center", term6809);
        setField(term6833, term6833.getClass(), "table", term6834);
        setIntField(term6833, term6833.getClass(), "count", -1835923897);
        setIntField(term6833, term6833.getClass(), "threshold", 15);
        setFloatField(term6833, term6833.getClass(), "loadFactor", 0.75F);
        setField(term6832, term6832.getClass(), "posMap", term6833);
        setField(term6832, term6832.getClass(), "graph", null);
        setIntElement(term6838, 0, -341287775);
        setIntElement(term6838, 1, -1651110911);
        setIntElement(term6838, 2, -1934033808);
        setIntElement(term6838, 3, 950322609);
        setIntElement(term6838, 4, -2023791789);
        setField(term6832, term6832.getClass(), "vertices", term6838);
        setIntField(term6832, term6832.getClass(), "numVertices", 353974456);
        setIntField(term6832, term6832.getClass(), "first", -485108462);
        setField(term6846, term6846.getClass(), "words", term6847);
        setIntField(term6846, term6846.getClass(), "wordsInUse", 1418551216);
        setBooleanField(term6846, term6846.getClass(), "sizeIsSticky", false);
        setField(term6832, term6832.getClass(), "bitset", term6846);
        setField(term6749, term6749.getClass(), "periphery", term6832);
        setField(term6749, term6749.getClass(), "extremaType", enum13);
        setField(term6749, term6749.getClass(), "graph", null);
        setBooleanField(term6749, term6749.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRadius", argTypes, term6749, args);
    }

};


