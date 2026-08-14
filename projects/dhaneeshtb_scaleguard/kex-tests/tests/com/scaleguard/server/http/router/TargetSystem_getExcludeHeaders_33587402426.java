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

public class TargetSystem_getExcludeHeaders_33587402426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34705;

    public TargetSystem_getExcludeHeaders_33587402426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34708 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term34714 = (Object[]) newArray("java.lang.String", 4);
        setField(term34708, term34708.getClass(), "pattern", "");
        setField(term34708, term34708.getClass(), "method", "");
        setBooleanField(term34708, term34708.getClass(), "cached", true);
        setBooleanField(term34708, term34708.getClass(), "async", true);
        setField(term34708, term34708.getClass(), "keyLookupType", "");
        setField(term34708, term34708.getClass(), "keyLookupHeaders", term34714);
        setField(term34708, term34708.getClass(), "keyLookupClass", "");
        Object term34716 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term34722 = (Object[]) newArray("java.lang.String", 9);
        setField(term34716, term34716.getClass(), "pattern", "");
        setField(term34716, term34716.getClass(), "method", "");
        setBooleanField(term34716, term34716.getClass(), "cached", true);
        setBooleanField(term34716, term34716.getClass(), "async", false);
        setField(term34716, term34716.getClass(), "keyLookupType", "");
        setField(term34716, term34716.getClass(), "keyLookupHeaders", term34722);
        setField(term34716, term34716.getClass(), "keyLookupClass", "");
        ArrayList term34706 = new ArrayList();
        ((ArrayList) term34706).add(term34708);
        ((ArrayList) term34706).add(term34716);
        Object term34728 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term34728, term34728.getClass(), "id", "");
        setField(term34728, term34728.getClass(), "host", "");
        setField(term34728, term34728.getClass(), "port", "");
        setField(term34728, term34728.getClass(), "health", "");
        setField(term34728, term34728.getClass(), "scheme", "");
        setIntField(term34728, term34728.getClass(), "priority", -1560631747);
        setBooleanField(term34728, term34728.getClass(), "isActive", true);
        setField(term34728, term34728.getClass(), "type", "");
        setField(term34728, term34728.getClass(), "groupId", "");
        setFloatField(term34728, term34728.getClass(), "loadFactor", 0.3017112F);
        setBooleanField(term34728, term34728.getClass(), "isReachable", true);
        Object term34740 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term34740, term34740.getClass(), "id", "");
        setField(term34740, term34740.getClass(), "host", "");
        setField(term34740, term34740.getClass(), "port", "");
        setField(term34740, term34740.getClass(), "health", "");
        setField(term34740, term34740.getClass(), "scheme", "");
        setIntField(term34740, term34740.getClass(), "priority", 1215150180);
        setBooleanField(term34740, term34740.getClass(), "isActive", true);
        setField(term34740, term34740.getClass(), "type", "");
        setField(term34740, term34740.getClass(), "groupId", "");
        setFloatField(term34740, term34740.getClass(), "loadFactor", 0.5597136F);
        setBooleanField(term34740, term34740.getClass(), "isReachable", true);
        Object term34752 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term34752, term34752.getClass(), "id", "");
        setField(term34752, term34752.getClass(), "host", "");
        setField(term34752, term34752.getClass(), "port", "");
        setField(term34752, term34752.getClass(), "health", "");
        setField(term34752, term34752.getClass(), "scheme", "");
        setIntField(term34752, term34752.getClass(), "priority", -1422859977);
        setBooleanField(term34752, term34752.getClass(), "isActive", true);
        setField(term34752, term34752.getClass(), "type", "");
        setField(term34752, term34752.getClass(), "groupId", "");
        setFloatField(term34752, term34752.getClass(), "loadFactor", 0.6366371F);
        setBooleanField(term34752, term34752.getClass(), "isReachable", true);
        Object term34764 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term34764, term34764.getClass(), "id", "");
        setField(term34764, term34764.getClass(), "host", "");
        setField(term34764, term34764.getClass(), "port", "");
        setField(term34764, term34764.getClass(), "health", "");
        setField(term34764, term34764.getClass(), "scheme", "");
        setIntField(term34764, term34764.getClass(), "priority", -1972436591);
        setBooleanField(term34764, term34764.getClass(), "isActive", true);
        setField(term34764, term34764.getClass(), "type", "");
        setField(term34764, term34764.getClass(), "groupId", "");
        setFloatField(term34764, term34764.getClass(), "loadFactor", 0.28292418F);
        setBooleanField(term34764, term34764.getClass(), "isReachable", true);
        ArrayList term34726 = new ArrayList();
        ((ArrayList) term34726).add(term34728);
        ((ArrayList) term34726).add(term34740);
        ((ArrayList) term34726).add(term34752);
        ((ArrayList) term34726).add(term34764);
        HashMap term34874 = new HashMap();
        HashMap term34879 = new HashMap();
        term34705 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term34705, term34705.getClass(), "cachedResources", term34706);
        setField(term34705, term34705.getClass(), "hostGroups", term34726);
        setField(term34705, term34705.getClass(), "host", "luSAqFzxeY");
        setField(term34705, term34705.getClass(), "port", "gHSquTdfrK");
        setField(term34705, term34705.getClass(), "hostGroupId", "lwSNhfQGzI");
        setField(term34705, term34705.getClass(), "scheme", "MvvzPTyVSb");
        setField(term34705, term34705.getClass(), "basePath", "aLyUXyVGbN");
        setField(term34705, term34705.getClass(), "id", "OHqCZWvTjl");
        setField(term34705, term34705.getClass(), "name", "UqemyfWxle");
        setField(term34705, term34705.getClass(), "groupId", "nhoRGmIXDW");
        setField(term34705, term34705.getClass(), "includeHeaders", term34874);
        setField(term34705, term34705.getClass(), "excludeHeaders", term34879);
        setBooleanField(term34705, term34705.getClass(), "enableCache", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludeHeaders", argTypes, term34705, args);
    }

};


