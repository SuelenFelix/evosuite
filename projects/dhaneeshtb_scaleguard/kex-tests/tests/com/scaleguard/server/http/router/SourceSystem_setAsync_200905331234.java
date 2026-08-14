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

public class SourceSystem_setAsync_200905331234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18946;
     Object term19282;

    public SourceSystem_setAsync_200905331234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19109 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19109, term19109.getClass(), "pattern", null);
        setField(term19109, term19109.getClass(), "method", null);
        setBooleanField(term19109, term19109.getClass(), "cached", true);
        setBooleanField(term19109, term19109.getClass(), "async", false);
        setField(term19109, term19109.getClass(), "keyLookupType", null);
        setField(term19109, term19109.getClass(), "keyLookupHeaders", null);
        setField(term19109, term19109.getClass(), "keyLookupClass", null);
        ArrayList term19107 = new ArrayList();
        ((ArrayList) term19107).add(term19109);
        Object term19116 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19116, term19116.getClass(), "id", null);
        setField(term19116, term19116.getClass(), "host", null);
        setField(term19116, term19116.getClass(), "port", null);
        setField(term19116, term19116.getClass(), "health", null);
        setField(term19116, term19116.getClass(), "scheme", null);
        setIntField(term19116, term19116.getClass(), "priority", -227365013);
        setBooleanField(term19116, term19116.getClass(), "isActive", true);
        setField(term19116, term19116.getClass(), "type", null);
        setField(term19116, term19116.getClass(), "groupId", null);
        setFloatField(term19116, term19116.getClass(), "loadFactor", 0.94706243F);
        setBooleanField(term19116, term19116.getClass(), "isReachable", true);
        Object term19121 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19121, term19121.getClass(), "id", null);
        setField(term19121, term19121.getClass(), "host", null);
        setField(term19121, term19121.getClass(), "port", null);
        setField(term19121, term19121.getClass(), "health", null);
        setField(term19121, term19121.getClass(), "scheme", null);
        setIntField(term19121, term19121.getClass(), "priority", 11724947);
        setBooleanField(term19121, term19121.getClass(), "isActive", true);
        setField(term19121, term19121.getClass(), "type", null);
        setField(term19121, term19121.getClass(), "groupId", null);
        setFloatField(term19121, term19121.getClass(), "loadFactor", 0.0027298927F);
        setBooleanField(term19121, term19121.getClass(), "isReachable", true);
        Object term19126 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19126, term19126.getClass(), "id", null);
        setField(term19126, term19126.getClass(), "host", null);
        setField(term19126, term19126.getClass(), "port", null);
        setField(term19126, term19126.getClass(), "health", null);
        setField(term19126, term19126.getClass(), "scheme", null);
        setIntField(term19126, term19126.getClass(), "priority", 1953277050);
        setBooleanField(term19126, term19126.getClass(), "isActive", true);
        setField(term19126, term19126.getClass(), "type", null);
        setField(term19126, term19126.getClass(), "groupId", null);
        setFloatField(term19126, term19126.getClass(), "loadFactor", 0.45478272F);
        setBooleanField(term19126, term19126.getClass(), "isReachable", true);
        Object term19131 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19131, term19131.getClass(), "id", null);
        setField(term19131, term19131.getClass(), "host", null);
        setField(term19131, term19131.getClass(), "port", null);
        setField(term19131, term19131.getClass(), "health", null);
        setField(term19131, term19131.getClass(), "scheme", null);
        setIntField(term19131, term19131.getClass(), "priority", 1283079251);
        setBooleanField(term19131, term19131.getClass(), "isActive", true);
        setField(term19131, term19131.getClass(), "type", null);
        setField(term19131, term19131.getClass(), "groupId", null);
        setFloatField(term19131, term19131.getClass(), "loadFactor", 0.29874015F);
        setBooleanField(term19131, term19131.getClass(), "isReachable", true);
        Object term19136 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19136, term19136.getClass(), "id", null);
        setField(term19136, term19136.getClass(), "host", null);
        setField(term19136, term19136.getClass(), "port", null);
        setField(term19136, term19136.getClass(), "health", null);
        setField(term19136, term19136.getClass(), "scheme", null);
        setIntField(term19136, term19136.getClass(), "priority", -523949691);
        setBooleanField(term19136, term19136.getClass(), "isActive", true);
        setField(term19136, term19136.getClass(), "type", null);
        setField(term19136, term19136.getClass(), "groupId", null);
        setFloatField(term19136, term19136.getClass(), "loadFactor", 0.8780084F);
        setBooleanField(term19136, term19136.getClass(), "isReachable", true);
        Object term19141 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19141, term19141.getClass(), "id", null);
        setField(term19141, term19141.getClass(), "host", null);
        setField(term19141, term19141.getClass(), "port", null);
        setField(term19141, term19141.getClass(), "health", null);
        setField(term19141, term19141.getClass(), "scheme", null);
        setIntField(term19141, term19141.getClass(), "priority", 1398204340);
        setBooleanField(term19141, term19141.getClass(), "isActive", true);
        setField(term19141, term19141.getClass(), "type", null);
        setField(term19141, term19141.getClass(), "groupId", null);
        setFloatField(term19141, term19141.getClass(), "loadFactor", 0.32554477F);
        setBooleanField(term19141, term19141.getClass(), "isReachable", true);
        Object term19146 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19146, term19146.getClass(), "id", null);
        setField(term19146, term19146.getClass(), "host", null);
        setField(term19146, term19146.getClass(), "port", null);
        setField(term19146, term19146.getClass(), "health", null);
        setField(term19146, term19146.getClass(), "scheme", null);
        setIntField(term19146, term19146.getClass(), "priority", 229204365);
        setBooleanField(term19146, term19146.getClass(), "isActive", true);
        setField(term19146, term19146.getClass(), "type", null);
        setField(term19146, term19146.getClass(), "groupId", null);
        setFloatField(term19146, term19146.getClass(), "loadFactor", 0.053365767F);
        setBooleanField(term19146, term19146.getClass(), "isReachable", true);
        Object term19151 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19151, term19151.getClass(), "id", null);
        setField(term19151, term19151.getClass(), "host", null);
        setField(term19151, term19151.getClass(), "port", null);
        setField(term19151, term19151.getClass(), "health", null);
        setField(term19151, term19151.getClass(), "scheme", null);
        setIntField(term19151, term19151.getClass(), "priority", -461771056);
        setBooleanField(term19151, term19151.getClass(), "isActive", true);
        setField(term19151, term19151.getClass(), "type", null);
        setField(term19151, term19151.getClass(), "groupId", null);
        setFloatField(term19151, term19151.getClass(), "loadFactor", 0.8924855F);
        setBooleanField(term19151, term19151.getClass(), "isReachable", true);
        ArrayList term19114 = new ArrayList();
        ((ArrayList) term19114).add(term19116);
        ((ArrayList) term19114).add(term19121);
        ((ArrayList) term19114).add(term19126);
        ((ArrayList) term19114).add(term19131);
        ((ArrayList) term19114).add(term19136);
        ((ArrayList) term19114).add(term19141);
        ((ArrayList) term19114).add(term19146);
        ((ArrayList) term19114).add(term19151);
        HashMap term19254 = new HashMap();
        HashMap term19259 = new HashMap();
        HashMap term19277 = new HashMap();
        term18946 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term19106 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term18946, term18946.getClass(), "host", "hhGHcwcBqB");
        setBooleanField(term18946, term18946.getClass(), "tunnel", true);
        setField(term18946, term18946.getClass(), "port", "WIVENkFxNU");
        setField(term18946, term18946.getClass(), "scheme", "MFSosHURtm");
        setField(term18946, term18946.getClass(), "basePath", "hIBYlJpYye");
        setField(term18946, term18946.getClass(), "id", "LNendOzJhj");
        setField(term18946, term18946.getClass(), "name", "ZwcevQDgzv");
        setField(term18946, term18946.getClass(), "groupId", "rzkENrHYBI");
        setField(term18946, term18946.getClass(), "target", "ylJjmNVzzt");
        setBooleanField(term18946, term18946.getClass(), "async", false);
        setField(term18946, term18946.getClass(), "asyncEngine", "nwKTRDmHWk");
        setField(term18946, term18946.getClass(), "callbackId", "UueEixdrss");
        setField(term18946, term18946.getClass(), "jwtKeylookup", "ceafBXJyBB");
        setField(term18946, term18946.getClass(), "certificateId", "VNHIbCXqhH");
        setField(term18946, term18946.getClass(), "secappid", "csnhUIxUaP");
        setBooleanField(term18946, term18946.getClass(), "autoProcure", true);
        setField(term19106, term19106.getClass(), "cachedResources", term19107);
        setField(term19106, term19106.getClass(), "hostGroups", term19114);
        setField(term19106, term19106.getClass(), "host", "LroMhmrHbv");
        setField(term19106, term19106.getClass(), "port", "nUWkEhozFC");
        setField(term19106, term19106.getClass(), "hostGroupId", "cZOLUZUhxQ");
        setField(term19106, term19106.getClass(), "scheme", "fXCybRqtsq");
        setField(term19106, term19106.getClass(), "basePath", "gPhmseJiob");
        setField(term19106, term19106.getClass(), "id", "dgpHJUBySN");
        setField(term19106, term19106.getClass(), "name", "jCEXysSVZf");
        setField(term19106, term19106.getClass(), "groupId", "jWrmcNnNoB");
        setField(term19106, term19106.getClass(), "includeHeaders", term19254);
        setField(term19106, term19106.getClass(), "excludeHeaders", term19259);
        setBooleanField(term19106, term19106.getClass(), "enableCache", true);
        setField(term18946, term18946.getClass(), "targetSystem", term19106);
        setField(term18946, term18946.getClass(), "headerLookup", "MoncgugUfo");
        setField(term18946, term18946.getClass(), "keyLookupMap", term19277);
        term19282 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term19282;
        callMethod(klass, "setAsync", argTypes, term18946, args);
    }

};


