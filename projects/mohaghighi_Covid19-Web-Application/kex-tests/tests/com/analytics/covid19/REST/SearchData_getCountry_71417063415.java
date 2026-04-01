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

public class SearchData_getCountry_71417063415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199;

    public SearchData_getCountry_71417063415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term199, term199.getClass(), "countryName", "RMFIsYGgne");
        setIntField(term212, term212.getClass(), "year", 2012);
        setShortField(term212, term212.getClass(), "month", (short) 8);
        setShortField(term212, term212.getClass(), "day", (short) 25);
        setField(term199, term199.getClass(), "fromDate", term212);
        setIntField(term216, term216.getClass(), "year", 2016);
        setShortField(term216, term216.getClass(), "month", (short) 11);
        setShortField(term216, term216.getClass(), "day", (short) 29);
        setField(term199, term199.getClass(), "toDate", term216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.SearchData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.analytics.covid19.REST.Request");
        Object[] args = new Object[1];
        args[0] = term199;
        callMethod(klass, "getCountry", argTypes, null, args);
    }

};


