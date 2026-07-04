package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Facility_setBuyTime_18904614218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39379;
     Object term39416;

    public Facility_setBuyTime_18904614218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term39380 = new Integer(-1368198865);
        term39379 = newInstance(Class.forName("com.org.model.Facility"));
        Object term39406 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39407 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39411 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term39379, term39379.getClass(), "id", term39380);
        setField(term39379, term39379.getClass(), "facilityName", "OFdIUrEOJR");
        setField(term39379, term39379.getClass(), "facilityState", "xUODPydxaT");
        setIntField(term39407, term39407.getClass(), "year", 2018);
        setShortField(term39407, term39407.getClass(), "month", (short) 6);
        setShortField(term39407, term39407.getClass(), "day", (short) 29);
        setField(term39406, term39406.getClass(), "date", term39407);
        setByteField(term39411, term39411.getClass(), "hour", (byte) 0);
        setByteField(term39411, term39411.getClass(), "minute", (byte) 24);
        setByteField(term39411, term39411.getClass(), "second", (byte) 5);
        setIntField(term39411, term39411.getClass(), "nano", 130907665);
        setField(term39406, term39406.getClass(), "time", term39411);
        setField(term39379, term39379.getClass(), "buyTime", term39406);
        term39416 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term39417 = newInstance(Class.forName("java.time.LocalDate"));
        Object term39421 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term39417, term39417.getClass(), "year", 2023);
        setShortField(term39417, term39417.getClass(), "month", (short) 4);
        setShortField(term39417, term39417.getClass(), "day", (short) 2);
        setField(term39416, term39416.getClass(), "date", term39417);
        setByteField(term39421, term39421.getClass(), "hour", (byte) 1);
        setByteField(term39421, term39421.getClass(), "minute", (byte) 39);
        setByteField(term39421, term39421.getClass(), "second", (byte) 47);
        setIntField(term39421, term39421.getClass(), "nano", 89556491);
        setField(term39416, term39416.getClass(), "time", term39421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.Facility");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term39416;
        callMethod(klass, "setBuyTime", argTypes, term39379, args);
    }

};


