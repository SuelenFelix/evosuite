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
import java.lang.Boolean;

public class SourceSystem_setTunnel_17438844642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term808;
     Object term1131;

    public SourceSystem_setTunnel_17438844642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term971 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term971, term971.getClass(), "pattern", null);
        setField(term971, term971.getClass(), "method", null);
        setBooleanField(term971, term971.getClass(), "cached", true);
        setBooleanField(term971, term971.getClass(), "async", false);
        setField(term971, term971.getClass(), "keyLookupType", null);
        setField(term971, term971.getClass(), "keyLookupHeaders", null);
        setField(term971, term971.getClass(), "keyLookupClass", null);
        Object term974 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term974, term974.getClass(), "pattern", null);
        setField(term974, term974.getClass(), "method", null);
        setBooleanField(term974, term974.getClass(), "cached", true);
        setBooleanField(term974, term974.getClass(), "async", false);
        setField(term974, term974.getClass(), "keyLookupType", null);
        setField(term974, term974.getClass(), "keyLookupHeaders", null);
        setField(term974, term974.getClass(), "keyLookupClass", null);
        Object term977 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term977, term977.getClass(), "pattern", null);
        setField(term977, term977.getClass(), "method", null);
        setBooleanField(term977, term977.getClass(), "cached", true);
        setBooleanField(term977, term977.getClass(), "async", false);
        setField(term977, term977.getClass(), "keyLookupType", null);
        setField(term977, term977.getClass(), "keyLookupHeaders", null);
        setField(term977, term977.getClass(), "keyLookupClass", null);
        Object term980 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term980, term980.getClass(), "pattern", null);
        setField(term980, term980.getClass(), "method", null);
        setBooleanField(term980, term980.getClass(), "cached", true);
        setBooleanField(term980, term980.getClass(), "async", false);
        setField(term980, term980.getClass(), "keyLookupType", null);
        setField(term980, term980.getClass(), "keyLookupHeaders", null);
        setField(term980, term980.getClass(), "keyLookupClass", null);
        Object term983 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term983, term983.getClass(), "pattern", null);
        setField(term983, term983.getClass(), "method", null);
        setBooleanField(term983, term983.getClass(), "cached", false);
        setBooleanField(term983, term983.getClass(), "async", true);
        setField(term983, term983.getClass(), "keyLookupType", null);
        setField(term983, term983.getClass(), "keyLookupHeaders", null);
        setField(term983, term983.getClass(), "keyLookupClass", null);
        ArrayList term969 = new ArrayList();
        ((ArrayList) term969).add(term971);
        ((ArrayList) term969).add(term974);
        ((ArrayList) term969).add(term977);
        ((ArrayList) term969).add(term980);
        ((ArrayList) term969).add(term983);
        Object term990 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term990, term990.getClass(), "id", null);
        setField(term990, term990.getClass(), "host", null);
        setField(term990, term990.getClass(), "port", null);
        setField(term990, term990.getClass(), "health", null);
        setField(term990, term990.getClass(), "scheme", null);
        setIntField(term990, term990.getClass(), "priority", -616727354);
        setBooleanField(term990, term990.getClass(), "isActive", true);
        setField(term990, term990.getClass(), "type", null);
        setField(term990, term990.getClass(), "groupId", null);
        setFloatField(term990, term990.getClass(), "loadFactor", 0.8564069F);
        setBooleanField(term990, term990.getClass(), "isReachable", true);
        Object term995 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term995, term995.getClass(), "id", null);
        setField(term995, term995.getClass(), "host", null);
        setField(term995, term995.getClass(), "port", null);
        setField(term995, term995.getClass(), "health", null);
        setField(term995, term995.getClass(), "scheme", null);
        setIntField(term995, term995.getClass(), "priority", -1955890973);
        setBooleanField(term995, term995.getClass(), "isActive", true);
        setField(term995, term995.getClass(), "type", null);
        setField(term995, term995.getClass(), "groupId", null);
        setFloatField(term995, term995.getClass(), "loadFactor", 0.5446086F);
        setBooleanField(term995, term995.getClass(), "isReachable", true);
        Object term1000 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term1000, term1000.getClass(), "id", null);
        setField(term1000, term1000.getClass(), "host", null);
        setField(term1000, term1000.getClass(), "port", null);
        setField(term1000, term1000.getClass(), "health", null);
        setField(term1000, term1000.getClass(), "scheme", null);
        setIntField(term1000, term1000.getClass(), "priority", -2038273078);
        setBooleanField(term1000, term1000.getClass(), "isActive", true);
        setField(term1000, term1000.getClass(), "type", null);
        setField(term1000, term1000.getClass(), "groupId", null);
        setFloatField(term1000, term1000.getClass(), "loadFactor", 0.5254275F);
        setBooleanField(term1000, term1000.getClass(), "isReachable", true);
        ArrayList term988 = new ArrayList();
        ((ArrayList) term988).add(term990);
        ((ArrayList) term988).add(term995);
        ((ArrayList) term988).add(term1000);
        HashMap term1103 = new HashMap();
        HashMap term1108 = new HashMap();
        HashMap term1126 = new HashMap();
        term808 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term968 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term808, term808.getClass(), "host", "hoicvmsovO");
        setBooleanField(term808, term808.getClass(), "tunnel", true);
        setField(term808, term808.getClass(), "port", "eqJfYWRaEL");
        setField(term808, term808.getClass(), "scheme", "fhkbdRViHi");
        setField(term808, term808.getClass(), "basePath", "uWHnvSvaPl");
        setField(term808, term808.getClass(), "id", "kBdSllIBVz");
        setField(term808, term808.getClass(), "name", "TJmVBGfTML");
        setField(term808, term808.getClass(), "groupId", "tPlsykYBqO");
        setField(term808, term808.getClass(), "target", "bLPjGVBhlX");
        setBooleanField(term808, term808.getClass(), "async", true);
        setField(term808, term808.getClass(), "asyncEngine", "whBvTVIIlC");
        setField(term808, term808.getClass(), "callbackId", "IgRJUzaCwW");
        setField(term808, term808.getClass(), "jwtKeylookup", "JUmudUmaaV");
        setField(term808, term808.getClass(), "certificateId", "KoyGrUJeJW");
        setField(term808, term808.getClass(), "secappid", "HqBOwkVqjD");
        setBooleanField(term808, term808.getClass(), "autoProcure", true);
        setField(term968, term968.getClass(), "cachedResources", term969);
        setField(term968, term968.getClass(), "hostGroups", term988);
        setField(term968, term968.getClass(), "host", "pXOkjyeIRb");
        setField(term968, term968.getClass(), "port", "GgZWSjxjyE");
        setField(term968, term968.getClass(), "hostGroupId", "EeBVbzjcCI");
        setField(term968, term968.getClass(), "scheme", "UfQtPRyWRC");
        setField(term968, term968.getClass(), "basePath", "FPvxVzzSvD");
        setField(term968, term968.getClass(), "id", "WHcwFgsGFC");
        setField(term968, term968.getClass(), "name", "HzqpegHiRq");
        setField(term968, term968.getClass(), "groupId", "jwsfVjMoJT");
        setField(term968, term968.getClass(), "includeHeaders", term1103);
        setField(term968, term968.getClass(), "excludeHeaders", term1108);
        setBooleanField(term968, term968.getClass(), "enableCache", true);
        setField(term808, term808.getClass(), "targetSystem", term968);
        setField(term808, term808.getClass(), "headerLookup", "ZfdXfCCFDf");
        setField(term808, term808.getClass(), "keyLookupMap", term1126);
        term1131 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1131;
        callMethod(klass, "setTunnel", argTypes, term808, args);
    }

};


