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
import java.lang.Integer;

public class Country_getDataForDate_208063676439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3357;
     Object term3358;

    public Country_getDataForDate_208063676439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3357 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term3357, term3357.getClass(), "id", null);
        setField(term3357, term3357.getClass(), "name", null);
        setField(term3357, term3357.getClass(), "RName", null);
        setField(term3357, term3357.getClass(), "Region", null);
        setField(term3357, term3357.getClass(), "Lat", null);
        setField(term3357, term3357.getClass(), "Long", null);
        setField(term3357, term3357.getClass(), "DataSet", null);
        term3358 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3358;
        callMethod(klass, "getDataForDate", argTypes, term3357, args);
    }

};


