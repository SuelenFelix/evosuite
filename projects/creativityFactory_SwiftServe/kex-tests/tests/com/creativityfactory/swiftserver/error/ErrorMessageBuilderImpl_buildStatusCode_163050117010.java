package com.creativityfactory.swiftserver.error;

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
import static com.creativityfactory.swiftserver.error.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ErrorMessageBuilderImpl_buildStatusCode_163050117010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term885;
     Object term886;

    public ErrorMessageBuilderImpl_buildStatusCode_163050117010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term885 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorMessageBuilderImpl"));
        setField(term885, term885.getClass(), "errorResponse", null);
        term886 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorMessageBuilderImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term886;
        callMethod(klass, "buildStatusCode", argTypes, term885, args);
    }

};


