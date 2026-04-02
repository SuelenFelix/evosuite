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

public class Data_getDateStr_9048198773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3422;

    public Data_getDateStr_9048198773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3422 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3423 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3423, term3423.getClass(), "year", 2012);
        setShortField(term3423, term3423.getClass(), "month", (short) 4);
        setShortField(term3423, term3423.getClass(), "day", (short) 19);
        setField(term3422, term3422.getClass(), "date", term3423);
        setIntField(term3422, term3422.getClass(), "stat", 1585847225);
        setField(term3422, term3422.getClass(), "NameRef", "");
        setField(term3422, term3422.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateStr", argTypes, term3422, args);
    }

};


