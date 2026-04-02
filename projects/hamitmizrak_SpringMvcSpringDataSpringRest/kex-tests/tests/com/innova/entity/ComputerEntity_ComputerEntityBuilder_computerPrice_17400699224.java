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
import java.lang.Long;
import java.lang.Object;
import java.lang.Double;

public class ComputerEntity_ComputerEntityBuilder_computerPrice_17400699224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1322;
     Object term1352;

    public ComputerEntity_ComputerEntityBuilder_computerPrice_17400699224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1323 = new Long(-5892135042702373494L);
        term1322 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        Object term1350 = newInstance(Class.forName("java.util.Date"));
        setField(term1322, term1322.getClass(), "computerId", term1323);
        setField(term1322, term1322.getClass(), "computerName", "jDtqGUpnZN");
        setField(term1322, term1322.getClass(), "computerTrade", "nGKItKLYNC");
        setDoubleField(term1322, term1322.getClass(), "computerPrice", 0.13481025392611334);
        setLongField(term1350, term1350.getClass(), "fastTime", 1488725902101L);
        setField(term1350, term1350.getClass(), "cdate", null);
        setField(term1322, term1322.getClass(), "createdDate", term1350);
        term1352 = new Double(0.3800088629986428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1352;
        callMethod(klass, "computerPrice", argTypes, term1322, args);
    }

};


