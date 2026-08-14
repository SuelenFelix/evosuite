package com.microsoft.credentialstorage.model;

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
import static com.microsoft.credentialstorage.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StoredToken_getValue_16074522848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2171;

    public StoredToken_getValue_16074522848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2171 = newInstance(Class.forName("com.microsoft.credentialstorage.model.StoredToken"));
        setField(term2171, term2171.getClass(), "type", null);
        setField(term2171, term2171.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.microsoft.credentialstorage.model.StoredToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term2171, args);
    }

};


