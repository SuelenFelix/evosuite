package com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response;

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
import static com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProductResponse_ProductResponseBuilder_name_10537684878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;

    public ProductResponse_ProductResponseBuilder_name_10537684878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283 = newInstance(Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ProductResponse$ProductResponseBuilder"));
        setField(term283, term283.getClass(), "id", null);
        setField(term283, term283.getClass(), "name", null);
        setField(term283, term283.getClass(), "description", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.response.ProductResponse$ProductResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "name", argTypes, term283, args);
    }

};


