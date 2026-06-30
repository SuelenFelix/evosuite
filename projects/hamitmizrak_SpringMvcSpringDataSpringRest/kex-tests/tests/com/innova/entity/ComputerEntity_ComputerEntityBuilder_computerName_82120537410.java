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

public class ComputerEntity_ComputerEntityBuilder_computerName_82120537410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1528;

    public ComputerEntity_ComputerEntityBuilder_computerName_82120537410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1528 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        setField(term1528, term1528.getClass(), "computerId", null);
        setField(term1528, term1528.getClass(), "computerName", null);
        setField(term1528, term1528.getClass(), "computerTrade", null);
        setDoubleField(term1528, term1528.getClass(), "computerPrice", 0.0);
        setField(term1528, term1528.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "computerName", argTypes, term1528, args);
    }

};


