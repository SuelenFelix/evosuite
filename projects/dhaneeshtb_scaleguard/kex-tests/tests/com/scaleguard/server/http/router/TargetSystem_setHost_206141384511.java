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

public class TargetSystem_setHost_206141384511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30142;

    public TargetSystem_setHost_206141384511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30145 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30151 = (Object[]) newArray("java.lang.String", 2);
        setField(term30145, term30145.getClass(), "pattern", "");
        setField(term30145, term30145.getClass(), "method", "");
        setBooleanField(term30145, term30145.getClass(), "cached", false);
        setBooleanField(term30145, term30145.getClass(), "async", false);
        setField(term30145, term30145.getClass(), "keyLookupType", "");
        setField(term30145, term30145.getClass(), "keyLookupHeaders", term30151);
        setField(term30145, term30145.getClass(), "keyLookupClass", "");
        Object term30153 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30159 = (Object[]) newArray("java.lang.String", 0);
        setField(term30153, term30153.getClass(), "pattern", "");
        setField(term30153, term30153.getClass(), "method", "");
        setBooleanField(term30153, term30153.getClass(), "cached", true);
        setBooleanField(term30153, term30153.getClass(), "async", false);
        setField(term30153, term30153.getClass(), "keyLookupType", "");
        setField(term30153, term30153.getClass(), "keyLookupHeaders", term30159);
        setField(term30153, term30153.getClass(), "keyLookupClass", "");
        Object term30161 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30167 = (Object[]) newArray("java.lang.String", 5);
        setField(term30161, term30161.getClass(), "pattern", "");
        setField(term30161, term30161.getClass(), "method", "");
        setBooleanField(term30161, term30161.getClass(), "cached", false);
        setBooleanField(term30161, term30161.getClass(), "async", false);
        setField(term30161, term30161.getClass(), "keyLookupType", "");
        setField(term30161, term30161.getClass(), "keyLookupHeaders", term30167);
        setField(term30161, term30161.getClass(), "keyLookupClass", "");
        Object term30169 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30175 = (Object[]) newArray("java.lang.String", 4);
        setField(term30169, term30169.getClass(), "pattern", "");
        setField(term30169, term30169.getClass(), "method", "");
        setBooleanField(term30169, term30169.getClass(), "cached", false);
        setBooleanField(term30169, term30169.getClass(), "async", true);
        setField(term30169, term30169.getClass(), "keyLookupType", "");
        setField(term30169, term30169.getClass(), "keyLookupHeaders", term30175);
        setField(term30169, term30169.getClass(), "keyLookupClass", "");
        Object term30177 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30183 = (Object[]) newArray("java.lang.String", 3);
        setField(term30177, term30177.getClass(), "pattern", "");
        setField(term30177, term30177.getClass(), "method", "");
        setBooleanField(term30177, term30177.getClass(), "cached", true);
        setBooleanField(term30177, term30177.getClass(), "async", false);
        setField(term30177, term30177.getClass(), "keyLookupType", "");
        setField(term30177, term30177.getClass(), "keyLookupHeaders", term30183);
        setField(term30177, term30177.getClass(), "keyLookupClass", "");
        ArrayList term30143 = new ArrayList();
        ((ArrayList) term30143).add(term30145);
        ((ArrayList) term30143).add(term30153);
        ((ArrayList) term30143).add(term30161);
        ((ArrayList) term30143).add(term30169);
        ((ArrayList) term30143).add(term30177);
        Object term30189 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30189, term30189.getClass(), "id", "");
        setField(term30189, term30189.getClass(), "host", "");
        setField(term30189, term30189.getClass(), "port", "");
        setField(term30189, term30189.getClass(), "health", "");
        setField(term30189, term30189.getClass(), "scheme", "");
        setIntField(term30189, term30189.getClass(), "priority", 34470066);
        setBooleanField(term30189, term30189.getClass(), "isActive", true);
        setField(term30189, term30189.getClass(), "type", "");
        setField(term30189, term30189.getClass(), "groupId", "");
        setFloatField(term30189, term30189.getClass(), "loadFactor", 0.87770385F);
        setBooleanField(term30189, term30189.getClass(), "isReachable", true);
        Object term30201 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30201, term30201.getClass(), "id", "");
        setField(term30201, term30201.getClass(), "host", "");
        setField(term30201, term30201.getClass(), "port", "");
        setField(term30201, term30201.getClass(), "health", "");
        setField(term30201, term30201.getClass(), "scheme", "");
        setIntField(term30201, term30201.getClass(), "priority", 2058711405);
        setBooleanField(term30201, term30201.getClass(), "isActive", true);
        setField(term30201, term30201.getClass(), "type", "");
        setField(term30201, term30201.getClass(), "groupId", "");
        setFloatField(term30201, term30201.getClass(), "loadFactor", 0.034274876F);
        setBooleanField(term30201, term30201.getClass(), "isReachable", true);
        Object term30213 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30213, term30213.getClass(), "id", "");
        setField(term30213, term30213.getClass(), "host", "");
        setField(term30213, term30213.getClass(), "port", "");
        setField(term30213, term30213.getClass(), "health", "");
        setField(term30213, term30213.getClass(), "scheme", "");
        setIntField(term30213, term30213.getClass(), "priority", 1743683601);
        setBooleanField(term30213, term30213.getClass(), "isActive", true);
        setField(term30213, term30213.getClass(), "type", "");
        setField(term30213, term30213.getClass(), "groupId", "");
        setFloatField(term30213, term30213.getClass(), "loadFactor", 0.008025646F);
        setBooleanField(term30213, term30213.getClass(), "isReachable", true);
        Object term30225 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30225, term30225.getClass(), "id", "");
        setField(term30225, term30225.getClass(), "host", "");
        setField(term30225, term30225.getClass(), "port", "");
        setField(term30225, term30225.getClass(), "health", "");
        setField(term30225, term30225.getClass(), "scheme", "");
        setIntField(term30225, term30225.getClass(), "priority", -945116798);
        setBooleanField(term30225, term30225.getClass(), "isActive", true);
        setField(term30225, term30225.getClass(), "type", "");
        setField(term30225, term30225.getClass(), "groupId", "");
        setFloatField(term30225, term30225.getClass(), "loadFactor", 0.47933108F);
        setBooleanField(term30225, term30225.getClass(), "isReachable", true);
        Object term30237 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30237, term30237.getClass(), "id", "");
        setField(term30237, term30237.getClass(), "host", "");
        setField(term30237, term30237.getClass(), "port", "");
        setField(term30237, term30237.getClass(), "health", "");
        setField(term30237, term30237.getClass(), "scheme", "");
        setIntField(term30237, term30237.getClass(), "priority", 1593461795);
        setBooleanField(term30237, term30237.getClass(), "isActive", true);
        setField(term30237, term30237.getClass(), "type", "");
        setField(term30237, term30237.getClass(), "groupId", "");
        setFloatField(term30237, term30237.getClass(), "loadFactor", 0.40598297F);
        setBooleanField(term30237, term30237.getClass(), "isReachable", true);
        ArrayList term30187 = new ArrayList();
        ((ArrayList) term30187).add(term30189);
        ((ArrayList) term30187).add(term30201);
        ((ArrayList) term30187).add(term30213);
        ((ArrayList) term30187).add(term30225);
        ((ArrayList) term30187).add(term30237);
        HashMap term30347 = new HashMap();
        HashMap term30352 = new HashMap();
        term30142 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term30142, term30142.getClass(), "cachedResources", term30143);
        setField(term30142, term30142.getClass(), "hostGroups", term30187);
        setField(term30142, term30142.getClass(), "host", "FYhlObvAKO");
        setField(term30142, term30142.getClass(), "port", "GFxNoBwsCD");
        setField(term30142, term30142.getClass(), "hostGroupId", "zBVQNMxMvk");
        setField(term30142, term30142.getClass(), "scheme", "iJSPWddhZO");
        setField(term30142, term30142.getClass(), "basePath", "WbvttDefvl");
        setField(term30142, term30142.getClass(), "id", "coNhvymEkq");
        setField(term30142, term30142.getClass(), "name", "dMuXJftgrw");
        setField(term30142, term30142.getClass(), "groupId", "INNyzaqXFS");
        setField(term30142, term30142.getClass(), "includeHeaders", term30347);
        setField(term30142, term30142.getClass(), "excludeHeaders", term30352);
        setBooleanField(term30142, term30142.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GdZWpscDov";
        callMethod(klass, "setHost", argTypes, term30142, args);
    }

};


