package com.demo.bootcamp.model.jpa;

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
import static com.demo.bootcamp.model.jpa.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TestEntity_getInfo_11943354615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1140;

    public TestEntity_getInfo_11943354615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1140 = newInstance(Class.forName("com.demo.bootcamp.model.jpa.TestEntity"));
        setIntField(term1140, term1140.getClass(), "id", 865208305);
        setField(term1140, term1140.getClass(), "name", "fhkbdRViHi");
        setField(term1140, term1140.getClass(), "info", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.demo.bootcamp.model.jpa.TestEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInfo", argTypes, term1140, args);
    }

};


