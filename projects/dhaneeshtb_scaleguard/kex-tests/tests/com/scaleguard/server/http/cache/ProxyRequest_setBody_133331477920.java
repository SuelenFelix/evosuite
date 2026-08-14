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

public class ProxyRequest_setBody_133331477920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4241;

    public ProxyRequest_setBody_133331477920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4338 = new HashMap();
        term4241 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term4241, term4241.getClass(), "id", "gUvcueTURF");
        setField(term4241, term4241.getClass(), "method", "EwQBhZjCIT");
        setField(term4241, term4241.getClass(), "scheme", "aSkmSwTnEw");
        setField(term4241, term4241.getClass(), "groupId", "xvkbvaEGYd");
        setField(term4241, term4241.getClass(), "hostGrpId", "HBGNxdNURv");
        setField(term4241, term4241.getClass(), "host", "mfCpTPPQQm");
        setField(term4241, term4241.getClass(), "port", "OcJCIDNIXA");
        setField(term4241, term4241.getClass(), "uri", "XfRABIFVEp");
        setField(term4241, term4241.getClass(), "headers", term4338);
        setField(term4241, term4241.getClass(), "body", "IpQuOGMgmj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pJbnHTYrxn";
        callMethod(klass, "setBody", argTypes, term4241, args);
    }

};


