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

public class Request_getCountryName_12156400947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7580;

    public Request_getCountryName_12156400947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7580 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term7593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7597 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term7580, term7580.getClass(), "countryName", "WzFopsaDuG");
        setIntField(term7593, term7593.getClass(), "year", 2022);
        setShortField(term7593, term7593.getClass(), "month", (short) 10);
        setShortField(term7593, term7593.getClass(), "day", (short) 18);
        setField(term7580, term7580.getClass(), "fromDate", term7593);
        setIntField(term7597, term7597.getClass(), "year", 2015);
        setShortField(term7597, term7597.getClass(), "month", (short) 3);
        setShortField(term7597, term7597.getClass(), "day", (short) 10);
        setField(term7580, term7580.getClass(), "toDate", term7597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountryName", argTypes, term7580, args);
    }

};


