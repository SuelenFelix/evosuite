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

public class Booking_withShow_5683868371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300;
     Object term327;

    public Booking_withShow_5683868371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term325 = new Integer(1162663216);
        term300 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term301 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term302 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term302, term302.getClass(), "title", "NRdvgJlhkX");
        setField(term301, term301.getClass(), "movie", term302);
        setIntField(term316, term316.getClass(), "year", 2025);
        setShortField(term316, term316.getClass(), "month", (short) 4);
        setShortField(term316, term316.getClass(), "day", (short) 24);
        setField(term315, term315.getClass(), "date", term316);
        setByteField(term320, term320.getClass(), "hour", (byte) 18);
        setByteField(term320, term320.getClass(), "minute", (byte) 11);
        setByteField(term320, term320.getClass(), "second", (byte) 40);
        setIntField(term320, term320.getClass(), "nano", 137454929);
        setField(term315, term315.getClass(), "time", term320);
        setField(term301, term301.getClass(), "dateTime", term315);
        setField(term300, term300.getClass(), "show", term301);
        setField(term300, term300.getClass(), "numSeats", term325);
        term327 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term328 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term341 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term342 = newInstance(Class.forName("java.time.LocalDate"));
        Object term346 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term328, term328.getClass(), "title", "uuaPigETmJ");
        setField(term327, term327.getClass(), "movie", term328);
        setIntField(term342, term342.getClass(), "year", 2024);
        setShortField(term342, term342.getClass(), "month", (short) 1);
        setShortField(term342, term342.getClass(), "day", (short) 24);
        setField(term341, term341.getClass(), "date", term342);
        setByteField(term346, term346.getClass(), "hour", (byte) 20);
        setByteField(term346, term346.getClass(), "minute", (byte) 28);
        setByteField(term346, term346.getClass(), "second", (byte) 39);
        setIntField(term346, term346.getClass(), "nano", 952728177);
        setField(term341, term341.getClass(), "time", term346);
        setField(term327, term327.getClass(), "dateTime", term341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.Booking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.vivek.pattern.models.Show");
        Object[] args = new Object[1];
        args[0] = term327;
        callMethod(klass, "withShow", argTypes, term300, args);
    }

};


