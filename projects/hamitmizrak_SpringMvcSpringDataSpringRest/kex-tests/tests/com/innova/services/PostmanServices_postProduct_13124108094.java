package com.innova.services;

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
import static com.innova.services.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class PostmanServices_postProduct_13124108094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public PostmanServices_postProduct_13124108094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term36 = new Long(6375119433582206027L);
        term35 = newInstance(Class.forName("com.innova.dto.ProductDto"));
        setField(term35, term35.getClass(), "productId", term36);
        setField(term35, term35.getClass(), "productName", "sjlJAEtRrb");
        setDoubleField(term35, term35.getClass(), "productPrice", 0.13238746331190498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.services.PostmanServices");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.innova.dto.ProductDto");
        Object[] args = new Object[1];
        args[0] = term35;
        callMethod(klass, "postProduct", argTypes, null, args);
    }

};


