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

public class PostmanServices_updateProduct_4941991485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;

    public PostmanServices_updateProduct_4941991485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62 = new Long(-8257434502486459194L);
        term61 = newInstance(Class.forName("com.innova.dto.ProductDto"));
        setField(term61, term61.getClass(), "productId", term62);
        setField(term61, term61.getClass(), "productName", "MuLcgQHgqz");
        setDoubleField(term61, term61.getClass(), "productPrice", 0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.services.PostmanServices");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.innova.dto.ProductDto");
        Object[] args = new Object[1];
        args[0] = term61;
        callMethod(klass, "updateProduct", argTypes, null, args);
    }

};


