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

public class Path_firstVertex_19913828393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114337;

    public Path_firstVertex_19913828393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114337 = newInstance(Class.forName("org.graph4j.util.Path"));
        int[] term114339 = (int[]) newIntArray(7);
        Object term114349 = newInstance(Class.forName("java.util.BitSet"));
        long[] term114350 = (long[]) newLongArray(1);
        setIntField(term114337, term114337.getClass(), "numEdges", -303846106);
        setField(term114337, term114337.getClass(), "graph", null);
        setIntElement(term114339, 0, 1861195554);
        setIntElement(term114339, 1, 207621271);
        setIntElement(term114339, 2, -1850529442);
        setIntElement(term114339, 3, -689658308);
        setIntElement(term114339, 4, -1420473074);
        setIntElement(term114339, 5, -902312389);
        setIntElement(term114339, 6, -1855830685);
        setField(term114337, term114337.getClass(), "vertices", term114339);
        setIntField(term114337, term114337.getClass(), "numVertices", -1845827652);
        setIntField(term114337, term114337.getClass(), "first", 1717849983);
        setField(term114349, term114349.getClass(), "words", term114350);
        setIntField(term114349, term114349.getClass(), "wordsInUse", 845426642);
        setBooleanField(term114349, term114349.getClass(), "sizeIsSticky", true);
        setField(term114337, term114337.getClass(), "bitset", term114349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Path");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "firstVertex", argTypes, term114337, args);
    }

};


