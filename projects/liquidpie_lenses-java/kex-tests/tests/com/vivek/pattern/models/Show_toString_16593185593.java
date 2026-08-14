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

public class Show_toString_16593185593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public Show_toString_16593185593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("com.vivek.pattern.models.Show"));
        Object term136 = newInstance(Class.forName("com.vivek.pattern.models.Movie"));
        Object term149 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150 = newInstance(Class.forName("java.time.LocalDate"));
        Object term154 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term136, term136.getClass(), "title", "jJCZpVmanW");
        setField(term135, term135.getClass(), "movie", term136);
        setIntField(term150, term150.getClass(), "year", 2022);
        setShortField(term150, term150.getClass(), "month", (short) 2);
        setShortField(term150, term150.getClass(), "day", (short) 26);
        setField(term149, term149.getClass(), "date", term150);
        setByteField(term154, term154.getClass(), "hour", (byte) 11);
        setByteField(term154, term154.getClass(), "minute", (byte) 42);
        setByteField(term154, term154.getClass(), "second", (byte) 15);
        setIntField(term154, term154.getClass(), "nano", 377731937);
        setField(term149, term149.getClass(), "time", term154);
        setField(term135, term135.getClass(), "dateTime", term149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.vivek.pattern.models.Show");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term135, args);
    }

};


