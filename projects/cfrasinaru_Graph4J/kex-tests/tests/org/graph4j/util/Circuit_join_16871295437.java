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

public class Circuit_join_16871295437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99237;
     Object term99250;

    public Circuit_join_16871295437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99237 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99239 = (int[]) newIntArray(3);
        Object term99245 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99246 = (long[]) newLongArray(1);
        setIntField(term99237, term99237.getClass(), "numEdges", -326704512);
        setField(term99237, term99237.getClass(), "graph", null);
        setIntElement(term99239, 0, -243882414);
        setIntElement(term99239, 1, 671126920);
        setIntElement(term99239, 2, 1273806754);
        setField(term99237, term99237.getClass(), "vertices", term99239);
        setIntField(term99237, term99237.getClass(), "numVertices", -1951879272);
        setIntField(term99237, term99237.getClass(), "first", -2003857250);
        setField(term99245, term99245.getClass(), "words", term99246);
        setIntField(term99245, term99245.getClass(), "wordsInUse", 294839075);
        setBooleanField(term99245, term99245.getClass(), "sizeIsSticky", true);
        setField(term99237, term99237.getClass(), "bitset", term99245);
        term99250 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99252 = (int[]) newIntArray(8);
        Object term99263 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99264 = (long[]) newLongArray(1);
        setIntField(term99250, term99250.getClass(), "numEdges", 591258092);
        setField(term99250, term99250.getClass(), "graph", null);
        setIntElement(term99252, 0, -1052140576);
        setIntElement(term99252, 1, -271424283);
        setIntElement(term99252, 2, 1731549443);
        setIntElement(term99252, 3, 1099618075);
        setIntElement(term99252, 4, -1949109167);
        setIntElement(term99252, 5, 672435692);
        setIntElement(term99252, 6, -488001056);
        setIntElement(term99252, 7, -1595822497);
        setField(term99250, term99250.getClass(), "vertices", term99252);
        setIntField(term99250, term99250.getClass(), "numVertices", 845221249);
        setIntField(term99250, term99250.getClass(), "first", 493327780);
        setField(term99263, term99263.getClass(), "words", term99264);
        setIntField(term99263, term99263.getClass(), "wordsInUse", 1273239065);
        setBooleanField(term99263, term99263.getClass(), "sizeIsSticky", false);
        setField(term99250, term99250.getClass(), "bitset", term99263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.Circuit");
        Object[] args = new Object[1];
        args[0] = term99250;
        callMethod(klass, "join", argTypes, term99237, args);
    }

};


