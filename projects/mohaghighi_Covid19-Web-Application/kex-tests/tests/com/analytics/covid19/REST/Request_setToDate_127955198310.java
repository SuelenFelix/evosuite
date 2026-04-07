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

public class Request_setToDate_127955198310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1035;
     Object term1056;

    public Request_setToDate_127955198310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1035 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term1048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1052 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1035, term1035.getClass(), "countryName", "aKnKipADSo");
        setIntField(term1048, term1048.getClass(), "year", 2017);
        setShortField(term1048, term1048.getClass(), "month", (short) 6);
        setShortField(term1048, term1048.getClass(), "day", (short) 7);
        setField(term1035, term1035.getClass(), "fromDate", term1048);
        setIntField(term1052, term1052.getClass(), "year", 2023);
        setShortField(term1052, term1052.getClass(), "month", (short) 8);
        setShortField(term1052, term1052.getClass(), "day", (short) 12);
        setField(term1035, term1035.getClass(), "toDate", term1052);
        term1056 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term1056, term1056.getClass(), "year", 2015);
        setShortField(term1056, term1056.getClass(), "month", (short) 9);
        setShortField(term1056, term1056.getClass(), "day", (short) 15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term1056;
        callMethod(klass, "setToDate", argTypes, term1035, args);
    }

};


