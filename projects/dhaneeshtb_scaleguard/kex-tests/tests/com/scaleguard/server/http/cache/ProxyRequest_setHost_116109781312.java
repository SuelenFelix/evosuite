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

public class ProxyRequest_setHost_116109781312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2436;

    public ProxyRequest_setHost_116109781312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2533 = new HashMap();
        term2436 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term2436, term2436.getClass(), "id", "mLUZFTfjle");
        setField(term2436, term2436.getClass(), "method", "xIeFjkHkOe");
        setField(term2436, term2436.getClass(), "scheme", "SdCKLMIYnX");
        setField(term2436, term2436.getClass(), "groupId", "OJJtVNPyKZ");
        setField(term2436, term2436.getClass(), "hostGrpId", "AKNapTAfmD");
        setField(term2436, term2436.getClass(), "host", "xJgPlLxpgC");
        setField(term2436, term2436.getClass(), "port", "EYtfuJaxiM");
        setField(term2436, term2436.getClass(), "uri", "gCWtLVKVVe");
        setField(term2436, term2436.getClass(), "headers", term2533);
        setField(term2436, term2436.getClass(), "body", "VMeAzAHwZj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        callMethod(klass, "setHost", argTypes, term2436, args);
    }

};


