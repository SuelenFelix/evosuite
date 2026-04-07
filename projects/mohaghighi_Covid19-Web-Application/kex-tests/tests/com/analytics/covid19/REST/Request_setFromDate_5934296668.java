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

public class Request_setFromDate_5934296668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term969;
     Object term990;

    public Request_setFromDate_5934296668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term969 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term986 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term969, term969.getClass(), "countryName", "IDCWpPLRkE");
        setIntField(term982, term982.getClass(), "year", 2017);
        setShortField(term982, term982.getClass(), "month", (short) 8);
        setShortField(term982, term982.getClass(), "day", (short) 7);
        setField(term969, term969.getClass(), "fromDate", term982);
        setIntField(term986, term986.getClass(), "year", 2021);
        setShortField(term986, term986.getClass(), "month", (short) 9);
        setShortField(term986, term986.getClass(), "day", (short) 6);
        setField(term969, term969.getClass(), "toDate", term986);
        term990 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term990, term990.getClass(), "year", 2025);
        setShortField(term990, term990.getClass(), "month", (short) 2);
        setShortField(term990, term990.getClass(), "day", (short) 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term990;
        callMethod(klass, "setFromDate", argTypes, term969, args);
    }

};


