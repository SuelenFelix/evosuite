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

public class ProxyRequest_getGroupId_5634636879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1787;

    public ProxyRequest_getGroupId_5634636879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1884 = new HashMap();
        term1787 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term1787, term1787.getClass(), "id", "JqXGgAhZPl");
        setField(term1787, term1787.getClass(), "method", "jiKYgYHqIS");
        setField(term1787, term1787.getClass(), "scheme", "DfISiziTgG");
        setField(term1787, term1787.getClass(), "groupId", "XqgfKFvPSD");
        setField(term1787, term1787.getClass(), "hostGrpId", "JiVRgTZvKc");
        setField(term1787, term1787.getClass(), "host", "XPKmummaqg");
        setField(term1787, term1787.getClass(), "port", "BKLfkLiZTH");
        setField(term1787, term1787.getClass(), "uri", "SPpkrGcPRr");
        setField(term1787, term1787.getClass(), "headers", term1884);
        setField(term1787, term1787.getClass(), "body", "vjxIhXHxGR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term1787, args);
    }

};


