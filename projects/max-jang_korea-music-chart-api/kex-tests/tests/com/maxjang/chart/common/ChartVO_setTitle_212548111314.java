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

public class ChartVO_setTitle_212548111314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829;

    public ChartVO_setTitle_212548111314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1830 = new Integer(-1275173084);
        Integer term1844 = new Integer(-244121226);
        term1829 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term1829, term1829.getClass(), "rank", term1830);
        setField(term1829, term1829.getClass(), "rankStatus", "idgaQsnJpQ");
        setField(term1829, term1829.getClass(), "changedRank", term1844);
        setField(term1829, term1829.getClass(), "artistName", "VgZnGoIFwQ");
        setField(term1829, term1829.getClass(), "title", "jUbSRrkrYZ");
        setField(term1829, term1829.getClass(), "albumName", "bWWfajKbEX");
        setField(term1829, term1829.getClass(), "albumArt", "cAPeiZHKGJ");
        setField(term1829, term1829.getClass(), "songNumber", "LvJFtLBaxj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PHvxnGHptP";
        callMethod(klass, "setTitle", argTypes, term1829, args);
    }

};


