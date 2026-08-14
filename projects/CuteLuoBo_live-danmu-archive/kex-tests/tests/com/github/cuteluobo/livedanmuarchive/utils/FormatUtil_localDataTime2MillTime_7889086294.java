package com.github.cuteluobo.livedanmuarchive.utils;

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
import static com.github.cuteluobo.livedanmuarchive.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FormatUtil_localDataTime2MillTime_7889086294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term917;

    public FormatUtil_localDataTime2MillTime_7889086294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term922 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term918, term918.getClass(), "year", 2012);
        setShortField(term918, term918.getClass(), "month", (short) 8);
        setShortField(term918, term918.getClass(), "day", (short) 25);
        setField(term917, term917.getClass(), "date", term918);
        setByteField(term922, term922.getClass(), "hour", (byte) 5);
        setByteField(term922, term922.getClass(), "minute", (byte) 20);
        setByteField(term922, term922.getClass(), "second", (byte) 50);
        setIntField(term922, term922.getClass(), "nano", 345595912);
        setField(term917, term917.getClass(), "time", term922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.utils.FormatUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term917;
        callMethod(klass, "localDataTime2MillTime", argTypes, null, args);
    }

};


