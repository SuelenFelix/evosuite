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

public class Data_setDate_7008899417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3462;
     Object term3472;

    public Data_setDate_7008899417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3462 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3463 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3463, term3463.getClass(), "year", 2022);
        setShortField(term3463, term3463.getClass(), "month", (short) 8);
        setShortField(term3463, term3463.getClass(), "day", (short) 8);
        setField(term3462, term3462.getClass(), "date", term3463);
        setIntField(term3462, term3462.getClass(), "stat", 1622346318);
        setField(term3462, term3462.getClass(), "NameRef", "");
        setField(term3462, term3462.getClass(), "Region", "");
        term3472 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3472, term3472.getClass(), "year", 2029);
        setShortField(term3472, term3472.getClass(), "month", (short) 6);
        setShortField(term3472, term3472.getClass(), "day", (short) 22);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term3472;
        callMethod(klass, "setDate", argTypes, term3462, args);
    }

};


