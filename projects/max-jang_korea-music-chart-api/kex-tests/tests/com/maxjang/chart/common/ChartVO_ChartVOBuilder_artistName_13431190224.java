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

public class ChartVO_ChartVOBuilder_artistName_13431190224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3769;

    public ChartVO_ChartVOBuilder_artistName_13431190224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3770 = new Integer(-1786399638);
        Integer term3784 = new Integer(2055867847);
        term3769 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term3769, term3769.getClass(), "rank", term3770);
        setField(term3769, term3769.getClass(), "rankStatus", "aWYOWZFyaX");
        setField(term3769, term3769.getClass(), "changedRank", term3784);
        setField(term3769, term3769.getClass(), "artistName", "BRIVNtfUWU");
        setField(term3769, term3769.getClass(), "title", "DbiCVtPPCT");
        setField(term3769, term3769.getClass(), "albumName", "WzFopsaDuG");
        setField(term3769, term3769.getClass(), "albumArt", "PapWxkhEWe");
        setField(term3769, term3769.getClass(), "songNumber", "smnHEqRFRx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XYtryyobou";
        callMethod(klass, "artistName", argTypes, term3769, args);
    }

};


