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

public class RandomGnmGraphGenerator_createMultiGraph_12701997565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;

    public RandomGnmGraphGenerator_createMultiGraph_12701997565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term86 = newInstance(Class.forName("java.util.Random"));
        Object term87 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term91 = (int[]) newIntArray(2);
        int[] term94 = (int[]) newIntArray(6);
        setLongField(term84, term84.getClass(), "numEdges", 7411271909051562686L);
        setLongField(term87, term87.getClass(), "value", 125464507797002L);
        setField(term86, term86.getClass(), "seed", term87);
        setDoubleField(term86, term86.getClass(), "nextNextGaussian", 0.544608645520025);
        setBooleanField(term86, term86.getClass(), "haveNextNextGaussian", false);
        setField(term84, term84.getClass(), "random", term86);
        setIntElement(term91, 0, 590364439);
        setIntElement(term91, 1, 865208305);
        setField(term84, term84.getClass(), "edgeValues", term91);
        setIntElement(term94, 0, -1275173084);
        setIntElement(term94, 1, -244121226);
        setIntElement(term94, 2, -203030934);
        setIntElement(term94, 3, -1179120542);
        setIntElement(term94, 4, -73683645);
        setIntElement(term94, 5, -226514366);
        setField(term84, term84.getClass(), "vertices", term94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createMultiGraph", argTypes, term84, args);
    }

};


