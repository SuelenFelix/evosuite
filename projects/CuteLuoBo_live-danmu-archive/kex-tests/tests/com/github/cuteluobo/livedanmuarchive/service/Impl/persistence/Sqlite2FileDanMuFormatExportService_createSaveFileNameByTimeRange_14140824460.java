package com.github.cuteluobo.livedanmuarchive.service.Impl.persistence;

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
import static com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Sqlite2FileDanMuFormatExportService_createSaveFileNameByTimeRange_14140824460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11667;
     Object term11677;

    public Sqlite2FileDanMuFormatExportService_createSaveFileNameByTimeRange_14140824460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11672 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11668, term11668.getClass(), "year", 2012);
        setShortField(term11668, term11668.getClass(), "month", (short) 8);
        setShortField(term11668, term11668.getClass(), "day", (short) 25);
        setField(term11667, term11667.getClass(), "date", term11668);
        setByteField(term11672, term11672.getClass(), "hour", (byte) 5);
        setByteField(term11672, term11672.getClass(), "minute", (byte) 20);
        setByteField(term11672, term11672.getClass(), "second", (byte) 50);
        setIntField(term11672, term11672.getClass(), "nano", 345595912);
        setField(term11667, term11667.getClass(), "time", term11672);
        term11677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11682 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term11678, term11678.getClass(), "year", 2021);
        setShortField(term11678, term11678.getClass(), "month", (short) 1);
        setShortField(term11678, term11678.getClass(), "day", (short) 18);
        setField(term11677, term11677.getClass(), "date", term11678);
        setByteField(term11682, term11682.getClass(), "hour", (byte) 13);
        setByteField(term11682, term11682.getClass(), "minute", (byte) 38);
        setByteField(term11682, term11682.getClass(), "second", (byte) 26);
        setIntField(term11682, term11682.getClass(), "nano", 544608644);
        setField(term11677, term11677.getClass(), "time", term11682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2FileDanMuFormatExportService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = term11667;
        args[1] = term11677;
        callMethod(klass, "createSaveFileNameByTimeRange", argTypes, null, args);
    }

};


