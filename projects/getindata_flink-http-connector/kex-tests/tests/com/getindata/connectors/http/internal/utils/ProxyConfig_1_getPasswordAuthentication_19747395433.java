package com.getindata.connectors.http.internal.utils;

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
import static com.getindata.connectors.http.internal.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProxyConfig_1_getPasswordAuthentication_19747395433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2649;

    public ProxyConfig_1_getPasswordAuthentication_19747395433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2649 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.ProxyConfig$1"));
        setField(term2649, term2649.getClass(), "val$host", null);
        setField(term2649, term2649.getClass(), "val$proxyUsername", null);
        setField(term2649, term2649.getClass(), "val$proxyPassword", null);
        setField(term2649, term2649.getClass(), "this$0", null);
        setField(term2649, term2649.getClass(), "requestingHost", null);
        setField(term2649, term2649.getClass(), "requestingSite", null);
        setIntField(term2649, term2649.getClass(), "requestingPort", 0);
        setField(term2649, term2649.getClass(), "requestingProtocol", null);
        setField(term2649, term2649.getClass(), "requestingPrompt", null);
        setField(term2649, term2649.getClass(), "requestingScheme", null);
        setField(term2649, term2649.getClass(), "requestingURL", null);
        setField(term2649, term2649.getClass(), "requestingAuthType", null);
        setField(term2649, term2649.getClass(), "key", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.ProxyConfig$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPasswordAuthentication", argTypes, term2649, args);
    }

};


