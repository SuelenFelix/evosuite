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

public class ChartVO_getRank_75801731024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3016;

    public ChartVO_getRank_75801731024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3016 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term3016, term3016.getClass(), "rank", null);
        setField(term3016, term3016.getClass(), "rankStatus", null);
        setField(term3016, term3016.getClass(), "changedRank", null);
        setField(term3016, term3016.getClass(), "artistName", null);
        setField(term3016, term3016.getClass(), "title", null);
        setField(term3016, term3016.getClass(), "albumName", null);
        setField(term3016, term3016.getClass(), "albumArt", null);
        setField(term3016, term3016.getClass(), "songNumber", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term3016, args);
    }

};


