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

public class ComputerEntity_setComputerId_196047922923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2356;

    public ComputerEntity_setComputerId_196047922923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2356 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        setField(term2356, term2356.getClass(), "computerId", null);
        setField(term2356, term2356.getClass(), "computerName", null);
        setField(term2356, term2356.getClass(), "computerTrade", null);
        setDoubleField(term2356, term2356.getClass(), "computerPrice", 0.0);
        setField(term2356, term2356.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setComputerId", argTypes, term2356, args);
    }

};


