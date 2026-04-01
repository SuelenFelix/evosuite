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

public class Circuit_isClosed_3101807074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99170;

    public Circuit_isClosed_3101807074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99170 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term99172 = (int[]) newIntArray(5);
        Object term99180 = newInstance(Class.forName("java.util.BitSet"));
        long[] term99181 = (long[]) newLongArray(1);
        setIntField(term99170, term99170.getClass(), "numEdges", 1810176632);
        setField(term99170, term99170.getClass(), "graph", null);
        setIntElement(term99172, 0, -872274514);
        setIntElement(term99172, 1, 1210866595);
        setIntElement(term99172, 2, -1100589173);
        setIntElement(term99172, 3, 1988339953);
        setIntElement(term99172, 4, 1100230399);
        setField(term99170, term99170.getClass(), "vertices", term99172);
        setIntField(term99170, term99170.getClass(), "numVertices", -1544966933);
        setIntField(term99170, term99170.getClass(), "first", -373406556);
        setField(term99180, term99180.getClass(), "words", term99181);
        setIntField(term99180, term99180.getClass(), "wordsInUse", -341758770);
        setBooleanField(term99180, term99180.getClass(), "sizeIsSticky", true);
        setField(term99170, term99170.getClass(), "bitset", term99180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term99170, args);
    }

};


