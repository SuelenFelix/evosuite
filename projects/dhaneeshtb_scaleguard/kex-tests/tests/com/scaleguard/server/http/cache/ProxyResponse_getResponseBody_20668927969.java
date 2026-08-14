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

public class ProxyResponse_getResponseBody_20668927969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5283;

    public ProxyResponse_getResponseBody_20668927969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5283 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term5283, term5283.getClass(), "id", "bnsyeQXFdu");
        setField(term5283, term5283.getClass(), "groupId", "BwtdjiefJn");
        setField(term5283, term5283.getClass(), "status", "pending");
        setIntField(term5283, term5283.getClass(), "responseCode", -1685132342);
        setField(term5283, term5283.getClass(), "responseBody", "jDmhBrIoDa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseBody", argTypes, term5283, args);
    }

};


