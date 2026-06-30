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

public class ComputerEntity_ComputerEntityBuilder_computerPrice_174006992212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1532;
     Object term1534;

    public ComputerEntity_ComputerEntityBuilder_computerPrice_174006992212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1532 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        setField(term1532, term1532.getClass(), "computerId", null);
        setField(term1532, term1532.getClass(), "computerName", null);
        setField(term1532, term1532.getClass(), "computerTrade", null);
        setDoubleField(term1532, term1532.getClass(), "computerPrice", 0.0);
        setField(term1532, term1532.getClass(), "createdDate", null);
        term1534 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1534;
        callMethod(klass, "computerPrice", argTypes, term1532, args);
    }

};


