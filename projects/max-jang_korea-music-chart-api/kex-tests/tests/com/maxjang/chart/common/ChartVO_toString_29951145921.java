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

public class ChartVO_toString_29951145921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2878;

    public ChartVO_toString_29951145921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2879 = new Integer(-602026508);
        Integer term2893 = new Integer(-157887805);
        term2878 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term2878, term2878.getClass(), "rank", term2879);
        setField(term2878, term2878.getClass(), "rankStatus", "JDaAnsVTGV");
        setField(term2878, term2878.getClass(), "changedRank", term2893);
        setField(term2878, term2878.getClass(), "artistName", "mLUZFTfjle");
        setField(term2878, term2878.getClass(), "title", "xIeFjkHkOe");
        setField(term2878, term2878.getClass(), "albumName", "SdCKLMIYnX");
        setField(term2878, term2878.getClass(), "albumArt", "OJJtVNPyKZ");
        setField(term2878, term2878.getClass(), "songNumber", "AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2878, args);
    }

};


