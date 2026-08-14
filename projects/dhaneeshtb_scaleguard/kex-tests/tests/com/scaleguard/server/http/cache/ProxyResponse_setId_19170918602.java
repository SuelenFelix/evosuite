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

public class ProxyResponse_setId_19170918602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4627;

    public ProxyResponse_setId_19170918602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4627 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term4627, term4627.getClass(), "id", "PqtVXXZMqK");
        setField(term4627, term4627.getClass(), "groupId", "rYbtIDVdnd");
        setField(term4627, term4627.getClass(), "status", "pending");
        setIntField(term4627, term4627.getClass(), "responseCode", 1227103734);
        setField(term4627, term4627.getClass(), "responseBody", "UKAReurpHG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVRMUmrljA";
        callMethod(klass, "setId", argTypes, term4627, args);
    }

};


