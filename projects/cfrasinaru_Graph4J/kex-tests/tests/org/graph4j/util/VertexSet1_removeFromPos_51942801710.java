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

public class VertexSet1_removeFromPos_51942801710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71509;
     Object term71523;

    public VertexSet1_removeFromPos_51942801710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71509 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71510 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71511 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71515 = (int[]) newIntArray(0);
        Object term71518 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71519 = (long[]) newLongArray(1);
        setField(term71510, term71510.getClass(), "table", term71511);
        setIntField(term71510, term71510.getClass(), "count", -970909578);
        setIntField(term71510, term71510.getClass(), "threshold", 15);
        setFloatField(term71510, term71510.getClass(), "loadFactor", 0.75F);
        setField(term71509, term71509.getClass(), "posMap", term71510);
        setField(term71509, term71509.getClass(), "graph", null);
        setField(term71509, term71509.getClass(), "vertices", term71515);
        setIntField(term71509, term71509.getClass(), "numVertices", -827598043);
        setIntField(term71509, term71509.getClass(), "first", 1788293670);
        setField(term71518, term71518.getClass(), "words", term71519);
        setIntField(term71518, term71518.getClass(), "wordsInUse", 894914094);
        setBooleanField(term71518, term71518.getClass(), "sizeIsSticky", true);
        setField(term71509, term71509.getClass(), "bitset", term71518);
        term71523 = new Integer(-902442746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71523;
        callMethod(klass, "removeFromPos", argTypes, term71509, args);
    }

};


