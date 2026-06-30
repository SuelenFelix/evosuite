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

public class ChartVO_getRank_7580173102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;

    public ChartVO_getRank_7580173102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term138 = new Integer(1484323161);
        Integer term152 = new Integer(391863371);
        term137 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term137, term137.getClass(), "rank", term138);
        setField(term137, term137.getClass(), "rankStatus", "SzjVpOQTyS");
        setField(term137, term137.getClass(), "changedRank", term152);
        setField(term137, term137.getClass(), "artistName", "MjGYSRKTNF");
        setField(term137, term137.getClass(), "title", "hRNSzYYIrc");
        setField(term137, term137.getClass(), "albumName", "RMFIsYGgne");
        setField(term137, term137.getClass(), "albumArt", "NRdvgJlhkX");
        setField(term137, term137.getClass(), "songNumber", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term137, args);
    }

};


