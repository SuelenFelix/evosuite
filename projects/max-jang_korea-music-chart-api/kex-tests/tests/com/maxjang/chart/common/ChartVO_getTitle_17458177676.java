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

public class ChartVO_getTitle_17458177676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term685;

    public ChartVO_getTitle_17458177676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term686 = new Integer(1725571209);
        Integer term700 = new Integer(-522618178);
        term685 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term685, term685.getClass(), "rank", term686);
        setField(term685, term685.getClass(), "rankStatus", "OWDIEULEFu");
        setField(term685, term685.getClass(), "changedRank", term700);
        setField(term685, term685.getClass(), "artistName", "dWRymuLBtr");
        setField(term685, term685.getClass(), "title", "AijpHYOFuy");
        setField(term685, term685.getClass(), "albumName", "SbAoxhfrkn");
        setField(term685, term685.getClass(), "albumArt", "kuTXqwMtDB");
        setField(term685, term685.getClass(), "songNumber", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term685, args);
    }

};


