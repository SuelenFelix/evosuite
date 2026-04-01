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

public class Clique_isMaximal_7484130088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141628;

    public Clique_isMaximal_7484130088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141628 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term141629 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term141630 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term141634 = (int[]) newIntArray(6);
        Object term141643 = newInstance(Class.forName("java.util.BitSet"));
        long[] term141644 = (long[]) newLongArray(1);
        setField(term141629, term141629.getClass(), "table", term141630);
        setIntField(term141629, term141629.getClass(), "count", -705479387);
        setIntField(term141629, term141629.getClass(), "threshold", 15);
        setFloatField(term141629, term141629.getClass(), "loadFactor", 0.75F);
        setField(term141628, term141628.getClass(), "posMap", term141629);
        setField(term141628, term141628.getClass(), "graph", null);
        setIntElement(term141634, 0, -627102852);
        setIntElement(term141634, 1, -380898091);
        setIntElement(term141634, 2, -1849870684);
        setIntElement(term141634, 3, 255628143);
        setIntElement(term141634, 4, 398589520);
        setIntElement(term141634, 5, 800565822);
        setField(term141628, term141628.getClass(), "vertices", term141634);
        setIntField(term141628, term141628.getClass(), "numVertices", 731707735);
        setIntField(term141628, term141628.getClass(), "first", -503364496);
        setField(term141643, term141643.getClass(), "words", term141644);
        setIntField(term141643, term141643.getClass(), "wordsInUse", -1346047153);
        setBooleanField(term141643, term141643.getClass(), "sizeIsSticky", false);
        setField(term141628, term141628.getClass(), "bitset", term141643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Clique");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaximal", argTypes, term141628, args);
    }

};


