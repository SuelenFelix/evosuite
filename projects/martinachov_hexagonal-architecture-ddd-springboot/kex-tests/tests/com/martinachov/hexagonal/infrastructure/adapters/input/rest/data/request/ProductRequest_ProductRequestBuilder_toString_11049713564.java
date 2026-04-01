package com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.request;

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
import static com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProductRequest_ProductRequestBuilder_toString_11049713564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;

    public ProductRequest_ProductRequestBuilder_toString_11049713564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180 = newInstance(Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.request.ProductRequest$ProductRequestBuilder"));
        setField(term180, term180.getClass(), "name", "hRNSzYYIrc");
        setField(term180, term180.getClass(), "description", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.request.ProductRequest$ProductRequestBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term180, args);
    }

};


