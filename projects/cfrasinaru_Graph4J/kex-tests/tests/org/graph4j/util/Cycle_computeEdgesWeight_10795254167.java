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

public class Cycle_computeEdgesWeight_10795254167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;

    public Cycle_computeEdgesWeight_10795254167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term330 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term332 = (int[]) newIntArray(2);
        Object term337 = newInstance(Class.forName("java.util.BitSet"));
        long[] term338 = (long[]) newLongArray(1);
        setIntField(term330, term330.getClass(), "numEdges", -478195677);
        setField(term330, term330.getClass(), "graph", null);
        setIntElement(term332, 0, 972867650);
        setIntElement(term332, 1, 1655935355);
        setField(term330, term330.getClass(), "vertices", term332);
        setIntField(term330, term330.getClass(), "numVertices", -481533957);
        setIntField(term330, term330.getClass(), "first", 1240914516);
        setField(term337, term337.getClass(), "words", term338);
        setIntField(term337, term337.getClass(), "wordsInUse", -1465035361);
        setBooleanField(term337, term337.getClass(), "sizeIsSticky", true);
        setField(term330, term330.getClass(), "bitset", term337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeEdgesWeight", argTypes, term330, args);
    }

};


