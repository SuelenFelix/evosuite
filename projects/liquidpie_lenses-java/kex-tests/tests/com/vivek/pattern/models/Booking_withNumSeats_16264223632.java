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

public class Booking_withNumSeats_16264223632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;
     Object term398;

    public Booking_withNumSeats_16264223632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term396 = new Integer(1484323161);
        term371 = newInstance(Class.forName("com.vivek.pattern.models.Booking"));
        Object term372 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term373 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term373, term373.getClass(), "title", "MxlszYVzRf");
        setField(term372, term372.getClass(), "movie", term373);
        setIntField(term387, term387.getClass(), "year", 2029);
        setShortField(term387, term387.getClass(), "month", (short) 8);
        setShortField(term387, term387.getClass(), "day", (short) 29);
        setField(term386, term386.getClass(), "date", term387);
        setByteField(term391, term391.getClass(), "hour", (byte) 15);
        setByteField(term391, term391.getClass(), "minute", (byte) 50);
        setByteField(term391, term391.getClass(), "second", (byte) 1);
        setIntField(term391, term391.getClass(), "nano", 277971904);
        setField(term386, term386.getClass(), "time", term391);
        setField(term372, term372.getClass(), "dateTime", term386);
        setField(term371, term371.getClass(), "show", term372);
        setField(term371, term371.getClass(), "numSeats", term396);
        term398 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.Booking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term398;
        callMethod(klass, "withNumSeats", argTypes, term371, args);
    }

};


