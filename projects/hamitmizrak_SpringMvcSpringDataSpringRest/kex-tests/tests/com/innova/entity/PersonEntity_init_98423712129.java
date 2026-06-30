package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class PersonEntity_init_98423712129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423;

    public PersonEntity_init_98423712129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = double.class;
        argTypes[3] = Class.forName("java.util.Date");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term423;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


