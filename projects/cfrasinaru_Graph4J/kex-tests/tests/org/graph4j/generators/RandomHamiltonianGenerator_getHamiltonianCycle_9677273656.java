package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RandomHamiltonianGenerator_getHamiltonianCycle_9677273656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term464;

    public RandomHamiltonianGenerator_getHamiltonianCycle_9677273656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term464 = newInstance(Class.forName("org.graph4j.generators.RandomHamiltonianGenerator"));
        Object term466 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term468 = (int[]) newIntArray(6);
        Object term477 = newInstance(Class.forName("java.util.BitSet"));
        long[] term478 = (long[]) newLongArray(1);
        int[] term482 = (int[]) newIntArray(6);
        setDoubleField(term464, term464.getClass(), "edgeProbability", 0.2779719046761513);
        setIntField(term466, term466.getClass(), "numEdges", -1565502840);
        setField(term466, term466.getClass(), "graph", null);
        setIntElement(term468, 0, 344323424);
        setIntElement(term468, 1, 9726679);
        setIntElement(term468, 2, -25637976);
        setIntElement(term468, 3, 1555897383);
        setIntElement(term468, 4, 202001407);
        setIntElement(term468, 5, 158873461);
        setField(term466, term466.getClass(), "vertices", term468);
        setIntField(term466, term466.getClass(), "numVertices", -430151637);
        setIntField(term466, term466.getClass(), "first", -1697741339);
        setField(term477, term477.getClass(), "words", term478);
        setIntField(term477, term477.getClass(), "wordsInUse", 98922530);
        setBooleanField(term477, term477.getClass(), "sizeIsSticky", false);
        setField(term466, term466.getClass(), "bitset", term477);
        setField(term464, term464.getClass(), "cycle", term466);
        setIntElement(term482, 0, -1388471422);
        setIntElement(term482, 1, -1498296052);
        setIntElement(term482, 2, 2098647989);
        setIntElement(term482, 3, 1598895173);
        setIntElement(term482, 4, 1830648570);
        setIntElement(term482, 5, -227365013);
        setField(term464, term464.getClass(), "vertices", term482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomHamiltonianGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHamiltonianCycle", argTypes, term464, args);
    }

};


