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

public class ChartVO_ChartVOBuilder_rankStatus_20834712382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3471;

    public ChartVO_ChartVOBuilder_rankStatus_20834712382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3472 = new Integer(-1968847291);
        Integer term3486 = new Integer(579005622);
        term3471 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term3471, term3471.getClass(), "rank", term3472);
        setField(term3471, term3471.getClass(), "rankStatus", "WHcwFgsGFC");
        setField(term3471, term3471.getClass(), "changedRank", term3486);
        setField(term3471, term3471.getClass(), "artistName", "HzqpegHiRq");
        setField(term3471, term3471.getClass(), "title", "jwsfVjMoJT");
        setField(term3471, term3471.getClass(), "albumName", "ZfdXfCCFDf");
        setField(term3471, term3471.getClass(), "albumArt", "MwwjNtdOFT");
        setField(term3471, term3471.getClass(), "songNumber", "VYkqXKVlAJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XkIoWJRNwN";
        callMethod(klass, "rankStatus", argTypes, term3471, args);
    }

};


