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

public class Walk_isClosed_18548581879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143916;

    public Walk_isClosed_18548581879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143916 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term143918 = (int[]) newIntArray(4);
        Object term143925 = newInstance(Class.forName("java.util.BitSet"));
        long[] term143926 = (long[]) newLongArray(1);
        setIntField(term143916, term143916.getClass(), "numEdges", 1392833741);
        setField(term143916, term143916.getClass(), "graph", null);
        setIntElement(term143918, 0, 683342209);
        setIntElement(term143918, 1, -415684405);
        setIntElement(term143918, 2, -736368591);
        setIntElement(term143918, 3, -203381816);
        setField(term143916, term143916.getClass(), "vertices", term143918);
        setIntField(term143916, term143916.getClass(), "numVertices", 2145190871);
        setIntField(term143916, term143916.getClass(), "first", 217998825);
        setField(term143925, term143925.getClass(), "words", term143926);
        setIntField(term143925, term143925.getClass(), "wordsInUse", -1769877037);
        setBooleanField(term143925, term143925.getClass(), "sizeIsSticky", true);
        setField(term143916, term143916.getClass(), "bitset", term143925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term143916, args);
    }

};


