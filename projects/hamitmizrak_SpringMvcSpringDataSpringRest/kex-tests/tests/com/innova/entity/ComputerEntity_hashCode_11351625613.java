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

public class ComputerEntity_hashCode_11351625613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2194;

    public ComputerEntity_hashCode_11351625613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2195 = new Long(-4443169559037975007L);
        term2194 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term2222 = newInstance(Class.forName("java.util.Date"));
        setField(term2194, term2194.getClass(), "computerId", term2195);
        setField(term2194, term2194.getClass(), "computerName", "bWWfajKbEX");
        setField(term2194, term2194.getClass(), "computerTrade", "cAPeiZHKGJ");
        setDoubleField(term2194, term2194.getClass(), "computerPrice", 0.6588948704887806);
        setLongField(term2222, term2222.getClass(), "fastTime", 1802995433545L);
        setField(term2222, term2222.getClass(), "cdate", null);
        setField(term2194, term2194.getClass(), "createdDate", term2222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2194, args);
    }

};


