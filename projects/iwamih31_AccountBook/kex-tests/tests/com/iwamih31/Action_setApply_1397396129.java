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

public class Action_setApply_1397396129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13286;

    public Action_setApply_1397396129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13287 = new Integer(1962444399);
        Integer term13317 = new Integer(767834723);
        Integer term13319 = new Integer(-602026508);
        term13286 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13289 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13286, term13286.getClass(), "id", term13287);
        setIntField(term13289, term13289.getClass(), "year", 2018);
        setShortField(term13289, term13289.getClass(), "month", (short) 9);
        setShortField(term13289, term13289.getClass(), "day", (short) 27);
        setField(term13286, term13286.getClass(), "date", term13289);
        setField(term13286, term13286.getClass(), "subject", "nhoHrZfnIN");
        setField(term13286, term13286.getClass(), "apply", "ZkMALXpEAZ");
        setField(term13286, term13286.getClass(), "income", term13317);
        setField(term13286, term13286.getClass(), "spending", term13319);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tXfQjSqDzN";
        callMethod(klass, "setApply", argTypes, term13286, args);
    }

};


