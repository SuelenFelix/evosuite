package com.mozen.springbootpaginationandsorting.model;

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
import static com.mozen.springbootpaginationandsorting.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Plant_canEqual_870192630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1194;

    public Plant_canEqual_870192630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1194 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        setField(term1194, term1194.getClass(), "id", null);
        setField(term1194, term1194.getClass(), "name", null);
        setField(term1194, term1194.getClass(), "scientificName", null);
        setField(term1194, term1194.getClass(), "family", null);
        setField(term1194, term1194.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term1194, args);
    }

};


