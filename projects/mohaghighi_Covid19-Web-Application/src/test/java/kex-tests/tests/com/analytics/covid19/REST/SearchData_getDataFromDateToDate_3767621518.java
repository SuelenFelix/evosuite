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

public class SearchData_getDataFromDateToDate_3767621518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292;

    public SearchData_getDataFromDateToDate_3767621518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term305 = newInstance(Class.forName("java.time.LocalDate"));
        Object term309 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term292, term292.getClass(), "countryName", "MxlszYVzRf");
        setIntField(term305, term305.getClass(), "year", 2015);
        setShortField(term305, term305.getClass(), "month", (short) 4);
        setShortField(term305, term305.getClass(), "day", (short) 14);
        setField(term292, term292.getClass(), "fromDate", term305);
        setIntField(term309, term309.getClass(), "year", 2017);
        setShortField(term309, term309.getClass(), "month", (short) 5);
        setShortField(term309, term309.getClass(), "day", (short) 21);
        setField(term292, term292.getClass(), "toDate", term309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.SearchData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.analytics.covid19.REST.Request");
        Object[] args = new Object[1];
        args[0] = term292;
        callMethod(klass, "getDataFromDateToDate", argTypes, null, args);
    }

};


