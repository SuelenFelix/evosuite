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

public class Data_setRegion_169677428810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3520;

    public Data_setRegion_169677428810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3520 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3521 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3521, term3521.getClass(), "year", 2011);
        setShortField(term3521, term3521.getClass(), "month", (short) 7);
        setShortField(term3521, term3521.getClass(), "day", (short) 24);
        setField(term3520, term3520.getClass(), "date", term3521);
        setIntField(term3520, term3520.getClass(), "stat", -2068769794);
        setField(term3520, term3520.getClass(), "NameRef", "");
        setField(term3520, term3520.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        callMethod(klass, "setRegion", argTypes, term3520, args);
    }

};


