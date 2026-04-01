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

public class RandomGnmGraphGenerator_createDirectedPseudograph_317722708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;

    public RandomGnmGraphGenerator_createDirectedPseudograph_317722708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term167 = newInstance(Class.forName("java.util.Random"));
        Object term168 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term172 = (int[]) newIntArray(5);
        int[] term178 = (int[]) newIntArray(2);
        setLongField(term165, term165.getClass(), "numEdges", -7237588299778557629L);
        setLongField(term168, term168.getClass(), "value", 270748532888959L);
        setField(term167, term167.getClass(), "seed", term168);
        setDoubleField(term167, term167.getClass(), "nextNextGaussian", 0.2641345529914265);
        setBooleanField(term167, term167.getClass(), "haveNextNextGaussian", true);
        setField(term165, term165.getClass(), "random", term167);
        setIntElement(term172, 0, 2055867847);
        setIntElement(term172, 1, -1048298087);
        setIntElement(term172, 2, 292681826);
        setIntElement(term172, 3, 458147407);
        setIntElement(term172, 4, -184153539);
        setField(term165, term165.getClass(), "edgeValues", term172);
        setIntElement(term178, 0, 493620644);
        setIntElement(term178, 1, 1328271830);
        setField(term165, term165.getClass(), "vertices", term178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDirectedPseudograph", argTypes, term165, args);
    }

};


