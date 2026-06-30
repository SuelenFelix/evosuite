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

public class State_canEqual_16477649397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638;
     Object term657;

    public State_canEqual_16477649397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term639 = new Integer(1227103734);
        term638 = newInstance(Class.forName("com.iwamih31.State"));
        Object term653 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term638, term638.getClass(), "id", term639);
        setField(term638, term638.getClass(), "name", "BYqFIqCKAV");
        setIntField(term653, term653.getClass(), "year", 2022);
        setShortField(term653, term653.getClass(), "month", (short) 2);
        setShortField(term653, term653.getClass(), "day", (short) 25);
        setField(term638, term638.getClass(), "date", term653);
        term657 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term657;
        callMethod(klass, "canEqual", argTypes, term638, args);
    }

};


