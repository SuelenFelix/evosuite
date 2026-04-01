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

public class VertexSeparator_leftShore_2328949095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78601;

    public VertexSeparator_leftShore_2328949095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78601 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term78602 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78603 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78604 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78608 = (int[]) newIntArray(8);
        Object term78619 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78620 = (long[]) newLongArray(1);
        Object term78624 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78625 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78626 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78630 = (int[]) newIntArray(1);
        Object term78634 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78635 = (long[]) newLongArray(1);
        Object term78639 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term78640 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term78641 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term78645 = (int[]) newIntArray(6);
        Object term78654 = newInstance(Class.forName("java.util.BitSet"));
        long[] term78655 = (long[]) newLongArray(1);
        setField(term78601, term78601.getClass(), "graph", null);
        setField(term78603, term78603.getClass(), "table", term78604);
        setIntField(term78603, term78603.getClass(), "count", 1784256355);
        setIntField(term78603, term78603.getClass(), "threshold", 15);
        setFloatField(term78603, term78603.getClass(), "loadFactor", 0.75F);
        setField(term78602, term78602.getClass(), "posMap", term78603);
        setField(term78602, term78602.getClass(), "graph", null);
        setIntElement(term78608, 0, 1725956287);
        setIntElement(term78608, 1, -84853525);
        setIntElement(term78608, 2, -546326269);
        setIntElement(term78608, 3, 2053693297);
        setIntElement(term78608, 4, -1629858755);
        setIntElement(term78608, 5, 357202791);
        setIntElement(term78608, 6, 752907570);
        setIntElement(term78608, 7, -41191754);
        setField(term78602, term78602.getClass(), "vertices", term78608);
        setIntField(term78602, term78602.getClass(), "numVertices", -298829219);
        setIntField(term78602, term78602.getClass(), "first", -1327779796);
        setField(term78619, term78619.getClass(), "words", term78620);
        setIntField(term78619, term78619.getClass(), "wordsInUse", -386655726);
        setBooleanField(term78619, term78619.getClass(), "sizeIsSticky", true);
        setField(term78602, term78602.getClass(), "bitset", term78619);
        setField(term78601, term78601.getClass(), "separator", term78602);
        setField(term78625, term78625.getClass(), "table", term78626);
        setIntField(term78625, term78625.getClass(), "count", -1507263372);
        setIntField(term78625, term78625.getClass(), "threshold", 15);
        setFloatField(term78625, term78625.getClass(), "loadFactor", 0.75F);
        setField(term78624, term78624.getClass(), "posMap", term78625);
        setField(term78624, term78624.getClass(), "graph", null);
        setIntElement(term78630, 0, 1422961512);
        setField(term78624, term78624.getClass(), "vertices", term78630);
        setIntField(term78624, term78624.getClass(), "numVertices", 1716206989);
        setIntField(term78624, term78624.getClass(), "first", -1686050149);
        setField(term78634, term78634.getClass(), "words", term78635);
        setIntField(term78634, term78634.getClass(), "wordsInUse", 801148897);
        setBooleanField(term78634, term78634.getClass(), "sizeIsSticky", false);
        setField(term78624, term78624.getClass(), "bitset", term78634);
        setField(term78601, term78601.getClass(), "leftShore", term78624);
        setField(term78640, term78640.getClass(), "table", term78641);
        setIntField(term78640, term78640.getClass(), "count", -1859757820);
        setIntField(term78640, term78640.getClass(), "threshold", 15);
        setFloatField(term78640, term78640.getClass(), "loadFactor", 0.75F);
        setField(term78639, term78639.getClass(), "posMap", term78640);
        setField(term78639, term78639.getClass(), "graph", null);
        setIntElement(term78645, 0, -1791319968);
        setIntElement(term78645, 1, 80849890);
        setIntElement(term78645, 2, -554684079);
        setIntElement(term78645, 3, 162685569);
        setIntElement(term78645, 4, -291983428);
        setIntElement(term78645, 5, -1465588855);
        setField(term78639, term78639.getClass(), "vertices", term78645);
        setIntField(term78639, term78639.getClass(), "numVertices", 758026643);
        setIntField(term78639, term78639.getClass(), "first", -1012041102);
        setField(term78654, term78654.getClass(), "words", term78655);
        setIntField(term78654, term78654.getClass(), "wordsInUse", 997299459);
        setBooleanField(term78654, term78654.getClass(), "sizeIsSticky", true);
        setField(term78639, term78639.getClass(), "bitset", term78654);
        setField(term78601, term78601.getClass(), "rightShore", term78639);
        setIntField(term78601, term78601.getClass(), "maxShoreSize", 1765607800);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "leftShore", argTypes, term78601, args);
    }

};


