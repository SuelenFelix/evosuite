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

public class ChartVO_getSongNumber_10648931639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1096;

    public ChartVO_getSongNumber_10648931639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1097 = new Integer(-1685132342);
        Integer term1111 = new Integer(-1456670397);
        term1096 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term1096, term1096.getClass(), "rank", term1097);
        setField(term1096, term1096.getClass(), "rankStatus", "xLbjWUgOIL");
        setField(term1096, term1096.getClass(), "changedRank", term1111);
        setField(term1096, term1096.getClass(), "artistName", "jDtqGUpnZN");
        setField(term1096, term1096.getClass(), "title", "nGKItKLYNC");
        setField(term1096, term1096.getClass(), "albumName", "UiUYnPrcCi");
        setField(term1096, term1096.getClass(), "albumArt", "UoYtihxVaS");
        setField(term1096, term1096.getClass(), "songNumber", "JDswTTCZHV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSongNumber", argTypes, term1096, args);
    }

};


