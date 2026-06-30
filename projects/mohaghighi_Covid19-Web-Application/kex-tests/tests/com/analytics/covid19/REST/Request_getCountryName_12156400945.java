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

public class Request_getCountryName_12156400945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854;

    public Request_getCountryName_12156400945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term867 = newInstance(Class.forName("java.time.LocalDate"));
        Object term871 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term854, term854.getClass(), "countryName", "SbAoxhfrkn");
        setIntField(term867, term867.getClass(), "year", 2024);
        setShortField(term867, term867.getClass(), "month", (short) 8);
        setShortField(term867, term867.getClass(), "day", (short) 31);
        setField(term854, term854.getClass(), "fromDate", term867);
        setIntField(term871, term871.getClass(), "year", 2019);
        setShortField(term871, term871.getClass(), "month", (short) 2);
        setShortField(term871, term871.getClass(), "day", (short) 20);
        setField(term854, term854.getClass(), "toDate", term871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountryName", argTypes, term854, args);
    }

};


