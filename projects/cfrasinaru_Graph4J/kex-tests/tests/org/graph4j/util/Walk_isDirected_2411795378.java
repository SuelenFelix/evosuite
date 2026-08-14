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

public class Walk_isDirected_2411795378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7783;

    public Walk_isDirected_2411795378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7783 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7785 = (int[]) newIntArray(2);
        Object term7790 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7791 = (long[]) newLongArray(1);
        setIntField(term7783, term7783.getClass(), "numEdges", -1892890104);
        setField(term7783, term7783.getClass(), "graph", null);
        setIntElement(term7785, 0, 2003356558);
        setIntElement(term7785, 1, -638126185);
        setField(term7783, term7783.getClass(), "vertices", term7785);
        setIntField(term7783, term7783.getClass(), "numVertices", 28070985);
        setIntField(term7783, term7783.getClass(), "first", 334110739);
        setField(term7790, term7790.getClass(), "words", term7791);
        setIntField(term7790, term7790.getClass(), "wordsInUse", -1724529322);
        setBooleanField(term7790, term7790.getClass(), "sizeIsSticky", false);
        setField(term7783, term7783.getClass(), "bitset", term7790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirected", argTypes, term7783, args);
    }

};


