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

public class Data_getStat_20435956294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3432;

    public Data_getStat_20435956294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3432 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3433 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3433, term3433.getClass(), "year", 2017);
        setShortField(term3433, term3433.getClass(), "month", (short) 6);
        setShortField(term3433, term3433.getClass(), "day", (short) 7);
        setField(term3432, term3432.getClass(), "date", term3433);
        setIntField(term3432, term3432.getClass(), "stat", 597278769);
        setField(term3432, term3432.getClass(), "NameRef", "");
        setField(term3432, term3432.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStat", argTypes, term3432, args);
    }

};


