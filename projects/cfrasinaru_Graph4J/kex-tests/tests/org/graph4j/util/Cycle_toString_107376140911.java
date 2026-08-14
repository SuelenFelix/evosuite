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

public class Cycle_toString_107376140911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57087;

    public Cycle_toString_107376140911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57087 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term57089 = (int[]) newIntArray(9);
        Object term57101 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57102 = (long[]) newLongArray(1);
        setIntField(term57087, term57087.getClass(), "numEdges", -1674151373);
        setField(term57087, term57087.getClass(), "graph", null);
        setIntElement(term57089, 0, 2007242087);
        setIntElement(term57089, 1, 33663834);
        setIntElement(term57089, 2, 1194874786);
        setIntElement(term57089, 3, -1495464639);
        setIntElement(term57089, 4, -1504462202);
        setIntElement(term57089, 5, 125976040);
        setIntElement(term57089, 6, -666251907);
        setIntElement(term57089, 7, 417356870);
        setIntElement(term57089, 8, -488295525);
        setField(term57087, term57087.getClass(), "vertices", term57089);
        setIntField(term57087, term57087.getClass(), "numVertices", 2035542822);
        setIntField(term57087, term57087.getClass(), "first", 1606668266);
        setField(term57101, term57101.getClass(), "words", term57102);
        setIntField(term57101, term57101.getClass(), "wordsInUse", 1659642005);
        setBooleanField(term57101, term57101.getClass(), "sizeIsSticky", false);
        setField(term57087, term57087.getClass(), "bitset", term57101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term57087, args);
    }

};


