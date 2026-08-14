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

public class VertexSet1_indexOf_182480144013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71552;
     Object term71571;

    public VertexSet1_indexOf_182480144013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71552 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term71553 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term71554 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term71558 = (int[]) newIntArray(5);
        Object term71566 = newInstance(Class.forName("java.util.BitSet"));
        long[] term71567 = (long[]) newLongArray(1);
        setField(term71553, term71553.getClass(), "table", term71554);
        setIntField(term71553, term71553.getClass(), "count", -240209237);
        setIntField(term71553, term71553.getClass(), "threshold", 15);
        setFloatField(term71553, term71553.getClass(), "loadFactor", 0.75F);
        setField(term71552, term71552.getClass(), "posMap", term71553);
        setField(term71552, term71552.getClass(), "graph", null);
        setIntElement(term71558, 0, 448751443);
        setIntElement(term71558, 1, -2026783706);
        setIntElement(term71558, 2, 36962226);
        setIntElement(term71558, 3, -787981404);
        setIntElement(term71558, 4, 503641255);
        setField(term71552, term71552.getClass(), "vertices", term71558);
        setIntField(term71552, term71552.getClass(), "numVertices", 556061823);
        setIntField(term71552, term71552.getClass(), "first", 1060184160);
        setField(term71566, term71566.getClass(), "words", term71567);
        setIntField(term71566, term71566.getClass(), "wordsInUse", 74678316);
        setBooleanField(term71566, term71566.getClass(), "sizeIsSticky", true);
        setField(term71552, term71552.getClass(), "bitset", term71566);
        term71571 = new Integer(1440958306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71571;
        callMethod(klass, "indexOf", argTypes, term71552, args);
    }

};


