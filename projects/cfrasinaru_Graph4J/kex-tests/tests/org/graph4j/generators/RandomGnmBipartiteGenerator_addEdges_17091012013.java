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

public class RandomGnmBipartiteGenerator_addEdges_17091012013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;
     Object term901;

    public RandomGnmBipartiteGenerator_addEdges_17091012013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term880 = newInstance(Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator"));
        Object term882 = newInstance(Class.forName("java.util.Random"));
        Object term883 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term891 = (int[]) newIntArray(9);
        setLongField(term880, term880.getClass(), "numEdges", -316468845751588286L);
        setLongField(term883, term883.getClass(), "value", 145490844586150L);
        setField(term882, term882.getClass(), "seed", term883);
        setDoubleField(term882, term882.getClass(), "nextNextGaussian", 0.9737083944266686);
        setBooleanField(term882, term882.getClass(), "haveNextNextGaussian", true);
        setField(term880, term880.getClass(), "random", term882);
        setIntField(term880, term880.getClass(), "first1", -129547140);
        setIntField(term880, term880.getClass(), "last1", 199287428);
        setIntField(term880, term880.getClass(), "first2", -1195339592);
        setIntField(term880, term880.getClass(), "last2", -376422566);
        setIntElement(term891, 0, 306847454);
        setIntElement(term891, 1, 1745276158);
        setIntElement(term891, 2, 2009020256);
        setIntElement(term891, 3, 2049577015);
        setIntElement(term891, 4, 1236004505);
        setIntElement(term891, 5, 1050765721);
        setIntElement(term891, 6, 474518942);
        setIntElement(term891, 7, -1656687479);
        setIntElement(term891, 8, -249614216);
        setField(term880, term880.getClass(), "vertices", term891);
        term901 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmBipartiteGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term901;
        callMethod(klass, "addEdges", argTypes, term880, args);
    }

};


