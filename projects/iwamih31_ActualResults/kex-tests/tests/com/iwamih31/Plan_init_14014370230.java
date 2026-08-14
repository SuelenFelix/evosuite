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

public class Plan_init_14014370230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31465;

    public Plan_init_14014370230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31466 = new Integer(458147407);
        Integer term31468 = new Integer(-184153539);
        Integer term31514 = new Integer(493620644);
        term31465 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term31470 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31474 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31465, term31465.getClass(), "id", term31466);
        setField(term31465, term31465.getClass(), "user_id", term31468);
        setIntField(term31470, term31470.getClass(), "year", 2015);
        setShortField(term31470, term31470.getClass(), "month", (short) 3);
        setShortField(term31470, term31470.getClass(), "day", (short) 10);
        setField(term31465, term31465.getClass(), "start_date", term31470);
        setIntField(term31474, term31474.getClass(), "year", 2021);
        setShortField(term31474, term31474.getClass(), "month", (short) 9);
        setShortField(term31474, term31474.getClass(), "day", (short) 30);
        setField(term31465, term31465.getClass(), "last_date", term31474);
        setField(term31465, term31465.getClass(), "day_of_week", "mIRMQIxHUD");
        setField(term31465, term31465.getClass(), "subject", "FbBMtntDbw");
        setField(term31465, term31465.getClass(), "start_time", "zRnpRGaHlI");
        setField(term31465, term31465.getClass(), "minutes", term31514);
        setField(term31465, term31465.getClass(), "items", "dVHfxjbMRK");
        setField(term31465, term31465.getClass(), "note", "LzwyLxKJpw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.iwamih31.Plan");
        Object[] args = new Object[1];
        args[0] = term31465;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


