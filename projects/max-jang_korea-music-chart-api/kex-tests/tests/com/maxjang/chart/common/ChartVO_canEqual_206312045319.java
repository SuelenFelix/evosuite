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

public class ChartVO_canEqual_206312045319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2603;
     Object term2680;

    public ChartVO_canEqual_206312045319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2604 = new Integer(-1145578966);
        Integer term2618 = new Integer(679763016);
        term2603 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term2603, term2603.getClass(), "rank", term2604);
        setField(term2603, term2603.getClass(), "rankStatus", "yGtHPyvYiQ");
        setField(term2603, term2603.getClass(), "changedRank", term2618);
        setField(term2603, term2603.getClass(), "artistName", "MvRIxilFMJ");
        setField(term2603, term2603.getClass(), "title", "iNwOJRBEjp");
        setField(term2603, term2603.getClass(), "albumName", "XylxrMBraH");
        setField(term2603, term2603.getClass(), "albumArt", "pORebkoRdD");
        setField(term2603, term2603.getClass(), "songNumber", "mXGCWJDOqA");
        term2680 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2680;
        callMethod(klass, "canEqual", argTypes, term2603, args);
    }

};


