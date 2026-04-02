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

public class Request_getFromDate_9881713649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7664;

    public Request_getFromDate_9881713649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7664 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term7677 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7681 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term7664, term7664.getClass(), "countryName", "XYtryyobou");
        setIntField(term7677, term7677.getClass(), "year", 2014);
        setShortField(term7677, term7677.getClass(), "month", (short) 5);
        setShortField(term7677, term7677.getClass(), "day", (short) 21);
        setField(term7664, term7664.getClass(), "fromDate", term7677);
        setIntField(term7681, term7681.getClass(), "year", 2025);
        setShortField(term7681, term7681.getClass(), "month", (short) 3);
        setShortField(term7681, term7681.getClass(), "day", (short) 8);
        setField(term7664, term7664.getClass(), "toDate", term7681);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromDate", argTypes, term7664, args);
    }

};


