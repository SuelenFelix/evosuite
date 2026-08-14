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
import java.util.LinkedHashMap;

public class SourceSystem_setKeyLookupMap_200258702516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8875;
     Object term9196;

    public SourceSystem_setKeyLookupMap_200258702516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9038 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term9038, term9038.getClass(), "pattern", null);
        setField(term9038, term9038.getClass(), "method", null);
        setBooleanField(term9038, term9038.getClass(), "cached", false);
        setBooleanField(term9038, term9038.getClass(), "async", true);
        setField(term9038, term9038.getClass(), "keyLookupType", null);
        setField(term9038, term9038.getClass(), "keyLookupHeaders", null);
        setField(term9038, term9038.getClass(), "keyLookupClass", null);
        ArrayList term9036 = new ArrayList();
        ((ArrayList) term9036).add(term9038);
        Object term9045 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term9045, term9045.getClass(), "id", null);
        setField(term9045, term9045.getClass(), "host", null);
        setField(term9045, term9045.getClass(), "port", null);
        setField(term9045, term9045.getClass(), "health", null);
        setField(term9045, term9045.getClass(), "scheme", null);
        setIntField(term9045, term9045.getClass(), "priority", -2027534003);
        setBooleanField(term9045, term9045.getClass(), "isActive", true);
        setField(term9045, term9045.getClass(), "type", null);
        setField(term9045, term9045.getClass(), "groupId", null);
        setFloatField(term9045, term9045.getClass(), "loadFactor", 0.52792794F);
        setBooleanField(term9045, term9045.getClass(), "isReachable", true);
        Object term9050 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term9050, term9050.getClass(), "id", null);
        setField(term9050, term9050.getClass(), "host", null);
        setField(term9050, term9050.getClass(), "port", null);
        setField(term9050, term9050.getClass(), "health", null);
        setField(term9050, term9050.getClass(), "scheme", null);
        setIntField(term9050, term9050.getClass(), "priority", 1063420942);
        setBooleanField(term9050, term9050.getClass(), "isActive", true);
        setField(term9050, term9050.getClass(), "type", null);
        setField(term9050, term9050.getClass(), "groupId", null);
        setFloatField(term9050, term9050.getClass(), "loadFactor", 0.24759698F);
        setBooleanField(term9050, term9050.getClass(), "isReachable", true);
        Object term9055 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term9055, term9055.getClass(), "id", null);
        setField(term9055, term9055.getClass(), "host", null);
        setField(term9055, term9055.getClass(), "port", null);
        setField(term9055, term9055.getClass(), "health", null);
        setField(term9055, term9055.getClass(), "scheme", null);
        setIntField(term9055, term9055.getClass(), "priority", 1375330971);
        setBooleanField(term9055, term9055.getClass(), "isActive", true);
        setField(term9055, term9055.getClass(), "type", null);
        setField(term9055, term9055.getClass(), "groupId", null);
        setFloatField(term9055, term9055.getClass(), "loadFactor", 0.32021916F);
        setBooleanField(term9055, term9055.getClass(), "isReachable", true);
        Object term9060 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term9060, term9060.getClass(), "id", null);
        setField(term9060, term9060.getClass(), "host", null);
        setField(term9060, term9060.getClass(), "port", null);
        setField(term9060, term9060.getClass(), "health", null);
        setField(term9060, term9060.getClass(), "scheme", null);
        setIntField(term9060, term9060.getClass(), "priority", -478195677);
        setBooleanField(term9060, term9060.getClass(), "isActive", true);
        setField(term9060, term9060.getClass(), "type", null);
        setField(term9060, term9060.getClass(), "groupId", null);
        setFloatField(term9060, term9060.getClass(), "loadFactor", 0.8886614F);
        setBooleanField(term9060, term9060.getClass(), "isReachable", true);
        Object term9065 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term9065, term9065.getClass(), "id", null);
        setField(term9065, term9065.getClass(), "host", null);
        setField(term9065, term9065.getClass(), "port", null);
        setField(term9065, term9065.getClass(), "health", null);
        setField(term9065, term9065.getClass(), "scheme", null);
        setIntField(term9065, term9065.getClass(), "priority", 972867650);
        setBooleanField(term9065, term9065.getClass(), "isActive", true);
        setField(term9065, term9065.getClass(), "type", null);
        setField(term9065, term9065.getClass(), "groupId", null);
        setFloatField(term9065, term9065.getClass(), "loadFactor", 0.22651339F);
        setBooleanField(term9065, term9065.getClass(), "isReachable", true);
        ArrayList term9043 = new ArrayList();
        ((ArrayList) term9043).add(term9045);
        ((ArrayList) term9043).add(term9050);
        ((ArrayList) term9043).add(term9055);
        ((ArrayList) term9043).add(term9060);
        ((ArrayList) term9043).add(term9065);
        HashMap term9168 = new HashMap();
        HashMap term9173 = new HashMap();
        HashMap term9191 = new HashMap();
        term8875 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term9035 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term8875, term8875.getClass(), "host", "mIRMQIxHUD");
        setBooleanField(term8875, term8875.getClass(), "tunnel", true);
        setField(term8875, term8875.getClass(), "port", "FbBMtntDbw");
        setField(term8875, term8875.getClass(), "scheme", "zRnpRGaHlI");
        setField(term8875, term8875.getClass(), "basePath", "dVHfxjbMRK");
        setField(term8875, term8875.getClass(), "id", "LzwyLxKJpw");
        setField(term8875, term8875.getClass(), "name", "ZhWJlplAVK");
        setField(term8875, term8875.getClass(), "groupId", "pnmjTuTojv");
        setField(term8875, term8875.getClass(), "target", "eMtshhmGEm");
        setBooleanField(term8875, term8875.getClass(), "async", false);
        setField(term8875, term8875.getClass(), "asyncEngine", "VJUbzHGOvg");
        setField(term8875, term8875.getClass(), "callbackId", "SiwcigIrfD");
        setField(term8875, term8875.getClass(), "jwtKeylookup", "MFIdGVLoDo");
        setField(term8875, term8875.getClass(), "certificateId", "kbxgTcnXyU");
        setField(term8875, term8875.getClass(), "secappid", "lnJvDbbuwo");
        setBooleanField(term8875, term8875.getClass(), "autoProcure", false);
        setField(term9035, term9035.getClass(), "cachedResources", term9036);
        setField(term9035, term9035.getClass(), "hostGroups", term9043);
        setField(term9035, term9035.getClass(), "host", "UMMXkhuqzw");
        setField(term9035, term9035.getClass(), "port", "KyGXZcXJwq");
        setField(term9035, term9035.getClass(), "hostGroupId", "TqiCjeuoWE");
        setField(term9035, term9035.getClass(), "scheme", "GWWfkXOYLP");
        setField(term9035, term9035.getClass(), "basePath", "qvykDllgpT");
        setField(term9035, term9035.getClass(), "id", "hzdUbcLZhZ");
        setField(term9035, term9035.getClass(), "name", "GlxnEJvYeC");
        setField(term9035, term9035.getClass(), "groupId", "SLdOGaqmNv");
        setField(term9035, term9035.getClass(), "includeHeaders", term9168);
        setField(term9035, term9035.getClass(), "excludeHeaders", term9173);
        setBooleanField(term9035, term9035.getClass(), "enableCache", false);
        setField(term8875, term8875.getClass(), "targetSystem", term9035);
        setField(term8875, term8875.getClass(), "headerLookup", "QZfhwDBzyR");
        setField(term8875, term8875.getClass(), "keyLookupMap", term9191);
        term9196 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term9196;
        callMethod(klass, "setKeyLookupMap", argTypes, term8875, args);
    }

};


