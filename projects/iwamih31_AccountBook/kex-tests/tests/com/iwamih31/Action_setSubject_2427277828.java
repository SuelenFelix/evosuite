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

public class Action_setSubject_2427277828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13209;

    public Action_setSubject_2427277828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13210 = new Integer(-469968304);
        Integer term13240 = new Integer(-1145578966);
        Integer term13242 = new Integer(679763016);
        term13209 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term13212 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13209, term13209.getClass(), "id", term13210);
        setIntField(term13212, term13212.getClass(), "year", 2027);
        setShortField(term13212, term13212.getClass(), "month", (short) 3);
        setShortField(term13212, term13212.getClass(), "day", (short) 14);
        setField(term13209, term13209.getClass(), "date", term13212);
        setField(term13209, term13209.getClass(), "subject", "XJJNClzHRf");
        setField(term13209, term13209.getClass(), "apply", "HDaezxQfQR");
        setField(term13209, term13209.getClass(), "income", term13240);
        setField(term13209, term13209.getClass(), "spending", term13242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iikZEapDlu";
        callMethod(klass, "setSubject", argTypes, term13209, args);
    }

};


