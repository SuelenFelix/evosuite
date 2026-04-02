package com.mozen.springboothibernatesearch.model;

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
import static com.mozen.springboothibernatesearch.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_equals_163806719213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term930;
     Object term972;

    public Plant_equals_163806719213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term931 = new Long(-4325723315152823407L);
        term930 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.Plant"));
        Object term969 = newInstance(Class.forName("java.time.Instant"));
        setField(term930, term930.getClass(), "id", term931);
        setField(term930, term930.getClass(), "name", "aKnKipADSo");
        setField(term930, term930.getClass(), "scientificName", "wSQxaModmm");
        setField(term930, term930.getClass(), "family", "UlajhuVLaP");
        setLongField(term969, term969.getClass(), "seconds", 1775099878L);
        setIntField(term969, term969.getClass(), "nanos", 824468000);
        setField(term930, term930.getClass(), "createdAt", term969);
        term972 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term972;
        callMethod(klass, "equals", argTypes, term930, args);
    }

};


