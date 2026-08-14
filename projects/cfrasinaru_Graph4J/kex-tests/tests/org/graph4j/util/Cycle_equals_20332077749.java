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

public class Cycle_equals_20332077749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362;
     Object term373;

    public Cycle_equals_20332077749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term364 = (int[]) newIntArray(1);
        Object term368 = newInstance(Class.forName("java.util.BitSet"));
        long[] term369 = (long[]) newLongArray(1);
        setIntField(term362, term362.getClass(), "numEdges", -505439934);
        setField(term362, term362.getClass(), "graph", null);
        setIntElement(term364, 0, -344842608);
        setField(term362, term362.getClass(), "vertices", term364);
        setIntField(term362, term362.getClass(), "numVertices", 941650513);
        setIntField(term362, term362.getClass(), "first", 444029505);
        setField(term368, term368.getClass(), "words", term369);
        setIntField(term368, term368.getClass(), "wordsInUse", -1034506028);
        setBooleanField(term368, term368.getClass(), "sizeIsSticky", true);
        setField(term362, term362.getClass(), "bitset", term368);
        term373 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term373;
        callMethod(klass, "equals", argTypes, term362, args);
    }

};


