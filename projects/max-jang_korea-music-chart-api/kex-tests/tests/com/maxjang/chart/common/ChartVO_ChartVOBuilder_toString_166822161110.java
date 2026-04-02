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

public class ChartVO_ChartVOBuilder_toString_166822161110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4701;

    public ChartVO_ChartVOBuilder_toString_166822161110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term4702 = new Integer(1225272962);
        Integer term4716 = new Integer(1324040357);
        term4701 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term4701, term4701.getClass(), "rank", term4702);
        setField(term4701, term4701.getClass(), "rankStatus", "ZkMALXpEAZ");
        setField(term4701, term4701.getClass(), "changedRank", term4716);
        setField(term4701, term4701.getClass(), "artistName", "tXfQjSqDzN");
        setField(term4701, term4701.getClass(), "title", "BjugTaMcxJ");
        setField(term4701, term4701.getClass(), "albumName", "vGiuZVPJNH");
        setField(term4701, term4701.getClass(), "albumArt", "tlzpzIjMib");
        setField(term4701, term4701.getClass(), "songNumber", "AZdLeSugwv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4701, args);
    }

};


