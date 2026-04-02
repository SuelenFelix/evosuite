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

public class ChartVO_setRankStatus_85611410911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1372;

    public ChartVO_setRankStatus_85611410911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1373 = new Integer(-6029667);
        Integer term1387 = new Integer(-2068769794);
        term1372 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term1372, term1372.getClass(), "rank", term1373);
        setField(term1372, term1372.getClass(), "rankStatus", "ieCtQFdkii");
        setField(term1372, term1372.getClass(), "changedRank", term1387);
        setField(term1372, term1372.getClass(), "artistName", "dEnhdmILtU");
        setField(term1372, term1372.getClass(), "title", "hoicvmsovO");
        setField(term1372, term1372.getClass(), "albumName", "eqJfYWRaEL");
        setField(term1372, term1372.getClass(), "albumArt", "fhkbdRViHi");
        setField(term1372, term1372.getClass(), "songNumber", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kBdSllIBVz";
        callMethod(klass, "setRankStatus", argTypes, term1372, args);
    }

};


