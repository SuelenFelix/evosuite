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

public class ChartVO_setAlbumArt_6150591316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2147;

    public ChartVO_setAlbumArt_6150591316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2148 = new Integer(-73683645);
        Integer term2162 = new Integer(-226514366);
        term2147 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term2147, term2147.getClass(), "rank", term2148);
        setField(term2147, term2147.getClass(), "rankStatus", "jiKYgYHqIS");
        setField(term2147, term2147.getClass(), "changedRank", term2162);
        setField(term2147, term2147.getClass(), "artistName", "DfISiziTgG");
        setField(term2147, term2147.getClass(), "title", "XqgfKFvPSD");
        setField(term2147, term2147.getClass(), "albumName", "JiVRgTZvKc");
        setField(term2147, term2147.getClass(), "albumArt", "XPKmummaqg");
        setField(term2147, term2147.getClass(), "songNumber", "BKLfkLiZTH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPpkrGcPRr";
        callMethod(klass, "setAlbumArt", argTypes, term2147, args);
    }

};


