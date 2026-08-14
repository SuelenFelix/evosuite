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

public class ProxyRequest_getHost_141399291511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2227;

    public ProxyRequest_getHost_141399291511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2324 = new HashMap();
        term2227 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term2227, term2227.getClass(), "id", "iNwOJRBEjp");
        setField(term2227, term2227.getClass(), "method", "XylxrMBraH");
        setField(term2227, term2227.getClass(), "scheme", "pORebkoRdD");
        setField(term2227, term2227.getClass(), "groupId", "mXGCWJDOqA");
        setField(term2227, term2227.getClass(), "hostGrpId", "dpNsDgfPso");
        setField(term2227, term2227.getClass(), "host", "hCWPJQKpdc");
        setField(term2227, term2227.getClass(), "port", "WzMEhMXkKx");
        setField(term2227, term2227.getClass(), "uri", "XOiDvlDhdc");
        setField(term2227, term2227.getClass(), "headers", term2324);
        setField(term2227, term2227.getClass(), "body", "JDaAnsVTGV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term2227, args);
    }

};


