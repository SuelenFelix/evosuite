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
import java.lang.Long;

public class ProductService_createProduct_11579098481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;
     Object term5;

    public ProductService_createProduct_11579098481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("com.martinachov.hexagonal.domain.service.ProductService"));
        setField(term4, term4.getClass(), "productOutputPort", null);
        Long term6 = new Long(6375119433582206027L);
        term5 = newInstance(Class.forName("com.martinachov.hexagonal.domain.model.Product"));
        setField(term5, term5.getClass(), "id", term6);
        setField(term5, term5.getClass(), "name", "PAEBtnZtTD");
        setField(term5, term5.getClass(), "description", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.domain.service.ProductService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.martinachov.hexagonal.domain.model.Product");
        Object[] args = new Object[1];
        args[0] = term5;
        callMethod(klass, "createProduct", argTypes, term4, args);
    }

};


