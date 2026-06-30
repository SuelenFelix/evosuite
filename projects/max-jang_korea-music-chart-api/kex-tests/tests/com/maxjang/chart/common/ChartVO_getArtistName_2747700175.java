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

public class ChartVO_getArtistName_2747700175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548;

    public ChartVO_getArtistName_2747700175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term549 = new Integer(1227103734);
        Integer term563 = new Integer(-1339778481);
        term548 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term548, term548.getClass(), "rank", term549);
        setField(term548, term548.getClass(), "rankStatus", "BYqFIqCKAV");
        setField(term548, term548.getClass(), "changedRank", term563);
        setField(term548, term548.getClass(), "artistName", "vrQLuWIDJX");
        setField(term548, term548.getClass(), "title", "flxyYxBRtu");
        setField(term548, term548.getClass(), "albumName", "OclPbYPkcH");
        setField(term548, term548.getClass(), "albumArt", "IoAlmYsBwc");
        setField(term548, term548.getClass(), "songNumber", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getArtistName", argTypes, term548, args);
    }

};


