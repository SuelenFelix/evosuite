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
     Object term4007;
     Object term4022;

    public Circuit_join_16871295437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4007 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term4009 = (int[]) newIntArray(5);
        Object term4017 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4018 = (long[]) newLongArray(1);
        setIntField(term4007, term4007.getClass(), "numEdges", -1123526433);
        setField(term4007, term4007.getClass(), "graph", null);
        setIntElement(term4009, 0, 910269225);
        setIntElement(term4009, 1, -298852874);
        setIntElement(term4009, 2, 1094297953);
        setIntElement(term4009, 3, -329141819);
        setIntElement(term4009, 4, -963204620);
        setField(term4007, term4007.getClass(), "vertices", term4009);
        setIntField(term4007, term4007.getClass(), "numVertices", 172898580);
        setIntField(term4007, term4007.getClass(), "first", -777833461);
        setField(term4017, term4017.getClass(), "words", term4018);
        setIntField(term4017, term4017.getClass(), "wordsInUse", 1583691829);
        setBooleanField(term4017, term4017.getClass(), "sizeIsSticky", true);
        setField(term4007, term4007.getClass(), "bitset", term4017);
        term4022 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term4024 = (int[]) newIntArray(4);
        Object term4031 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4032 = (long[]) newLongArray(1);
        setIntField(term4022, term4022.getClass(), "numEdges", -1468541076);
        setField(term4022, term4022.getClass(), "graph", null);
        setIntElement(term4024, 0, -1796760393);
        setIntElement(term4024, 1, -2099267271);
        setIntElement(term4024, 2, 1134565344);
        setIntElement(term4024, 3, -1747434000);
        setField(term4022, term4022.getClass(), "vertices", term4024);
        setIntField(term4022, term4022.getClass(), "numVertices", 1611620166);
        setIntField(term4022, term4022.getClass(), "first", 249657454);
        setField(term4031, term4031.getClass(), "words", term4032);
        setIntField(term4031, term4031.getClass(), "wordsInUse", 1734630901);
        setBooleanField(term4031, term4031.getClass(), "sizeIsSticky", false);
        setField(term4022, term4022.getClass(), "bitset", term4031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.util.Circuit");
        Object[] args = new Object[1];
        args[0] = term4022;
        callMethod(klass, "join", argTypes, term4007, args);
    }

};


