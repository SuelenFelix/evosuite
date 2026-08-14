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

public class ProxyResponse_getStatus_18553198515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4923;

    public ProxyResponse_getStatus_18553198515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4923 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term4923, term4923.getClass(), "id", "WZzvmIHhzZ");
        setField(term4923, term4923.getClass(), "groupId", "doQLHkjpNm");
        setField(term4923, term4923.getClass(), "status", "pending");
        setIntField(term4923, term4923.getClass(), "responseCode", -522618178);
        setField(term4923, term4923.getClass(), "responseBody", "lCyLIcSuom");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term4923, args);
    }

};


