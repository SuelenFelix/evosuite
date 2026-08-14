package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Domain_toString_19255989313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10097;

    public Domain_toString_19255989313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10097 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term10099 = (int[]) newIntArray(5);
        int[] term10105 = (int[]) newIntArray(8);
        setIntField(term10097, term10097.getClass(), "vertex", 724669093);
        setIntElement(term10099, 0, -2005743628);
        setIntElement(term10099, 1, -1204207224);
        setIntElement(term10099, 2, -77932500);
        setIntElement(term10099, 3, -1558194793);
        setIntElement(term10099, 4, -13354986);
        setField(term10097, term10097.getClass(), "values", term10099);
        setIntElement(term10105, 0, -2134459880);
        setIntElement(term10105, 1, -1811405838);
        setIntElement(term10105, 2, 619484749);
        setIntElement(term10105, 3, 490271003);
        setIntElement(term10105, 4, 1541867826);
        setIntElement(term10105, 5, -137176190);
        setIntElement(term10105, 6, 348263044);
        setIntElement(term10105, 7, 1394815305);
        setField(term10097, term10097.getClass(), "positions", term10105);
        setIntField(term10097, term10097.getClass(), "size", -315070279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term10097, args);
    }

};


