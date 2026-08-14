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

public class SourceSystem_setCallbackId_5149103736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20059;

    public SourceSystem_setCallbackId_5149103736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20222 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20222, term20222.getClass(), "pattern", null);
        setField(term20222, term20222.getClass(), "method", null);
        setBooleanField(term20222, term20222.getClass(), "cached", false);
        setBooleanField(term20222, term20222.getClass(), "async", false);
        setField(term20222, term20222.getClass(), "keyLookupType", null);
        setField(term20222, term20222.getClass(), "keyLookupHeaders", null);
        setField(term20222, term20222.getClass(), "keyLookupClass", null);
        Object term20225 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20225, term20225.getClass(), "pattern", null);
        setField(term20225, term20225.getClass(), "method", null);
        setBooleanField(term20225, term20225.getClass(), "cached", false);
        setBooleanField(term20225, term20225.getClass(), "async", false);
        setField(term20225, term20225.getClass(), "keyLookupType", null);
        setField(term20225, term20225.getClass(), "keyLookupHeaders", null);
        setField(term20225, term20225.getClass(), "keyLookupClass", null);
        Object term20228 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20228, term20228.getClass(), "pattern", null);
        setField(term20228, term20228.getClass(), "method", null);
        setBooleanField(term20228, term20228.getClass(), "cached", false);
        setBooleanField(term20228, term20228.getClass(), "async", true);
        setField(term20228, term20228.getClass(), "keyLookupType", null);
        setField(term20228, term20228.getClass(), "keyLookupHeaders", null);
        setField(term20228, term20228.getClass(), "keyLookupClass", null);
        Object term20231 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20231, term20231.getClass(), "pattern", null);
        setField(term20231, term20231.getClass(), "method", null);
        setBooleanField(term20231, term20231.getClass(), "cached", true);
        setBooleanField(term20231, term20231.getClass(), "async", true);
        setField(term20231, term20231.getClass(), "keyLookupType", null);
        setField(term20231, term20231.getClass(), "keyLookupHeaders", null);
        setField(term20231, term20231.getClass(), "keyLookupClass", null);
        Object term20234 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20234, term20234.getClass(), "pattern", null);
        setField(term20234, term20234.getClass(), "method", null);
        setBooleanField(term20234, term20234.getClass(), "cached", true);
        setBooleanField(term20234, term20234.getClass(), "async", false);
        setField(term20234, term20234.getClass(), "keyLookupType", null);
        setField(term20234, term20234.getClass(), "keyLookupHeaders", null);
        setField(term20234, term20234.getClass(), "keyLookupClass", null);
        Object term20237 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20237, term20237.getClass(), "pattern", null);
        setField(term20237, term20237.getClass(), "method", null);
        setBooleanField(term20237, term20237.getClass(), "cached", false);
        setBooleanField(term20237, term20237.getClass(), "async", false);
        setField(term20237, term20237.getClass(), "keyLookupType", null);
        setField(term20237, term20237.getClass(), "keyLookupHeaders", null);
        setField(term20237, term20237.getClass(), "keyLookupClass", null);
        Object term20240 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20240, term20240.getClass(), "pattern", null);
        setField(term20240, term20240.getClass(), "method", null);
        setBooleanField(term20240, term20240.getClass(), "cached", true);
        setBooleanField(term20240, term20240.getClass(), "async", false);
        setField(term20240, term20240.getClass(), "keyLookupType", null);
        setField(term20240, term20240.getClass(), "keyLookupHeaders", null);
        setField(term20240, term20240.getClass(), "keyLookupClass", null);
        Object term20243 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20243, term20243.getClass(), "pattern", null);
        setField(term20243, term20243.getClass(), "method", null);
        setBooleanField(term20243, term20243.getClass(), "cached", false);
        setBooleanField(term20243, term20243.getClass(), "async", false);
        setField(term20243, term20243.getClass(), "keyLookupType", null);
        setField(term20243, term20243.getClass(), "keyLookupHeaders", null);
        setField(term20243, term20243.getClass(), "keyLookupClass", null);
        Object term20246 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term20246, term20246.getClass(), "pattern", null);
        setField(term20246, term20246.getClass(), "method", null);
        setBooleanField(term20246, term20246.getClass(), "cached", false);
        setBooleanField(term20246, term20246.getClass(), "async", true);
        setField(term20246, term20246.getClass(), "keyLookupType", null);
        setField(term20246, term20246.getClass(), "keyLookupHeaders", null);
        setField(term20246, term20246.getClass(), "keyLookupClass", null);
        ArrayList term20220 = new ArrayList();
        ((ArrayList) term20220).add(term20222);
        ((ArrayList) term20220).add(term20225);
        ((ArrayList) term20220).add(term20228);
        ((ArrayList) term20220).add(term20231);
        ((ArrayList) term20220).add(term20234);
        ((ArrayList) term20220).add(term20237);
        ((ArrayList) term20220).add(term20240);
        ((ArrayList) term20220).add(term20243);
        ((ArrayList) term20220).add(term20246);
        Object term20253 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term20253, term20253.getClass(), "id", null);
        setField(term20253, term20253.getClass(), "host", null);
        setField(term20253, term20253.getClass(), "port", null);
        setField(term20253, term20253.getClass(), "health", null);
        setField(term20253, term20253.getClass(), "scheme", null);
        setIntField(term20253, term20253.getClass(), "priority", -2014576105);
        setBooleanField(term20253, term20253.getClass(), "isActive", true);
        setField(term20253, term20253.getClass(), "type", null);
        setField(term20253, term20253.getClass(), "groupId", null);
        setFloatField(term20253, term20253.getClass(), "loadFactor", 0.53094494F);
        setBooleanField(term20253, term20253.getClass(), "isReachable", true);
        ArrayList term20251 = new ArrayList();
        ((ArrayList) term20251).add(term20253);
        HashMap term20356 = new HashMap();
        HashMap term20361 = new HashMap();
        HashMap term20379 = new HashMap();
        term20059 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term20219 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term20059, term20059.getClass(), "host", "pfyJIgGkiH");
        setBooleanField(term20059, term20059.getClass(), "tunnel", false);
        setField(term20059, term20059.getClass(), "port", "lvQpEwdZeM");
        setField(term20059, term20059.getClass(), "scheme", "xtNmObxmHy");
        setField(term20059, term20059.getClass(), "basePath", "nComTwhtzu");
        setField(term20059, term20059.getClass(), "id", "gXyUtfRzMt");
        setField(term20059, term20059.getClass(), "name", "RUmloTNkOF");
        setField(term20059, term20059.getClass(), "groupId", "xlEdrgoOEf");
        setField(term20059, term20059.getClass(), "target", "DfKLAuTNTf");
        setBooleanField(term20059, term20059.getClass(), "async", false);
        setField(term20059, term20059.getClass(), "asyncEngine", "lWuRJaTZQB");
        setField(term20059, term20059.getClass(), "callbackId", "jiQYzmbdOz");
        setField(term20059, term20059.getClass(), "jwtKeylookup", "HBnovMFfRR");
        setField(term20059, term20059.getClass(), "certificateId", "kvBRGWtVMY");
        setField(term20059, term20059.getClass(), "secappid", "nnkddhphsi");
        setBooleanField(term20059, term20059.getClass(), "autoProcure", false);
        setField(term20219, term20219.getClass(), "cachedResources", term20220);
        setField(term20219, term20219.getClass(), "hostGroups", term20251);
        setField(term20219, term20219.getClass(), "host", "JOSsHVpnAd");
        setField(term20219, term20219.getClass(), "port", "PbEsDEkNLx");
        setField(term20219, term20219.getClass(), "hostGroupId", "pWmmwQMysX");
        setField(term20219, term20219.getClass(), "scheme", "BuJzsOARZG");
        setField(term20219, term20219.getClass(), "basePath", "lIqJQDMmVL");
        setField(term20219, term20219.getClass(), "id", "cXTrsrxYFN");
        setField(term20219, term20219.getClass(), "name", "pEUndHGBiE");
        setField(term20219, term20219.getClass(), "groupId", "PCzKLiLqoO");
        setField(term20219, term20219.getClass(), "includeHeaders", term20356);
        setField(term20219, term20219.getClass(), "excludeHeaders", term20361);
        setBooleanField(term20219, term20219.getClass(), "enableCache", true);
        setField(term20059, term20059.getClass(), "targetSystem", term20219);
        setField(term20059, term20059.getClass(), "headerLookup", "JuYhKUgElF");
        setField(term20059, term20059.getClass(), "keyLookupMap", term20379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NInWPlYtwe";
        callMethod(klass, "setCallbackId", argTypes, term20059, args);
    }

};


