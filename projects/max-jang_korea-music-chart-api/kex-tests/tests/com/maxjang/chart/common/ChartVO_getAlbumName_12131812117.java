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

public class ChartVO_getAlbumName_12131812117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822;

    public ChartVO_getAlbumName_12131812117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term823 = new Integer(1134449235);
        Integer term837 = new Integer(-883034806);
        term822 = newInstance(Class.forName("com.maxjang.chart.common.ChartVO"));
        setField(term822, term822.getClass(), "rank", term823);
        setField(term822, term822.getClass(), "rankStatus", "xrwlQZdwCp");
        setField(term822, term822.getClass(), "changedRank", term837);
        setField(term822, term822.getClass(), "artistName", "IDCWpPLRkE");
        setField(term822, term822.getClass(), "title", "nyiiPDVjAc");
        setField(term822, term822.getClass(), "albumName", "aKnKipADSo");
        setField(term822, term822.getClass(), "albumArt", "wSQxaModmm");
        setField(term822, term822.getClass(), "songNumber", "UlajhuVLaP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maxjang.chart.common.ChartVO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlbumName", argTypes, term822, args);
    }

};


