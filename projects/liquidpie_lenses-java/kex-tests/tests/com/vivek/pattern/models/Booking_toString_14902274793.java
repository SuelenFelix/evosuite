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

public class Booking_toString_14902274793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410;

    public Booking_toString_14902274793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term435 = new Integer(-1922583790);
        term410 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term411 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term412 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term425 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term426 = newInstance(Class.forName("java.time.LocalDate"));
        Object term430 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term412, term412.getClass(), "title", "LQFpaHEwXR");
        setField(term411, term411.getClass(), "movie", term412);
        setIntField(term426, term426.getClass(), "year", 2022);
        setShortField(term426, term426.getClass(), "month", (short) 11);
        setShortField(term426, term426.getClass(), "day", (short) 16);
        setField(term425, term425.getClass(), "date", term426);
        setByteField(term430, term430.getClass(), "hour", (byte) 15);
        setByteField(term430, term430.getClass(), "minute", (byte) 54);
        setByteField(term430, term430.getClass(), "second", (byte) 2);
        setIntField(term430, term430.getClass(), "nano", 733274103);
        setField(term425, term425.getClass(), "time", term430);
        setField(term411, term411.getClass(), "dateTime", term425);
        setField(term410, term410.getClass(), "show", term411);
        setField(term410, term410.getClass(), "numSeats", term435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.Booking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term410, args);
    }

};


