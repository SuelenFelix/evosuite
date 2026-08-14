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

public class GraphExtremaCalculator_selectVertexMaxUB_100380989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9527;

    public GraphExtremaCalculator_selectVertexMaxUB_100380989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term9580 = new Integer(-1968847291);
        Integer term9582 = new Integer(579005622);
        Class<? extends Object> term9680 = Class.forName((String) "org.graph4j.metrics.GraphExtremaCalculator$Type");
        Field term9679 = ((Class) term9680).getDeclaredField((String) "DIAMETER");
        ((Field) term9679).setAccessible(true);
        Object enum20 = ((Field) term9679).get((Object) null);
        term9527 = newInstance(Class.forName("org.graph4j.metrics.GraphExtremaCalculator"));
        int[] term9532 = (int[]) newIntArray(5);
        int[] term9538 = (int[]) newIntArray(8);
        int[] term9547 = (int[]) newIntArray(9);
        Object term9557 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term9558 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term9559 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term9563 = (int[]) newIntArray(7);
        Object term9573 = newInstance(Class.forName("java.util.BitSet"));
        long[] term9574 = (long[]) newLongArray(1);
        Object term9584 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term9585 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term9586 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term9590 = (int[]) newIntArray(6);
        Object term9599 = newInstance(Class.forName("java.util.BitSet"));
        long[] term9600 = (long[]) newLongArray(1);
        Object term9604 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term9605 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term9606 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term9610 = (int[]) newIntArray(5);
        Object term9618 = newInstance(Class.forName("java.util.BitSet"));
        long[] term9619 = (long[]) newLongArray(1);
        setIntField(term9527, term9527.getClass(), "radiusLB", 1558810715);
        setIntField(term9527, term9527.getClass(), "radiusUB", -382652403);
        setIntField(term9527, term9527.getClass(), "diamLB", -2126539433);
        setIntField(term9527, term9527.getClass(), "diamUB", 196952878);
        setIntElement(term9532, 0, 802673242);
        setIntElement(term9532, 1, -1808638031);
        setIntElement(term9532, 2, -1514240086);
        setIntElement(term9532, 3, 2052244839);
        setIntElement(term9532, 4, -1763480506);
        setField(term9527, term9527.getClass(), "eccLB", term9532);
        setIntElement(term9538, 0, -1541297110);
        setIntElement(term9538, 1, -1581464804);
        setIntElement(term9538, 2, -1954937310);
        setIntElement(term9538, 3, -460657407);
        setIntElement(term9538, 4, 941003590);
        setIntElement(term9538, 5, -1825624890);
        setIntElement(term9538, 6, 413214164);
        setIntElement(term9538, 7, 355911655);
        setField(term9527, term9527.getClass(), "eccUB", term9538);
        setIntElement(term9547, 0, 1811833766);
        setIntElement(term9547, 1, 735987104);
        setIntElement(term9547, 2, -1784072578);
        setIntElement(term9547, 3, 2011764585);
        setIntElement(term9547, 4, -860680764);
        setIntElement(term9547, 5, -963198667);
        setIntElement(term9547, 6, -1007935918);
        setIntElement(term9547, 7, 1485731037);
        setIntElement(term9547, 8, 1304396087);
        setField(term9527, term9527.getClass(), "dist", term9547);
        setField(term9558, term9558.getClass(), "table", term9559);
        setIntField(term9558, term9558.getClass(), "count", 1782600602);
        setIntField(term9558, term9558.getClass(), "threshold", 15);
        setFloatField(term9558, term9558.getClass(), "loadFactor", 0.75F);
        setField(term9557, term9557.getClass(), "posMap", term9558);
        setField(term9557, term9557.getClass(), "graph", null);
        setIntElement(term9563, 0, -185892708);
        setIntElement(term9563, 1, -203163250);
        setIntElement(term9563, 2, 498473526);
        setIntElement(term9563, 3, 1186917020);
        setIntElement(term9563, 4, 1670041824);
        setIntElement(term9563, 5, 2140388634);
        setIntElement(term9563, 6, 21095258);
        setField(term9557, term9557.getClass(), "vertices", term9563);
        setIntField(term9557, term9557.getClass(), "numVertices", -1793997256);
        setIntField(term9557, term9557.getClass(), "first", -1271598018);
        setField(term9573, term9573.getClass(), "words", term9574);
        setIntField(term9573, term9573.getClass(), "wordsInUse", 157967613);
        setBooleanField(term9573, term9573.getClass(), "sizeIsSticky", false);
        setField(term9557, term9557.getClass(), "bitset", term9573);
        setField(term9527, term9527.getClass(), "candidates", term9557);
        setBooleanField(term9527, term9527.getClass(), "selector", false);
        setBooleanField(term9527, term9527.getClass(), "connected", false);
        setField(term9527, term9527.getClass(), "radius", term9580);
        setField(term9527, term9527.getClass(), "diameter", term9582);
        setField(term9585, term9585.getClass(), "table", term9586);
        setIntField(term9585, term9585.getClass(), "count", 811839399);
        setIntField(term9585, term9585.getClass(), "threshold", 15);
        setFloatField(term9585, term9585.getClass(), "loadFactor", 0.75F);
        setField(term9584, term9584.getClass(), "posMap", term9585);
        setField(term9584, term9584.getClass(), "graph", null);
        setIntElement(term9590, 0, 593962063);
        setIntElement(term9590, 1, -1485826786);
        setIntElement(term9590, 2, -1549952664);
        setIntElement(term9590, 3, 148394188);
        setIntElement(term9590, 4, 504525721);
        setIntElement(term9590, 5, 1835568392);
        setField(term9584, term9584.getClass(), "vertices", term9590);
        setIntField(term9584, term9584.getClass(), "numVertices", 457470807);
        setIntField(term9584, term9584.getClass(), "first", -994742871);
        setField(term9599, term9599.getClass(), "words", term9600);
        setIntField(term9599, term9599.getClass(), "wordsInUse", -222412326);
        setBooleanField(term9599, term9599.getClass(), "sizeIsSticky", true);
        setField(term9584, term9584.getClass(), "bitset", term9599);
        setField(term9527, term9527.getClass(), "center", term9584);
        setField(term9605, term9605.getClass(), "table", term9606);
        setIntField(term9605, term9605.getClass(), "count", -299497261);
        setIntField(term9605, term9605.getClass(), "threshold", 15);
        setFloatField(term9605, term9605.getClass(), "loadFactor", 0.75F);
        setField(term9604, term9604.getClass(), "posMap", term9605);
        setField(term9604, term9604.getClass(), "graph", null);
        setIntElement(term9610, 0, -23054366);
        setIntElement(term9610, 1, 153009426);
        setIntElement(term9610, 2, 185751892);
        setIntElement(term9610, 3, 1068256001);
        setIntElement(term9610, 4, 1139078354);
        setField(term9604, term9604.getClass(), "vertices", term9610);
        setIntField(term9604, term9604.getClass(), "numVertices", -691164974);
        setIntField(term9604, term9604.getClass(), "first", -761675396);
        setField(term9618, term9618.getClass(), "words", term9619);
        setIntField(term9618, term9618.getClass(), "wordsInUse", -1954860951);
        setBooleanField(term9618, term9618.getClass(), "sizeIsSticky", false);
        setField(term9604, term9604.getClass(), "bitset", term9618);
        setField(term9527, term9527.getClass(), "periphery", term9604);
        setField(term9527, term9527.getClass(), "extremaType", enum20);
        setField(term9527, term9527.getClass(), "graph", null);
        setBooleanField(term9527, term9527.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.GraphExtremaCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "selectVertexMaxUB", argTypes, term9527, args);
    }

};


