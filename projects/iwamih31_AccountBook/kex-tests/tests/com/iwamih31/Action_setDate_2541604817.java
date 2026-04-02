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

public class Action_setDate_2541604817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13150;
     Object term13185;

    public Action_setDate_2541604817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13151 = new Integer(1193880199);
        Integer term13181 = new Integer(-1087774327);
        Integer term13183 = new Integer(-1530420153);
        term13150 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13153 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13150, term13150.getClass(), "id", term13151);
        setIntField(term13153, term13153.getClass(), "year", 2024);
        setShortField(term13153, term13153.getClass(), "month", (short) 8);
        setShortField(term13153, term13153.getClass(), "day", (short) 31);
        setField(term13150, term13150.getClass(), "date", term13153);
        setField(term13150, term13150.getClass(), "subject", "wzsPSPcRdj");
        setField(term13150, term13150.getClass(), "apply", "kGMQdqJYyB");
        setField(term13150, term13150.getClass(), "income", term13181);
        setField(term13150, term13150.getClass(), "spending", term13183);
        term13185 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term13185, term13185.getClass(), "year", 2019);
        setShortField(term13185, term13185.getClass(), "month", (short) 2);
        setShortField(term13185, term13185.getClass(), "day", (short) 20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term13185;
        callMethod(klass, "setDate", argTypes, term13150, args);
    }

};


