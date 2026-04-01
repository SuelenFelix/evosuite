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

public class Cycle_toString_107376140910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57083;

    public Cycle_toString_107376140910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57083 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term57085 = (int[]) newIntArray(9);
        Object term57097 = newInstance(Class.forName("java.util.BitSet"));
        long[] term57098 = (long[]) newLongArray(1);
        setIntField(term57083, term57083.getClass(), "numEdges", -1674151373);
        setField(term57083, term57083.getClass(), "graph", null);
        setIntElement(term57085, 0, 2007242087);
        setIntElement(term57085, 1, 33663834);
        setIntElement(term57085, 2, 1194874786);
        setIntElement(term57085, 3, -1495464639);
        setIntElement(term57085, 4, -1504462202);
        setIntElement(term57085, 5, 125976040);
        setIntElement(term57085, 6, -666251907);
        setIntElement(term57085, 7, 417356870);
        setIntElement(term57085, 8, -488295525);
        setField(term57083, term57083.getClass(), "vertices", term57085);
        setIntField(term57083, term57083.getClass(), "numVertices", 2035542822);
        setIntField(term57083, term57083.getClass(), "first", 1606668266);
        setField(term57097, term57097.getClass(), "words", term57098);
        setIntField(term57097, term57097.getClass(), "wordsInUse", 1659642005);
        setBooleanField(term57097, term57097.getClass(), "sizeIsSticky", false);
        setField(term57083, term57083.getClass(), "bitset", term57097);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term57083, args);
    }

};


