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

public class State_setName_4722747744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524;

    public State_setName_4722747744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term525 = new Integer(-616727354);
        term524 = newInstance(Class.forName("com.iwamih31.State"));
        Object term539 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term524, term524.getClass(), "id", term525);
        setField(term524, term524.getClass(), "name", "hNxWaHcfhY");
        setIntField(term539, term539.getClass(), "year", 2015);
        setShortField(term539, term539.getClass(), "month", (short) 9);
        setShortField(term539, term539.getClass(), "day", (short) 19);
        setField(term524, term524.getClass(), "date", term539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RkybSrpybU";
        callMethod(klass, "setName", argTypes, term524, args);
    }

};


