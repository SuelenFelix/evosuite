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

public class Request_getFromDate_9881713647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938;

    public Request_getFromDate_9881713647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term938 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term951 = newInstance(Class.forName("java.time.LocalDate"));
        Object term955 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term938, term938.getClass(), "countryName", "xrwlQZdwCp");
        setIntField(term951, term951.getClass(), "year", 2025);
        setShortField(term951, term951.getClass(), "month", (short) 4);
        setShortField(term951, term951.getClass(), "day", (short) 8);
        setField(term938, term938.getClass(), "fromDate", term951);
        setIntField(term955, term955.getClass(), "year", 2012);
        setShortField(term955, term955.getClass(), "month", (short) 9);
        setShortField(term955, term955.getClass(), "day", (short) 11);
        setField(term938, term938.getClass(), "toDate", term955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromDate", argTypes, term938, args);
    }

};


