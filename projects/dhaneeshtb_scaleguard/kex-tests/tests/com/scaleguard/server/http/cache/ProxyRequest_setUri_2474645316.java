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

public class ProxyRequest_setUri_2474645316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3316;

    public ProxyRequest_setUri_2474645316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3413 = new HashMap();
        term3316 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term3316, term3316.getClass(), "id", "vwbEQQNQrx");
        setField(term3316, term3316.getClass(), "method", "xtftXXMbem");
        setField(term3316, term3316.getClass(), "scheme", "cudZvLMQon");
        setField(term3316, term3316.getClass(), "groupId", "lihXWlGDxk");
        setField(term3316, term3316.getClass(), "hostGrpId", "JmcmxoGhIK");
        setField(term3316, term3316.getClass(), "host", "jXzmYyrnnT");
        setField(term3316, term3316.getClass(), "port", "igCAtimmYB");
        setField(term3316, term3316.getClass(), "uri", "DyiXbeYIaN");
        setField(term3316, term3316.getClass(), "headers", term3413);
        setField(term3316, term3316.getClass(), "body", "ekxGuOYIwi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RbVQXSpxXy";
        callMethod(klass, "setUri", argTypes, term3316, args);
    }

};


