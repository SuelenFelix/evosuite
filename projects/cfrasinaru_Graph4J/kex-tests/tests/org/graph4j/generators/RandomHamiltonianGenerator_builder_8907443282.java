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

public class RandomHamiltonianGenerator_builder_8907443282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328;

    public RandomHamiltonianGenerator_builder_8907443282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328 = newInstance(Class.forName("org.graph4j.generators.RandomHamiltonianGenerator"));
        Object term330 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term332 = (int[]) newIntArray(9);
        Object term344 = newInstance(Class.forName("java.util.BitSet"));
        long[] term345 = (long[]) newLongArray(1);
        int[] term349 = (int[]) newIntArray(3);
        setDoubleField(term328, term328.getClass(), "edgeProbability", 0.1374549299694151);
        setIntField(term330, term330.getClass(), "numEdges", -1547384488);
        setField(term330, term330.getClass(), "graph", null);
        setIntElement(term332, 0, 1442160736);
        setIntElement(term332, 1, 1114000454);
        setIntElement(term332, 2, -556405712);
        setIntElement(term332, 3, -1772434990);
        setIntElement(term332, 4, -1845499264);
        setIntElement(term332, 5, -505439934);
        setIntElement(term332, 6, -344842608);
        setIntElement(term332, 7, 941650513);
        setIntElement(term332, 8, 444029505);
        setField(term330, term330.getClass(), "vertices", term332);
        setIntField(term330, term330.getClass(), "numVertices", -1034506028);
        setIntField(term330, term330.getClass(), "first", -1263114719);
        setField(term344, term344.getClass(), "words", term345);
        setIntField(term344, term344.getClass(), "wordsInUse", -894662986);
        setBooleanField(term344, term344.getClass(), "sizeIsSticky", false);
        setField(term330, term330.getClass(), "bitset", term344);
        setField(term328, term328.getClass(), "cycle", term330);
        setIntElement(term349, 0, 304775596);
        setIntElement(term349, 1, -1347665717);
        setIntElement(term349, 2, -1888585309);
        setField(term328, term328.getClass(), "vertices", term349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomHamiltonianGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "builder", argTypes, term328, args);
    }

};


