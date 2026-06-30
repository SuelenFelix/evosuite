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
import java.lang.Integer;

public class User_setAge_130287863523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1135;
     Object term1138;

    public User_setAge_130287863523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1135 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term1135, term1135.getClass(), "id", 0L);
        setField(term1135, term1135.getClass(), "firstName", null);
        setField(term1135, term1135.getClass(), "lastName", null);
        setIntField(term1135, term1135.getClass(), "age", 0);
        setField(term1135, term1135.getClass(), "nationality", null);
        term1138 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1138;
        callMethod(klass, "setAge", argTypes, term1135, args);
    }

};


