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

public class Action_canEqual_43664948613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13533;
     Object term13568;

    public Action_canEqual_43664948613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13534 = new Integer(-1048298087);
        Integer term13564 = new Integer(292681826);
        Integer term13566 = new Integer(458147407);
        term13533 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13536 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13533, term13533.getClass(), "id", term13534);
        setIntField(term13536, term13536.getClass(), "year", 2021);
        setShortField(term13536, term13536.getClass(), "month", (short) 9);
        setShortField(term13536, term13536.getClass(), "day", (short) 6);
        setField(term13533, term13533.getClass(), "date", term13536);
        setField(term13533, term13533.getClass(), "subject", "hOncybyCAH");
        setField(term13533, term13533.getClass(), "apply", "QduALnDSVo");
        setField(term13533, term13533.getClass(), "income", term13564);
        setField(term13533, term13533.getClass(), "spending", term13566);
        term13568 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13568;
        callMethod(klass, "canEqual", argTypes, term13533, args);
    }

};


