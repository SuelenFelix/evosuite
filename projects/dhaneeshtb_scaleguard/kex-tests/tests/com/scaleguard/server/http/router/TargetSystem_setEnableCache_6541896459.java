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
import java.lang.Boolean;

public class TargetSystem_setEnableCache_6541896459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29676;
     Object term29832;

    public TargetSystem_setEnableCache_6541896459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29679 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term29685 = (Object[]) newArray("java.lang.String", 7);
        setField(term29679, term29679.getClass(), "pattern", "");
        setField(term29679, term29679.getClass(), "method", "");
        setBooleanField(term29679, term29679.getClass(), "cached", true);
        setBooleanField(term29679, term29679.getClass(), "async", true);
        setField(term29679, term29679.getClass(), "keyLookupType", "");
        setField(term29679, term29679.getClass(), "keyLookupHeaders", term29685);
        setField(term29679, term29679.getClass(), "keyLookupClass", "");
        Object term29687 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term29693 = (Object[]) newArray("java.lang.String", 4);
        setField(term29687, term29687.getClass(), "pattern", "");
        setField(term29687, term29687.getClass(), "method", "");
        setBooleanField(term29687, term29687.getClass(), "cached", false);
        setBooleanField(term29687, term29687.getClass(), "async", false);
        setField(term29687, term29687.getClass(), "keyLookupType", "");
        setField(term29687, term29687.getClass(), "keyLookupHeaders", term29693);
        setField(term29687, term29687.getClass(), "keyLookupClass", "");
        ArrayList term29677 = new ArrayList();
        ((ArrayList) term29677).add(term29679);
        ((ArrayList) term29677).add(term29687);
        Object term29699 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29699, term29699.getClass(), "id", "");
        setField(term29699, term29699.getClass(), "host", "");
        setField(term29699, term29699.getClass(), "port", "");
        setField(term29699, term29699.getClass(), "health", "");
        setField(term29699, term29699.getClass(), "scheme", "");
        setIntField(term29699, term29699.getClass(), "priority", -1497710478);
        setBooleanField(term29699, term29699.getClass(), "isActive", true);
        setField(term29699, term29699.getClass(), "type", "");
        setField(term29699, term29699.getClass(), "groupId", "");
        setFloatField(term29699, term29699.getClass(), "loadFactor", 0.9022041F);
        setBooleanField(term29699, term29699.getClass(), "isReachable", true);
        Object term29711 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29711, term29711.getClass(), "id", "");
        setField(term29711, term29711.getClass(), "host", "");
        setField(term29711, term29711.getClass(), "port", "");
        setField(term29711, term29711.getClass(), "health", "");
        setField(term29711, term29711.getClass(), "scheme", "");
        setIntField(term29711, term29711.getClass(), "priority", 49950830);
        setBooleanField(term29711, term29711.getClass(), "isActive", true);
        setField(term29711, term29711.getClass(), "type", "");
        setField(term29711, term29711.getClass(), "groupId", "");
        setFloatField(term29711, term29711.getClass(), "loadFactor", 0.06234348F);
        setBooleanField(term29711, term29711.getClass(), "isReachable", true);
        ArrayList term29697 = new ArrayList();
        ((ArrayList) term29697).add(term29699);
        ((ArrayList) term29697).add(term29711);
        HashMap term29821 = new HashMap();
        HashMap term29826 = new HashMap();
        term29676 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term29676, term29676.getClass(), "cachedResources", term29677);
        setField(term29676, term29676.getClass(), "hostGroups", term29697);
        setField(term29676, term29676.getClass(), "host", "LcLfqpnOTW");
        setField(term29676, term29676.getClass(), "port", "hGwBHMBbGw");
        setField(term29676, term29676.getClass(), "hostGroupId", "CzTiZXTrcB");
        setField(term29676, term29676.getClass(), "scheme", "HOEmWmVnLk");
        setField(term29676, term29676.getClass(), "basePath", "LxSzRiSUke");
        setField(term29676, term29676.getClass(), "id", "NxbQJWSXQu");
        setField(term29676, term29676.getClass(), "name", "ByfIvofaQE");
        setField(term29676, term29676.getClass(), "groupId", "xvhHgJLoQS");
        setField(term29676, term29676.getClass(), "includeHeaders", term29821);
        setField(term29676, term29676.getClass(), "excludeHeaders", term29826);
        setBooleanField(term29676, term29676.getClass(), "enableCache", false);
        term29832 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term29832;
        callMethod(klass, "setEnableCache", argTypes, term29676, args);
    }

};


