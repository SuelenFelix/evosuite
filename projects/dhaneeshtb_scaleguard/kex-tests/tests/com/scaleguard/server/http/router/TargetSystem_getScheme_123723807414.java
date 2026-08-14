package com.scaleguard.server.http.router;

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
import static com.scaleguard.server.http.router.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class TargetSystem_getScheme_123723807414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31038;

    public TargetSystem_getScheme_123723807414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31041 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31047 = (Object[]) newArray("java.lang.String", 9);
        setField(term31041, term31041.getClass(), "pattern", "");
        setField(term31041, term31041.getClass(), "method", "");
        setBooleanField(term31041, term31041.getClass(), "cached", false);
        setBooleanField(term31041, term31041.getClass(), "async", true);
        setField(term31041, term31041.getClass(), "keyLookupType", "");
        setField(term31041, term31041.getClass(), "keyLookupHeaders", term31047);
        setField(term31041, term31041.getClass(), "keyLookupClass", "");
        Object term31049 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31055 = (Object[]) newArray("java.lang.String", 4);
        setField(term31049, term31049.getClass(), "pattern", "");
        setField(term31049, term31049.getClass(), "method", "");
        setBooleanField(term31049, term31049.getClass(), "cached", true);
        setBooleanField(term31049, term31049.getClass(), "async", false);
        setField(term31049, term31049.getClass(), "keyLookupType", "");
        setField(term31049, term31049.getClass(), "keyLookupHeaders", term31055);
        setField(term31049, term31049.getClass(), "keyLookupClass", "");
        Object term31057 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31063 = (Object[]) newArray("java.lang.String", 6);
        setField(term31057, term31057.getClass(), "pattern", "");
        setField(term31057, term31057.getClass(), "method", "");
        setBooleanField(term31057, term31057.getClass(), "cached", false);
        setBooleanField(term31057, term31057.getClass(), "async", false);
        setField(term31057, term31057.getClass(), "keyLookupType", "");
        setField(term31057, term31057.getClass(), "keyLookupHeaders", term31063);
        setField(term31057, term31057.getClass(), "keyLookupClass", "");
        Object term31065 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31071 = (Object[]) newArray("java.lang.String", 4);
        setField(term31065, term31065.getClass(), "pattern", "");
        setField(term31065, term31065.getClass(), "method", "");
        setBooleanField(term31065, term31065.getClass(), "cached", false);
        setBooleanField(term31065, term31065.getClass(), "async", false);
        setField(term31065, term31065.getClass(), "keyLookupType", "");
        setField(term31065, term31065.getClass(), "keyLookupHeaders", term31071);
        setField(term31065, term31065.getClass(), "keyLookupClass", "");
        ArrayList term31039 = new ArrayList();
        ((ArrayList) term31039).add(term31041);
        ((ArrayList) term31039).add(term31049);
        ((ArrayList) term31039).add(term31057);
        ((ArrayList) term31039).add(term31065);
        Object term31077 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31077, term31077.getClass(), "id", "");
        setField(term31077, term31077.getClass(), "host", "");
        setField(term31077, term31077.getClass(), "port", "");
        setField(term31077, term31077.getClass(), "health", "");
        setField(term31077, term31077.getClass(), "scheme", "");
        setIntField(term31077, term31077.getClass(), "priority", -376422566);
        setBooleanField(term31077, term31077.getClass(), "isActive", true);
        setField(term31077, term31077.getClass(), "type", "");
        setField(term31077, term31077.getClass(), "groupId", "");
        setFloatField(term31077, term31077.getClass(), "loadFactor", 0.04640019F);
        setBooleanField(term31077, term31077.getClass(), "isReachable", true);
        Object term31089 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31089, term31089.getClass(), "id", "");
        setField(term31089, term31089.getClass(), "host", "");
        setField(term31089, term31089.getClass(), "port", "");
        setField(term31089, term31089.getClass(), "health", "");
        setField(term31089, term31089.getClass(), "scheme", "");
        setIntField(term31089, term31089.getClass(), "priority", 306847454);
        setBooleanField(term31089, term31089.getClass(), "isActive", true);
        setField(term31089, term31089.getClass(), "type", "");
        setField(term31089, term31089.getClass(), "groupId", "");
        setFloatField(term31089, term31089.getClass(), "loadFactor", 0.7216883F);
        setBooleanField(term31089, term31089.getClass(), "isReachable", true);
        Object term31101 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31101, term31101.getClass(), "id", "");
        setField(term31101, term31101.getClass(), "host", "");
        setField(term31101, term31101.getClass(), "port", "");
        setField(term31101, term31101.getClass(), "health", "");
        setField(term31101, term31101.getClass(), "scheme", "");
        setIntField(term31101, term31101.getClass(), "priority", 1745276158);
        setBooleanField(term31101, term31101.getClass(), "isActive", true);
        setField(term31101, term31101.getClass(), "type", "");
        setField(term31101, term31101.getClass(), "groupId", "");
        setFloatField(term31101, term31101.getClass(), "loadFactor", 0.9123573F);
        setBooleanField(term31101, term31101.getClass(), "isReachable", true);
        Object term31113 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31113, term31113.getClass(), "id", "");
        setField(term31113, term31113.getClass(), "host", "");
        setField(term31113, term31113.getClass(), "port", "");
        setField(term31113, term31113.getClass(), "health", "");
        setField(term31113, term31113.getClass(), "scheme", "");
        setIntField(term31113, term31113.getClass(), "priority", 2009020256);
        setBooleanField(term31113, term31113.getClass(), "isActive", true);
        setField(term31113, term31113.getClass(), "type", "");
        setField(term31113, term31113.getClass(), "groupId", "");
        setFloatField(term31113, term31113.getClass(), "loadFactor", 0.07144344F);
        setBooleanField(term31113, term31113.getClass(), "isReachable", true);
        Object term31125 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31125, term31125.getClass(), "id", "");
        setField(term31125, term31125.getClass(), "host", "");
        setField(term31125, term31125.getClass(), "port", "");
        setField(term31125, term31125.getClass(), "health", "");
        setField(term31125, term31125.getClass(), "scheme", "");
        setIntField(term31125, term31125.getClass(), "priority", 2049577015);
        setBooleanField(term31125, term31125.getClass(), "isActive", true);
        setField(term31125, term31125.getClass(), "type", "");
        setField(term31125, term31125.getClass(), "groupId", "");
        setFloatField(term31125, term31125.getClass(), "loadFactor", 0.4063537F);
        setBooleanField(term31125, term31125.getClass(), "isReachable", true);
        ArrayList term31075 = new ArrayList();
        ((ArrayList) term31075).add(term31077);
        ((ArrayList) term31075).add(term31089);
        ((ArrayList) term31075).add(term31101);
        ((ArrayList) term31075).add(term31113);
        ((ArrayList) term31075).add(term31125);
        HashMap term31235 = new HashMap();
        HashMap term31240 = new HashMap();
        term31038 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term31038, term31038.getClass(), "cachedResources", term31039);
        setField(term31038, term31038.getClass(), "hostGroups", term31075);
        setField(term31038, term31038.getClass(), "host", "dWqMWOnvZA");
        setField(term31038, term31038.getClass(), "port", "LWvhNNTPry");
        setField(term31038, term31038.getClass(), "hostGroupId", "NKZtzKmNMG");
        setField(term31038, term31038.getClass(), "scheme", "bybEmXMboY");
        setField(term31038, term31038.getClass(), "basePath", "mSHWVzcYng");
        setField(term31038, term31038.getClass(), "id", "JbyjPaAJuH");
        setField(term31038, term31038.getClass(), "name", "YxeVJOSiti");
        setField(term31038, term31038.getClass(), "groupId", "IuUPZzTzjB");
        setField(term31038, term31038.getClass(), "includeHeaders", term31235);
        setField(term31038, term31038.getClass(), "excludeHeaders", term31240);
        setBooleanField(term31038, term31038.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScheme", argTypes, term31038, args);
    }

};


