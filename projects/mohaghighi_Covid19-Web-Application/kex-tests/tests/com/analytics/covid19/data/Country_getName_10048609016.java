package com.analytics.covid19.data;

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
import static com.analytics.covid19.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class Country_getName_10048609016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1404;

    public Country_getName_10048609016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1405 = new Long(6811161968424632369L);
        ArrayList term1467 = new ArrayList();
        term1404 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1404, term1404.getClass(), "id", term1405);
        setField(term1404, term1404.getClass(), "name", "YRHGsAkhxb");
        setField(term1404, term1404.getClass(), "RName", "ffYhPOzlUs");
        setField(term1404, term1404.getClass(), "Region", "MLqYREekMl");
        setField(term1404, term1404.getClass(), "Lat", "ytSBIKXogI");
        setField(term1404, term1404.getClass(), "Long", "nHXjMycHlU");
        setField(term1404, term1404.getClass(), "DataSet", term1467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1404, args);
    }

};


