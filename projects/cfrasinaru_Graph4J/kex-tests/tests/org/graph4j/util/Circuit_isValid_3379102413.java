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
     Object term3921;

    public Circuit_isValid_3379102413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3921 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term3923 = (int[]) newIntArray(3);
        Object term3929 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3930 = (long[]) newLongArray(1);
        setIntField(term3921, term3921.getClass(), "numEdges", 1757149811);
        setField(term3921, term3921.getClass(), "graph", null);
        setIntElement(term3923, 0, 1505375686);
        setIntElement(term3923, 1, -132005524);
        setIntElement(term3923, 2, -1235127374);
        setField(term3921, term3921.getClass(), "vertices", term3923);
        setIntField(term3921, term3921.getClass(), "numVertices", -2077814162);
        setIntField(term3921, term3921.getClass(), "first", 444514470);
        setField(term3929, term3929.getClass(), "words", term3930);
        setIntField(term3929, term3929.getClass(), "wordsInUse", -147055177);
        setBooleanField(term3929, term3929.getClass(), "sizeIsSticky", false);
        setField(term3921, term3921.getClass(), "bitset", term3929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term3921, args);
    }

};


