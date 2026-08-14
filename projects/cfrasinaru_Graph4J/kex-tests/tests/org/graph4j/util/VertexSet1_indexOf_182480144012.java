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

public class VertexSet1_indexOf_182480144012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2940;
     Object term2954;

    public VertexSet1_indexOf_182480144012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2940 = newInstance(Class.forName("org.graph4j.util.VertexSet1"));
        Object term2941 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2942 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2946 = (int[]) newIntArray(0);
        Object term2949 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2950 = (long[]) newLongArray(1);
        setField(term2941, term2941.getClass(), "table", term2942);
        setIntField(term2941, term2941.getClass(), "count", 21095258);
        setIntField(term2941, term2941.getClass(), "threshold", 15);
        setFloatField(term2941, term2941.getClass(), "loadFactor", 0.75F);
        setField(term2940, term2940.getClass(), "posMap", term2941);
        setField(term2940, term2940.getClass(), "graph", null);
        setField(term2940, term2940.getClass(), "vertices", term2946);
        setIntField(term2940, term2940.getClass(), "numVertices", -1793997256);
        setIntField(term2940, term2940.getClass(), "first", -1271598018);
        setField(term2949, term2949.getClass(), "words", term2950);
        setIntField(term2949, term2949.getClass(), "wordsInUse", 157967613);
        setBooleanField(term2949, term2949.getClass(), "sizeIsSticky", false);
        setField(term2940, term2940.getClass(), "bitset", term2949);
        term2954 = new Integer(811839399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexSet1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2954;
        callMethod(klass, "indexOf", argTypes, term2940, args);
    }

};


