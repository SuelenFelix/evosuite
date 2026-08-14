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

public class TargetSystem_getPort_57054069412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30460;

    public TargetSystem_getPort_57054069412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30463 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30469 = (Object[]) newArray("java.lang.String", 3);
        setField(term30463, term30463.getClass(), "pattern", "");
        setField(term30463, term30463.getClass(), "method", "");
        setBooleanField(term30463, term30463.getClass(), "cached", true);
        setBooleanField(term30463, term30463.getClass(), "async", true);
        setField(term30463, term30463.getClass(), "keyLookupType", "");
        setField(term30463, term30463.getClass(), "keyLookupHeaders", term30469);
        setField(term30463, term30463.getClass(), "keyLookupClass", "");
        Object term30471 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30477 = (Object[]) newArray("java.lang.String", 5);
        setField(term30471, term30471.getClass(), "pattern", "");
        setField(term30471, term30471.getClass(), "method", "");
        setBooleanField(term30471, term30471.getClass(), "cached", true);
        setBooleanField(term30471, term30471.getClass(), "async", true);
        setField(term30471, term30471.getClass(), "keyLookupType", "");
        setField(term30471, term30471.getClass(), "keyLookupHeaders", term30477);
        setField(term30471, term30471.getClass(), "keyLookupClass", "");
        Object term30479 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30485 = (Object[]) newArray("java.lang.String", 0);
        setField(term30479, term30479.getClass(), "pattern", "");
        setField(term30479, term30479.getClass(), "method", "");
        setBooleanField(term30479, term30479.getClass(), "cached", false);
        setBooleanField(term30479, term30479.getClass(), "async", false);
        setField(term30479, term30479.getClass(), "keyLookupType", "");
        setField(term30479, term30479.getClass(), "keyLookupHeaders", term30485);
        setField(term30479, term30479.getClass(), "keyLookupClass", "");
        Object term30487 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30493 = (Object[]) newArray("java.lang.String", 1);
        setField(term30487, term30487.getClass(), "pattern", "");
        setField(term30487, term30487.getClass(), "method", "");
        setBooleanField(term30487, term30487.getClass(), "cached", false);
        setBooleanField(term30487, term30487.getClass(), "async", true);
        setField(term30487, term30487.getClass(), "keyLookupType", "");
        setField(term30487, term30487.getClass(), "keyLookupHeaders", term30493);
        setField(term30487, term30487.getClass(), "keyLookupClass", "");
        Object term30495 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30501 = (Object[]) newArray("java.lang.String", 0);
        setField(term30495, term30495.getClass(), "pattern", "");
        setField(term30495, term30495.getClass(), "method", "");
        setBooleanField(term30495, term30495.getClass(), "cached", false);
        setBooleanField(term30495, term30495.getClass(), "async", true);
        setField(term30495, term30495.getClass(), "keyLookupType", "");
        setField(term30495, term30495.getClass(), "keyLookupHeaders", term30501);
        setField(term30495, term30495.getClass(), "keyLookupClass", "");
        Object term30503 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30509 = (Object[]) newArray("java.lang.String", 6);
        setField(term30503, term30503.getClass(), "pattern", "");
        setField(term30503, term30503.getClass(), "method", "");
        setBooleanField(term30503, term30503.getClass(), "cached", false);
        setBooleanField(term30503, term30503.getClass(), "async", true);
        setField(term30503, term30503.getClass(), "keyLookupType", "");
        setField(term30503, term30503.getClass(), "keyLookupHeaders", term30509);
        setField(term30503, term30503.getClass(), "keyLookupClass", "");
        Object term30511 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30517 = (Object[]) newArray("java.lang.String", 7);
        setField(term30511, term30511.getClass(), "pattern", "");
        setField(term30511, term30511.getClass(), "method", "");
        setBooleanField(term30511, term30511.getClass(), "cached", true);
        setBooleanField(term30511, term30511.getClass(), "async", false);
        setField(term30511, term30511.getClass(), "keyLookupType", "");
        setField(term30511, term30511.getClass(), "keyLookupHeaders", term30517);
        setField(term30511, term30511.getClass(), "keyLookupClass", "");
        Object term30519 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30525 = (Object[]) newArray("java.lang.String", 5);
        setField(term30519, term30519.getClass(), "pattern", "");
        setField(term30519, term30519.getClass(), "method", "");
        setBooleanField(term30519, term30519.getClass(), "cached", true);
        setBooleanField(term30519, term30519.getClass(), "async", false);
        setField(term30519, term30519.getClass(), "keyLookupType", "");
        setField(term30519, term30519.getClass(), "keyLookupHeaders", term30525);
        setField(term30519, term30519.getClass(), "keyLookupClass", "");
        Object term30527 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30533 = (Object[]) newArray("java.lang.String", 8);
        setField(term30527, term30527.getClass(), "pattern", "");
        setField(term30527, term30527.getClass(), "method", "");
        setBooleanField(term30527, term30527.getClass(), "cached", true);
        setBooleanField(term30527, term30527.getClass(), "async", false);
        setField(term30527, term30527.getClass(), "keyLookupType", "");
        setField(term30527, term30527.getClass(), "keyLookupHeaders", term30533);
        setField(term30527, term30527.getClass(), "keyLookupClass", "");
        ArrayList term30461 = new ArrayList();
        ((ArrayList) term30461).add(term30463);
        ((ArrayList) term30461).add(term30471);
        ((ArrayList) term30461).add(term30479);
        ((ArrayList) term30461).add(term30487);
        ((ArrayList) term30461).add(term30495);
        ((ArrayList) term30461).add(term30503);
        ((ArrayList) term30461).add(term30511);
        ((ArrayList) term30461).add(term30519);
        ((ArrayList) term30461).add(term30527);
        Object term30539 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30539, term30539.getClass(), "id", "");
        setField(term30539, term30539.getClass(), "host", "");
        setField(term30539, term30539.getClass(), "port", "");
        setField(term30539, term30539.getClass(), "health", "");
        setField(term30539, term30539.getClass(), "scheme", "");
        setIntField(term30539, term30539.getClass(), "priority", 515182546);
        setBooleanField(term30539, term30539.getClass(), "isActive", true);
        setField(term30539, term30539.getClass(), "type", "");
        setField(term30539, term30539.getClass(), "groupId", "");
        setFloatField(term30539, term30539.getClass(), "loadFactor", 0.7799478F);
        setBooleanField(term30539, term30539.getClass(), "isReachable", true);
        Object term30551 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30551, term30551.getClass(), "id", "");
        setField(term30551, term30551.getClass(), "host", "");
        setField(term30551, term30551.getClass(), "port", "");
        setField(term30551, term30551.getClass(), "health", "");
        setField(term30551, term30551.getClass(), "scheme", "");
        setIntField(term30551, term30551.getClass(), "priority", -936895502);
        setBooleanField(term30551, term30551.getClass(), "isActive", true);
        setField(term30551, term30551.getClass(), "type", "");
        setField(term30551, term30551.getClass(), "groupId", "");
        setFloatField(term30551, term30551.getClass(), "loadFactor", 0.37100673F);
        setBooleanField(term30551, term30551.getClass(), "isReachable", true);
        ArrayList term30537 = new ArrayList();
        ((ArrayList) term30537).add(term30539);
        ((ArrayList) term30537).add(term30551);
        HashMap term30661 = new HashMap();
        HashMap term30666 = new HashMap();
        term30460 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term30460, term30460.getClass(), "cachedResources", term30461);
        setField(term30460, term30460.getClass(), "hostGroups", term30537);
        setField(term30460, term30460.getClass(), "host", "qOEJpzrzgF");
        setField(term30460, term30460.getClass(), "port", "ExvDwmtNdV");
        setField(term30460, term30460.getClass(), "hostGroupId", "MmhamxEBqw");
        setField(term30460, term30460.getClass(), "scheme", "heEXeIaieQ");
        setField(term30460, term30460.getClass(), "basePath", "MhsNUxKgPP");
        setField(term30460, term30460.getClass(), "id", "cGLyrLlynk");
        setField(term30460, term30460.getClass(), "name", "mMpSzaWkTz");
        setField(term30460, term30460.getClass(), "groupId", "leDgyXJudi");
        setField(term30460, term30460.getClass(), "includeHeaders", term30661);
        setField(term30460, term30460.getClass(), "excludeHeaders", term30666);
        setBooleanField(term30460, term30460.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPort", argTypes, term30460, args);
    }

};


