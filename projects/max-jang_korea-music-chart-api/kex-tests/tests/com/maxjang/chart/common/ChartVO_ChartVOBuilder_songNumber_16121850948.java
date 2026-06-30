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

public class ChartVO_ChartVOBuilder_songNumber_16121850948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4405;

    public ChartVO_ChartVOBuilder_songNumber_16121850948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4406 = new Integer(1596070772);
        Integer term4420 = new Integer(97029295);
        term4405 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term4405, term4405.getClass(), "rank", term4406);
        setField(term4405, term4405.getClass(), "rankStatus", "vKQukfbJUd");
        setField(term4405, term4405.getClass(), "changedRank", term4420);
        setField(term4405, term4405.getClass(), "artistName", "lFRJFUMVbx");
        setField(term4405, term4405.getClass(), "title", "sZdUNdggUW");
        setField(term4405, term4405.getClass(), "albumName", "OqbwYQfvAe");
        setField(term4405, term4405.getClass(), "albumArt", "tRxZafjqIx");
        setField(term4405, term4405.getClass(), "songNumber", "DhjNLmRMCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PgPzMSEjjX";
        callMethod(klass, "songNumber", argTypes, term4405, args);
    }

};


