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

public class ChartVO_setAlbumName_137593865115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1988;

    public ChartVO_setAlbumName_137593865115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1989 = new Integer(-203030934);
        Integer term2003 = new Integer(-1179120542);
        term1988 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term1988, term1988.getClass(), "rank", term1989);
        setField(term1988, term1988.getClass(), "rankStatus", "TimdotUuNC");
        setField(term1988, term1988.getClass(), "changedRank", term2003);
        setField(term1988, term1988.getClass(), "artistName", "PkWMRdJcBb");
        setField(term1988, term1988.getClass(), "title", "jSpAteRute");
        setField(term1988, term1988.getClass(), "albumName", "swZVeJAxjt");
        setField(term1988, term1988.getClass(), "albumArt", "xOcJIiQQDu");
        setField(term1988, term1988.getClass(), "songNumber", "GVizqqzXpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JqXGgAhZPl";
        callMethod(klass, "setAlbumName", argTypes, term1988, args);
    }

};


