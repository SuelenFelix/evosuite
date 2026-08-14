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

public class CachedResponse_setResource_6026277984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6959;
     Object term7202;

    public CachedResponse_setResource_6026277984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7170 = new HashMap();
        term6959 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResponse"));
        Object term6960 = newInstance(Class.forName("java.lang.Object"));
        Object term6961 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term7000 = (Object[]) newArray("java.lang.String", 5);
        Object term7073 = newInstance(Class.forName("com.scaleguard.server.http.cache.ProxyRequest"));
        setField(term6959, term6959.getClass(), "response", term6960);
        setField(term6961, term6961.getClass(), "pattern", "JkgoRtImdE");
        setField(term6961, term6961.getClass(), "method", "qFGKIJjlmV");
        setBooleanField(term6961, term6961.getClass(), "cached", true);
        setBooleanField(term6961, term6961.getClass(), "async", true);
        setField(term6961, term6961.getClass(), "keyLookupType", "IHqvyhMtuM");
        setElement(term7000, 0, "dAldIGYAXV");
        setElement(term7000, 1, "mLwibAPEsa");
        setElement(term7000, 2, "zsWKWiTFuo");
        setElement(term7000, 3, "UPUbwyHQKN");
        setElement(term7000, 4, "lgQkrXANyI");
        setField(term6961, term6961.getClass(), "keyLookupHeaders", term7000);
        setField(term6961, term6961.getClass(), "keyLookupClass", "MeTmRZXErV");
        setField(term6959, term6959.getClass(), "resource", term6961);
        setField(term7073, term7073.getClass(), "id", "jNxbVmoZgq");
        setField(term7073, term7073.getClass(), "method", "PvmBHIXaMY");
        setField(term7073, term7073.getClass(), "scheme", "hulYxtowxw");
        setField(term7073, term7073.getClass(), "groupId", "GNEmuHPNcU");
        setField(term7073, term7073.getClass(), "hostGrpId", "IoSfuKDFRe");
        setField(term7073, term7073.getClass(), "host", "AWYyZiNfsm");
        setField(term7073, term7073.getClass(), "port", "ITRRYiuDwH");
        setField(term7073, term7073.getClass(), "uri", "llRfwANcVF");
        setField(term7073, term7073.getClass(), "headers", term7170);
        setField(term7073, term7073.getClass(), "body", "eOJfbiZLnb");
        setField(term6959, term6959.getClass(), "proxyRequest", term7073);
        setField(term6959, term6959.getClass(), "key", "nKZKnxWYCK");
        term7202 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term7241 = (Object[]) newArray("java.lang.String", 0);
        setField(term7202, term7202.getClass(), "pattern", "JOqQxuzRuZ");
        setField(term7202, term7202.getClass(), "method", "RSaoipUlsg");
        setBooleanField(term7202, term7202.getClass(), "cached", false);
        setBooleanField(term7202, term7202.getClass(), "async", true);
        setField(term7202, term7202.getClass(), "keyLookupType", "cSHGbqKqlN");
        setField(term7202, term7202.getClass(), "keyLookupHeaders", term7241);
        setField(term7202, term7202.getClass(), "keyLookupClass", "pFAfANnxup");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.cache.CachedResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.cache.CachedResource");
        Object[] args = new Object[1];
        args[0] = term7202;
        callMethod(klass, "setResource", argTypes, term6959, args);
    }

};


