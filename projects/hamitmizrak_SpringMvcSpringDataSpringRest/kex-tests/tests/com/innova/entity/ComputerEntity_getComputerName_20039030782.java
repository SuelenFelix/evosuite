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

public class ComputerEntity_getComputerName_20039030782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1592;

    public ComputerEntity_getComputerName_20039030782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1593 = new Long(6617340557564669657L);
        term1592 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term1620 = newInstance(Class.forName("java.util.Date"));
        setField(term1592, term1592.getClass(), "computerId", term1593);
        setField(term1592, term1592.getClass(), "computerName", "nHXjMycHlU");
        setField(term1592, term1592.getClass(), "computerTrade", "ieCtQFdkii");
        setDoubleField(term1592, term1592.getClass(), "computerPrice", 0.37161417339133307);
        setLongField(term1620, term1620.getClass(), "fastTime", 1678177615298L);
        setField(term1620, term1620.getClass(), "cdate", null);
        setField(term1592, term1592.getClass(), "createdDate", term1620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComputerName", argTypes, term1592, args);
    }

};


