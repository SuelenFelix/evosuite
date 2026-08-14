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

public class ProxyResponse_setResponseCode_10528687008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5197;
     Object term5244;

    public ProxyResponse_setResponseCode_10528687008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5197 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term5197, term5197.getClass(), "id", "uSUvKAyuvd");
        setField(term5197, term5197.getClass(), "groupId", "onQLVONGuf");
        setField(term5197, term5197.getClass(), "status", "pending");
        setIntField(term5197, term5197.getClass(), "responseCode", 1585847225);
        setField(term5197, term5197.getClass(), "responseBody", "SOrEHbcbmn");
        term5244 = new Integer(597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5244;
        callMethod(klass, "setResponseCode", argTypes, term5197, args);
    }

};


