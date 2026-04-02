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

public class Request_setFromDate_59342966610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7695;
     Object term7716;

    public Request_setFromDate_59342966610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7695 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term7708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7712 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term7695, term7695.getClass(), "countryName", "OYbzXylRWW");
        setIntField(term7708, term7708.getClass(), "year", 2025);
        setShortField(term7708, term7708.getClass(), "month", (short) 11);
        setShortField(term7708, term7708.getClass(), "day", (short) 1);
        setField(term7695, term7695.getClass(), "fromDate", term7708);
        setIntField(term7712, term7712.getClass(), "year", 2023);
        setShortField(term7712, term7712.getClass(), "month", (short) 9);
        setShortField(term7712, term7712.getClass(), "day", (short) 22);
        setField(term7695, term7695.getClass(), "toDate", term7712);
        term7716 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term7716, term7716.getClass(), "year", 2013);
        setShortField(term7716, term7716.getClass(), "month", (short) 3);
        setShortField(term7716, term7716.getClass(), "day", (short) 8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term7716;
        callMethod(klass, "setFromDate", argTypes, term7695, args);
    }

};


