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

public class Show_init_11857908770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term14;

    public Show_init_11857908770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        setField(term1, term1.getClass(), "title", "PAEBtnZtTD");
        term14 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term15, term15.getClass(), "year", 2012);
        setShortField(term15, term15.getClass(), "month", (short) 8);
        setShortField(term15, term15.getClass(), "day", (short) 25);
        setField(term14, term14.getClass(), "date", term15);
        setByteField(term19, term19.getClass(), "hour", (byte) 5);
        setByteField(term19, term19.getClass(), "minute", (byte) 20);
        setByteField(term19, term19.getClass(), "second", (byte) 50);
        setIntField(term19, term19.getClass(), "nano", 345595912);
        setField(term14, term14.getClass(), "time", term19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.Show");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.vivek.pattern.models.Movie");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term14;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


