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

public class Sqlite2FileDanMuFormatExportService_formatExportBySelector_10618597883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12104;
     Object term12114;

    public Sqlite2FileDanMuFormatExportService_formatExportBySelector_10618597883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12105 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12109 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12105, term12105.getClass(), "year", 2015);
        setShortField(term12105, term12105.getClass(), "month", (short) 9);
        setShortField(term12105, term12105.getClass(), "day", (short) 19);
        setField(term12104, term12104.getClass(), "date", term12105);
        setByteField(term12109, term12109.getClass(), "hour", (byte) 9);
        setByteField(term12109, term12109.getClass(), "minute", (byte) 4);
        setByteField(term12109, term12109.getClass(), "second", (byte) 10);
        setIntField(term12109, term12109.getClass(), "nano", 401765865);
        setField(term12104, term12104.getClass(), "time", term12109);
        term12114 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12115 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12119 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term12115, term12115.getClass(), "year", 2015);
        setShortField(term12115, term12115.getClass(), "month", (short) 4);
        setShortField(term12115, term12115.getClass(), "day", (short) 14);
        setField(term12114, term12114.getClass(), "date", term12115);
        setByteField(term12119, term12119.getClass(), "hour", (byte) 18);
        setByteField(term12119, term12119.getClass(), "minute", (byte) 24);
        setByteField(term12119, term12119.getClass(), "second", (byte) 32);
        setIntField(term12119, term12119.getClass(), "nano", 369233818);
        setField(term12114, term12114.getClass(), "time", term12119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.service.Impl.persistence.Sqlite2FileDanMuFormatExportService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = term12104;
        args[1] = term12114;
        callMethod(klass, "formatExportBySelector", argTypes, null, args);
    }

};


