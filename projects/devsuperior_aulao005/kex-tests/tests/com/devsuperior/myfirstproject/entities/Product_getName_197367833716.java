package com.devsuperior.myfirstproject.entities;

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
import static com.devsuperior.myfirstproject.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Product_getName_197367833716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term933;

    public Product_getName_197367833716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term933 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        setField(term933, term933.getClass(), "id", null);
        setField(term933, term933.getClass(), "name", null);
        setField(term933, term933.getClass(), "price", null);
        setField(term933, term933.getClass(), "category", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term933, args);
    }

};


