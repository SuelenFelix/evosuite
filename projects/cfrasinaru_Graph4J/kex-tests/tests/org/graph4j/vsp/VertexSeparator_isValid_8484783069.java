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

public class VertexSeparator_isValid_8484783069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3537;

    public VertexSeparator_isValid_8484783069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3537 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term3538 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3539 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3540 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3544 = (int[]) newIntArray(1);
        Object term3548 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3549 = (long[]) newLongArray(1);
        Object term3553 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3554 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3555 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3559 = (int[]) newIntArray(4);
        Object term3566 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3567 = (long[]) newLongArray(1);
        Object term3571 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3572 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3573 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3577 = (int[]) newIntArray(9);
        Object term3589 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3590 = (long[]) newLongArray(1);
        setField(term3537, term3537.getClass(), "graph", null);
        setField(term3539, term3539.getClass(), "table", term3540);
        setIntField(term3539, term3539.getClass(), "count", 125432890);
        setIntField(term3539, term3539.getClass(), "threshold", 15);
        setFloatField(term3539, term3539.getClass(), "loadFactor", 0.75F);
        setField(term3538, term3538.getClass(), "posMap", term3539);
        setField(term3538, term3538.getClass(), "graph", null);
        setIntElement(term3544, 0, -197740561);
        setField(term3538, term3538.getClass(), "vertices", term3544);
        setIntField(term3538, term3538.getClass(), "numVertices", -1811706962);
        setIntField(term3538, term3538.getClass(), "first", -1242133071);
        setField(term3548, term3548.getClass(), "words", term3549);
        setIntField(term3548, term3548.getClass(), "wordsInUse", -455052015);
        setBooleanField(term3548, term3548.getClass(), "sizeIsSticky", true);
        setField(term3538, term3538.getClass(), "bitset", term3548);
        setField(term3537, term3537.getClass(), "separator", term3538);
        setField(term3554, term3554.getClass(), "table", term3555);
        setIntField(term3554, term3554.getClass(), "count", -1322797287);
        setIntField(term3554, term3554.getClass(), "threshold", 15);
        setFloatField(term3554, term3554.getClass(), "loadFactor", 0.75F);
        setField(term3553, term3553.getClass(), "posMap", term3554);
        setField(term3553, term3553.getClass(), "graph", null);
        setIntElement(term3559, 0, -615198242);
        setIntElement(term3559, 1, -491132382);
        setIntElement(term3559, 2, 918882916);
        setIntElement(term3559, 3, 1544012770);
        setField(term3553, term3553.getClass(), "vertices", term3559);
        setIntField(term3553, term3553.getClass(), "numVertices", 1922068039);
        setIntField(term3553, term3553.getClass(), "first", -410564443);
        setField(term3566, term3566.getClass(), "words", term3567);
        setIntField(term3566, term3566.getClass(), "wordsInUse", 996017434);
        setBooleanField(term3566, term3566.getClass(), "sizeIsSticky", false);
        setField(term3553, term3553.getClass(), "bitset", term3566);
        setField(term3537, term3537.getClass(), "leftShore", term3553);
        setField(term3572, term3572.getClass(), "table", term3573);
        setIntField(term3572, term3572.getClass(), "count", -983870300);
        setIntField(term3572, term3572.getClass(), "threshold", 15);
        setFloatField(term3572, term3572.getClass(), "loadFactor", 0.75F);
        setField(term3571, term3571.getClass(), "posMap", term3572);
        setField(term3571, term3571.getClass(), "graph", null);
        setIntElement(term3577, 0, 360715062);
        setIntElement(term3577, 1, 1047409266);
        setIntElement(term3577, 2, 1427248961);
        setIntElement(term3577, 3, 1445291866);
        setIntElement(term3577, 4, -139927812);
        setIntElement(term3577, 5, -2065157320);
        setIntElement(term3577, 6, 1782011477);
        setIntElement(term3577, 7, 2129957018);
        setIntElement(term3577, 8, 691663312);
        setField(term3571, term3571.getClass(), "vertices", term3577);
        setIntField(term3571, term3571.getClass(), "numVertices", -1236696275);
        setIntField(term3571, term3571.getClass(), "first", 575249858);
        setField(term3589, term3589.getClass(), "words", term3590);
        setIntField(term3589, term3589.getClass(), "wordsInUse", -297957951);
        setBooleanField(term3589, term3589.getClass(), "sizeIsSticky", false);
        setField(term3571, term3571.getClass(), "bitset", term3589);
        setField(term3537, term3537.getClass(), "rightShore", term3571);
        setIntField(term3537, term3537.getClass(), "maxShoreSize", -1816920588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term3537, args);
    }

};


