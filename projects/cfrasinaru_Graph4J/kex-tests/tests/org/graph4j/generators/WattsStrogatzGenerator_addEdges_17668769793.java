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

public class WattsStrogatzGenerator_addEdges_17668769793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2462;

    public WattsStrogatzGenerator_addEdges_17668769793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2462 = newInstance(Class.forName("org.graph4j.generators.WattsStrogatzGenerator"));
        int[] term2466 = (int[]) newIntArray(5);
        setIntField(term2462, term2462.getClass(), "averageDegree", 1851127634);
        setDoubleField(term2462, term2462.getClass(), "rewireProbability", 0.025133051616627267);
        setDoubleField(term2462, term2462.getClass(), "addProbability", 0.016575281023182953);
        setIntElement(term2466, 0, 783730213);
        setIntElement(term2466, 1, 1815951606);
        setIntElement(term2466, 2, 1105016932);
        setIntElement(term2466, 3, -365784998);
        setIntElement(term2466, 4, -1893236300);
        setField(term2462, term2462.getClass(), "vertices", term2466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.WattsStrogatzGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addEdges", argTypes, term2462, args);
    }

};


