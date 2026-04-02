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

public class ChartVO_setChangedRank_133988310812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1531;
     Object term1608;

    public ChartVO_setChangedRank_133988310812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1532 = new Integer(-117576464);
        Integer term1546 = new Integer(-1007160944);
        term1531 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term1531, term1531.getClass(), "rank", term1532);
        setField(term1531, term1531.getClass(), "rankStatus", "TJmVBGfTML");
        setField(term1531, term1531.getClass(), "changedRank", term1546);
        setField(term1531, term1531.getClass(), "artistName", "tPlsykYBqO");
        setField(term1531, term1531.getClass(), "title", "bLPjGVBhlX");
        setField(term1531, term1531.getClass(), "albumName", "whBvTVIIlC");
        setField(term1531, term1531.getClass(), "albumArt", "IgRJUzaCwW");
        setField(term1531, term1531.getClass(), "songNumber", "JUmudUmaaV");
        term1608 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1608;
        callMethod(klass, "setChangedRank", argTypes, term1531, args);
    }

};


