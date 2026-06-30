package com.maxjang.chart.common;

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
import static com.maxjang.chart.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ChartVO_ChartVOBuilder_rank_6668961891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3332;
     Object term3409;

    public ChartVO_ChartVOBuilder_rank_6668961891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3333 = new Integer(1876565163);
        Integer term3347 = new Integer(-817164822);
        term3332 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term3332, term3332.getClass(), "rank", term3333);
        setField(term3332, term3332.getClass(), "rankStatus", "mvrkADEgpp");
        setField(term3332, term3332.getClass(), "changedRank", term3347);
        setField(term3332, term3332.getClass(), "artistName", "pXOkjyeIRb");
        setField(term3332, term3332.getClass(), "title", "GgZWSjxjyE");
        setField(term3332, term3332.getClass(), "albumName", "EeBVbzjcCI");
        setField(term3332, term3332.getClass(), "albumArt", "UfQtPRyWRC");
        setField(term3332, term3332.getClass(), "songNumber", "FPvxVzzSvD");
        term3409 = new Integer(-1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3409;
        callMethod(klass, "rank", argTypes, term3332, args);
    }

};


