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

public class ProxyRequest_getBody_124177594919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4032;

    public ProxyRequest_getBody_124177594919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4129 = new HashMap();
        term4032 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term4032, term4032.getClass(), "id", "GrqozDKFOk");
        setField(term4032, term4032.getClass(), "method", "CFyoseFGLF");
        setField(term4032, term4032.getClass(), "scheme", "SFqCrhEWLm");
        setField(term4032, term4032.getClass(), "groupId", "GZdcJyZntS");
        setField(term4032, term4032.getClass(), "hostGrpId", "OIHoJeysUi");
        setField(term4032, term4032.getClass(), "host", "WXMWFDGcLB");
        setField(term4032, term4032.getClass(), "port", "wKWbJssZuG");
        setField(term4032, term4032.getClass(), "uri", "NzBMMhkhpT");
        setField(term4032, term4032.getClass(), "headers", term4129);
        setField(term4032, term4032.getClass(), "body", "TwfWVQGiIj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBody", argTypes, term4032, args);
    }

};


