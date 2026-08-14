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
import java.lang.Integer;

public class ComposeHttpStatusCodeChecker_isErrorCode_9530698397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1316;
     Object term1317;

    public ComposeHttpStatusCodeChecker_isErrorCode_9530698397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1316 = newInstance(Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker"));
        setField(term1316, term1316.getClass(), "excludedCodes", null);
        setField(term1316, term1316.getClass(), "errorCodes", null);
        term1317 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.status.ComposeHttpStatusCodeChecker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1317;
        callMethod(klass, "isErrorCode", argTypes, term1316, args);
    }

};


