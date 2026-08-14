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
     Object term3938;

    public Circuit_isClosed_3101807074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3938 = newInstance(Class.forName("org.graph4j.util.Circuit"));
        int[] term3940 = (int[]) newIntArray(0);
        Object term3943 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3944 = (long[]) newLongArray(1);
        setIntField(term3938, term3938.getClass(), "numEdges", 1979044375);
        setField(term3938, term3938.getClass(), "graph", null);
        setField(term3938, term3938.getClass(), "vertices", term3940);
        setIntField(term3938, term3938.getClass(), "numVertices", 961252909);
        setIntField(term3938, term3938.getClass(), "first", 1455842357);
        setField(term3943, term3943.getClass(), "words", term3944);
        setIntField(term3943, term3943.getClass(), "wordsInUse", 1349806561);
        setBooleanField(term3943, term3943.getClass(), "sizeIsSticky", false);
        setField(term3938, term3938.getClass(), "bitset", term3943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Circuit");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isClosed", argTypes, term3938, args);
    }

};


