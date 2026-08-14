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

public class VertexQueue_peek_10326181084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4259;

    public VertexQueue_peek_10326181084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4259 = newInstance(Class.forName("org.graph4j.util.VertexQueue"));
        int[] term4260 = (int[]) newIntArray(3);
        Object term4266 = newInstance(Class.forName("java.util.BitSet"));
        long[] term4267 = (long[]) newLongArray(1);
        setField(term4259, term4259.getClass(), "graph", null);
        setIntElement(term4260, 0, -1929689681);
        setIntElement(term4260, 1, -91240911);
        setIntElement(term4260, 2, -321227954);
        setField(term4259, term4259.getClass(), "vertices", term4260);
        setIntField(term4259, term4259.getClass(), "numVertices", 373810833);
        setIntField(term4259, term4259.getClass(), "first", -215979293);
        setField(term4266, term4266.getClass(), "words", term4267);
        setIntField(term4266, term4266.getClass(), "wordsInUse", -19567889);
        setBooleanField(term4266, term4266.getClass(), "sizeIsSticky", false);
        setField(term4259, term4259.getClass(), "bitset", term4266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.VertexQueue");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term4259, args);
    }

};


