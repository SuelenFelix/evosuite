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
import java.lang.Double;

public class ProductDto_setProductPrice_79235995225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1586;
     Object term1588;

    public ProductDto_setProductPrice_79235995225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1586 = newInstance(Class.forName("com.innova.dto.ProductDto"));
        setField(term1586, term1586.getClass(), "productId", null);
        setField(term1586, term1586.getClass(), "productName", null);
        setDoubleField(term1586, term1586.getClass(), "productPrice", 0.0);
        term1588 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.ProductDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1588;
        callMethod(klass, "setProductPrice", argTypes, term1586, args);
    }

};


