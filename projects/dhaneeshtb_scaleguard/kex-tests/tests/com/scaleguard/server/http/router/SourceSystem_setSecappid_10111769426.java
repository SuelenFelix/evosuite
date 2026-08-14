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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SourceSystem_setSecappid_10111769426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3028;

    public SourceSystem_setSecappid_10111769426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3191 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term3191, term3191.getClass(), "pattern", null);
        setField(term3191, term3191.getClass(), "method", null);
        setBooleanField(term3191, term3191.getClass(), "cached", false);
        setBooleanField(term3191, term3191.getClass(), "async", false);
        setField(term3191, term3191.getClass(), "keyLookupType", null);
        setField(term3191, term3191.getClass(), "keyLookupHeaders", null);
        setField(term3191, term3191.getClass(), "keyLookupClass", null);
        Object term3194 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term3194, term3194.getClass(), "pattern", null);
        setField(term3194, term3194.getClass(), "method", null);
        setBooleanField(term3194, term3194.getClass(), "cached", true);
        setBooleanField(term3194, term3194.getClass(), "async", true);
        setField(term3194, term3194.getClass(), "keyLookupType", null);
        setField(term3194, term3194.getClass(), "keyLookupHeaders", null);
        setField(term3194, term3194.getClass(), "keyLookupClass", null);
        Object term3197 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term3197, term3197.getClass(), "pattern", null);
        setField(term3197, term3197.getClass(), "method", null);
        setBooleanField(term3197, term3197.getClass(), "cached", false);
        setBooleanField(term3197, term3197.getClass(), "async", false);
        setField(term3197, term3197.getClass(), "keyLookupType", null);
        setField(term3197, term3197.getClass(), "keyLookupHeaders", null);
        setField(term3197, term3197.getClass(), "keyLookupClass", null);
        Object term3200 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term3200, term3200.getClass(), "pattern", null);
        setField(term3200, term3200.getClass(), "method", null);
        setBooleanField(term3200, term3200.getClass(), "cached", true);
        setBooleanField(term3200, term3200.getClass(), "async", true);
        setField(term3200, term3200.getClass(), "keyLookupType", null);
        setField(term3200, term3200.getClass(), "keyLookupHeaders", null);
        setField(term3200, term3200.getClass(), "keyLookupClass", null);
        ArrayList term3189 = new ArrayList();
        ((ArrayList) term3189).add(term3191);
        ((ArrayList) term3189).add(term3194);
        ((ArrayList) term3189).add(term3197);
        ((ArrayList) term3189).add(term3200);
        Object term3207 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term3207, term3207.getClass(), "id", null);
        setField(term3207, term3207.getClass(), "host", null);
        setField(term3207, term3207.getClass(), "port", null);
        setField(term3207, term3207.getClass(), "health", null);
        setField(term3207, term3207.getClass(), "scheme", null);
        setIntField(term3207, term3207.getClass(), "priority", -117576464);
        setBooleanField(term3207, term3207.getClass(), "isActive", true);
        setField(term3207, term3207.getClass(), "type", null);
        setField(term3207, term3207.getClass(), "groupId", null);
        setFloatField(term3207, term3207.getClass(), "loadFactor", 0.97262454F);
        setBooleanField(term3207, term3207.getClass(), "isReachable", true);
        Object term3212 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term3212, term3212.getClass(), "id", null);
        setField(term3212, term3212.getClass(), "host", null);
        setField(term3212, term3212.getClass(), "port", null);
        setField(term3212, term3212.getClass(), "health", null);
        setField(term3212, term3212.getClass(), "scheme", null);
        setIntField(term3212, term3212.getClass(), "priority", -1007160944);
        setBooleanField(term3212, term3212.getClass(), "isActive", true);
        setField(term3212, term3212.getClass(), "type", null);
        setField(term3212, term3212.getClass(), "groupId", null);
        setFloatField(term3212, term3212.getClass(), "loadFactor", 0.76550204F);
        setBooleanField(term3212, term3212.getClass(), "isReachable", true);
        ArrayList term3205 = new ArrayList();
        ((ArrayList) term3205).add(term3207);
        ((ArrayList) term3205).add(term3212);
        HashMap term3315 = new HashMap();
        HashMap term3320 = new HashMap();
        HashMap term3338 = new HashMap();
        term3028 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term3188 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term3028, term3028.getClass(), "host", "GsWxOwXvSu");
        setBooleanField(term3028, term3028.getClass(), "tunnel", true);
        setField(term3028, term3028.getClass(), "port", "bKBSncrMEZ");
        setField(term3028, term3028.getClass(), "scheme", "yeSXGqQExb");
        setField(term3028, term3028.getClass(), "basePath", "uXYcXVYJZM");
        setField(term3028, term3028.getClass(), "id", "BJhjdJUhkz");
        setField(term3028, term3028.getClass(), "name", "cdHYQDgUZR");
        setField(term3028, term3028.getClass(), "groupId", "KAORSSPSeV");
        setField(term3028, term3028.getClass(), "target", "UimMMORkzd");
        setBooleanField(term3028, term3028.getClass(), "async", false);
        setField(term3028, term3028.getClass(), "asyncEngine", "huVIXUWLtI");
        setField(term3028, term3028.getClass(), "callbackId", "vhKzFyKPOT");
        setField(term3028, term3028.getClass(), "jwtKeylookup", "nQhIgWXdRc");
        setField(term3028, term3028.getClass(), "certificateId", "EusenEbIoF");
        setField(term3028, term3028.getClass(), "secappid", "SScVQYSvWH");
        setBooleanField(term3028, term3028.getClass(), "autoProcure", false);
        setField(term3188, term3188.getClass(), "cachedResources", term3189);
        setField(term3188, term3188.getClass(), "hostGroups", term3205);
        setField(term3188, term3188.getClass(), "host", "wwAwLLcLPp");
        setField(term3188, term3188.getClass(), "port", "nHpMKOmlpQ");
        setField(term3188, term3188.getClass(), "hostGroupId", "fKhrQsJToZ");
        setField(term3188, term3188.getClass(), "scheme", "wsysQLGFnl");
        setField(term3188, term3188.getClass(), "basePath", "ckQLZGFjMX");
        setField(term3188, term3188.getClass(), "id", "qphdrqUtNx");
        setField(term3188, term3188.getClass(), "name", "bwlLFAfNWx");
        setField(term3188, term3188.getClass(), "groupId", "JWodNQzjjV");
        setField(term3188, term3188.getClass(), "includeHeaders", term3315);
        setField(term3188, term3188.getClass(), "excludeHeaders", term3320);
        setBooleanField(term3188, term3188.getClass(), "enableCache", true);
        setField(term3028, term3028.getClass(), "targetSystem", term3188);
        setField(term3028, term3028.getClass(), "headerLookup", "CAgxWjhxNf");
        setField(term3028, term3028.getClass(), "keyLookupMap", term3338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "goAoCMhKBu";
        callMethod(klass, "setSecappid", argTypes, term3028, args);
    }

};


