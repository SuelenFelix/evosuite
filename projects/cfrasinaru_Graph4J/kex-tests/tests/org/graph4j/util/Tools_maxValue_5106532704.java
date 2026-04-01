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
import java.lang.Object;

public class Tools_maxValue_5106532704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184810;

    public Tools_maxValue_5106532704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184810 = (Object[]) newArray("[D", 3);
        double[] term184811 = (double[]) newDoubleArray(7);
        double[] term184819 = (double[]) newDoubleArray(1);
        double[] term184821 = (double[]) newDoubleArray(1);
        setDoubleElement(term184811, 0, 0.13779609132039605);
        setDoubleElement(term184811, 1, 0.9945628006467517);
        setDoubleElement(term184811, 2, 0.18738416333517094);
        setDoubleElement(term184811, 3, 0.8213379073674529);
        setDoubleElement(term184811, 4, 0.14443819559546767);
        setDoubleElement(term184811, 5, 0.4662612026176247);
        setDoubleElement(term184811, 6, 0.21679441236817487);
        setElement(term184810, 0, term184811);
        setDoubleElement(term184819, 0, 0.0652918264029082);
        setElement(term184810, 1, term184819);
        setDoubleElement(term184821, 0, 0.7968847793595243);
        setElement(term184810, 2, term184821);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term184810;
        callMethod(klass, "maxValue", argTypes, null, args);
    }

};


