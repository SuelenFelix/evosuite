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

public class Request_init_6568209504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7576;

    public Request_init_6568209504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7576 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term7576, term7576.getClass(), "year", 2023);
        setShortField(term7576, term7576.getClass(), "month", (short) 3);
        setShortField(term7576, term7576.getClass(), "day", (short) 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.Request");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term7576;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


