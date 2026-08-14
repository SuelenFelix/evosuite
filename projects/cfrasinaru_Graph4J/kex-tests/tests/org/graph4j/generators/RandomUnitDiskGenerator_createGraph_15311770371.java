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

public class RandomUnitDiskGenerator_createGraph_15311770371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2160;

    public RandomUnitDiskGenerator_createGraph_15311770371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2160 = newInstance(Class.forName("org.graph4j.generators.RandomUnitDiskGenerator"));
        int[] term2162 = (int[]) newIntArray(5);
        setDoubleField(term2160, term2160.getClass(), "radius", 0.5804948995371725);
        setIntElement(term2162, 0, 86041387);
        setIntElement(term2162, 1, 1010721666);
        setIntElement(term2162, 2, 27043781);
        setIntElement(term2162, 3, -1367122405);
        setIntElement(term2162, 4, -1703625118);
        setField(term2160, term2160.getClass(), "vertices", term2162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomUnitDiskGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term2160, args);
    }

};


