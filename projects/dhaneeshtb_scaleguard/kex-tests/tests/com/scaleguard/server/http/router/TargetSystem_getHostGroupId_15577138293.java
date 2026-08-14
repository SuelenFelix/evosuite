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

public class TargetSystem_getHostGroupId_15577138293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27580;

    public TargetSystem_getHostGroupId_15577138293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27583 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term27589 = (Object[]) newArray("java.lang.String", 9);
        setField(term27583, term27583.getClass(), "pattern", "");
        setField(term27583, term27583.getClass(), "method", "");
        setBooleanField(term27583, term27583.getClass(), "cached", true);
        setBooleanField(term27583, term27583.getClass(), "async", false);
        setField(term27583, term27583.getClass(), "keyLookupType", "");
        setField(term27583, term27583.getClass(), "keyLookupHeaders", term27589);
        setField(term27583, term27583.getClass(), "keyLookupClass", "");
        Object term27591 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term27597 = (Object[]) newArray("java.lang.String", 0);
        setField(term27591, term27591.getClass(), "pattern", "");
        setField(term27591, term27591.getClass(), "method", "");
        setBooleanField(term27591, term27591.getClass(), "cached", true);
        setBooleanField(term27591, term27591.getClass(), "async", true);
        setField(term27591, term27591.getClass(), "keyLookupType", "");
        setField(term27591, term27591.getClass(), "keyLookupHeaders", term27597);
        setField(term27591, term27591.getClass(), "keyLookupClass", "");
        Object term27599 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term27605 = (Object[]) newArray("java.lang.String", 8);
        setField(term27599, term27599.getClass(), "pattern", "");
        setField(term27599, term27599.getClass(), "method", "");
        setBooleanField(term27599, term27599.getClass(), "cached", false);
        setBooleanField(term27599, term27599.getClass(), "async", true);
        setField(term27599, term27599.getClass(), "keyLookupType", "");
        setField(term27599, term27599.getClass(), "keyLookupHeaders", term27605);
        setField(term27599, term27599.getClass(), "keyLookupClass", "");
        Object term27607 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term27613 = (Object[]) newArray("java.lang.String", 4);
        setField(term27607, term27607.getClass(), "pattern", "");
        setField(term27607, term27607.getClass(), "method", "");
        setBooleanField(term27607, term27607.getClass(), "cached", false);
        setBooleanField(term27607, term27607.getClass(), "async", false);
        setField(term27607, term27607.getClass(), "keyLookupType", "");
        setField(term27607, term27607.getClass(), "keyLookupHeaders", term27613);
        setField(term27607, term27607.getClass(), "keyLookupClass", "");
        ArrayList term27581 = new ArrayList();
        ((ArrayList) term27581).add(term27583);
        ((ArrayList) term27581).add(term27591);
        ((ArrayList) term27581).add(term27599);
        ((ArrayList) term27581).add(term27607);
        Object term27619 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term27619, term27619.getClass(), "id", "");
        setField(term27619, term27619.getClass(), "host", "");
        setField(term27619, term27619.getClass(), "port", "");
        setField(term27619, term27619.getClass(), "health", "");
        setField(term27619, term27619.getClass(), "scheme", "");
        setIntField(term27619, term27619.getClass(), "priority", 880977281);
        setBooleanField(term27619, term27619.getClass(), "isActive", true);
        setField(term27619, term27619.getClass(), "type", "");
        setField(term27619, term27619.getClass(), "groupId", "");
        setFloatField(term27619, term27619.getClass(), "loadFactor", 0.5037956F);
        setBooleanField(term27619, term27619.getClass(), "isReachable", true);
        Object term27631 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term27631, term27631.getClass(), "id", "");
        setField(term27631, term27631.getClass(), "host", "");
        setField(term27631, term27631.getClass(), "port", "");
        setField(term27631, term27631.getClass(), "health", "");
        setField(term27631, term27631.getClass(), "scheme", "");
        setIntField(term27631, term27631.getClass(), "priority", 371943306);
        setBooleanField(term27631, term27631.getClass(), "isActive", true);
        setField(term27631, term27631.getClass(), "type", "");
        setField(term27631, term27631.getClass(), "groupId", "");
        setFloatField(term27631, term27631.getClass(), "loadFactor", 0.06587154F);
        setBooleanField(term27631, term27631.getClass(), "isReachable", true);
        ArrayList term27617 = new ArrayList();
        ((ArrayList) term27617).add(term27619);
        ((ArrayList) term27617).add(term27631);
        HashMap term27741 = new HashMap();
        HashMap term27746 = new HashMap();
        term27580 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term27580, term27580.getClass(), "cachedResources", term27581);
        setField(term27580, term27580.getClass(), "hostGroups", term27617);
        setField(term27580, term27580.getClass(), "host", "SiShLTAOSK");
        setField(term27580, term27580.getClass(), "port", "FAPbpaVZzb");
        setField(term27580, term27580.getClass(), "hostGroupId", "jMmGJiFUkL");
        setField(term27580, term27580.getClass(), "scheme", "fHyUJhfoxR");
        setField(term27580, term27580.getClass(), "basePath", "CgnkREXVNP");
        setField(term27580, term27580.getClass(), "id", "mBAKehIGeW");
        setField(term27580, term27580.getClass(), "name", "tmiPUgRXrn");
        setField(term27580, term27580.getClass(), "groupId", "VuZmwqnade");
        setField(term27580, term27580.getClass(), "includeHeaders", term27741);
        setField(term27580, term27580.getClass(), "excludeHeaders", term27746);
        setBooleanField(term27580, term27580.getClass(), "enableCache", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostGroupId", argTypes, term27580, args);
    }

};


