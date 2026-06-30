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

public class Action_equals_124081211512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13477;
     Object term13512;

    public Action_equals_124081211512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13478 = new Integer(454281060);
        Integer term13508 = new Integer(-1786399638);
        Integer term13510 = new Integer(2055867847);
        term13477 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13480 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13477, term13477.getClass(), "id", term13478);
        setIntField(term13480, term13480.getClass(), "year", 2017);
        setShortField(term13480, term13480.getClass(), "month", (short) 8);
        setShortField(term13480, term13480.getClass(), "day", (short) 7);
        setField(term13477, term13477.getClass(), "date", term13480);
        setField(term13477, term13477.getClass(), "subject", "RMsXuyzKJV");
        setField(term13477, term13477.getClass(), "apply", "FwPbDZcHmB");
        setField(term13477, term13477.getClass(), "income", term13508);
        setField(term13477, term13477.getClass(), "spending", term13510);
        term13512 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13512;
        callMethod(klass, "equals", argTypes, term13477, args);
    }

};


