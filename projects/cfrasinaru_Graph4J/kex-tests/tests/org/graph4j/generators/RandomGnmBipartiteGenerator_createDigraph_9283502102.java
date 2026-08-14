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

public class RandomGnmBipartiteGenerator_createDigraph_9283502102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852;

    public RandomGnmBipartiteGenerator_createDigraph_9283502102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852 = newInstance(Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator"));
        Object term854 = newInstance(Class.forName("java.util.Random"));
        Object term855 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term863 = (int[]) newIntArray(8);
        setLongField(term852, term852.getClass(), "numEdges", -872011222785455006L);
        setLongField(term855, term855.getClass(), "value", 47070736129920L);
        setField(term854, term854.getClass(), "seed", term855);
        setDoubleField(term854, term854.getClass(), "nextNextGaussian", 0.6300849762307866);
        setBooleanField(term854, term854.getClass(), "haveNextNextGaussian", true);
        setField(term852, term852.getClass(), "random", term854);
        setIntField(term852, term852.getClass(), "first1", 267763294);
        setIntField(term852, term852.getClass(), "last1", -1497710478);
        setIntField(term852, term852.getClass(), "first2", 49950830);
        setIntField(term852, term852.getClass(), "last2", -525257914);
        setIntElement(term863, 0, 147209682);
        setIntElement(term863, 1, 34470066);
        setIntElement(term863, 2, 2058711405);
        setIntElement(term863, 3, 1743683601);
        setIntElement(term863, 4, -945116798);
        setIntElement(term863, 5, 1593461795);
        setIntElement(term863, 6, 515182546);
        setIntElement(term863, 7, -936895502);
        setField(term852, term852.getClass(), "vertices", term863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDigraph", argTypes, term852, args);
    }

};


