package com.analytics.covid19.REST;

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
import static com.analytics.covid19.REST.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Request_init_20500221870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784;
     Object term788;

    public Request_init_20500221870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term784 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term784, term784.getClass(), "year", 2029);
        setShortField(term784, term784.getClass(), "month", (short) 1);
        setShortField(term784, term784.getClass(), "day", (short) 20);
        term788 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term788, term788.getClass(), "year", 2029);
        setShortField(term788, term788.getClass(), "month", (short) 8);
        setShortField(term788, term788.getClass(), "day", (short) 28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[3];
        args[0] = "OWDIEULEFu";
        args[1] = term784;
        args[2] = term788;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


