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

public class Trail_checkDuplicateEdges_4967405994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4171;

    public Trail_checkDuplicateEdges_4967405994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4171 = newInstance(Class.forName("org.graph4j.util.Trail"));
        int[] term4173 = (int[]) newIntArray(9);
        Object term4185 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4186 = (long[]) newLongArray(1);
        setIntField(term4171, term4171.getClass(), "numEdges", -165487736);
        setField(term4171, term4171.getClass(), "graph", null);
        setIntElement(term4173, 0, -608393431);
        setIntElement(term4173, 1, 298082829);
        setIntElement(term4173, 2, -1494372780);
        setIntElement(term4173, 3, 703799187);
        setIntElement(term4173, 4, -1305898281);
        setIntElement(term4173, 5, 140501130);
        setIntElement(term4173, 6, -1458890291);
        setIntElement(term4173, 7, 1016087323);
        setIntElement(term4173, 8, 1957748979);
        setField(term4171, term4171.getClass(), "vertices", term4173);
        setIntField(term4171, term4171.getClass(), "numVertices", -1290093259);
        setIntField(term4171, term4171.getClass(), "first", -1200934890);
        setField(term4185, term4185.getClass(), "words", term4186);
        setIntField(term4185, term4185.getClass(), "wordsInUse", 1765633108);
        setBooleanField(term4185, term4185.getClass(), "sizeIsSticky", false);
        setField(term4171, term4171.getClass(), "bitset", term4185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Trail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkDuplicateEdges", argTypes, term4171, args);
    }

};


