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
     Object term7667;

    public Walk_type_8013746583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7667 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7669 = (int[]) newIntArray(2);
        Object term7674 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7675 = (long[]) newLongArray(1);
        setIntField(term7667, term7667.getClass(), "numEdges", 1966881264);
        setField(term7667, term7667.getClass(), "graph", null);
        setIntElement(term7669, 0, -1707655562);
        setIntElement(term7669, 1, 1525815085);
        setField(term7667, term7667.getClass(), "vertices", term7669);
        setIntField(term7667, term7667.getClass(), "numVertices", 1785476260);
        setIntField(term7667, term7667.getClass(), "first", -655035002);
        setField(term7674, term7674.getClass(), "words", term7675);
        setIntField(term7674, term7674.getClass(), "wordsInUse", 1841475189);
        setBooleanField(term7674, term7674.getClass(), "sizeIsSticky", false);
        setField(term7667, term7667.getClass(), "bitset", term7674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "type", argTypes, term7667, args);
    }

};


