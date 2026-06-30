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

public class State_setDate_19563923905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575;
     Object term594;

    public State_setDate_19563923905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term576 = new Integer(-1955890973);
        term575 = newInstance(Class.forName("com.iwamih31.State"));
        Object term590 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term575, term575.getClass(), "id", term576);
        setField(term575, term575.getClass(), "name", "xOEqzGAmDU");
        setIntField(term590, term590.getClass(), "year", 2018);
        setShortField(term590, term590.getClass(), "month", (short) 1);
        setShortField(term590, term590.getClass(), "day", (short) 13);
        setField(term575, term575.getClass(), "date", term590);
        term594 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term594, term594.getClass(), "year", 2015);
        setShortField(term594, term594.getClass(), "month", (short) 4);
        setShortField(term594, term594.getClass(), "day", (short) 14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term594;
        callMethod(klass, "setDate", argTypes, term575, args);
    }

};


