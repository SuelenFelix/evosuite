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
     Object term7798;

    public Walk_isClosed_18548581879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7798 = newInstance(Class.forName("org.graph4j.util.Walk"));
        int[] term7800 = (int[]) newIntArray(9);
        Object term7812 = newInstance(Class.forName("java.util.BitSet"));
        long[] term7813 = (long[]) newLongArray(1);
        setIntField(term7798, term7798.getClass(), "numEdges", 1843465187);
        setField(term7798, term7798.getClass(), "graph", null);
        setIntElement(term7800, 0, 529595969);
        setIntElement(term7800, 1, -1548733886);
        setIntElement(term7800, 2, 1543539715);
        setIntElement(term7800, 3, 1744599521);
        setIntElement(term7800, 4, -985141153);
        setIntElement(term7800, 5, -1983740361);
        setIntElement(term7800, 6, -1494716341);
        setIntElement(term7800, 7, 816237851);
        setIntElement(term7800, 8, -604114341);
        setField(term7798, term7798.getClass(), "vertices", term7800);
        setIntField(term7798, term7798.getClass(), "numVertices", 1146236760);
        setIntField(term7798, term7798.getClass(), "first", 985801789);
        setField(term7812, term7812.getClass(), "words", term7813);
        setIntField(term7812, term7812.getClass(), "wordsInUse", -1628536749);
        setBooleanField(term7812, term7812.getClass(), "sizeIsSticky", true);
        setField(term7798, term7798.getClass(), "bitset", term7812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Walk");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term7798, args);
    }

};


