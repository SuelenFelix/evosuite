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

public class VertexSet1_removeFromPos_51942801711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71512;
     Object term71526;

    public VertexSet1_removeFromPos_51942801711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71512 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71513 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71514 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71518 = (int[]) newIntArray(0);
        Object term71521 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71522 = (long[]) newLongArray(1);
        setField(term71513, term71513.getClass(), "table", term71514);
        setIntField(term71513, term71513.getClass(), "count", -970909578);
        setIntField(term71513, term71513.getClass(), "threshold", 15);
        setFloatField(term71513, term71513.getClass(), "loadFactor", 0.75F);
        setField(term71512, term71512.getClass(), "posMap", term71513);
        setField(term71512, term71512.getClass(), "graph", null);
        setField(term71512, term71512.getClass(), "vertices", term71518);
        setIntField(term71512, term71512.getClass(), "numVertices", -827598043);
        setIntField(term71512, term71512.getClass(), "first", 1788293670);
        setField(term71521, term71521.getClass(), "words", term71522);
        setIntField(term71521, term71521.getClass(), "wordsInUse", 894914094);
        setBooleanField(term71521, term71521.getClass(), "sizeIsSticky", true);
        setField(term71512, term71512.getClass(), "bitset", term71521);
        term71526 = new Integer(-902442746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71526;
        callMethod(klass, "removeFromPos", argTypes, term71512, args);
    }

};


