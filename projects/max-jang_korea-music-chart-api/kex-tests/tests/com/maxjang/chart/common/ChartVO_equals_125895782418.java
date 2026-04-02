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

public class ChartVO_equals_125895782418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2465;
     Object term2542;

    public ChartVO_equals_125895782418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2466 = new Integer(-1530420153);
        Integer term2480 = new Integer(-469968304);
        term2465 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term2465, term2465.getClass(), "rank", term2466);
        setField(term2465, term2465.getClass(), "rankStatus", "ZVecLZMLHF");
        setField(term2465, term2465.getClass(), "changedRank", term2480);
        setField(term2465, term2465.getClass(), "artistName", "fztQhjqwdP");
        setField(term2465, term2465.getClass(), "title", "eVpkWxjuki");
        setField(term2465, term2465.getClass(), "albumName", "SJiQaLvSKv");
        setField(term2465, term2465.getClass(), "albumArt", "OEXDRUKcFl");
        setField(term2465, term2465.getClass(), "songNumber", "RYdKCNNMBR");
        term2542 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2542;
        callMethod(klass, "equals", argTypes, term2465, args);
    }

};


