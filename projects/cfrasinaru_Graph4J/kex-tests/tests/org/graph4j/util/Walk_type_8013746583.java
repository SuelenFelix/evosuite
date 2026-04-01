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

public class Walk_type_8013746583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143775;

    public Walk_type_8013746583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143775 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143777 = (int[]) newIntArray(1);
        Object term143781 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143782 = (long[]) newLongArray(1);
        setIntField(term143775, term143775.getClass(), "numEdges", -1333009169);
        setField(term143775, term143775.getClass(), "graph", null);
        setIntElement(term143777, 0, -12379471);
        setField(term143775, term143775.getClass(), "vertices", term143777);
        setIntField(term143775, term143775.getClass(), "numVertices", -1179547691);
        setIntField(term143775, term143775.getClass(), "first", -321239092);
        setField(term143781, term143781.getClass(), "words", term143782);
        setIntField(term143781, term143781.getClass(), "wordsInUse", 179613061);
        setBooleanField(term143781, term143781.getClass(), "sizeIsSticky", false);
        setField(term143775, term143775.getClass(), "bitset", term143781);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "type", argTypes, term143775, args);
    }

};


