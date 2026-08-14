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

public class Circuit_length_19470231555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3949;

    public Circuit_length_19470231555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3949 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term3951 = (int[]) newIntArray(9);
        Object term3963 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3964 = (long[]) newLongArray(1);
        setIntField(term3949, term3949.getClass(), "numEdges", 923905351);
        setField(term3949, term3949.getClass(), "graph", null);
        setIntElement(term3951, 0, 428360161);
        setIntElement(term3951, 1, 631528579);
        setIntElement(term3951, 2, -1652091834);
        setIntElement(term3951, 3, -282021579);
        setIntElement(term3951, 4, -1652588127);
        setIntElement(term3951, 5, -1902823385);
        setIntElement(term3951, 6, -784924879);
        setIntElement(term3951, 7, -1062027102);
        setIntElement(term3951, 8, 1763217806);
        setField(term3949, term3949.getClass(), "vertices", term3951);
        setIntField(term3949, term3949.getClass(), "numVertices", 1644949396);
        setIntField(term3949, term3949.getClass(), "first", -2017073245);
        setField(term3963, term3963.getClass(), "words", term3964);
        setIntField(term3963, term3963.getClass(), "wordsInUse", 522440332);
        setBooleanField(term3963, term3963.getClass(), "sizeIsSticky", false);
        setField(term3949, term3949.getClass(), "bitset", term3963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "length", argTypes, term3949, args);
    }

};


