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

public class Walk_checkEdges_1932714895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7710;

    public Walk_checkEdges_1932714895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7710 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7712 = (int[]) newIntArray(6);
        Object term7721 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7722 = (long[]) newLongArray(1);
        setIntField(term7710, term7710.getClass(), "numEdges", -311300330);
        setField(term7710, term7710.getClass(), "graph", null);
        setIntElement(term7712, 0, 1160936971);
        setIntElement(term7712, 1, 1258846008);
        setIntElement(term7712, 2, 702866958);
        setIntElement(term7712, 3, 622731276);
        setIntElement(term7712, 4, -1302341502);
        setIntElement(term7712, 5, 1113574554);
        setField(term7710, term7710.getClass(), "vertices", term7712);
        setIntField(term7710, term7710.getClass(), "numVertices", 1685800093);
        setIntField(term7710, term7710.getClass(), "first", -318699441);
        setField(term7721, term7721.getClass(), "words", term7722);
        setIntField(term7721, term7721.getClass(), "wordsInUse", 1381027809);
        setBooleanField(term7721, term7721.getClass(), "sizeIsSticky", true);
        setField(term7710, term7710.getClass(), "bitset", term7721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkEdges", argTypes, term7710, args);
    }

};


