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
import java.lang.Integer;

public class Data_init_18099132991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3362;
     Object term3366;

    public Data_init_18099132991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3362 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3362, term3362.getClass(), "year", 2025);
        setShortField(term3362, term3362.getClass(), "month", (short) 2);
        setShortField(term3362, term3362.getClass(), "day", (short) 13);
        term3366 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term3362;
        args[1] = term3366;
        args[2] = "fWKJoSoCwE";
        args[3] = "wfaXBpWAUH";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


