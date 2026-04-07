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

public class Request_getToDate_57110324311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7730;

    public Request_getToDate_57110324311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7730 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term7743 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7747 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term7730, term7730.getClass(), "countryName", "DSNsTGYXDF");
        setIntField(term7743, term7743.getClass(), "year", 2028);
        setShortField(term7743, term7743.getClass(), "month", (short) 9);
        setShortField(term7743, term7743.getClass(), "day", (short) 30);
        setField(term7730, term7730.getClass(), "fromDate", term7743);
        setIntField(term7747, term7747.getClass(), "year", 2026);
        setShortField(term7747, term7747.getClass(), "month", (short) 11);
        setShortField(term7747, term7747.getClass(), "day", (short) 29);
        setField(term7730, term7730.getClass(), "toDate", term7747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToDate", argTypes, term7730, args);
    }

};


