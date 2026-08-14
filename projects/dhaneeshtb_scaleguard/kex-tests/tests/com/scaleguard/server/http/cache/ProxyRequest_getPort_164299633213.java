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
import java.util.HashMap;

public class ProxyRequest_getPort_164299633213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2667;

    public ProxyRequest_getPort_164299633213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2764 = new HashMap();
        term2667 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term2667, term2667.getClass(), "id", "ZzIujlwVsw");
        setField(term2667, term2667.getClass(), "method", "LWyEaeIyAo");
        setField(term2667, term2667.getClass(), "scheme", "yVMkkQhvmN");
        setField(term2667, term2667.getClass(), "groupId", "mvrkADEgpp");
        setField(term2667, term2667.getClass(), "hostGrpId", "pXOkjyeIRb");
        setField(term2667, term2667.getClass(), "host", "GgZWSjxjyE");
        setField(term2667, term2667.getClass(), "port", "EeBVbzjcCI");
        setField(term2667, term2667.getClass(), "uri", "UfQtPRyWRC");
        setField(term2667, term2667.getClass(), "headers", term2764);
        setField(term2667, term2667.getClass(), "body", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPort", argTypes, term2667, args);
    }

};


