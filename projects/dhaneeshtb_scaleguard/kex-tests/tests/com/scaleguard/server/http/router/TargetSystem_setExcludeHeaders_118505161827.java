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
import java.util.LinkedHashMap;

public class TargetSystem_setExcludeHeaders_118505161827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34965;
     Object term35201;

    public TargetSystem_setExcludeHeaders_118505161827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34968 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term34974 = (Object[]) newArray("java.lang.String", 8);
        setField(term34968, term34968.getClass(), "pattern", "");
        setField(term34968, term34968.getClass(), "method", "");
        setBooleanField(term34968, term34968.getClass(), "cached", false);
        setBooleanField(term34968, term34968.getClass(), "async", false);
        setField(term34968, term34968.getClass(), "keyLookupType", "");
        setField(term34968, term34968.getClass(), "keyLookupHeaders", term34974);
        setField(term34968, term34968.getClass(), "keyLookupClass", "");
        Object term34976 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term34982 = (Object[]) newArray("java.lang.String", 0);
        setField(term34976, term34976.getClass(), "pattern", "");
        setField(term34976, term34976.getClass(), "method", "");
        setBooleanField(term34976, term34976.getClass(), "cached", false);
        setBooleanField(term34976, term34976.getClass(), "async", false);
        setField(term34976, term34976.getClass(), "keyLookupType", "");
        setField(term34976, term34976.getClass(), "keyLookupHeaders", term34982);
        setField(term34976, term34976.getClass(), "keyLookupClass", "");
        Object term34984 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term34990 = (Object[]) newArray("java.lang.String", 9);
        setField(term34984, term34984.getClass(), "pattern", "");
        setField(term34984, term34984.getClass(), "method", "");
        setBooleanField(term34984, term34984.getClass(), "cached", false);
        setBooleanField(term34984, term34984.getClass(), "async", true);
        setField(term34984, term34984.getClass(), "keyLookupType", "");
        setField(term34984, term34984.getClass(), "keyLookupHeaders", term34990);
        setField(term34984, term34984.getClass(), "keyLookupClass", "");
        ArrayList term34966 = new ArrayList();
        ((ArrayList) term34966).add(term34968);
        ((ArrayList) term34966).add(term34976);
        ((ArrayList) term34966).add(term34984);
        Object term34996 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term34996, term34996.getClass(), "id", "");
        setField(term34996, term34996.getClass(), "host", "");
        setField(term34996, term34996.getClass(), "port", "");
        setField(term34996, term34996.getClass(), "health", "");
        setField(term34996, term34996.getClass(), "scheme", "");
        setIntField(term34996, term34996.getClass(), "priority", 68922753);
        setBooleanField(term34996, term34996.getClass(), "isActive", true);
        setField(term34996, term34996.getClass(), "type", "");
        setField(term34996, term34996.getClass(), "groupId", "");
        setFloatField(term34996, term34996.getClass(), "loadFactor", 0.6687146F);
        setBooleanField(term34996, term34996.getClass(), "isReachable", true);
        Object term35008 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35008, term35008.getClass(), "id", "");
        setField(term35008, term35008.getClass(), "host", "");
        setField(term35008, term35008.getClass(), "port", "");
        setField(term35008, term35008.getClass(), "health", "");
        setField(term35008, term35008.getClass(), "scheme", "");
        setIntField(term35008, term35008.getClass(), "priority", -220791533);
        setBooleanField(term35008, term35008.getClass(), "isActive", true);
        setField(term35008, term35008.getClass(), "type", "");
        setField(term35008, term35008.getClass(), "groupId", "");
        setFloatField(term35008, term35008.getClass(), "loadFactor", 0.5407563F);
        setBooleanField(term35008, term35008.getClass(), "isReachable", true);
        Object term35020 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35020, term35020.getClass(), "id", "");
        setField(term35020, term35020.getClass(), "host", "");
        setField(term35020, term35020.getClass(), "port", "");
        setField(term35020, term35020.getClass(), "health", "");
        setField(term35020, term35020.getClass(), "scheme", "");
        setIntField(term35020, term35020.getClass(), "priority", 1741500243);
        setBooleanField(term35020, term35020.getClass(), "isActive", true);
        setField(term35020, term35020.getClass(), "type", "");
        setField(term35020, term35020.getClass(), "groupId", "");
        setFloatField(term35020, term35020.getClass(), "loadFactor", 0.016047299F);
        setBooleanField(term35020, term35020.getClass(), "isReachable", true);
        Object term35032 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35032, term35032.getClass(), "id", "");
        setField(term35032, term35032.getClass(), "host", "");
        setField(term35032, term35032.getClass(), "port", "");
        setField(term35032, term35032.getClass(), "health", "");
        setField(term35032, term35032.getClass(), "scheme", "");
        setIntField(term35032, term35032.getClass(), "priority", -2070466617);
        setBooleanField(term35032, term35032.getClass(), "isActive", true);
        setField(term35032, term35032.getClass(), "type", "");
        setField(term35032, term35032.getClass(), "groupId", "");
        setFloatField(term35032, term35032.getClass(), "loadFactor", 0.94859296F);
        setBooleanField(term35032, term35032.getClass(), "isReachable", true);
        Object term35044 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35044, term35044.getClass(), "id", "");
        setField(term35044, term35044.getClass(), "host", "");
        setField(term35044, term35044.getClass(), "port", "");
        setField(term35044, term35044.getClass(), "health", "");
        setField(term35044, term35044.getClass(), "scheme", "");
        setIntField(term35044, term35044.getClass(), "priority", -1127721881);
        setBooleanField(term35044, term35044.getClass(), "isActive", true);
        setField(term35044, term35044.getClass(), "type", "");
        setField(term35044, term35044.getClass(), "groupId", "");
        setFloatField(term35044, term35044.getClass(), "loadFactor", 0.4054746F);
        setBooleanField(term35044, term35044.getClass(), "isReachable", true);
        Object term35056 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35056, term35056.getClass(), "id", "");
        setField(term35056, term35056.getClass(), "host", "");
        setField(term35056, term35056.getClass(), "port", "");
        setField(term35056, term35056.getClass(), "health", "");
        setField(term35056, term35056.getClass(), "scheme", "");
        setIntField(term35056, term35056.getClass(), "priority", 1074848808);
        setBooleanField(term35056, term35056.getClass(), "isActive", true);
        setField(term35056, term35056.getClass(), "type", "");
        setField(term35056, term35056.getClass(), "groupId", "");
        setFloatField(term35056, term35056.getClass(), "loadFactor", 0.5179319F);
        setBooleanField(term35056, term35056.getClass(), "isReachable", true);
        Object term35068 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35068, term35068.getClass(), "id", "");
        setField(term35068, term35068.getClass(), "host", "");
        setField(term35068, term35068.getClass(), "port", "");
        setField(term35068, term35068.getClass(), "health", "");
        setField(term35068, term35068.getClass(), "scheme", "");
        setIntField(term35068, term35068.getClass(), "priority", -146054762);
        setBooleanField(term35068, term35068.getClass(), "isActive", true);
        setField(term35068, term35068.getClass(), "type", "");
        setField(term35068, term35068.getClass(), "groupId", "");
        setFloatField(term35068, term35068.getClass(), "loadFactor", 0.73743176F);
        setBooleanField(term35068, term35068.getClass(), "isReachable", true);
        Object term35080 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term35080, term35080.getClass(), "id", "");
        setField(term35080, term35080.getClass(), "host", "");
        setField(term35080, term35080.getClass(), "port", "");
        setField(term35080, term35080.getClass(), "health", "");
        setField(term35080, term35080.getClass(), "scheme", "");
        setIntField(term35080, term35080.getClass(), "priority", 798043553);
        setBooleanField(term35080, term35080.getClass(), "isActive", true);
        setField(term35080, term35080.getClass(), "type", "");
        setField(term35080, term35080.getClass(), "groupId", "");
        setFloatField(term35080, term35080.getClass(), "loadFactor", 0.25025773F);
        setBooleanField(term35080, term35080.getClass(), "isReachable", true);
        ArrayList term34994 = new ArrayList();
        ((ArrayList) term34994).add(term34996);
        ((ArrayList) term34994).add(term35008);
        ((ArrayList) term34994).add(term35020);
        ((ArrayList) term34994).add(term35032);
        ((ArrayList) term34994).add(term35044);
        ((ArrayList) term34994).add(term35056);
        ((ArrayList) term34994).add(term35068);
        ((ArrayList) term34994).add(term35080);
        HashMap term35190 = new HashMap();
        HashMap term35195 = new HashMap();
        term34965 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term34965, term34965.getClass(), "cachedResources", term34966);
        setField(term34965, term34965.getClass(), "hostGroups", term34994);
        setField(term34965, term34965.getClass(), "host", "gONpcfzuaS");
        setField(term34965, term34965.getClass(), "port", "GFIAakuePk");
        setField(term34965, term34965.getClass(), "hostGroupId", "hNGAMuzptC");
        setField(term34965, term34965.getClass(), "scheme", "oJkataxIMU");
        setField(term34965, term34965.getClass(), "basePath", "vRLnmEEamN");
        setField(term34965, term34965.getClass(), "id", "NYuTLpktFv");
        setField(term34965, term34965.getClass(), "name", "FneAhRnndA");
        setField(term34965, term34965.getClass(), "groupId", "KaPVoelwqi");
        setField(term34965, term34965.getClass(), "includeHeaders", term35190);
        setField(term34965, term34965.getClass(), "excludeHeaders", term35195);
        setBooleanField(term34965, term34965.getClass(), "enableCache", false);
        term35201 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term35201;
        callMethod(klass, "setExcludeHeaders", argTypes, term34965, args);
    }

};


