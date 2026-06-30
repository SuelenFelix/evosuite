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

public class Data_toString_113965839411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3552;

    public Data_toString_113965839411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3552 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3553 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3553, term3553.getClass(), "year", 2020);
        setShortField(term3553, term3553.getClass(), "month", (short) 7);
        setShortField(term3553, term3553.getClass(), "day", (short) 23);
        setField(term3552, term3552.getClass(), "date", term3553);
        setIntField(term3552, term3552.getClass(), "stat", -117576464);
        setField(term3552, term3552.getClass(), "NameRef", "");
        setField(term3552, term3552.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3552, args);
    }

};


