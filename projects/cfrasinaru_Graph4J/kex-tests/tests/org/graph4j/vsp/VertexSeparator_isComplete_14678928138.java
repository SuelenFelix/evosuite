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

public class VertexSeparator_isComplete_14678928138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3454;

    public VertexSeparator_isComplete_14678928138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3454 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term3455 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3456 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3457 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3461 = (int[]) newIntArray(6);
        Object term3470 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3471 = (long[]) newLongArray(1);
        Object term3475 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3476 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3477 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3481 = (int[]) newIntArray(3);
        Object term3487 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3488 = (long[]) newLongArray(1);
        Object term3492 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3493 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3494 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3498 = (int[]) newIntArray(9);
        Object term3510 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3511 = (long[]) newLongArray(1);
        setField(term3454, term3454.getClass(), "graph", null);
        setField(term3456, term3456.getClass(), "table", term3457);
        setIntField(term3456, term3456.getClass(), "count", 251039122);
        setIntField(term3456, term3456.getClass(), "threshold", 15);
        setFloatField(term3456, term3456.getClass(), "loadFactor", 0.75F);
        setField(term3455, term3455.getClass(), "posMap", term3456);
        setField(term3455, term3455.getClass(), "graph", null);
        setIntElement(term3461, 0, 459471826);
        setIntElement(term3461, 1, -1054011286);
        setIntElement(term3461, 2, -1640361091);
        setIntElement(term3461, 3, -1908164516);
        setIntElement(term3461, 4, -1343269854);
        setIntElement(term3461, 5, -731459309);
        setField(term3455, term3455.getClass(), "vertices", term3461);
        setIntField(term3455, term3455.getClass(), "numVertices", -913468095);
        setIntField(term3455, term3455.getClass(), "first", 38489871);
        setField(term3470, term3470.getClass(), "words", term3471);
        setIntField(term3470, term3470.getClass(), "wordsInUse", -1667787735);
        setBooleanField(term3470, term3470.getClass(), "sizeIsSticky", true);
        setField(term3455, term3455.getClass(), "bitset", term3470);
        setField(term3454, term3454.getClass(), "separator", term3455);
        setField(term3476, term3476.getClass(), "table", term3477);
        setIntField(term3476, term3476.getClass(), "count", 1841765799);
        setIntField(term3476, term3476.getClass(), "threshold", 15);
        setFloatField(term3476, term3476.getClass(), "loadFactor", 0.75F);
        setField(term3475, term3475.getClass(), "posMap", term3476);
        setField(term3475, term3475.getClass(), "graph", null);
        setIntElement(term3481, 0, 72160200);
        setIntElement(term3481, 1, -1870567623);
        setIntElement(term3481, 2, -1442923471);
        setField(term3475, term3475.getClass(), "vertices", term3481);
        setIntField(term3475, term3475.getClass(), "numVertices", -434247549);
        setIntField(term3475, term3475.getClass(), "first", 1246505552);
        setField(term3487, term3487.getClass(), "words", term3488);
        setIntField(term3487, term3487.getClass(), "wordsInUse", -1456497810);
        setBooleanField(term3487, term3487.getClass(), "sizeIsSticky", true);
        setField(term3475, term3475.getClass(), "bitset", term3487);
        setField(term3454, term3454.getClass(), "leftShore", term3475);
        setField(term3493, term3493.getClass(), "table", term3494);
        setIntField(term3493, term3493.getClass(), "count", 61954667);
        setIntField(term3493, term3493.getClass(), "threshold", 15);
        setFloatField(term3493, term3493.getClass(), "loadFactor", 0.75F);
        setField(term3492, term3492.getClass(), "posMap", term3493);
        setField(term3492, term3492.getClass(), "graph", null);
        setIntElement(term3498, 0, -919022885);
        setIntElement(term3498, 1, -1836286878);
        setIntElement(term3498, 2, 276336694);
        setIntElement(term3498, 3, 1627938506);
        setIntElement(term3498, 4, 386284750);
        setIntElement(term3498, 5, 906856023);
        setIntElement(term3498, 6, 198857801);
        setIntElement(term3498, 7, 1342884142);
        setIntElement(term3498, 8, -1454325068);
        setField(term3492, term3492.getClass(), "vertices", term3498);
        setIntField(term3492, term3492.getClass(), "numVertices", 346714653);
        setIntField(term3492, term3492.getClass(), "first", 2121928697);
        setField(term3510, term3510.getClass(), "words", term3511);
        setIntField(term3510, term3510.getClass(), "wordsInUse", -1741056571);
        setBooleanField(term3510, term3510.getClass(), "sizeIsSticky", false);
        setField(term3492, term3492.getClass(), "bitset", term3510);
        setField(term3454, term3454.getClass(), "rightShore", term3492);
        setIntField(term3454, term3454.getClass(), "maxShoreSize", 522501050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term3454, args);
    }

};


