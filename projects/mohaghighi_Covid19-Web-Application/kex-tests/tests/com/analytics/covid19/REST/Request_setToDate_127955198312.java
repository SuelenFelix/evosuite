package com.analytics.covid19.REST;

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
import static com.analytics.covid19.REST.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Request_setToDate_127955198312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7761;
     Object term7782;

    public Request_setToDate_127955198312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7761 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term7774 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7778 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term7761, term7761.getClass(), "countryName", "sQvGcVjdEx");
        setIntField(term7774, term7774.getClass(), "year", 2027);
        setShortField(term7774, term7774.getClass(), "month", (short) 2);
        setShortField(term7774, term7774.getClass(), "day", (short) 18);
        setField(term7761, term7761.getClass(), "fromDate", term7774);
        setIntField(term7778, term7778.getClass(), "year", 2028);
        setShortField(term7778, term7778.getClass(), "month", (short) 5);
        setShortField(term7778, term7778.getClass(), "day", (short) 29);
        setField(term7761, term7761.getClass(), "toDate", term7778);
        term7782 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term7782, term7782.getClass(), "year", 2021);
        setShortField(term7782, term7782.getClass(), "month", (short) 8);
        setShortField(term7782, term7782.getClass(), "day", (short) 11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term7782;
        callMethod(klass, "setToDate", argTypes, term7761, args);
    }

};


