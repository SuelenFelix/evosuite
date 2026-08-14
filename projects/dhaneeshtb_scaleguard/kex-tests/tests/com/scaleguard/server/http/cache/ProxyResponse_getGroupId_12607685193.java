package com.scaleguard.server.http.cache;

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
import static com.scaleguard.server.http.cache.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProxyResponse_getGroupId_12607685193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4733;

    public ProxyResponse_getGroupId_12607685193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4733 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term4733, term4733.getClass(), "id", "NTlKJDDWlk");
        setField(term4733, term4733.getClass(), "groupId", "vOuMEpOQAg");
        setField(term4733, term4733.getClass(), "status", "pending");
        setIntField(term4733, term4733.getClass(), "responseCode", -1339778481);
        setField(term4733, term4733.getClass(), "responseBody", "SIODFGaQhr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term4733, args);
    }

};


