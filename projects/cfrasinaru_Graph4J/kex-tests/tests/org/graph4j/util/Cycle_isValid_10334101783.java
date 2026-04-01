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

public class Cycle_isValid_10334101783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56945;

    public Cycle_isValid_10334101783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56945 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term56947 = (int[]) newIntArray(5);
        Object term56955 = newInstance(Class.forName("java.util.BitSet"));
        long[] term56956 = (long[]) newLongArray(1);
        setIntField(term56945, term56945.getClass(), "numEdges", 4051182);
        setField(term56945, term56945.getClass(), "graph", null);
        setIntElement(term56947, 0, -868532730);
        setIntElement(term56947, 1, -90828570);
        setIntElement(term56947, 2, -340081641);
        setIntElement(term56947, 3, -1412324757);
        setIntElement(term56947, 4, 140849786);
        setField(term56945, term56945.getClass(), "vertices", term56947);
        setIntField(term56945, term56945.getClass(), "numVertices", 34056751);
        setIntField(term56945, term56945.getClass(), "first", 1802001091);
        setField(term56955, term56955.getClass(), "words", term56956);
        setIntField(term56955, term56955.getClass(), "wordsInUse", -1767833537);
        setBooleanField(term56955, term56955.getClass(), "sizeIsSticky", false);
        setField(term56945, term56945.getClass(), "bitset", term56955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Cycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isValid", argTypes, term56945, args);
    }

};


