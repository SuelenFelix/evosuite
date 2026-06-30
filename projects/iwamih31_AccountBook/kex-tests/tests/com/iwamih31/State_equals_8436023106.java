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

public class State_equals_8436023106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608;
     Object term627;

    public State_equals_8436023106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term609 = new Integer(-2038273078);
        term608 = newInstance(Class.forName("com.iwamih31.State"));
        Object term623 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term608, term608.getClass(), "id", term609);
        setField(term608, term608.getClass(), "name", "eZFUvlxvGV");
        setIntField(term623, term623.getClass(), "year", 2017);
        setShortField(term623, term623.getClass(), "month", (short) 5);
        setShortField(term623, term623.getClass(), "day", (short) 21);
        setField(term608, term608.getClass(), "date", term623);
        term627 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term627;
        callMethod(klass, "equals", argTypes, term608, args);
    }

};


