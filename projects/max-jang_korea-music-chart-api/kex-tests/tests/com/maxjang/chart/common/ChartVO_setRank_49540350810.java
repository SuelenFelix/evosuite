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

public class ChartVO_setRank_49540350810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1233;
     Object term1310;

    public ChartVO_setRank_49540350810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1234 = new Integer(1622346318);
        Integer term1248 = new Integer(1048535127);
        term1233 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term1233, term1233.getClass(), "rank", term1234);
        setField(term1233, term1233.getClass(), "rankStatus", "onpbIeEKoi");
        setField(term1233, term1233.getClass(), "changedRank", term1248);
        setField(term1233, term1233.getClass(), "artistName", "YRHGsAkhxb");
        setField(term1233, term1233.getClass(), "title", "ffYhPOzlUs");
        setField(term1233, term1233.getClass(), "albumName", "MLqYREekMl");
        setField(term1233, term1233.getClass(), "albumArt", "ytSBIKXogI");
        setField(term1233, term1233.getClass(), "songNumber", "nHXjMycHlU");
        term1310 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1310;
        callMethod(klass, "setRank", argTypes, term1233, args);
    }

};


