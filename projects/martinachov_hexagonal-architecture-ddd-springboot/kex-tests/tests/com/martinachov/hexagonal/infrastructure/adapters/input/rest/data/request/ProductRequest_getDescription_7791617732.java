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

public class ProductRequest_getDescription_7791617732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274;

    public ProductRequest_getDescription_7791617732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274 = newInstance(Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.request.ProductRequest"));
        setField(term274, term274.getClass(), "name", "MxlszYVzRf");
        setField(term274, term274.getClass(), "description", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.input.rest.data.request.ProductRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term274, args);
    }

};


