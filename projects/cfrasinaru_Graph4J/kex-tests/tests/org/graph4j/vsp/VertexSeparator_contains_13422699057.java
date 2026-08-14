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
import java.lang.Integer;

public class VertexSeparator_contains_13422699057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3361;
     Object term3427;

    public VertexSeparator_contains_13422699057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3361 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term3362 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3363 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3364 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3368 = (int[]) newIntArray(8);
        Object term3379 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3380 = (long[]) newLongArray(1);
        Object term3384 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3385 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3386 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3390 = (int[]) newIntArray(6);
        Object term3399 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3400 = (long[]) newLongArray(1);
        Object term3404 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3405 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3406 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3410 = (int[]) newIntArray(8);
        Object term3421 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3422 = (long[]) newLongArray(1);
        setField(term3361, term3361.getClass(), "graph", null);
        setField(term3363, term3363.getClass(), "table", term3364);
        setIntField(term3363, term3363.getClass(), "count", 1232958763);
        setIntField(term3363, term3363.getClass(), "threshold", 15);
        setFloatField(term3363, term3363.getClass(), "loadFactor", 0.75F);
        setField(term3362, term3362.getClass(), "posMap", term3363);
        setField(term3362, term3362.getClass(), "graph", null);
        setIntElement(term3368, 0, -1702132549);
        setIntElement(term3368, 1, -1786136772);
        setIntElement(term3368, 2, -1510967747);
        setIntElement(term3368, 3, -2014792457);
        setIntElement(term3368, 4, 1957633116);
        setIntElement(term3368, 5, 1428598210);
        setIntElement(term3368, 6, 1071776561);
        setIntElement(term3368, 7, 1846399918);
        setField(term3362, term3362.getClass(), "vertices", term3368);
        setIntField(term3362, term3362.getClass(), "numVertices", 35388821);
        setIntField(term3362, term3362.getClass(), "first", -598803400);
        setField(term3379, term3379.getClass(), "words", term3380);
        setIntField(term3379, term3379.getClass(), "wordsInUse", 25560022);
        setBooleanField(term3379, term3379.getClass(), "sizeIsSticky", false);
        setField(term3362, term3362.getClass(), "bitset", term3379);
        setField(term3361, term3361.getClass(), "separator", term3362);
        setField(term3385, term3385.getClass(), "table", term3386);
        setIntField(term3385, term3385.getClass(), "count", -1090136985);
        setIntField(term3385, term3385.getClass(), "threshold", 15);
        setFloatField(term3385, term3385.getClass(), "loadFactor", 0.75F);
        setField(term3384, term3384.getClass(), "posMap", term3385);
        setField(term3384, term3384.getClass(), "graph", null);
        setIntElement(term3390, 0, -355574894);
        setIntElement(term3390, 1, 1866941633);
        setIntElement(term3390, 2, 1697296048);
        setIntElement(term3390, 3, 1302075623);
        setIntElement(term3390, 4, 1238707613);
        setIntElement(term3390, 5, 1961351136);
        setField(term3384, term3384.getClass(), "vertices", term3390);
        setIntField(term3384, term3384.getClass(), "numVertices", -1546528470);
        setIntField(term3384, term3384.getClass(), "first", -1518971561);
        setField(term3399, term3399.getClass(), "words", term3400);
        setIntField(term3399, term3399.getClass(), "wordsInUse", 1513663171);
        setBooleanField(term3399, term3399.getClass(), "sizeIsSticky", true);
        setField(term3384, term3384.getClass(), "bitset", term3399);
        setField(term3361, term3361.getClass(), "leftShore", term3384);
        setField(term3405, term3405.getClass(), "table", term3406);
        setIntField(term3405, term3405.getClass(), "count", 1527034193);
        setIntField(term3405, term3405.getClass(), "threshold", 15);
        setFloatField(term3405, term3405.getClass(), "loadFactor", 0.75F);
        setField(term3404, term3404.getClass(), "posMap", term3405);
        setField(term3404, term3404.getClass(), "graph", null);
        setIntElement(term3410, 0, 1309545946);
        setIntElement(term3410, 1, -1457812682);
        setIntElement(term3410, 2, -161850441);
        setIntElement(term3410, 3, 1486351894);
        setIntElement(term3410, 4, 1352463113);
        setIntElement(term3410, 5, 897269648);
        setIntElement(term3410, 6, -1020664075);
        setIntElement(term3410, 7, -1412100145);
        setField(term3404, term3404.getClass(), "vertices", term3410);
        setIntField(term3404, term3404.getClass(), "numVertices", -1702355599);
        setIntField(term3404, term3404.getClass(), "first", -1477091217);
        setField(term3421, term3421.getClass(), "words", term3422);
        setIntField(term3421, term3421.getClass(), "wordsInUse", 2023226154);
        setBooleanField(term3421, term3421.getClass(), "sizeIsSticky", true);
        setField(term3404, term3404.getClass(), "bitset", term3421);
        setField(term3361, term3361.getClass(), "rightShore", term3404);
        setIntField(term3361, term3361.getClass(), "maxShoreSize", 2111611214);
        term3427 = new Integer(-2031129784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3427;
        callMethod(klass, "contains", argTypes, term3361, args);
    }

};


