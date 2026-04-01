package org.graph4j.metrics;

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
import static org.graph4j.metrics.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DistancesCalculator_calculate_17446161211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10019;

    public DistancesCalculator_calculate_17446161211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10019 = newInstance(Class.forName("org.graph4j.metrics.DistancesCalculator"));
        Object[] term10020 = (Object[]) newArray("[I", 2);
        int[] term10021 = (int[]) newIntArray(2);
        int[] term10024 = (int[]) newIntArray(0);
        setIntElement(term10021, 0, -2078879114);
        setIntElement(term10021, 1, -1186882318);
        setElement(term10020, 0, term10021);
        setElement(term10020, 1, term10024);
        setField(term10019, term10019.getClass(), "dist", term10020);
        setField(term10019, term10019.getClass(), "graph", null);
        setBooleanField(term10019, term10019.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.metrics.DistancesCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "calculate", argTypes, term10019, args);
    }

};


