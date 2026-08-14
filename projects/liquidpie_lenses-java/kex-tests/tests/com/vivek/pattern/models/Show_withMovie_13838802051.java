package com.vivek.pattern.models;

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
import static com.vivek.pattern.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Show_withMovie_13838802051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term58;

    public Show_withMovie_13838802051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term35 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term48 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term49 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term35, term35.getClass(), "title", "sjlJAEtRrb");
        setField(term34, term34.getClass(), "movie", term35);
        setIntField(term49, term49.getClass(), "year", 2021);
        setShortField(term49, term49.getClass(), "month", (short) 1);
        setShortField(term49, term49.getClass(), "day", (short) 18);
        setField(term48, term48.getClass(), "date", term49);
        setByteField(term53, term53.getClass(), "hour", (byte) 13);
        setByteField(term53, term53.getClass(), "minute", (byte) 38);
        setByteField(term53, term53.getClass(), "second", (byte) 26);
        setIntField(term53, term53.getClass(), "nano", 544608644);
        setField(term48, term48.getClass(), "time", term53);
        setField(term34, term34.getClass(), "dateTime", term48);
        term58 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        setField(term58, term58.getClass(), "title", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.Show");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.vivek.pattern.models.Movie");
        Object[] args = new Object[1];
        args[0] = term58;
        callMethod(klass, "withMovie", argTypes, term34, args);
    }

};


