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

public class SourceSystem_setAsyncEngine_7085354214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1912;

    public SourceSystem_setAsyncEngine_7085354214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2075 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term2075, term2075.getClass(), "pattern", null);
        setField(term2075, term2075.getClass(), "method", null);
        setBooleanField(term2075, term2075.getClass(), "cached", false);
        setBooleanField(term2075, term2075.getClass(), "async", false);
        setField(term2075, term2075.getClass(), "keyLookupType", null);
        setField(term2075, term2075.getClass(), "keyLookupHeaders", null);
        setField(term2075, term2075.getClass(), "keyLookupClass", null);
        Object term2078 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term2078, term2078.getClass(), "pattern", null);
        setField(term2078, term2078.getClass(), "method", null);
        setBooleanField(term2078, term2078.getClass(), "cached", true);
        setBooleanField(term2078, term2078.getClass(), "async", true);
        setField(term2078, term2078.getClass(), "keyLookupType", null);
        setField(term2078, term2078.getClass(), "keyLookupHeaders", null);
        setField(term2078, term2078.getClass(), "keyLookupClass", null);
        Object term2081 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term2081, term2081.getClass(), "pattern", null);
        setField(term2081, term2081.getClass(), "method", null);
        setBooleanField(term2081, term2081.getClass(), "cached", false);
        setBooleanField(term2081, term2081.getClass(), "async", true);
        setField(term2081, term2081.getClass(), "keyLookupType", null);
        setField(term2081, term2081.getClass(), "keyLookupHeaders", null);
        setField(term2081, term2081.getClass(), "keyLookupClass", null);
        Object term2084 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term2084, term2084.getClass(), "pattern", null);
        setField(term2084, term2084.getClass(), "method", null);
        setBooleanField(term2084, term2084.getClass(), "cached", true);
        setBooleanField(term2084, term2084.getClass(), "async", true);
        setField(term2084, term2084.getClass(), "keyLookupType", null);
        setField(term2084, term2084.getClass(), "keyLookupHeaders", null);
        setField(term2084, term2084.getClass(), "keyLookupClass", null);
        ArrayList term2073 = new ArrayList();
        ((ArrayList) term2073).add(term2075);
        ((ArrayList) term2073).add(term2078);
        ((ArrayList) term2073).add(term2081);
        ((ArrayList) term2073).add(term2084);
        Object term2091 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term2091, term2091.getClass(), "id", null);
        setField(term2091, term2091.getClass(), "host", null);
        setField(term2091, term2091.getClass(), "port", null);
        setField(term2091, term2091.getClass(), "health", null);
        setField(term2091, term2091.getClass(), "scheme", null);
        setIntField(term2091, term2091.getClass(), "priority", -883034806);
        setBooleanField(term2091, term2091.getClass(), "isActive", true);
        setField(term2091, term2091.getClass(), "type", null);
        setField(term2091, term2091.getClass(), "groupId", null);
        setFloatField(term2091, term2091.getClass(), "loadFactor", 0.7944024F);
        setBooleanField(term2091, term2091.getClass(), "isReachable", true);
        ArrayList term2089 = new ArrayList();
        ((ArrayList) term2089).add(term2091);
        HashMap term2194 = new HashMap();
        HashMap term2199 = new HashMap();
        HashMap term2217 = new HashMap();
        term1912 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term2072 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term1912, term1912.getClass(), "host", "UBRmXJmfrt");
        setBooleanField(term1912, term1912.getClass(), "tunnel", true);
        setField(term1912, term1912.getClass(), "port", "WZzvmIHhzZ");
        setField(term1912, term1912.getClass(), "scheme", "doQLHkjpNm");
        setField(term1912, term1912.getClass(), "basePath", "lCyLIcSuom");
        setField(term1912, term1912.getClass(), "id", "CGOpQSZZwI");
        setField(term1912, term1912.getClass(), "name", "ypEdrstygY");
        setField(term1912, term1912.getClass(), "groupId", "sNQFlATEeQ");
        setField(term1912, term1912.getClass(), "target", "ZKMLioamsY");
        setBooleanField(term1912, term1912.getClass(), "async", true);
        setField(term1912, term1912.getClass(), "asyncEngine", "WVbxuoDBcn");
        setField(term1912, term1912.getClass(), "callbackId", "pvDEABOxLt");
        setField(term1912, term1912.getClass(), "jwtKeylookup", "beAMpkroCQ");
        setField(term1912, term1912.getClass(), "certificateId", "uSUvKAyuvd");
        setField(term1912, term1912.getClass(), "secappid", "onQLVONGuf");
        setBooleanField(term1912, term1912.getClass(), "autoProcure", false);
        setField(term2072, term2072.getClass(), "cachedResources", term2073);
        setField(term2072, term2072.getClass(), "hostGroups", term2089);
        setField(term2072, term2072.getClass(), "host", "PXdVZyoJyC");
        setField(term2072, term2072.getClass(), "port", "vLerpqavFM");
        setField(term2072, term2072.getClass(), "hostGroupId", "qnvxzwuGKX");
        setField(term2072, term2072.getClass(), "scheme", "EdPAvpluZg");
        setField(term2072, term2072.getClass(), "basePath", "DzHVBMqWtE");
        setField(term2072, term2072.getClass(), "id", "THZSpzBRYP");
        setField(term2072, term2072.getClass(), "name", "ZfBIVGBQOE");
        setField(term2072, term2072.getClass(), "groupId", "QSrDQfEsTR");
        setField(term2072, term2072.getClass(), "includeHeaders", term2194);
        setField(term2072, term2072.getClass(), "excludeHeaders", term2199);
        setBooleanField(term2072, term2072.getClass(), "enableCache", false);
        setField(term1912, term1912.getClass(), "targetSystem", term2072);
        setField(term1912, term1912.getClass(), "headerLookup", "PsqusYmejD");
        setField(term1912, term1912.getClass(), "keyLookupMap", term2217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTWMiBEaDF";
        callMethod(klass, "setAsyncEngine", argTypes, term1912, args);
    }

};


