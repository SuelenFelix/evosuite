package com.creativityfactory.swiftserver.middleware.rest;

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
import static com.creativityfactory.swiftserver.middleware.rest.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetById_method_12519894583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4;

    public GetById_method_12519894583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4 = newInstance(Class.forName("com.creativityfactory.swiftserver.middleware.rest.GetById"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.middleware.rest.GetById");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.creativityfactory.swiftserver.request.Request");
        argTypes[1] = Class.forName("com.creativityfactory.swiftserver.response.Response");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "method", argTypes, term4, args);
    }

};


