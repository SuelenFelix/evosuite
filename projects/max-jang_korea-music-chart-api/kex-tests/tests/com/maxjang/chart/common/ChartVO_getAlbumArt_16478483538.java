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

public class ChartVO_getAlbumArt_16478483538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term959;

    public ChartVO_getAlbumArt_16478483538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term960 = new Integer(1585847225);
        Integer term974 = new Integer(597278769);
        term959 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term959, term959.getClass(), "rank", term960);
        setField(term959, term959.getClass(), "rankStatus", "gGSMzuGICf");
        setField(term959, term959.getClass(), "changedRank", term974);
        setField(term959, term959.getClass(), "artistName", "hxCBltsObl");
        setField(term959, term959.getClass(), "title", "BndsHwAFMv");
        setField(term959, term959.getClass(), "albumName", "GzFkzHGYFt");
        setField(term959, term959.getClass(), "albumArt", "tShwQLRGNe");
        setField(term959, term959.getClass(), "songNumber", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlbumArt", argTypes, term959, args);
    }

};


