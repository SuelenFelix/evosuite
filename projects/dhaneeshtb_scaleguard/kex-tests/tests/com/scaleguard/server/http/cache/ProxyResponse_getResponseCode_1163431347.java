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

public class ProxyResponse_getResponseCode_1163431347 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5113;

    public ProxyResponse_getResponseCode_1163431347() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5113 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyResponse"));
        setField(term5113, term5113.getClass(), "id", "WVbxuoDBcn");
        setField(term5113, term5113.getClass(), "groupId", "pvDEABOxLt");
        setField(term5113, term5113.getClass(), "status", "pending");
        setIntField(term5113, term5113.getClass(), "responseCode", -883034806);
        setField(term5113, term5113.getClass(), "responseBody", "beAMpkroCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResponseCode", argTypes, term5113, args);
    }

};


