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

public class ChartVO_hashCode_81027114920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2741;

    public ChartVO_hashCode_81027114920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2742 = new Integer(1962444399);
        Integer term2756 = new Integer(767834723);
        term2741 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term2741, term2741.getClass(), "rank", term2742);
        setField(term2741, term2741.getClass(), "rankStatus", "dpNsDgfPso");
        setField(term2741, term2741.getClass(), "changedRank", term2756);
        setField(term2741, term2741.getClass(), "artistName", "hCWPJQKpdc");
        setField(term2741, term2741.getClass(), "title", "WzMEhMXkKx");
        setField(term2741, term2741.getClass(), "albumName", "XOiDvlDhdc");
        setField(term2741, term2741.getClass(), "albumArt", "AdxvLJhNLe");
        setField(term2741, term2741.getClass(), "songNumber", "lHfTrWKMPk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2741, args);
    }

};


