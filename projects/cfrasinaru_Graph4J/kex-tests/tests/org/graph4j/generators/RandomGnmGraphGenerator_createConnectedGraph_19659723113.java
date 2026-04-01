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

public class RandomGnmGraphGenerator_createConnectedGraph_19659723113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;

    public RandomGnmGraphGenerator_createConnectedGraph_19659723113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term40 = newInstance(Class.forName("java.util.Random"));
        Object term41 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term45 = (int[]) newIntArray(3);
        int[] term49 = (int[]) newIntArray(4);
        setLongField(term38, term38.getClass(), "numEdges", -8400487765614892086L);
        setLongField(term41, term41.getClass(), "value", 250741833605203L);
        setField(term40, term40.getClass(), "seed", term41);
        setDoubleField(term40, term40.getClass(), "nextNextGaussian", 0.3455959125047594);
        setBooleanField(term40, term40.getClass(), "haveNextNextGaussian", false);
        setField(term38, term38.getClass(), "random", term40);
        setIntElement(term45, 0, 1134449235);
        setIntElement(term45, 1, -883034806);
        setIntElement(term45, 2, 1585847225);
        setField(term38, term38.getClass(), "edgeValues", term45);
        setIntElement(term49, 0, 597278769);
        setIntElement(term49, 1, -1685132342);
        setIntElement(term49, 2, -1456670397);
        setIntElement(term49, 3, 1622346318);
        setField(term38, term38.getClass(), "vertices", term49);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createConnectedGraph", argTypes, term38, args);
    }

};


