package com.meteergin.medium.stream;

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
import static com.meteergin.medium.stream.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class User_setId_190007127520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1124;
     Object term1127;

    public User_setId_190007127520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1124 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1124, term1124.getClass(), "id", 0L);
        setField(term1124, term1124.getClass(), "firstName", null);
        setField(term1124, term1124.getClass(), "lastName", null);
        setIntField(term1124, term1124.getClass(), "age", 0);
        setField(term1124, term1124.getClass(), "nationality", null);
        term1127 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1127;
        callMethod(klass, "setId", argTypes, term1124, args);
    }

};


