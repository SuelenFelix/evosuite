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

public class TargetSystem_isEnableCache_14732501278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29392;

    public TargetSystem_isEnableCache_14732501278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29395 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term29401 = (Object[]) newArray("java.lang.String", 5);
        setField(term29395, term29395.getClass(), "pattern", "");
        setField(term29395, term29395.getClass(), "method", "");
        setBooleanField(term29395, term29395.getClass(), "cached", true);
        setBooleanField(term29395, term29395.getClass(), "async", true);
        setField(term29395, term29395.getClass(), "keyLookupType", "");
        setField(term29395, term29395.getClass(), "keyLookupHeaders", term29401);
        setField(term29395, term29395.getClass(), "keyLookupClass", "");
        Object term29403 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term29409 = (Object[]) newArray("java.lang.String", 0);
        setField(term29403, term29403.getClass(), "pattern", "");
        setField(term29403, term29403.getClass(), "method", "");
        setBooleanField(term29403, term29403.getClass(), "cached", true);
        setBooleanField(term29403, term29403.getClass(), "async", false);
        setField(term29403, term29403.getClass(), "keyLookupType", "");
        setField(term29403, term29403.getClass(), "keyLookupHeaders", term29409);
        setField(term29403, term29403.getClass(), "keyLookupClass", "");
        ArrayList term29393 = new ArrayList();
        ((ArrayList) term29393).add(term29395);
        ((ArrayList) term29393).add(term29403);
        Object term29415 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29415, term29415.getClass(), "id", "");
        setField(term29415, term29415.getClass(), "host", "");
        setField(term29415, term29415.getClass(), "port", "");
        setField(term29415, term29415.getClass(), "health", "");
        setField(term29415, term29415.getClass(), "scheme", "");
        setIntField(term29415, term29415.getClass(), "priority", 1935707624);
        setBooleanField(term29415, term29415.getClass(), "isActive", true);
        setField(term29415, term29415.getClass(), "type", "");
        setField(term29415, term29415.getClass(), "groupId", "");
        setFloatField(term29415, term29415.getClass(), "loadFactor", 0.19625396F);
        setBooleanField(term29415, term29415.getClass(), "isReachable", true);
        Object term29427 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29427, term29427.getClass(), "id", "");
        setField(term29427, term29427.getClass(), "host", "");
        setField(term29427, term29427.getClass(), "port", "");
        setField(term29427, term29427.getClass(), "health", "");
        setField(term29427, term29427.getClass(), "scheme", "");
        setIntField(term29427, term29427.getClass(), "priority", 1507074215);
        setBooleanField(term29427, term29427.getClass(), "isActive", true);
        setField(term29427, term29427.getClass(), "type", "");
        setField(term29427, term29427.getClass(), "groupId", "");
        setFloatField(term29427, term29427.getClass(), "loadFactor", 0.234712F);
        setBooleanField(term29427, term29427.getClass(), "isReachable", true);
        Object term29439 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29439, term29439.getClass(), "id", "");
        setField(term29439, term29439.getClass(), "host", "");
        setField(term29439, term29439.getClass(), "port", "");
        setField(term29439, term29439.getClass(), "health", "");
        setField(term29439, term29439.getClass(), "scheme", "");
        setIntField(term29439, term29439.getClass(), "priority", -282881827);
        setBooleanField(term29439, term29439.getClass(), "isActive", true);
        setField(term29439, term29439.getClass(), "type", "");
        setField(term29439, term29439.getClass(), "groupId", "");
        setFloatField(term29439, term29439.getClass(), "loadFactor", 0.450692F);
        setBooleanField(term29439, term29439.getClass(), "isReachable", true);
        Object term29451 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29451, term29451.getClass(), "id", "");
        setField(term29451, term29451.getClass(), "host", "");
        setField(term29451, term29451.getClass(), "port", "");
        setField(term29451, term29451.getClass(), "health", "");
        setField(term29451, term29451.getClass(), "scheme", "");
        setIntField(term29451, term29451.getClass(), "priority", -1183353915);
        setBooleanField(term29451, term29451.getClass(), "isActive", true);
        setField(term29451, term29451.getClass(), "type", "");
        setField(term29451, term29451.getClass(), "groupId", "");
        setFloatField(term29451, term29451.getClass(), "loadFactor", 0.35089302F);
        setBooleanField(term29451, term29451.getClass(), "isReachable", true);
        Object term29463 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29463, term29463.getClass(), "id", "");
        setField(term29463, term29463.getClass(), "host", "");
        setField(term29463, term29463.getClass(), "port", "");
        setField(term29463, term29463.getClass(), "health", "");
        setField(term29463, term29463.getClass(), "scheme", "");
        setIntField(term29463, term29463.getClass(), "priority", -420030135);
        setBooleanField(term29463, term29463.getClass(), "isActive", true);
        setField(term29463, term29463.getClass(), "type", "");
        setField(term29463, term29463.getClass(), "groupId", "");
        setFloatField(term29463, term29463.getClass(), "loadFactor", 0.9341364F);
        setBooleanField(term29463, term29463.getClass(), "isReachable", true);
        Object term29475 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29475, term29475.getClass(), "id", "");
        setField(term29475, term29475.getClass(), "host", "");
        setField(term29475, term29475.getClass(), "port", "");
        setField(term29475, term29475.getClass(), "health", "");
        setField(term29475, term29475.getClass(), "scheme", "");
        setIntField(term29475, term29475.getClass(), "priority", 267763294);
        setBooleanField(term29475, term29475.getClass(), "isActive", true);
        setField(term29475, term29475.getClass(), "type", "");
        setField(term29475, term29475.getClass(), "groupId", "");
        setFloatField(term29475, term29475.getClass(), "loadFactor", 0.7244789F);
        setBooleanField(term29475, term29475.getClass(), "isReachable", true);
        ArrayList term29413 = new ArrayList();
        ((ArrayList) term29413).add(term29415);
        ((ArrayList) term29413).add(term29427);
        ((ArrayList) term29413).add(term29439);
        ((ArrayList) term29413).add(term29451);
        ((ArrayList) term29413).add(term29463);
        ((ArrayList) term29413).add(term29475);
        HashMap term29585 = new HashMap();
        HashMap term29590 = new HashMap();
        term29392 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term29392, term29392.getClass(), "cachedResources", term29393);
        setField(term29392, term29392.getClass(), "hostGroups", term29413);
        setField(term29392, term29392.getClass(), "host", "jXaYbKgogd");
        setField(term29392, term29392.getClass(), "port", "MxPRraPVdF");
        setField(term29392, term29392.getClass(), "hostGroupId", "dnWHLTYWVU");
        setField(term29392, term29392.getClass(), "scheme", "AOSOeWGCwi");
        setField(term29392, term29392.getClass(), "basePath", "pBmevrFCmp");
        setField(term29392, term29392.getClass(), "id", "DOCvwqbYDn");
        setField(term29392, term29392.getClass(), "name", "mnqceiHjKv");
        setField(term29392, term29392.getClass(), "groupId", "AsVDXoZoBU");
        setField(term29392, term29392.getClass(), "includeHeaders", term29585);
        setField(term29392, term29392.getClass(), "excludeHeaders", term29590);
        setBooleanField(term29392, term29392.getClass(), "enableCache", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isEnableCache", argTypes, term29392, args);
    }

};


