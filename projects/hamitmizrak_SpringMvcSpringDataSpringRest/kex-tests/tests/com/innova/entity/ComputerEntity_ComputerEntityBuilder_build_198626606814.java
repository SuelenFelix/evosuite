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

public class ComputerEntity_ComputerEntityBuilder_build_198626606814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1538;

    public ComputerEntity_ComputerEntityBuilder_build_198626606814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1538 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        setField(term1538, term1538.getClass(), "computerId", null);
        setField(term1538, term1538.getClass(), "computerName", null);
        setField(term1538, term1538.getClass(), "computerTrade", null);
        setDoubleField(term1538, term1538.getClass(), "computerPrice", 0.0);
        setField(term1538, term1538.getClass(), "createdDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1538, args);
    }

};


