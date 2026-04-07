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

public class Request_setCountryName_11125892786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term885;

    public Request_setCountryName_11125892786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term885 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term898 = newInstance(Class.forName("java.time.LocalDate"));
        Object term902 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term885, term885.getClass(), "countryName", "kuTXqwMtDB");
        setIntField(term898, term898.getClass(), "year", 2027);
        setShortField(term898, term898.getClass(), "month", (short) 3);
        setShortField(term898, term898.getClass(), "day", (short) 14);
        setField(term885, term885.getClass(), "fromDate", term898);
        setIntField(term902, term902.getClass(), "year", 2018);
        setShortField(term902, term902.getClass(), "month", (short) 9);
        setShortField(term902, term902.getClass(), "day", (short) 27);
        setField(term885, term885.getClass(), "toDate", term902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "setCountryName", argTypes, term885, args);
    }

};


