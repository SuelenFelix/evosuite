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

public class GreedyVertexSeparator_neighborhood_11188318084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143020;
     Object term143085;

    public GreedyVertexSeparator_neighborhood_11188318084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143020 = newInstance(Class.forName("org.graph4j.vsp.GreedyVertexSeparator"));
        Object term143022 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term143023 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term143024 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term143025 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term143029 = (int[]) newIntArray(8);
        Object term143040 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143041 = (long[]) newLongArray(1);
        Object term143045 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term143046 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term143047 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term143051 = (int[]) newIntArray(4);
        Object term143058 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143059 = (long[]) newLongArray(1);
        Object term143063 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term143064 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term143065 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term143069 = (int[]) newIntArray(7);
        Object term143079 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143080 = (long[]) newLongArray(1);
        setIntField(term143020, term143020.getClass(), "maxShoreSize", -1712293905);
        setField(term143022, term143022.getClass(), "graph", null);
        setField(term143024, term143024.getClass(), "table", term143025);
        setIntField(term143024, term143024.getClass(), "count", 1075740779);
        setIntField(term143024, term143024.getClass(), "threshold", 15);
        setFloatField(term143024, term143024.getClass(), "loadFactor", 0.75F);
        setField(term143023, term143023.getClass(), "posMap", term143024);
        setField(term143023, term143023.getClass(), "graph", null);
        setIntElement(term143029, 0, 1777603249);
        setIntElement(term143029, 1, 810939905);
        setIntElement(term143029, 2, 435905015);
        setIntElement(term143029, 3, 1429131812);
        setIntElement(term143029, 4, -914393364);
        setIntElement(term143029, 5, 1692542155);
        setIntElement(term143029, 6, -1526924556);
        setIntElement(term143029, 7, -981121901);
        setField(term143023, term143023.getClass(), "vertices", term143029);
        setIntField(term143023, term143023.getClass(), "numVertices", -1520583737);
        setIntField(term143023, term143023.getClass(), "first", -588475104);
        setField(term143040, term143040.getClass(), "words", term143041);
        setIntField(term143040, term143040.getClass(), "wordsInUse", -1856484387);
        setBooleanField(term143040, term143040.getClass(), "sizeIsSticky", true);
        setField(term143023, term143023.getClass(), "bitset", term143040);
        setField(term143022, term143022.getClass(), "separator", term143023);
        setField(term143046, term143046.getClass(), "table", term143047);
        setIntField(term143046, term143046.getClass(), "count", -1915058547);
        setIntField(term143046, term143046.getClass(), "threshold", 15);
        setFloatField(term143046, term143046.getClass(), "loadFactor", 0.75F);
        setField(term143045, term143045.getClass(), "posMap", term143046);
        setField(term143045, term143045.getClass(), "graph", null);
        setIntElement(term143051, 0, -1729573183);
        setIntElement(term143051, 1, 1871499388);
        setIntElement(term143051, 2, 255079746);
        setIntElement(term143051, 3, -484162936);
        setField(term143045, term143045.getClass(), "vertices", term143051);
        setIntField(term143045, term143045.getClass(), "numVertices", 1272042407);
        setIntField(term143045, term143045.getClass(), "first", -1150694103);
        setField(term143058, term143058.getClass(), "words", term143059);
        setIntField(term143058, term143058.getClass(), "wordsInUse", 687074376);
        setBooleanField(term143058, term143058.getClass(), "sizeIsSticky", false);
        setField(term143045, term143045.getClass(), "bitset", term143058);
        setField(term143022, term143022.getClass(), "leftShore", term143045);
        setField(term143064, term143064.getClass(), "table", term143065);
        setIntField(term143064, term143064.getClass(), "count", 1575219530);
        setIntField(term143064, term143064.getClass(), "threshold", 15);
        setFloatField(term143064, term143064.getClass(), "loadFactor", 0.75F);
        setField(term143063, term143063.getClass(), "posMap", term143064);
        setField(term143063, term143063.getClass(), "graph", null);
        setIntElement(term143069, 0, 166630202);
        setIntElement(term143069, 1, -1849073127);
        setIntElement(term143069, 2, -632568846);
        setIntElement(term143069, 3, -41704478);
        setIntElement(term143069, 4, 1411166222);
        setIntElement(term143069, 5, 1124246517);
        setIntElement(term143069, 6, -2096970079);
        setField(term143063, term143063.getClass(), "vertices", term143069);
        setIntField(term143063, term143063.getClass(), "numVertices", -228525860);
        setIntField(term143063, term143063.getClass(), "first", -483867212);
        setField(term143079, term143079.getClass(), "words", term143080);
        setIntField(term143079, term143079.getClass(), "wordsInUse", 1846574965);
        setBooleanField(term143079, term143079.getClass(), "sizeIsSticky", false);
        setField(term143063, term143063.getClass(), "bitset", term143079);
        setField(term143022, term143022.getClass(), "rightShore", term143063);
        setIntField(term143022, term143022.getClass(), "maxShoreSize", 477488093);
        setField(term143020, term143020.getClass(), "solution", term143022);
        setField(term143020, term143020.getClass(), "graph", null);
        term143085 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term143086 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term143087 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term143091 = (int[]) newIntArray(7);
        Object term143101 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143102 = (long[]) newLongArray(1);
        setField(term143086, term143086.getClass(), "table", term143087);
        setIntField(term143086, term143086.getClass(), "count", 1786097839);
        setIntField(term143086, term143086.getClass(), "threshold", 15);
        setFloatField(term143086, term143086.getClass(), "loadFactor", 0.75F);
        setField(term143085, term143085.getClass(), "posMap", term143086);
        setField(term143085, term143085.getClass(), "graph", null);
        setIntElement(term143091, 0, -1276783077);
        setIntElement(term143091, 1, -1023204110);
        setIntElement(term143091, 2, 1861858901);
        setIntElement(term143091, 3, 663786874);
        setIntElement(term143091, 4, -813455053);
        setIntElement(term143091, 5, 1290017080);
        setIntElement(term143091, 6, -897309148);
        setField(term143085, term143085.getClass(), "vertices", term143091);
        setIntField(term143085, term143085.getClass(), "numVertices", 369666543);
        setIntField(term143085, term143085.getClass(), "first", 1392050898);
        setField(term143101, term143101.getClass(), "words", term143102);
        setIntField(term143101, term143101.getClass(), "wordsInUse", 1820983201);
        setBooleanField(term143101, term143101.getClass(), "sizeIsSticky", true);
        setField(term143085, term143085.getClass(), "bitset", term143101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.GreedyVertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[1];
        args[0] = term143085;
        callMethod(klass, "neighborhood", argTypes, term143020, args);
    }

};


