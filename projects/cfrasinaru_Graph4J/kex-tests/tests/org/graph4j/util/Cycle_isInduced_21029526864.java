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

public class Cycle_isInduced_21029526864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56966;

    public Cycle_isInduced_21029526864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56966 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term56968 = (int[]) newIntArray(9);
        Object term56980 = newInstance(Class.forName("java.util.BitSet"));
        long[] term56981 = (long[]) newLongArray(1);
        setIntField(term56966, term56966.getClass(), "numEdges", -215734173);
        setField(term56966, term56966.getClass(), "graph", null);
        setIntElement(term56968, 0, -1841017701);
        setIntElement(term56968, 1, 1099125651);
        setIntElement(term56968, 2, 338123354);
        setIntElement(term56968, 3, -830092964);
        setIntElement(term56968, 4, 2137377172);
        setIntElement(term56968, 5, 1981927891);
        setIntElement(term56968, 6, -1835063179);
        setIntElement(term56968, 7, -184092475);
        setIntElement(term56968, 8, -1002047965);
        setField(term56966, term56966.getClass(), "vertices", term56968);
        setIntField(term56966, term56966.getClass(), "numVertices", 1634880098);
        setIntField(term56966, term56966.getClass(), "first", 1459664470);
        setField(term56980, term56980.getClass(), "words", term56981);
        setIntField(term56980, term56980.getClass(), "wordsInUse", 390456498);
        setBooleanField(term56980, term56980.getClass(), "sizeIsSticky", false);
        setField(term56966, term56966.getClass(), "bitset", term56980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInduced", argTypes, term56966, args);
    }

};


