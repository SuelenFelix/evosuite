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

public class Request_getToDate_5711032439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1004;

    public Request_getToDate_5711032439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1004 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term1017 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1021 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1004, term1004.getClass(), "countryName", "nyiiPDVjAc");
        setIntField(term1017, term1017.getClass(), "year", 2012);
        setShortField(term1017, term1017.getClass(), "month", (short) 2);
        setShortField(term1017, term1017.getClass(), "day", (short) 19);
        setField(term1004, term1004.getClass(), "fromDate", term1017);
        setIntField(term1021, term1021.getClass(), "year", 2012);
        setShortField(term1021, term1021.getClass(), "month", (short) 4);
        setShortField(term1021, term1021.getClass(), "day", (short) 19);
        setField(term1004, term1004.getClass(), "toDate", term1021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToDate", argTypes, term1004, args);
    }

};


