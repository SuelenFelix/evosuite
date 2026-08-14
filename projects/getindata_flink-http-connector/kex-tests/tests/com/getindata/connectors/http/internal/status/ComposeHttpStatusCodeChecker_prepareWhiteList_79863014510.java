package com.getindata.connectors.http.internal.status;

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
import static com.getindata.connectors.http.internal.status.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ComposeHttpStatusCodeChecker_prepareWhiteList_79863014510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1321;

    public ComposeHttpStatusCodeChecker_prepareWhiteList_79863014510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1321 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker"));
        setField(term1321, term1321.getClass(), "excludedCodes", null);
        setField(term1321, term1321.getClass(), "errorCodes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker$ComposeHttpStatusCodeCheckerConfig");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "prepareWhiteList", argTypes, term1321, args);
    }

};


