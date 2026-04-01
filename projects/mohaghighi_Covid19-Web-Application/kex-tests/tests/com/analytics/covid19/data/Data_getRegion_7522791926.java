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
import java.lang.Object;

public class Data_getRegion_7522791926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3452;

    public Data_getRegion_7522791926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3452 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3453 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3453, term3453.getClass(), "year", 2015);
        setShortField(term3453, term3453.getClass(), "month", (short) 9);
        setShortField(term3453, term3453.getClass(), "day", (short) 15);
        setField(term3452, term3452.getClass(), "date", term3453);
        setIntField(term3452, term3452.getClass(), "stat", -1456670397);
        setField(term3452, term3452.getClass(), "NameRef", "");
        setField(term3452, term3452.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term3452, args);
    }

};


