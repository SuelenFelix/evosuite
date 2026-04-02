package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Cash_equals_36504724822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14343;
     Object term14368;

    public Cash_equals_36504724822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14344 = new Integer(32185364);
        Integer term14350 = new Integer(1768204942);
        Integer term14352 = new Integer(1252951645);
        Integer term14354 = new Integer(574481092);
        Integer term14356 = new Integer(-310528004);
        Integer term14358 = new Integer(-634976996);
        Integer term14360 = new Integer(-1015274146);
        Integer term14362 = new Integer(-49052672);
        Integer term14364 = new Integer(339372704);
        Integer term14366 = new Integer(-851097944);
        term14343 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14346 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14343, term14343.getClass(), "id", term14344);
        setIntField(term14346, term14346.getClass(), "year", 2026);
        setShortField(term14346, term14346.getClass(), "month", (short) 11);
        setShortField(term14346, term14346.getClass(), "day", (short) 29);
        setField(term14343, term14343.getClass(), "date", term14346);
        setField(term14343, term14343.getClass(), "man1", term14350);
        setField(term14343, term14343.getClass(), "sen5", term14352);
        setField(term14343, term14343.getClass(), "sen1", term14354);
        setField(term14343, term14343.getClass(), "hyaku5", term14356);
        setField(term14343, term14343.getClass(), "hyaku1", term14358);
        setField(term14343, term14343.getClass(), "jyuu5", term14360);
        setField(term14343, term14343.getClass(), "jyuu1", term14362);
        setField(term14343, term14343.getClass(), "en5", term14364);
        setField(term14343, term14343.getClass(), "en1", term14366);
        term14368 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term14368;
        callMethod(klass, "equals", argTypes, term14343, args);
    }

};


