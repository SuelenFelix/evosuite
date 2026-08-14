package com.example.pdf.util;

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
import static com.example.pdf.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateUtils_format_8789597451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public DateUtils_format_8789597451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28, term28.getClass(), "year", 2012);
        setShortField(term28, term28.getClass(), "month", (short) 8);
        setShortField(term28, term28.getClass(), "day", (short) 25);
        setField(term27, term27.getClass(), "date", term28);
        setByteField(term32, term32.getClass(), "hour", (byte) 5);
        setByteField(term32, term32.getClass(), "minute", (byte) 20);
        setByteField(term32, term32.getClass(), "second", (byte) 50);
        setIntField(term32, term32.getClass(), "nano", 345595912);
        setField(term27, term27.getClass(), "time", term32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.pdf.util.DateUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term27;
        args[1] = "sjlJAEtRrb";
        callMethod(klass, "format", argTypes, null, args);
    }

};


