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
import java.lang.Object;
import java.util.HashMap;

public class CachedResponse_getResource_12901041763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6548;

    public CachedResponse_getResource_12901041763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6747 = new HashMap();
        term6548 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        Object term6549 = newInstance(Class.forName("java.lang.Object"));
        Object term6550 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term6589 = (Object[]) newArray("java.lang.String", 4);
        Object term6650 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term6548, term6548.getClass(), "response", term6549);
        setField(term6550, term6550.getClass(), "pattern", "RDnkgWkcbz");
        setField(term6550, term6550.getClass(), "method", "IBpaxltauX");
        setBooleanField(term6550, term6550.getClass(), "cached", true);
        setBooleanField(term6550, term6550.getClass(), "async", true);
        setField(term6550, term6550.getClass(), "keyLookupType", "hePqROaplw");
        setElement(term6589, 0, "PJcSNDruWd");
        setElement(term6589, 1, "VVNNlAePXF");
        setElement(term6589, 2, "jnwVnmKAFv");
        setElement(term6589, 3, "TXyHhqeCjR");
        setField(term6550, term6550.getClass(), "keyLookupHeaders", term6589);
        setField(term6550, term6550.getClass(), "keyLookupClass", "lZIgPZPgTu");
        setField(term6548, term6548.getClass(), "resource", term6550);
        setField(term6650, term6650.getClass(), "id", "iuCxnHGMoW");
        setField(term6650, term6650.getClass(), "method", "GPSEWEDSTo");
        setField(term6650, term6650.getClass(), "scheme", "RCOqfVsRHt");
        setField(term6650, term6650.getClass(), "groupId", "TSyCeEZPaT");
        setField(term6650, term6650.getClass(), "hostGrpId", "JeZFtaqkzW");
        setField(term6650, term6650.getClass(), "host", "vOVuNSCCLe");
        setField(term6650, term6650.getClass(), "port", "fzeqPnzpnt");
        setField(term6650, term6650.getClass(), "uri", "RxbhrFBjkO");
        setField(term6650, term6650.getClass(), "headers", term6747);
        setField(term6650, term6650.getClass(), "body", "xClUIcPECX");
        setField(term6548, term6548.getClass(), "proxyRequest", term6650);
        setField(term6548, term6548.getClass(), "key", "avhRaGZaBF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResource", argTypes, term6548, args);
    }

};


