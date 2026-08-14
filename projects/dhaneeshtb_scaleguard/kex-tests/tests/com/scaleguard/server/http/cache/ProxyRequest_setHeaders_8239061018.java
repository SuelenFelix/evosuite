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
import java.util.LinkedHashMap;

public class ProxyRequest_setHeaders_8239061018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3756;
     Object term3875;

    public ProxyRequest_setHeaders_8239061018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3853 = new HashMap();
        term3756 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term3756, term3756.getClass(), "id", "wzsPSPcRdj");
        setField(term3756, term3756.getClass(), "method", "kGMQdqJYyB");
        setField(term3756, term3756.getClass(), "scheme", "XJJNClzHRf");
        setField(term3756, term3756.getClass(), "groupId", "HDaezxQfQR");
        setField(term3756, term3756.getClass(), "hostGrpId", "iikZEapDlu");
        setField(term3756, term3756.getClass(), "host", "nhoHrZfnIN");
        setField(term3756, term3756.getClass(), "port", "ZkMALXpEAZ");
        setField(term3756, term3756.getClass(), "uri", "tXfQjSqDzN");
        setField(term3756, term3756.getClass(), "headers", term3853);
        setField(term3756, term3756.getClass(), "body", "tlzpzIjMib");
        term3875 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term3875;
        callMethod(klass, "setHeaders", argTypes, term3756, args);
    }

};


