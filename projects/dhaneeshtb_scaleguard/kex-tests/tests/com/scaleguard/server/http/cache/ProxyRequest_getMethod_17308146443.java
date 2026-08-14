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

public class ProxyRequest_getMethod_17308146443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467;

    public ProxyRequest_getMethod_17308146443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term564 = new HashMap();
        term467 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term467, term467.getClass(), "id", "BYqFIqCKAV");
        setField(term467, term467.getClass(), "method", "vrQLuWIDJX");
        setField(term467, term467.getClass(), "scheme", "flxyYxBRtu");
        setField(term467, term467.getClass(), "groupId", "OclPbYPkcH");
        setField(term467, term467.getClass(), "hostGrpId", "IoAlmYsBwc");
        setField(term467, term467.getClass(), "host", "TEParAifyi");
        setField(term467, term467.getClass(), "port", "OWDIEULEFu");
        setField(term467, term467.getClass(), "uri", "dWRymuLBtr");
        setField(term467, term467.getClass(), "headers", term564);
        setField(term467, term467.getClass(), "body", "kuTXqwMtDB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.ProxyRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethod", argTypes, term467, args);
    }

};


