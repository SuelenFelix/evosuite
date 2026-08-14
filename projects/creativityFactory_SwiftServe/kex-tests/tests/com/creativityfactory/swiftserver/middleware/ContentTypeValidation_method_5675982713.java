package com.creativityfactory.swiftserver.middleware;

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
import static com.creativityfactory.swiftserver.middleware.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ContentTypeValidation_method_5675982713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public ContentTypeValidation_method_5675982713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11 = newInstance(Class.forName("com.creativityfactory.swiftserver.middleware.ContentTypeValidation"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.middleware.ContentTypeValidation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.creativityfactory.swiftserver.request.Request");
        argTypes[1] = Class.forName("com.creativityfactory.swiftserver.response.Response");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "method", argTypes, term11, args);
    }

};


