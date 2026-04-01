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

public class RandomGnpBipartiteGenerator_addEdges_13593934203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1006;
     Object term1022;

    public RandomGnpBipartiteGenerator_addEdges_13593934203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1006 = newInstance(Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator"));
        Object term1008 = newInstance(Class.forName("java.util.Random"));
        Object term1009 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term1017 = (int[]) newIntArray(4);
        setDoubleField(term1006, term1006.getClass(), "edgeProbability", 0.22651340641904605);
        setLongField(term1009, term1009.getClass(), "value", 145246355534629L);
        setField(term1008, term1008.getClass(), "seed", term1009);
        setDoubleField(term1008, term1008.getClass(), "nextNextGaussian", 0.8878841294187743);
        setBooleanField(term1008, term1008.getClass(), "haveNextNextGaussian", false);
        setField(term1006, term1006.getClass(), "random", term1008);
        setIntField(term1006, term1006.getClass(), "first1", 803925431);
        setIntField(term1006, term1006.getClass(), "last1", 76929641);
        setIntField(term1006, term1006.getClass(), "first2", -2003192918);
        setIntField(term1006, term1006.getClass(), "last2", -1362856620);
        setIntElement(term1017, 0, -1835839814);
        setIntElement(term1017, 1, -1404350380);
        setIntElement(term1017, 2, -2013924238);
        setIntElement(term1017, 3, 579006268);
        setField(term1006, term1006.getClass(), "vertices", term1017);
        term1022 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1022;
        callMethod(klass, "addEdges", argTypes, term1006, args);
    }

};


