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

public class RandomGnmBipartiteGenerator_checkMaxEdges_7931960064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term912;

    public RandomGnmBipartiteGenerator_checkMaxEdges_7931960064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term912 = newInstance(Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator"));
        Object term914 = newInstance(Class.forName("java.util.Random"));
        Object term915 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term923 = (int[]) newIntArray(7);
        setLongField(term912, term912.getClass(), "numEdges", 5127676408959197577L);
        setLongField(term915, term915.getClass(), "value", 260665885277412L);
        setField(term914, term914.getClass(), "seed", term915);
        setDoubleField(term914, term914.getClass(), "nextNextGaussian", 0.0668892744806211);
        setBooleanField(term914, term914.getClass(), "haveNextNextGaussian", true);
        setField(term912, term912.getClass(), "random", term914);
        setIntField(term912, term912.getClass(), "first1", 1870727665);
        setIntField(term912, term912.getClass(), "last1", -519881101);
        setIntField(term912, term912.getClass(), "first2", -680920524);
        setIntField(term912, term912.getClass(), "last2", -916335264);
        setIntElement(term923, 0, -919416536);
        setIntElement(term923, 1, -43417861);
        setIntElement(term923, 2, -1533843432);
        setIntElement(term923, 3, -123338791);
        setIntElement(term923, 4, -1467089634);
        setIntElement(term923, 5, 413548937);
        setIntElement(term923, 6, 1901317214);
        setField(term912, term912.getClass(), "vertices", term923);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkMaxEdges", argTypes, term912, args);
    }

};


