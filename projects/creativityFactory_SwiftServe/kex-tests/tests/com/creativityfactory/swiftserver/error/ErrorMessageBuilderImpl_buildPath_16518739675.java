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
import java.lang.Object;

public class ErrorMessageBuilderImpl_buildPath_16518739675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853;

    public ErrorMessageBuilderImpl_buildPath_16518739675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term853 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorMessageBuilderImpl"));
        Object term854 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        setField(term854, term854.getClass(), "timestamp", null);
        setIntField(term854, term854.getClass(), "status", 0);
        setField(term854, term854.getClass(), "error", null);
        setField(term854, term854.getClass(), "message", null);
        setField(term854, term854.getClass(), "path", null);
        setField(term853, term853.getClass(), "errorResponse", term854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorMessageBuilderImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        callMethod(klass, "buildPath", argTypes, term853, args);
    }

};


