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

public class ChartVO_ChartVOBuilder_changedRank_13757028893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3630;
     Object term3707;

    public ChartVO_ChartVOBuilder_changedRank_13757028893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3631 = new Integer(-14890619);
        Integer term3645 = new Integer(1632125673);
        term3630 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term3630, term3630.getClass(), "rank", term3631);
        setField(term3630, term3630.getClass(), "rankStatus", "aNWLJdrZMq");
        setField(term3630, term3630.getClass(), "changedRank", term3645);
        setField(term3630, term3630.getClass(), "artistName", "HHmNoYxIGj");
        setField(term3630, term3630.getClass(), "title", "PtirvZmsGt");
        setField(term3630, term3630.getClass(), "albumName", "HWkpTmtlrc");
        setField(term3630, term3630.getClass(), "albumArt", "hMmaoREuCK");
        setField(term3630, term3630.getClass(), "songNumber", "VeDtgDzGAN");
        term3707 = new Integer(454281060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3707;
        callMethod(klass, "changedRank", argTypes, term3630, args);
    }

};


