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

public class SearchData_getAllDataByDate_171317211219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323;

    public SearchData_getAllDataByDate_171317211219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term336 = newInstance(Class.forName("java.time.LocalDate"));
        Object term340 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term323, term323.getClass(), "countryName", "LQFpaHEwXR");
        setIntField(term336, term336.getClass(), "year", 2022);
        setShortField(term336, term336.getClass(), "month", (short) 2);
        setShortField(term336, term336.getClass(), "day", (short) 25);
        setField(term323, term323.getClass(), "fromDate", term336);
        setIntField(term340, term340.getClass(), "year", 2017);
        setShortField(term340, term340.getClass(), "month", (short) 7);
        setShortField(term340, term340.getClass(), "day", (short) 22);
        setField(term323, term323.getClass(), "toDate", term340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.SearchData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.analytics.covid19.REST.Request");
        Object[] args = new Object[1];
        args[0] = term323;
        callMethod(klass, "getAllDataByDate", argTypes, null, args);
    }

};


