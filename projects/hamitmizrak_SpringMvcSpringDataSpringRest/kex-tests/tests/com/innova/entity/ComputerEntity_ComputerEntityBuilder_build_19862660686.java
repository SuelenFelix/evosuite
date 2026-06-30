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

public class ComputerEntity_ComputerEntityBuilder_build_19862660686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1426;

    public ComputerEntity_ComputerEntityBuilder_build_19862660686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1427 = new Long(-6823727938421990489L);
        term1426 = newInstance(Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder"));
        Object term1454 = newInstance(Class.forName("java.util.Date"));
        setField(term1426, term1426.getClass(), "computerId", term1427);
        setField(term1426, term1426.getClass(), "computerName", "JDswTTCZHV");
        setField(term1426, term1426.getClass(), "computerTrade", "onpbIeEKoi");
        setDoubleField(term1426, term1426.getClass(), "computerPrice", 0.7559240768573477);
        setLongField(term1454, term1454.getClass(), "fastTime", 1464421789888L);
        setField(term1454, term1454.getClass(), "cdate", null);
        setField(term1426, term1426.getClass(), "createdDate", term1454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity$ComputerEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1426, args);
    }

};


