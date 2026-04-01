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

public class RandomGnmGraphGenerator_createDigraph_13589562404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;

    public RandomGnmGraphGenerator_createDigraph_13589562404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term63 = newInstance(Class.forName("java.util.Random"));
        Object term64 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term68 = (int[]) newIntArray(1);
        int[] term70 = (int[]) newIntArray(6);
        setLongField(term61, term61.getClass(), "numEdges", 5270370404989704783L);
        setLongField(term64, term64.getClass(), "value", 194858401390441L);
        setField(term63, term63.getClass(), "seed", term64);
        setDoubleField(term63, term63.getClass(), "nextNextGaussian", 0.5523635872663106);
        setBooleanField(term63, term63.getClass(), "haveNextNextGaussian", false);
        setField(term61, term61.getClass(), "random", term63);
        setIntElement(term68, 0, 1048535127);
        setField(term61, term61.getClass(), "edgeValues", term68);
        setIntElement(term70, 0, -655067527);
        setIntElement(term70, 1, -6029667);
        setIntElement(term70, 2, -2068769794);
        setIntElement(term70, 3, -117576464);
        setIntElement(term70, 4, -1007160944);
        setIntElement(term70, 5, 1135664017);
        setField(term61, term61.getClass(), "vertices", term70);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term61, args);
    }

};


