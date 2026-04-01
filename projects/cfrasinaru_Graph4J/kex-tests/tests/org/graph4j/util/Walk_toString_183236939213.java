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

public class Walk_toString_183236939213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143980;

    public Walk_toString_183236939213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143980 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143982 = (int[]) newIntArray(9);
        Object term143994 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143995 = (long[]) newLongArray(1);
        setIntField(term143980, term143980.getClass(), "numEdges", 463668948);
        setField(term143980, term143980.getClass(), "graph", null);
        setIntElement(term143982, 0, -448816202);
        setIntElement(term143982, 1, -79623890);
        setIntElement(term143982, 2, -176581727);
        setIntElement(term143982, 3, 300333066);
        setIntElement(term143982, 4, -1930392489);
        setIntElement(term143982, 5, 622288523);
        setIntElement(term143982, 6, 1375571400);
        setIntElement(term143982, 7, 907302122);
        setIntElement(term143982, 8, -2134859305);
        setField(term143980, term143980.getClass(), "vertices", term143982);
        setIntField(term143980, term143980.getClass(), "numVertices", -565663157);
        setIntField(term143980, term143980.getClass(), "first", 2105194644);
        setField(term143994, term143994.getClass(), "words", term143995);
        setIntField(term143994, term143994.getClass(), "wordsInUse", -939505132);
        setBooleanField(term143994, term143994.getClass(), "sizeIsSticky", false);
        setField(term143980, term143980.getClass(), "bitset", term143994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term143980, args);
    }

};


