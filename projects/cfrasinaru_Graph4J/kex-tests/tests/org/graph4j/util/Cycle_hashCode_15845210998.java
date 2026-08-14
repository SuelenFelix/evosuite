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

public class Cycle_hashCode_15845210998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;

    public Cycle_hashCode_15845210998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term347 = (int[]) newIntArray(3);
        Object term353 = newInstance(Class.forName("java.util.BitSet"));
        long[] term354 = (long[]) newLongArray(1);
        setIntField(term345, term345.getClass(), "numEdges", 1090617576);
        setField(term345, term345.getClass(), "graph", null);
        setIntElement(term347, 0, -1547384488);
        setIntElement(term347, 1, 1442160736);
        setIntElement(term347, 2, 1114000454);
        setField(term345, term345.getClass(), "vertices", term347);
        setIntField(term345, term345.getClass(), "numVertices", -556405712);
        setIntField(term345, term345.getClass(), "first", -1772434990);
        setField(term353, term353.getClass(), "words", term354);
        setIntField(term353, term353.getClass(), "wordsInUse", -1845499264);
        setBooleanField(term353, term353.getClass(), "sizeIsSticky", true);
        setField(term345, term345.getClass(), "bitset", term353);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term345, args);
    }

};


