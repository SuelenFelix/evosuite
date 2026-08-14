package com.getindata.connectors.http.internal;

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
import static com.getindata.connectors.http.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HttpLogger_logRequest_139308369912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16335;

    public HttpLogger_logRequest_139308369912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16335 = newInstance(Class.forName("com.getindata.connectors.http.internal.HttpLogger"));
        setField(term16335, term16335.getClass(), "httpLoggingLevelType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.HttpLogger");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.http.HttpRequest");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "logRequest", argTypes, term16335, args);
    }

};


