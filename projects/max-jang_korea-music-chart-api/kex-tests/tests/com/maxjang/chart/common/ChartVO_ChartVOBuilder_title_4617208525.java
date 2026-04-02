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

public class ChartVO_ChartVOBuilder_title_4617208525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3928;

    public ChartVO_ChartVOBuilder_title_4617208525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3929 = new Integer(-1048298087);
        Integer term3943 = new Integer(292681826);
        term3928 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder"));
        setField(term3928, term3928.getClass(), "rank", term3929);
        setField(term3928, term3928.getClass(), "rankStatus", "OYbzXylRWW");
        setField(term3928, term3928.getClass(), "changedRank", term3943);
        setField(term3928, term3928.getClass(), "artistName", "DSNsTGYXDF");
        setField(term3928, term3928.getClass(), "title", "sQvGcVjdEx");
        setField(term3928, term3928.getClass(), "albumName", "rLHAoqXgPh");
        setField(term3928, term3928.getClass(), "albumArt", "zUlRdimJtU");
        setField(term3928, term3928.getClass(), "songNumber", "vwbEQQNQrx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO$ChartVOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xtftXXMbem";
        callMethod(klass, "title", argTypes, term3928, args);
    }

};


