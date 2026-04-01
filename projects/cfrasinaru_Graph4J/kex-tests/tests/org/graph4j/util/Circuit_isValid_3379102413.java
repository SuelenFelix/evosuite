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

public class Circuit_isValid_3379102413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99141;

    public Circuit_isValid_3379102413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99141 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99143 = (int[]) newIntArray(9);
        Object term99155 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99156 = (long[]) newLongArray(1);
        setIntField(term99141, term99141.getClass(), "numEdges", 557693831);
        setField(term99141, term99141.getClass(), "graph", null);
        setIntElement(term99143, 0, 938638133);
        setIntElement(term99143, 1, -130864088);
        setIntElement(term99143, 2, -509472233);
        setIntElement(term99143, 3, 925935088);
        setIntElement(term99143, 4, 125924563);
        setIntElement(term99143, 5, -640546426);
        setIntElement(term99143, 6, -545966550);
        setIntElement(term99143, 7, -2036780189);
        setIntElement(term99143, 8, -1475767692);
        setField(term99141, term99141.getClass(), "vertices", term99143);
        setIntField(term99141, term99141.getClass(), "numVertices", -1526337631);
        setIntField(term99141, term99141.getClass(), "first", 1413259880);
        setField(term99155, term99155.getClass(), "words", term99156);
        setIntField(term99155, term99155.getClass(), "wordsInUse", -707058176);
        setBooleanField(term99155, term99155.getClass(), "sizeIsSticky", true);
        setField(term99141, term99141.getClass(), "bitset", term99155);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term99141, args);
    }

};


