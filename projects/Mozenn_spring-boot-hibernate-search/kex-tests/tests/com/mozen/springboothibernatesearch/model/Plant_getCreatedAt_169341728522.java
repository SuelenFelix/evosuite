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

public class Plant_getCreatedAt_169341728522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152;

    public Plant_getCreatedAt_169341728522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152 = newInstance(Class.forName("com.mozen.springboothibernatesearch.model.Plant"));
        setField(term1152, term1152.getClass(), "id", null);
        setField(term1152, term1152.getClass(), "name", null);
        setField(term1152, term1152.getClass(), "scientificName", null);
        setField(term1152, term1152.getClass(), "family", null);
        setField(term1152, term1152.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springboothibernatesearch.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term1152, args);
    }

};


