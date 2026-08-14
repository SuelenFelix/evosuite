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

public class OIDCAuthHeaderValuePreprocessor_preprocessHeaderValue_110194533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17092;

    public OIDCAuthHeaderValuePreprocessor_preprocessHeaderValue_110194533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17092 = newInstance(Class.forName("com.getindata.connectors.http.internal.OIDCAuthHeaderValuePreprocessor"));
        setField(term17092, term17092.getClass(), "oidcAuthURL", null);
        setField(term17092, term17092.getClass(), "oidcTokenRequest", null);
        setField(term17092, term17092.getClass(), "oidcExpiryReduction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.OIDCAuthHeaderValuePreprocessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "preprocessHeaderValue", argTypes, term17092, args);
    }

};


