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

public class ChartVO_toString_29951145943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3035;

    public ChartVO_toString_29951145943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3035 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term3035, term3035.getClass(), "rank", null);
        setField(term3035, term3035.getClass(), "rankStatus", null);
        setField(term3035, term3035.getClass(), "changedRank", null);
        setField(term3035, term3035.getClass(), "artistName", null);
        setField(term3035, term3035.getClass(), "title", null);
        setField(term3035, term3035.getClass(), "albumName", null);
        setField(term3035, term3035.getClass(), "albumArt", null);
        setField(term3035, term3035.getClass(), "songNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3035, args);
    }

};


