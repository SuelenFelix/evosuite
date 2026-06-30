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

public class ChartVO_getChangedRank_15303634624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411;

    public ChartVO_getChangedRank_15303634624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term412 = new Integer(-1955890973);
        Integer term426 = new Integer(-2038273078);
        term411 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term411, term411.getClass(), "rank", term412);
        setField(term411, term411.getClass(), "rankStatus", "HyxfbSQYBe");
        setField(term411, term411.getClass(), "changedRank", term426);
        setField(term411, term411.getClass(), "artistName", "pCTimMblYc");
        setField(term411, term411.getClass(), "title", "hNxWaHcfhY");
        setField(term411, term411.getClass(), "albumName", "RkybSrpybU");
        setField(term411, term411.getClass(), "albumArt", "xOEqzGAmDU");
        setField(term411, term411.getClass(), "songNumber", "eZFUvlxvGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChangedRank", argTypes, term411, args);
    }

};


