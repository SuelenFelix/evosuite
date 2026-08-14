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

public class SourceSystem_setScheme_87376800824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13337;

    public SourceSystem_setScheme_87376800824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13500 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term13500, term13500.getClass(), "pattern", null);
        setField(term13500, term13500.getClass(), "method", null);
        setBooleanField(term13500, term13500.getClass(), "cached", false);
        setBooleanField(term13500, term13500.getClass(), "async", false);
        setField(term13500, term13500.getClass(), "keyLookupType", null);
        setField(term13500, term13500.getClass(), "keyLookupHeaders", null);
        setField(term13500, term13500.getClass(), "keyLookupClass", null);
        Object term13503 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term13503, term13503.getClass(), "pattern", null);
        setField(term13503, term13503.getClass(), "method", null);
        setBooleanField(term13503, term13503.getClass(), "cached", false);
        setBooleanField(term13503, term13503.getClass(), "async", false);
        setField(term13503, term13503.getClass(), "keyLookupType", null);
        setField(term13503, term13503.getClass(), "keyLookupHeaders", null);
        setField(term13503, term13503.getClass(), "keyLookupClass", null);
        Object term13506 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term13506, term13506.getClass(), "pattern", null);
        setField(term13506, term13506.getClass(), "method", null);
        setBooleanField(term13506, term13506.getClass(), "cached", true);
        setBooleanField(term13506, term13506.getClass(), "async", true);
        setField(term13506, term13506.getClass(), "keyLookupType", null);
        setField(term13506, term13506.getClass(), "keyLookupHeaders", null);
        setField(term13506, term13506.getClass(), "keyLookupClass", null);
        Object term13509 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term13509, term13509.getClass(), "pattern", null);
        setField(term13509, term13509.getClass(), "method", null);
        setBooleanField(term13509, term13509.getClass(), "cached", true);
        setBooleanField(term13509, term13509.getClass(), "async", false);
        setField(term13509, term13509.getClass(), "keyLookupType", null);
        setField(term13509, term13509.getClass(), "keyLookupHeaders", null);
        setField(term13509, term13509.getClass(), "keyLookupClass", null);
        Object term13512 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term13512, term13512.getClass(), "pattern", null);
        setField(term13512, term13512.getClass(), "method", null);
        setBooleanField(term13512, term13512.getClass(), "cached", true);
        setBooleanField(term13512, term13512.getClass(), "async", false);
        setField(term13512, term13512.getClass(), "keyLookupType", null);
        setField(term13512, term13512.getClass(), "keyLookupHeaders", null);
        setField(term13512, term13512.getClass(), "keyLookupClass", null);
        ArrayList term13498 = new ArrayList();
        ((ArrayList) term13498).add(term13500);
        ((ArrayList) term13498).add(term13503);
        ((ArrayList) term13498).add(term13506);
        ((ArrayList) term13498).add(term13509);
        ((ArrayList) term13498).add(term13512);
        Object term13519 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term13519, term13519.getClass(), "id", null);
        setField(term13519, term13519.getClass(), "host", null);
        setField(term13519, term13519.getClass(), "port", null);
        setField(term13519, term13519.getClass(), "health", null);
        setField(term13519, term13519.getClass(), "scheme", null);
        setIntField(term13519, term13519.getClass(), "priority", -663691365);
        setBooleanField(term13519, term13519.getClass(), "isActive", true);
        setField(term13519, term13519.getClass(), "type", null);
        setField(term13519, term13519.getClass(), "groupId", null);
        setFloatField(term13519, term13519.getClass(), "loadFactor", 0.8454723F);
        setBooleanField(term13519, term13519.getClass(), "isReachable", true);
        Object term13524 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term13524, term13524.getClass(), "id", null);
        setField(term13524, term13524.getClass(), "host", null);
        setField(term13524, term13524.getClass(), "port", null);
        setField(term13524, term13524.getClass(), "health", null);
        setField(term13524, term13524.getClass(), "scheme", null);
        setIntField(term13524, term13524.getClass(), "priority", 339854490);
        setBooleanField(term13524, term13524.getClass(), "isActive", true);
        setField(term13524, term13524.getClass(), "type", null);
        setField(term13524, term13524.getClass(), "groupId", null);
        setFloatField(term13524, term13524.getClass(), "loadFactor", 0.079128504F);
        setBooleanField(term13524, term13524.getClass(), "isReachable", true);
        ArrayList term13517 = new ArrayList();
        ((ArrayList) term13517).add(term13519);
        ((ArrayList) term13517).add(term13524);
        HashMap term13627 = new HashMap();
        HashMap term13632 = new HashMap();
        HashMap term13650 = new HashMap();
        term13337 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term13497 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term13337, term13337.getClass(), "host", "PdeSzTcBgY");
        setBooleanField(term13337, term13337.getClass(), "tunnel", false);
        setField(term13337, term13337.getClass(), "port", "PmSvMYNoIS");
        setField(term13337, term13337.getClass(), "scheme", "zejWtMxJdV");
        setField(term13337, term13337.getClass(), "basePath", "YUIUZeZiMK");
        setField(term13337, term13337.getClass(), "id", "rrPETbKRef");
        setField(term13337, term13337.getClass(), "name", "viZRlrisPY");
        setField(term13337, term13337.getClass(), "groupId", "VSfRsPLslq");
        setField(term13337, term13337.getClass(), "target", "dwygneuBjP");
        setBooleanField(term13337, term13337.getClass(), "async", false);
        setField(term13337, term13337.getClass(), "asyncEngine", "LfKgkzPZpX");
        setField(term13337, term13337.getClass(), "callbackId", "belyXxMqFm");
        setField(term13337, term13337.getClass(), "jwtKeylookup", "LPotuCwkwB");
        setField(term13337, term13337.getClass(), "certificateId", "zpCKXLOzse");
        setField(term13337, term13337.getClass(), "secappid", "qhlWSiHAHt");
        setBooleanField(term13337, term13337.getClass(), "autoProcure", false);
        setField(term13497, term13497.getClass(), "cachedResources", term13498);
        setField(term13497, term13497.getClass(), "hostGroups", term13517);
        setField(term13497, term13497.getClass(), "host", "bdONLhBZoA");
        setField(term13497, term13497.getClass(), "port", "qPVeRcolUe");
        setField(term13497, term13497.getClass(), "hostGroupId", "AscZyfQFkU");
        setField(term13497, term13497.getClass(), "scheme", "nPfruizWey");
        setField(term13497, term13497.getClass(), "basePath", "RvgkUqMUFX");
        setField(term13497, term13497.getClass(), "id", "nOqmldTbXj");
        setField(term13497, term13497.getClass(), "name", "xNDnWDGUNx");
        setField(term13497, term13497.getClass(), "groupId", "faGVqjLquQ");
        setField(term13497, term13497.getClass(), "includeHeaders", term13627);
        setField(term13497, term13497.getClass(), "excludeHeaders", term13632);
        setBooleanField(term13497, term13497.getClass(), "enableCache", true);
        setField(term13337, term13337.getClass(), "targetSystem", term13497);
        setField(term13337, term13337.getClass(), "headerLookup", "MbsTNUmNqV");
        setField(term13337, term13337.getClass(), "keyLookupMap", term13650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VdDIonpedU";
        callMethod(klass, "setScheme", argTypes, term13337, args);
    }

};


