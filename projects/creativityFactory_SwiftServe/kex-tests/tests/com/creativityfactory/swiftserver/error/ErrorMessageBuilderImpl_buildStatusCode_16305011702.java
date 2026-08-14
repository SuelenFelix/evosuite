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
import java.lang.Integer;

public class ErrorMessageBuilderImpl_buildStatusCode_16305011702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798;
     Object term801;

    public ErrorMessageBuilderImpl_buildStatusCode_16305011702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorMessageBuilderImpl"));
        Object term799 = newInstance(Class.forName("com.creativityfactory.swiftserver.error.ErrorResponse"));
        setField(term799, term799.getClass(), "timestamp", null);
        setIntField(term799, term799.getClass(), "status", 0);
        setField(term799, term799.getClass(), "error", null);
        setField(term799, term799.getClass(), "message", null);
        setField(term799, term799.getClass(), "path", null);
        setField(term798, term798.getClass(), "errorResponse", term799);
        term801 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.error.ErrorMessageBuilderImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term801;
        callMethod(klass, "buildStatusCode", argTypes, term798, args);
    }

};


