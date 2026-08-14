package com.analytics.covid19.data;

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
import static com.analytics.covid19.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Data_setDate_7008899419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2695;
     Object term2705;

    public Data_setDate_7008899419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2695 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2696 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2696, term2696.getClass(), "year", 2022);
        setShortField(term2696, term2696.getClass(), "month", (short) 11);
        setShortField(term2696, term2696.getClass(), "day", (short) 16);
        setField(term2695, term2695.getClass(), "date", term2696);
        setIntField(term2695, term2695.getClass(), "stat", 1622346318);
        setField(term2695, term2695.getClass(), "NameRef", "");
        setField(term2695, term2695.getClass(), "Region", "");
        term2705 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2705, term2705.getClass(), "year", 2024);
        setShortField(term2705, term2705.getClass(), "month", (short) 8);
        setShortField(term2705, term2705.getClass(), "day", (short) 31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term2705;
        callMethod(klass, "setDate", argTypes, term2695, args);
    }

};


