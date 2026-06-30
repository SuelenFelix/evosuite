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

public class ComputerEntity_equals_33517041911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2092;
     Object term2122;

    public ComputerEntity_equals_33517041911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2093 = new Long(-2170847986967241072L);
        term2092 = newInstance(Class.forName("com.innova.entity.ComputerEntity"));
        Object term2120 = newInstance(Class.forName("java.util.Date"));
        setField(term2092, term2092.getClass(), "computerId", term2093);
        setField(term2092, term2092.getClass(), "computerName", "wGmYcqUkgE");
        setField(term2092, term2092.getClass(), "computerTrade", "idgaQsnJpQ");
        setDoubleField(term2092, term2092.getClass(), "computerPrice", 0.22651340641904605);
        setLongField(term2120, term2120.getClass(), "fastTime", 1853963979281L);
        setField(term2120, term2120.getClass(), "cdate", null);
        setField(term2092, term2092.getClass(), "createdDate", term2120);
        term2122 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.ComputerEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2122;
        callMethod(klass, "equals", argTypes, term2092, args);
    }

};


