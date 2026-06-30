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

public class ComputerEntity_ComputerEntityBuilder_toString_201152706915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1540;

    public ComputerEntity_ComputerEntityBuilder_toString_201152706915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1540 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        setField(term1540, term1540.getClass(), "computerId", null);
        setField(term1540, term1540.getClass(), "computerName", null);
        setField(term1540, term1540.getClass(), "computerTrade", null);
        setDoubleField(term1540, term1540.getClass(), "computerPrice", 0.0);
        setField(term1540, term1540.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1540, args);
    }

};


