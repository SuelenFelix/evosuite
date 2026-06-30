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

public class ComputerEntity_getComputerId_3810804151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542;

    public ComputerEntity_getComputerId_3810804151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1543 = new Long(1233889271256172047L);
        term1542 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term1570 = newInstance(Class.forName("java.util.Date"));
        setField(term1542, term1542.getClass(), "computerId", term1543);
        setField(term1542, term1542.getClass(), "computerName", "MLqYREekMl");
        setField(term1542, term1542.getClass(), "computerTrade", "ytSBIKXogI");
        setDoubleField(term1542, term1542.getClass(), "computerPrice", 0.11493000848982304);
        setLongField(term1570, term1570.getClass(), "fastTime", 1822704644050L);
        setField(term1570, term1570.getClass(), "cdate", null);
        setField(term1542, term1542.getClass(), "createdDate", term1570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComputerId", argTypes, term1542, args);
    }

};


