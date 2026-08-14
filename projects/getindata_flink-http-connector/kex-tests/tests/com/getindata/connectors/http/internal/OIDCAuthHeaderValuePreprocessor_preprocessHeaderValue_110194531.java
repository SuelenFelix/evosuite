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
import java.lang.Object;

public class OIDCAuthHeaderValuePreprocessor_preprocessHeaderValue_110194531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17022;

    public OIDCAuthHeaderValuePreprocessor_preprocessHeaderValue_110194531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17022 = newInstance(Class.forName("com.getindata.connectors.http.internal.OIDCAuthHeaderValuePreprocessor"));
        Object term17047 = newInstance(Class.forName("java.time.Duration"));
        setField(term17022, term17022.getClass(), "oidcAuthURL", "DSNsTGYXDF");
        setField(term17022, term17022.getClass(), "oidcTokenRequest", "sQvGcVjdEx");
        setLongField(term17047, term17047.getClass(), "seconds", 122400L);
        setIntField(term17047, term17047.getClass(), "nanos", 0);
        setField(term17022, term17022.getClass(), "oidcExpiryReduction", term17047);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.OIDCAuthHeaderValuePreprocessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rLHAoqXgPh";
        callMethod(klass, "preprocessHeaderValue", argTypes, term17022, args);
    }

};


