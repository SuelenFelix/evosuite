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

public class ChartVO_ChartVOBuilder_albumArt_8950285287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4246;

    public ChartVO_ChartVOBuilder_albumArt_8950285287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4247 = new Integer(493620644);
        Integer term4261 = new Integer(1328271830);
        term4246 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term4246, term4246.getClass(), "rank", term4247);
        setField(term4246, term4246.getClass(), "rankStatus", "kVEZMHmRtR");
        setField(term4246, term4246.getClass(), "changedRank", term4261);
        setField(term4246, term4246.getClass(), "artistName", "ekxGuOYIwi");
        setField(term4246, term4246.getClass(), "title", "RbVQXSpxXy");
        setField(term4246, term4246.getClass(), "albumName", "YpJbIgJWWv");
        setField(term4246, term4246.getClass(), "albumArt", "JppkknKVOw");
        setField(term4246, term4246.getClass(), "songNumber", "iljANwuEjk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kNqaJKIATy";
        callMethod(klass, "albumArt", argTypes, term4246, args);
    }

};


