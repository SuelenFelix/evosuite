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

public class State_setId_5307774093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493;
     Object term512;

    public State_setId_5307774093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term494 = new Integer(391863371);
        term493 = newInstance(Class.forName("com.iwamih31.State"));
        Object term508 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term493, term493.getClass(), "id", term494);
        setField(term493, term493.getClass(), "name", "pCTimMblYc");
        setIntField(term508, term508.getClass(), "year", 2020);
        setShortField(term508, term508.getClass(), "month", (short) 11);
        setShortField(term508, term508.getClass(), "day", (short) 22);
        setField(term493, term493.getClass(), "date", term508);
        term512 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term512;
        callMethod(klass, "setId", argTypes, term493, args);
    }

};


