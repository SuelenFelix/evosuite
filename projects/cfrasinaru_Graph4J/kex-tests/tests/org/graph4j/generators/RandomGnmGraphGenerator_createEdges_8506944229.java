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
import java.lang.Boolean;

public class RandomGnmGraphGenerator_createEdges_8506944229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;
     Object term201;

    public RandomGnmGraphGenerator_createEdges_8506944229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term190 = newInstance(Class.forName("java.util.Random"));
        Object term191 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term195 = (int[]) newIntArray(3);
        int[] term199 = (int[]) newIntArray(1);
        setLongField(term188, term188.getClass(), "numEdges", 6967924379644551255L);
        setLongField(term191, term191.getClass(), "value", 99557856014751L);
        setField(term190, term190.getClass(), "seed", term191);
        setDoubleField(term190, term190.getClass(), "nextNextGaussian", 0.36923381893433327);
        setBooleanField(term190, term190.getClass(), "haveNextNextGaussian", true);
        setField(term188, term188.getClass(), "random", term190);
        setIntElement(term195, 0, 1596070772);
        setIntElement(term195, 1, 97029295);
        setIntElement(term195, 2, -1371869594);
        setField(term188, term188.getClass(), "edgeValues", term195);
        setIntElement(term199, 0, -2095575670);
        setField(term188, term188.getClass(), "vertices", term199);
        term201 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term201;
        callMethod(klass, "createEdges", argTypes, term188, args);
    }

};


