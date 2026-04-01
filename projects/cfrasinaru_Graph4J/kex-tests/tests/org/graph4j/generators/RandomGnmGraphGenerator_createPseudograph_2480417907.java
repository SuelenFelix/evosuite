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

public class RandomGnmGraphGenerator_createPseudograph_2480417907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;

    public RandomGnmGraphGenerator_createPseudograph_2480417907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term136 = newInstance(Class.forName("java.util.Random"));
        Object term137 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term141 = (int[]) newIntArray(6);
        int[] term148 = (int[]) newIntArray(5);
        setLongField(term134, term134.getClass(), "numEdges", 6811161968424632369L);
        setLongField(term137, term137.getClass(), "value", 106681021303549L);
        setField(term136, term136.getClass(), "seed", term137);
        setDoubleField(term136, term136.getClass(), "nextNextGaussian", 0.40176586625454525);
        setBooleanField(term136, term136.getClass(), "haveNextNextGaussian", true);
        setField(term134, term134.getClass(), "random", term136);
        setIntElement(term141, 0, -602026508);
        setIntElement(term141, 1, -157887805);
        setIntElement(term141, 2, 1876565163);
        setIntElement(term141, 3, -817164822);
        setIntElement(term141, 4, -1016503459);
        setIntElement(term141, 5, -1968847291);
        setField(term134, term134.getClass(), "edgeValues", term141);
        setIntElement(term148, 0, 579005622);
        setIntElement(term148, 1, -14890619);
        setIntElement(term148, 2, 1632125673);
        setIntElement(term148, 3, 454281060);
        setIntElement(term148, 4, -1786399638);
        setField(term134, term134.getClass(), "vertices", term148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPseudograph", argTypes, term134, args);
    }

};


