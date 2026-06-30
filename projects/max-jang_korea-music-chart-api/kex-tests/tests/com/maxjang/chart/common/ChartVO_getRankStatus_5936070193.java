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

public class ChartVO_getRankStatus_5936070193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public ChartVO_getRankStatus_5936070193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term275 = new Integer(-1922583790);
        Integer term289 = new Integer(-616727354);
        term274 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term274, term274.getClass(), "rank", term275);
        setField(term274, term274.getClass(), "rankStatus", "MxlszYVzRf");
        setField(term274, term274.getClass(), "changedRank", term289);
        setField(term274, term274.getClass(), "artistName", "LQFpaHEwXR");
        setField(term274, term274.getClass(), "title", "oVcInYnLWB");
        setField(term274, term274.getClass(), "albumName", "aJlieCFVtF");
        setField(term274, term274.getClass(), "albumArt", "ZiaGIbnzTs");
        setField(term274, term274.getClass(), "songNumber", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRankStatus", argTypes, term274, args);
    }

};


