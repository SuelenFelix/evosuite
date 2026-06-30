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

public class ChartVO_setSongNumber_38482796539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3031;

    public ChartVO_setSongNumber_38482796539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3031 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term3031, term3031.getClass(), "rank", null);
        setField(term3031, term3031.getClass(), "rankStatus", null);
        setField(term3031, term3031.getClass(), "changedRank", null);
        setField(term3031, term3031.getClass(), "artistName", null);
        setField(term3031, term3031.getClass(), "title", null);
        setField(term3031, term3031.getClass(), "albumName", null);
        setField(term3031, term3031.getClass(), "albumArt", null);
        setField(term3031, term3031.getClass(), "songNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSongNumber", argTypes, term3031, args);
    }

};


