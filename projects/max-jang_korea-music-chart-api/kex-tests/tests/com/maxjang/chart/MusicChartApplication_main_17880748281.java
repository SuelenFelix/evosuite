package com.maxjang.chart;

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
import static com.maxjang.chart.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MusicChartApplication_main_17880748281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3287;

    public MusicChartApplication_main_17880748281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3287 = (Object[]) newArray("java.lang.String", 5);
        setElement(term3287, 0, "mvrkADEgpp");
        setElement(term3287, 1, "pXOkjyeIRb");
        setElement(term3287, 2, "GgZWSjxjyE");
        setElement(term3287, 3, "EeBVbzjcCI");
        setElement(term3287, 4, "UfQtPRyWRC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.MusicChartApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3287;
        callMethod(klass, "main", argTypes, null, args);
    }

};


