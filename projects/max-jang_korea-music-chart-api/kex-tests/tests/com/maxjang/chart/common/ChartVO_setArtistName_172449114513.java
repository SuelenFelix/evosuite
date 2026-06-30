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

public class ChartVO_setArtistName_172449114513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1670;

    public ChartVO_setArtistName_172449114513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1671 = new Integer(590364439);
        Integer term1685 = new Integer(865208305);
        term1670 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term1670, term1670.getClass(), "rank", term1671);
        setField(term1670, term1670.getClass(), "rankStatus", "KoyGrUJeJW");
        setField(term1670, term1670.getClass(), "changedRank", term1685);
        setField(term1670, term1670.getClass(), "artistName", "HqBOwkVqjD");
        setField(term1670, term1670.getClass(), "title", "MAcUBcBckh");
        setField(term1670, term1670.getClass(), "albumName", "oVgzLbrsFr");
        setField(term1670, term1670.getClass(), "albumArt", "vQVyKLdtaz");
        setField(term1670, term1670.getClass(), "songNumber", "OWKQODBLzb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wGmYcqUkgE";
        callMethod(klass, "setArtistName", argTypes, term1670, args);
    }

};


