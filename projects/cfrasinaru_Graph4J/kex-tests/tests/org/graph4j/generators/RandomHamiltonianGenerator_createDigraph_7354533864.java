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

public class RandomHamiltonianGenerator_createDigraph_7354533864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;

    public RandomHamiltonianGenerator_createDigraph_7354533864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402 = newInstance(Class.forName("org.graph4j.generators.RandomHamiltonianGenerator"));
        Object term404 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term406 = (int[]) newIntArray(5);
        Object term414 = newInstance(Class.forName("java.util.BitSet"));
        long[] term415 = (long[]) newLongArray(1);
        int[] term419 = (int[]) newIntArray(3);
        setDoubleField(term402, term402.getClass(), "edgeProbability", 0.9527281779865117);
        setIntField(term404, term404.getClass(), "numEdges", -1963434938);
        setField(term404, term404.getClass(), "graph", null);
        setIntElement(term406, 0, 906181092);
        setIntElement(term406, 1, 1045657203);
        setIntElement(term406, 2, 1386130016);
        setIntElement(term406, 3, 1072005683);
        setIntElement(term406, 4, 1861318859);
        setField(term404, term404.getClass(), "vertices", term406);
        setIntField(term404, term404.getClass(), "numVertices", 1474524152);
        setIntField(term404, term404.getClass(), "first", 568954359);
        setField(term414, term414.getClass(), "words", term415);
        setIntField(term414, term414.getClass(), "wordsInUse", 53410913);
        setBooleanField(term414, term414.getClass(), "sizeIsSticky", true);
        setField(term404, term404.getClass(), "bitset", term414);
        setField(term402, term402.getClass(), "cycle", term404);
        setIntElement(term419, 0, -375014958);
        setIntElement(term419, 1, 1107176718);
        setIntElement(term419, 2, 480137250);
        setField(term402, term402.getClass(), "vertices", term419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomHamiltonianGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term402, args);
    }

};


