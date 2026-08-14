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

public class RandomDAGGenerator_getTopologicalOrdering_17862871753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2726;

    public RandomDAGGenerator_getTopologicalOrdering_17862871753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2726 = newInstance(Class.forName("org.graph4j.generators.RandomDAGGenerator"));
        int[] term2728 = (int[]) newIntArray(3);
        int[] term2732 = (int[]) newIntArray(0);
        setDoubleField(term2726, term2726.getClass(), "edgeProbability", 0.6767213143579776);
        setIntElement(term2728, 0, -1911972560);
        setIntElement(term2728, 1, -642716895);
        setIntElement(term2728, 2, 1743398246);
        setField(term2726, term2726.getClass(), "ordering", term2728);
        setField(term2726, term2726.getClass(), "vertices", term2732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomDAGGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTopologicalOrdering", argTypes, term2726, args);
    }

};


