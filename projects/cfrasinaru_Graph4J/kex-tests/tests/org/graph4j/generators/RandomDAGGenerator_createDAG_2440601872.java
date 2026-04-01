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

public class RandomDAGGenerator_createDAG_2440601872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2700;

    public RandomDAGGenerator_createDAG_2440601872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2700 = newInstance(Class.forName("org.graph4j.generators.RandomDAGGenerator"));
        int[] term2702 = (int[]) newIntArray(5);
        int[] term2708 = (int[]) newIntArray(6);
        setDoubleField(term2700, term2700.getClass(), "edgeProbability", 0.6047137830113202);
        setIntElement(term2702, 0, -2009613557);
        setIntElement(term2702, 1, 654195547);
        setIntElement(term2702, 2, 1622857008);
        setIntElement(term2702, 3, 934338954);
        setIntElement(term2702, 4, 598635505);
        setField(term2700, term2700.getClass(), "ordering", term2702);
        setIntElement(term2708, 0, -944986533);
        setIntElement(term2708, 1, 1894454926);
        setIntElement(term2708, 2, 1415142780);
        setIntElement(term2708, 3, -574105759);
        setIntElement(term2708, 4, -1165271567);
        setIntElement(term2708, 5, 376834234);
        setField(term2700, term2700.getClass(), "vertices", term2708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomDAGGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDAG", argTypes, term2700, args);
    }

};


