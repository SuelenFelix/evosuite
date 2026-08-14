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

public class Data_toString_113965839413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2785;

    public Data_toString_113965839413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2785 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2786 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2786, term2786.getClass(), "year", 2025);
        setShortField(term2786, term2786.getClass(), "month", (short) 4);
        setShortField(term2786, term2786.getClass(), "day", (short) 8);
        setField(term2785, term2785.getClass(), "date", term2786);
        setIntField(term2785, term2785.getClass(), "stat", -117576464);
        setField(term2785, term2785.getClass(), "NameRef", "");
        setField(term2785, term2785.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2785, args);
    }

};


