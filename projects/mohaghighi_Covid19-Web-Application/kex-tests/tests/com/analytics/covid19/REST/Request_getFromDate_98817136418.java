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

public class Request_getFromDate_98817136418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1072;

    public Request_getFromDate_98817136418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1072 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        setField(term1072, term1072.getClass(), "countryName", null);
        setField(term1072, term1072.getClass(), "fromDate", null);
        setField(term1072, term1072.getClass(), "toDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromDate", argTypes, term1072, args);
    }

};


