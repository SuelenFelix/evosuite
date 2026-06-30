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

public class ChartVO_ChartVOBuilder_build_2782096979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4564;

    public ChartVO_ChartVOBuilder_build_2782096979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4565 = new Integer(-1371869594);
        Integer term4579 = new Integer(-2095575670);
        term4564 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term4564, term4564.getClass(), "rank", term4565);
        setField(term4564, term4564.getClass(), "rankStatus", "wzsPSPcRdj");
        setField(term4564, term4564.getClass(), "changedRank", term4579);
        setField(term4564, term4564.getClass(), "artistName", "kGMQdqJYyB");
        setField(term4564, term4564.getClass(), "title", "XJJNClzHRf");
        setField(term4564, term4564.getClass(), "albumName", "HDaezxQfQR");
        setField(term4564, term4564.getClass(), "albumArt", "iikZEapDlu");
        setField(term4564, term4564.getClass(), "songNumber", "nhoHrZfnIN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4564, args);
    }

};


