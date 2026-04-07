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

public class Request_setCountryName_11125892788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7611;

    public Request_setCountryName_11125892788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7611 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term7624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7628 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term7611, term7611.getClass(), "countryName", "PapWxkhEWe");
        setIntField(term7624, term7624.getClass(), "year", 2021);
        setShortField(term7624, term7624.getClass(), "month", (short) 9);
        setShortField(term7624, term7624.getClass(), "day", (short) 30);
        setField(term7611, term7611.getClass(), "fromDate", term7624);
        setIntField(term7628, term7628.getClass(), "year", 2027);
        setShortField(term7628, term7628.getClass(), "month", (short) 8);
        setShortField(term7628, term7628.getClass(), "day", (short) 25);
        setField(term7611, term7611.getClass(), "toDate", term7628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "smnHEqRFRx";
        callMethod(klass, "setCountryName", argTypes, term7611, args);
    }

};


