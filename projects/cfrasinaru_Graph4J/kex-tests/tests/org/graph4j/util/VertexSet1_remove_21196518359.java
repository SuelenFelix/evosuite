package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class VertexSet1_remove_21196518359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71474;
     Object term71497;

    public VertexSet1_remove_21196518359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71474 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71475 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71476 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71480 = (int[]) newIntArray(9);
        Object term71492 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71493 = (long[]) newLongArray(1);
        setField(term71475, term71475.getClass(), "table", term71476);
        setIntField(term71475, term71475.getClass(), "count", 1818020627);
        setIntField(term71475, term71475.getClass(), "threshold", 15);
        setFloatField(term71475, term71475.getClass(), "loadFactor", 0.75F);
        setField(term71474, term71474.getClass(), "posMap", term71475);
        setField(term71474, term71474.getClass(), "graph", null);
        setIntElement(term71480, 0, 1189773432);
        setIntElement(term71480, 1, -722813020);
        setIntElement(term71480, 2, -2087572575);
        setIntElement(term71480, 3, -426255380);
        setIntElement(term71480, 4, -1947252510);
        setIntElement(term71480, 5, -2010504521);
        setIntElement(term71480, 6, -2118814470);
        setIntElement(term71480, 7, -813617417);
        setIntElement(term71480, 8, -1373956603);
        setField(term71474, term71474.getClass(), "vertices", term71480);
        setIntField(term71474, term71474.getClass(), "numVertices", 693828474);
        setIntField(term71474, term71474.getClass(), "first", 1534615118);
        setField(term71492, term71492.getClass(), "words", term71493);
        setIntField(term71492, term71492.getClass(), "wordsInUse", -732773020);
        setBooleanField(term71492, term71492.getClass(), "sizeIsSticky", false);
        setField(term71474, term71474.getClass(), "bitset", term71492);
        term71497 = new Integer(1231519765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71497;
        callMethod(klass, "remove", argTypes, term71474, args);
    }

};


