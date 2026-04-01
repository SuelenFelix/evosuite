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

public class RandomChordalGraphGenerator_createRandomSubtree_16206452003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2078;

    public RandomChordalGraphGenerator_createRandomSubtree_16206452003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2078 = newInstance(Class.forName("org.graph4j.generators.RandomChordalGraphGenerator"));
        int[] term2080 = (int[]) newIntArray(8);
        setIntField(term2078, term2078.getClass(), "maxSubtreeSize", 1414025609);
        setIntElement(term2080, 0, 255145822);
        setIntElement(term2080, 1, -573608449);
        setIntElement(term2080, 2, -1660057757);
        setIntElement(term2080, 3, 1816273440);
        setIntElement(term2080, 4, -96541009);
        setIntElement(term2080, 5, -43719302);
        setIntElement(term2080, 6, 1024134939);
        setIntElement(term2080, 7, 109078154);
        setField(term2078, term2078.getClass(), "vertices", term2080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomChordalGraphGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createRandomSubtree", argTypes, term2078, args);
    }

};


