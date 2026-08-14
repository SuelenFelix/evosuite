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

public class ProxyConfig_1_init_19136474430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2348;
     Object term2374;
     Object term2375;

    public ProxyConfig_1_init_19136474430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2348 = newInstance(Class.forName("com.getindata.connectors.http.internal.utils.ProxyConfig"));
        setField(term2348, term2348.getClass(), "host", "SPpkrGcPRr");
        setIntField(term2348, term2348.getClass(), "port", 679763016);
        setField(term2348, term2348.getClass(), "authenticator", null);
        term2374 = newInstance(Class.forName("java.util.Optional"));
        setField(term2374, term2374.getClass(), "value", null);
        term2375 = newInstance(Class.forName("java.util.Optional"));
        setField(term2375, term2375.getClass(), "value", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.utils.ProxyConfig$1");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.getindata.connectors.http.internal.utils.ProxyConfig");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Optional");
        argTypes[3] = Class.forName("java.util.Optional");
        Object[] args = new Object[4];
        args[0] = term2348;
        args[1] = "sEccwbJKYE";
        args[2] = term2374;
        args[3] = term2375;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


