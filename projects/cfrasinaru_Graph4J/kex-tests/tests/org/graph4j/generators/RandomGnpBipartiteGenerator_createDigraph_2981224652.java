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

public class RandomGnpBipartiteGenerator_createDigraph_2981224652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term988;

    public RandomGnpBipartiteGenerator_createDigraph_2981224652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term988 = newInstance(Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator"));
        Object term990 = newInstance(Class.forName("java.util.Random"));
        Object term991 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term999 = (int[]) newIntArray(3);
        setDoubleField(term988, term988.getClass(), "edgeProbability", 0.5279279537140873);
        setLongField(term991, term991.getClass(), "value", 213907963540710L);
        setField(term990, term990.getClass(), "seed", term991);
        setDoubleField(term990, term990.getClass(), "nextNextGaussian", 0.3202192021706908);
        setBooleanField(term990, term990.getClass(), "haveNextNextGaussian", false);
        setField(term988, term988.getClass(), "random", term990);
        setIntField(term988, term988.getClass(), "first1", 574481092);
        setIntField(term988, term988.getClass(), "last1", -310528004);
        setIntField(term988, term988.getClass(), "first2", -634976996);
        setIntField(term988, term988.getClass(), "last2", -1015274146);
        setIntElement(term999, 0, -49052672);
        setIntElement(term999, 1, 339372704);
        setIntElement(term999, 2, -851097944);
        setField(term988, term988.getClass(), "vertices", term999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term988, args);
    }

};


