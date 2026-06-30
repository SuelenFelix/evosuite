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

public class ProductDto_canEqual_208026022611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1463;
     Object term1479;

    public ProductDto_canEqual_208026022611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1464 = new Long(-316468845751588286L);
        term1463 = newInstance(Class.forName("com.innova.dto.ProductDto"));
        setField(term1463, term1463.getClass(), "productId", term1464);
        setField(term1463, term1463.getClass(), "productName", "dEnhdmILtU");
        setDoubleField(term1463, term1463.getClass(), "productPrice", 0.9828442029246764);
        term1479 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.ProductDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1479;
        callMethod(klass, "canEqual", argTypes, term1463, args);
    }

};


