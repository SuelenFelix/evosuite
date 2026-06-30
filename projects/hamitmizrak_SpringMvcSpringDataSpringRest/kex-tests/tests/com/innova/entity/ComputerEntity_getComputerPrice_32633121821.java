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

public class ComputerEntity_getComputerPrice_32633121821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2352;

    public ComputerEntity_getComputerPrice_32633121821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2352 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        setField(term2352, term2352.getClass(), "computerId", null);
        setField(term2352, term2352.getClass(), "computerName", null);
        setField(term2352, term2352.getClass(), "computerTrade", null);
        setDoubleField(term2352, term2352.getClass(), "computerPrice", 0.0);
        setField(term2352, term2352.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComputerPrice", argTypes, term2352, args);
    }

};


