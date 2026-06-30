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
import java.lang.Double;

public class ProductDto_setProductPrice_7923599529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1408;
     Object term1424;

    public ProductDto_setProductPrice_7923599529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1409 = new Long(-5476826692763582090L);
        term1408 = newInstance(Class.forName("com.innova.dto.ProductDto"));
        setField(term1408, term1408.getClass(), "productId", term1409);
        setField(term1408, term1408.getClass(), "productName", "nHXjMycHlU");
        setDoubleField(term1408, term1408.getClass(), "productPrice", 0.1374549299694151);
        term1424 = new Double(0.7031006357544823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.ProductDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1424;
        callMethod(klass, "setProductPrice", argTypes, term1408, args);
    }

};


