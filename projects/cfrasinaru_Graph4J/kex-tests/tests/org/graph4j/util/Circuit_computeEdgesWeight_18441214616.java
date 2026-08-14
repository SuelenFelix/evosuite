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

public class Circuit_computeEdgesWeight_18441214616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3978;

    public Circuit_computeEdgesWeight_18441214616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3978 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term3980 = (int[]) newIntArray(9);
        Object term3992 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3993 = (long[]) newLongArray(1);
        setIntField(term3978, term3978.getClass(), "numEdges", 1516598327);
        setField(term3978, term3978.getClass(), "graph", null);
        setIntElement(term3980, 0, 82353584);
        setIntElement(term3980, 1, -758778797);
        setIntElement(term3980, 2, 765680355);
        setIntElement(term3980, 3, -1012090049);
        setIntElement(term3980, 4, -2025214553);
        setIntElement(term3980, 5, -154750730);
        setIntElement(term3980, 6, -2047179134);
        setIntElement(term3980, 7, 44908093);
        setIntElement(term3980, 8, 887198203);
        setField(term3978, term3978.getClass(), "vertices", term3980);
        setIntField(term3978, term3978.getClass(), "numVertices", 12581312);
        setIntField(term3978, term3978.getClass(), "first", 2087383644);
        setField(term3992, term3992.getClass(), "words", term3993);
        setIntField(term3992, term3992.getClass(), "wordsInUse", 405527523);
        setBooleanField(term3992, term3992.getClass(), "sizeIsSticky", true);
        setField(term3978, term3978.getClass(), "bitset", term3992);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeEdgesWeight", argTypes, term3978, args);
    }

};


