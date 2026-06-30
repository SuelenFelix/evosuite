package com.innova.dto;

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
import static com.innova.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ProductDto_setProductId_12711159397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1332;
     Object term1348;

    public ProductDto_setProductId_12711159397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1333 = new Long(-8885298608300233488L);
        term1332 = newInstance(Class.forName("com.innova.dto.ProductDto"));
        setField(term1332, term1332.getClass(), "productId", term1333);
        setField(term1332, term1332.getClass(), "productName", "ffYhPOzlUs");
        setDoubleField(term1332, term1332.getClass(), "productPrice", 0.5183269973490326);
        term1348 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.ProductDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1348;
        callMethod(klass, "setProductId", argTypes, term1332, args);
    }

};


