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

public class Data_getDate_18694593772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3412;

    public Data_getDate_18694593772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3412 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3413 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3413, term3413.getClass(), "year", 2012);
        setShortField(term3413, term3413.getClass(), "month", (short) 2);
        setShortField(term3413, term3413.getClass(), "day", (short) 19);
        setField(term3412, term3412.getClass(), "date", term3413);
        setIntField(term3412, term3412.getClass(), "stat", -883034806);
        setField(term3412, term3412.getClass(), "NameRef", "");
        setField(term3412, term3412.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term3412, args);
    }

};


