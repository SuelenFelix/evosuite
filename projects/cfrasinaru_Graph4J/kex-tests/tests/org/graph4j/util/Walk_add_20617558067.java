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
import java.lang.Integer;

public class Walk_add_20617558067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7760;
     Object term7775;

    public Walk_add_20617558067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7760 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7762 = (int[]) newIntArray(5);
        Object term7770 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7771 = (long[]) newLongArray(1);
        setIntField(term7760, term7760.getClass(), "numEdges", 1300928519);
        setField(term7760, term7760.getClass(), "graph", null);
        setIntElement(term7762, 0, 338172676);
        setIntElement(term7762, 1, -1896960942);
        setIntElement(term7762, 2, -935912608);
        setIntElement(term7762, 3, 505087197);
        setIntElement(term7762, 4, 427005798);
        setField(term7760, term7760.getClass(), "vertices", term7762);
        setIntField(term7760, term7760.getClass(), "numVertices", -993454505);
        setIntField(term7760, term7760.getClass(), "first", -238353821);
        setField(term7770, term7770.getClass(), "words", term7771);
        setIntField(term7770, term7770.getClass(), "wordsInUse", -818992228);
        setBooleanField(term7770, term7770.getClass(), "sizeIsSticky", true);
        setField(term7760, term7760.getClass(), "bitset", term7770);
        term7775 = new Integer(2087429143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7775;
        callMethod(klass, "add", argTypes, term7760, args);
    }

};


