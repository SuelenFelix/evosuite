package com.martinachov.hexagonal.domain.service;

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
import static com.martinachov.hexagonal.domain.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProductService_createProduct_11579098484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;

    public ProductService_createProduct_11579098484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = newInstance(Class.forName("com.martinachov.hexagonal.domain.service.ProductService"));
        setField(term53, term53.getClass(), "productOutputPort", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.domain.service.ProductService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.martinachov.hexagonal.domain.model.Product");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createProduct", argTypes, term53, args);
    }

};


