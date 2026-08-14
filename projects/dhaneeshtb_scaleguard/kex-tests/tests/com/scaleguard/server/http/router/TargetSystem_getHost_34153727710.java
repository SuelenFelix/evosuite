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

public class TargetSystem_getHost_34153727710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29914;

    public TargetSystem_getHost_34153727710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29917 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term29923 = (Object[]) newArray("java.lang.String", 0);
        setField(term29917, term29917.getClass(), "pattern", "");
        setField(term29917, term29917.getClass(), "method", "");
        setBooleanField(term29917, term29917.getClass(), "cached", false);
        setBooleanField(term29917, term29917.getClass(), "async", false);
        setField(term29917, term29917.getClass(), "keyLookupType", "");
        setField(term29917, term29917.getClass(), "keyLookupHeaders", term29923);
        setField(term29917, term29917.getClass(), "keyLookupClass", "");
        ArrayList term29915 = new ArrayList();
        ((ArrayList) term29915).add(term29917);
        Object term29929 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29929, term29929.getClass(), "id", "");
        setField(term29929, term29929.getClass(), "host", "");
        setField(term29929, term29929.getClass(), "port", "");
        setField(term29929, term29929.getClass(), "health", "");
        setField(term29929, term29929.getClass(), "scheme", "");
        setIntField(term29929, term29929.getClass(), "priority", -525257914);
        setBooleanField(term29929, term29929.getClass(), "isActive", true);
        setField(term29929, term29929.getClass(), "type", "");
        setField(term29929, term29929.getClass(), "groupId", "");
        setFloatField(term29929, term29929.getClass(), "loadFactor", 0.6512871F);
        setBooleanField(term29929, term29929.getClass(), "isReachable", true);
        Object term29941 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29941, term29941.getClass(), "id", "");
        setField(term29941, term29941.getClass(), "host", "");
        setField(term29941, term29941.getClass(), "port", "");
        setField(term29941, term29941.getClass(), "health", "");
        setField(term29941, term29941.getClass(), "scheme", "");
        setIntField(term29941, term29941.getClass(), "priority", 147209682);
        setBooleanField(term29941, term29941.getClass(), "isActive", true);
        setField(term29941, term29941.getClass(), "type", "");
        setField(term29941, term29941.getClass(), "groupId", "");
        setFloatField(term29941, term29941.getClass(), "loadFactor", 0.011630058F);
        setBooleanField(term29941, term29941.getClass(), "isReachable", true);
        ArrayList term29927 = new ArrayList();
        ((ArrayList) term29927).add(term29929);
        ((ArrayList) term29927).add(term29941);
        HashMap term30051 = new HashMap();
        HashMap term30056 = new HashMap();
        term29914 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term29914, term29914.getClass(), "cachedResources", term29915);
        setField(term29914, term29914.getClass(), "hostGroups", term29927);
        setField(term29914, term29914.getClass(), "host", "sERwhJnfhH");
        setField(term29914, term29914.getClass(), "port", "ttMftcuYTC");
        setField(term29914, term29914.getClass(), "hostGroupId", "ktSwbNnkjp");
        setField(term29914, term29914.getClass(), "scheme", "GnPQSLhuqc");
        setField(term29914, term29914.getClass(), "basePath", "mfxNrcSOVD");
        setField(term29914, term29914.getClass(), "id", "jrsTEswExz");
        setField(term29914, term29914.getClass(), "name", "ZQJeRspiaW");
        setField(term29914, term29914.getClass(), "groupId", "ZPHvVTleEx");
        setField(term29914, term29914.getClass(), "includeHeaders", term30051);
        setField(term29914, term29914.getClass(), "excludeHeaders", term30056);
        setBooleanField(term29914, term29914.getClass(), "enableCache", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term29914, args);
    }

};


