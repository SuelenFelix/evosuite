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

public class RandomGnmGraphGenerator_createGraph_3445549502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public RandomGnmGraphGenerator_createGraph_3445549502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term13 = newInstance(Class.forName("java.util.Random"));
        Object term14 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term18 = (int[]) newIntArray(5);
        int[] term24 = (int[]) newIntArray(4);
        setLongField(term11, term11.getClass(), "numEdges", -8257434502486459194L);
        setLongField(term14, term14.getClass(), "value", 219757884603757L);
        setField(term13, term13.getClass(), "seed", term14);
        setDoubleField(term13, term13.getClass(), "nextNextGaussian", 0.13238746331190498);
        setBooleanField(term13, term13.getClass(), "haveNextNextGaussian", false);
        setField(term11, term11.getClass(), "random", term13);
        setIntElement(term18, 0, 391863371);
        setIntElement(term18, 1, -1922583790);
        setIntElement(term18, 2, -616727354);
        setIntElement(term18, 3, -1955890973);
        setIntElement(term18, 4, -2038273078);
        setField(term11, term11.getClass(), "edgeValues", term18);
        setIntElement(term24, 0, 1227103734);
        setIntElement(term24, 1, -1339778481);
        setIntElement(term24, 2, 1725571209);
        setIntElement(term24, 3, -522618178);
        setField(term11, term11.getClass(), "vertices", term24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term11, args);
    }

};


