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

public class SourceSystem_getName_170919415429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16168;

    public SourceSystem_getName_170919415429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16331 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16331, term16331.getClass(), "pattern", null);
        setField(term16331, term16331.getClass(), "method", null);
        setBooleanField(term16331, term16331.getClass(), "cached", false);
        setBooleanField(term16331, term16331.getClass(), "async", true);
        setField(term16331, term16331.getClass(), "keyLookupType", null);
        setField(term16331, term16331.getClass(), "keyLookupHeaders", null);
        setField(term16331, term16331.getClass(), "keyLookupClass", null);
        Object term16334 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16334, term16334.getClass(), "pattern", null);
        setField(term16334, term16334.getClass(), "method", null);
        setBooleanField(term16334, term16334.getClass(), "cached", true);
        setBooleanField(term16334, term16334.getClass(), "async", false);
        setField(term16334, term16334.getClass(), "keyLookupType", null);
        setField(term16334, term16334.getClass(), "keyLookupHeaders", null);
        setField(term16334, term16334.getClass(), "keyLookupClass", null);
        Object term16337 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16337, term16337.getClass(), "pattern", null);
        setField(term16337, term16337.getClass(), "method", null);
        setBooleanField(term16337, term16337.getClass(), "cached", false);
        setBooleanField(term16337, term16337.getClass(), "async", true);
        setField(term16337, term16337.getClass(), "keyLookupType", null);
        setField(term16337, term16337.getClass(), "keyLookupHeaders", null);
        setField(term16337, term16337.getClass(), "keyLookupClass", null);
        Object term16340 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16340, term16340.getClass(), "pattern", null);
        setField(term16340, term16340.getClass(), "method", null);
        setBooleanField(term16340, term16340.getClass(), "cached", true);
        setBooleanField(term16340, term16340.getClass(), "async", false);
        setField(term16340, term16340.getClass(), "keyLookupType", null);
        setField(term16340, term16340.getClass(), "keyLookupHeaders", null);
        setField(term16340, term16340.getClass(), "keyLookupClass", null);
        Object term16343 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16343, term16343.getClass(), "pattern", null);
        setField(term16343, term16343.getClass(), "method", null);
        setBooleanField(term16343, term16343.getClass(), "cached", true);
        setBooleanField(term16343, term16343.getClass(), "async", true);
        setField(term16343, term16343.getClass(), "keyLookupType", null);
        setField(term16343, term16343.getClass(), "keyLookupHeaders", null);
        setField(term16343, term16343.getClass(), "keyLookupClass", null);
        Object term16346 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16346, term16346.getClass(), "pattern", null);
        setField(term16346, term16346.getClass(), "method", null);
        setBooleanField(term16346, term16346.getClass(), "cached", false);
        setBooleanField(term16346, term16346.getClass(), "async", true);
        setField(term16346, term16346.getClass(), "keyLookupType", null);
        setField(term16346, term16346.getClass(), "keyLookupHeaders", null);
        setField(term16346, term16346.getClass(), "keyLookupClass", null);
        ArrayList term16329 = new ArrayList();
        ((ArrayList) term16329).add(term16331);
        ((ArrayList) term16329).add(term16334);
        ((ArrayList) term16329).add(term16337);
        ((ArrayList) term16329).add(term16340);
        ((ArrayList) term16329).add(term16343);
        ((ArrayList) term16329).add(term16346);
        Object term16353 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term16353, term16353.getClass(), "id", null);
        setField(term16353, term16353.getClass(), "host", null);
        setField(term16353, term16353.getClass(), "port", null);
        setField(term16353, term16353.getClass(), "health", null);
        setField(term16353, term16353.getClass(), "scheme", null);
        setIntField(term16353, term16353.getClass(), "priority", 538259104);
        setBooleanField(term16353, term16353.getClass(), "isActive", true);
        setField(term16353, term16353.getClass(), "type", null);
        setField(term16353, term16353.getClass(), "groupId", null);
        setFloatField(term16353, term16353.getClass(), "loadFactor", 0.12532318F);
        setBooleanField(term16353, term16353.getClass(), "isReachable", true);
        Object term16358 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term16358, term16358.getClass(), "id", null);
        setField(term16358, term16358.getClass(), "host", null);
        setField(term16358, term16358.getClass(), "port", null);
        setField(term16358, term16358.getClass(), "health", null);
        setField(term16358, term16358.getClass(), "scheme", null);
        setIntField(term16358, term16358.getClass(), "priority", 96566506);
        setBooleanField(term16358, term16358.getClass(), "isActive", true);
        setField(term16358, term16358.getClass(), "type", null);
        setField(term16358, term16358.getClass(), "groupId", null);
        setFloatField(term16358, term16358.getClass(), "loadFactor", 0.022483587F);
        setBooleanField(term16358, term16358.getClass(), "isReachable", true);
        Object term16363 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term16363, term16363.getClass(), "id", null);
        setField(term16363, term16363.getClass(), "host", null);
        setField(term16363, term16363.getClass(), "port", null);
        setField(term16363, term16363.getClass(), "health", null);
        setField(term16363, term16363.getClass(), "scheme", null);
        setIntField(term16363, term16363.getClass(), "priority", -343325701);
        setBooleanField(term16363, term16363.getClass(), "isActive", true);
        setField(term16363, term16363.getClass(), "type", null);
        setField(term16363, term16363.getClass(), "groupId", null);
        setFloatField(term16363, term16363.getClass(), "loadFactor", 0.9200632F);
        setBooleanField(term16363, term16363.getClass(), "isReachable", true);
        Object term16368 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term16368, term16368.getClass(), "id", null);
        setField(term16368, term16368.getClass(), "host", null);
        setField(term16368, term16368.getClass(), "port", null);
        setField(term16368, term16368.getClass(), "health", null);
        setField(term16368, term16368.getClass(), "scheme", null);
        setIntField(term16368, term16368.getClass(), "priority", 107945604);
        setBooleanField(term16368, term16368.getClass(), "isActive", true);
        setField(term16368, term16368.getClass(), "type", null);
        setField(term16368, term16368.getClass(), "groupId", null);
        setFloatField(term16368, term16368.getClass(), "loadFactor", 0.025133014F);
        setBooleanField(term16368, term16368.getClass(), "isReachable", true);
        ArrayList term16351 = new ArrayList();
        ((ArrayList) term16351).add(term16353);
        ((ArrayList) term16351).add(term16358);
        ((ArrayList) term16351).add(term16363);
        ((ArrayList) term16351).add(term16368);
        HashMap term16471 = new HashMap();
        HashMap term16476 = new HashMap();
        HashMap term16494 = new HashMap();
        term16168 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term16328 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term16168, term16168.getClass(), "host", "lkujDCFpdm");
        setBooleanField(term16168, term16168.getClass(), "tunnel", false);
        setField(term16168, term16168.getClass(), "port", "sGfzmhpQEH");
        setField(term16168, term16168.getClass(), "scheme", "FqGkFGXAbg");
        setField(term16168, term16168.getClass(), "basePath", "SSWEZgFiFO");
        setField(term16168, term16168.getClass(), "id", "spphrCslQA");
        setField(term16168, term16168.getClass(), "name", "EPkEFVlZrY");
        setField(term16168, term16168.getClass(), "groupId", "jySnpYEVPv");
        setField(term16168, term16168.getClass(), "target", "VdHqujFzSo");
        setBooleanField(term16168, term16168.getClass(), "async", false);
        setField(term16168, term16168.getClass(), "asyncEngine", "cZbOKEdKPs");
        setField(term16168, term16168.getClass(), "callbackId", "nvXqvMSAjc");
        setField(term16168, term16168.getClass(), "jwtKeylookup", "agbhgbQisl");
        setField(term16168, term16168.getClass(), "certificateId", "EZvlAVCXCm");
        setField(term16168, term16168.getClass(), "secappid", "axtbmWOSRY");
        setBooleanField(term16168, term16168.getClass(), "autoProcure", true);
        setField(term16328, term16328.getClass(), "cachedResources", term16329);
        setField(term16328, term16328.getClass(), "hostGroups", term16351);
        setField(term16328, term16328.getClass(), "host", "shazlRAQrB");
        setField(term16328, term16328.getClass(), "port", "PNJdNWkxgW");
        setField(term16328, term16328.getClass(), "hostGroupId", "aCTJvzQZSQ");
        setField(term16328, term16328.getClass(), "scheme", "hcvedmWnmW");
        setField(term16328, term16328.getClass(), "basePath", "rBZaHWidIS");
        setField(term16328, term16328.getClass(), "id", "xneQCADwGB");
        setField(term16328, term16328.getClass(), "name", "luSCmxphxi");
        setField(term16328, term16328.getClass(), "groupId", "OGEDwuJhjV");
        setField(term16328, term16328.getClass(), "includeHeaders", term16471);
        setField(term16328, term16328.getClass(), "excludeHeaders", term16476);
        setBooleanField(term16328, term16328.getClass(), "enableCache", true);
        setField(term16168, term16168.getClass(), "targetSystem", term16328);
        setField(term16168, term16168.getClass(), "headerLookup", "vepOtOxlWM");
        setField(term16168, term16168.getClass(), "keyLookupMap", term16494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term16168, args);
    }

};


