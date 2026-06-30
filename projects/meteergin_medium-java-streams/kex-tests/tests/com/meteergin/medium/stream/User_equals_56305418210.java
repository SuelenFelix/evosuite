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

public class User_equals_56305418210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761;
     Object term800;

    public User_equals_56305418210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term761 = newInstance(Class.forName("com.meteergin.medium.stream.User"));
        setLongField(term761, term761.getClass(), "id", -8885298608300233488L);
        setField(term761, term761.getClass(), "firstName", "SbAoxhfrkn");
        setField(term761, term761.getClass(), "lastName", "kuTXqwMtDB");
        setIntField(term761, term761.getClass(), "age", -522618178);
        setField(term761, term761.getClass(), "nationality", "Ghbwtircqb");
        term800 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.meteergin.medium.stream.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term800;
        callMethod(klass, "equals", argTypes, term761, args);
    }

};


