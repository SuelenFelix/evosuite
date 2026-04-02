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

public class ChartVO_setSongNumber_38482796517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2306;

    public ChartVO_setSongNumber_38482796517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2307 = new Integer(1193880199);
        Integer term2321 = new Integer(-1087774327);
        term2306 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term2306, term2306.getClass(), "rank", term2307);
        setField(term2306, term2306.getClass(), "rankStatus", "sEccwbJKYE");
        setField(term2306, term2306.getClass(), "changedRank", term2321);
        setField(term2306, term2306.getClass(), "artistName", "AWRooQKkdW");
        setField(term2306, term2306.getClass(), "title", "vjxIhXHxGR");
        setField(term2306, term2306.getClass(), "albumName", "QXzGXbEXMu");
        setField(term2306, term2306.getClass(), "albumArt", "qxSDVejjiY");
        setField(term2306, term2306.getClass(), "songNumber", "xBsXSDjXYK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEnIVFtZuQ";
        callMethod(klass, "setSongNumber", argTypes, term2306, args);
    }

};


