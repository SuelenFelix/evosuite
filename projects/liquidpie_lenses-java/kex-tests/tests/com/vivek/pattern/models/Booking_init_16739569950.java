package com.vivek.pattern.models;

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
import static com.vivek.pattern.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Booking_init_16739569950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;
     Object term288;

    public Booking_init_16739569950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term265 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term265, term265.getClass(), "title", "RMFIsYGgne");
        setField(term264, term264.getClass(), "movie", term265);
        setIntField(term279, term279.getClass(), "year", 2026);
        setShortField(term279, term279.getClass(), "month", (short) 12);
        setShortField(term279, term279.getClass(), "day", (short) 14);
        setField(term278, term278.getClass(), "date", term279);
        setByteField(term283, term283.getClass(), "hour", (byte) 16);
        setByteField(term283, term283.getClass(), "minute", (byte) 34);
        setByteField(term283, term283.getClass(), "second", (byte) 9);
        setIntField(term283, term283.getClass(), "nano", 518326996);
        setField(term278, term278.getClass(), "time", term283);
        setField(term264, term264.getClass(), "dateTime", term278);
        term288 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.Booking");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.vivek.pattern.models.Show");
        argTypes[1] = Class.forName("java.lang.Integer");
        Object[] args = new Object[2];
        args[0] = term264;
        args[1] = term288;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


