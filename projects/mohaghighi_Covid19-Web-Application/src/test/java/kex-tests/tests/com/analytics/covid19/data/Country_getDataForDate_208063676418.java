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
import java.lang.Integer;

public class Country_getDataForDate_208063676418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2984;
     Object term3051;

    public Country_getDataForDate_208063676418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2985 = new Long(8428634514691209827L);
        ArrayList term3047 = new ArrayList();
        term2984 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term2984, term2984.getClass(), "id", term2985);
        setField(term2984, term2984.getClass(), "name", "dpNsDgfPso");
        setField(term2984, term2984.getClass(), "RName", "hCWPJQKpdc");
        setField(term2984, term2984.getClass(), "Region", "WzMEhMXkKx");
        setField(term2984, term2984.getClass(), "Lat", "XOiDvlDhdc");
        setField(term2984, term2984.getClass(), "Long", "AdxvLJhNLe");
        setField(term2984, term2984.getClass(), "DataSet", term3047);
        term3051 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3051;
        callMethod(klass, "getDataForDate", argTypes, term2984, args);
    }

};


