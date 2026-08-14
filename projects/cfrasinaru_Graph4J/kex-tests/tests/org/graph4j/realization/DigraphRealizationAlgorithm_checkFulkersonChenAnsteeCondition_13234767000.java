package org.graph4j.realization;

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
import static org.graph4j.realization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DigraphRealizationAlgorithm_checkFulkersonChenAnsteeCondition_13234767000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term91;

    public DigraphRealizationAlgorithm_checkFulkersonChenAnsteeCondition_13234767000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = (int[]) newIntArray(7);
        setIntElement(term83, 0, -1179120542);
        setIntElement(term83, 1, -73683645);
        setIntElement(term83, 2, -226514366);
        setIntElement(term83, 3, 1193880199);
        setIntElement(term83, 4, -1087774327);
        setIntElement(term83, 5, -1530420153);
        setIntElement(term83, 6, -469968304);
        term91 = (int[]) newIntArray(1);
        setIntElement(term91, 0, -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.realization.DigraphRealizationAlgorithm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term83;
        args[1] = term91;
        callMethod(klass, "checkFulkersonChenAnsteeCondition", argTypes, null, args);
    }

};


