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

public class Cycle_isValid_10334101783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252;

    public Cycle_isValid_10334101783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term254 = (int[]) newIntArray(1);
        Object term258 = newInstance(Class.forName("java.util.BitSet"));
        long[] term259 = (long[]) newLongArray(1);
        setIntField(term252, term252.getClass(), "numEdges", -1016503459);
        setField(term252, term252.getClass(), "graph", null);
        setIntElement(term254, 0, -1968847291);
        setField(term252, term252.getClass(), "vertices", term254);
        setIntField(term252, term252.getClass(), "numVertices", 579005622);
        setIntField(term252, term252.getClass(), "first", -14890619);
        setField(term258, term258.getClass(), "words", term259);
        setIntField(term258, term258.getClass(), "wordsInUse", 1632125673);
        setBooleanField(term258, term258.getClass(), "sizeIsSticky", false);
        setField(term252, term252.getClass(), "bitset", term258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term252, args);
    }

};


