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
import java.lang.Integer;

public class ProxyResponse_setResponseCode_105286870019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5487;
     Object term5489;

    public ProxyResponse_setResponseCode_105286870019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5487 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term5487, term5487.getClass(), "id", null);
        setField(term5487, term5487.getClass(), "groupId", null);
        setField(term5487, term5487.getClass(), "status", null);
        setIntField(term5487, term5487.getClass(), "responseCode", 0);
        setField(term5487, term5487.getClass(), "responseBody", null);
        term5489 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5489;
        callMethod(klass, "setResponseCode", argTypes, term5487, args);
    }

};


