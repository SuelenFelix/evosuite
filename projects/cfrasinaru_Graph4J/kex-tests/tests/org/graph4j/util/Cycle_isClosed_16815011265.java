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

public class Cycle_isClosed_16815011265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;

    public Cycle_isClosed_16815011265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term290 = (int[]) newIntArray(5);
        Object term298 = newInstance(Class.forName("java.util.BitSet"));
        long[] term299 = (long[]) newLongArray(1);
        setIntField(term288, term288.getClass(), "numEdges", 97029295);
        setField(term288, term288.getClass(), "graph", null);
        setIntElement(term290, 0, -1371869594);
        setIntElement(term290, 1, -2095575670);
        setIntElement(term290, 2, 1225272962);
        setIntElement(term290, 3, 1324040357);
        setIntElement(term290, 4, -1588772968);
        setField(term288, term288.getClass(), "vertices", term290);
        setIntField(term288, term288.getClass(), "numVertices", -93135961);
        setIntField(term288, term288.getClass(), "first", -112921587);
        setField(term298, term298.getClass(), "words", term299);
        setIntField(term298, term298.getClass(), "wordsInUse", 933028652);
        setBooleanField(term298, term298.getClass(), "sizeIsSticky", false);
        setField(term288, term288.getClass(), "bitset", term298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term288, args);
    }

};


