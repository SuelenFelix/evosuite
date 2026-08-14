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

public class SourceSystem_setPort_8103338022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12242;

    public SourceSystem_setPort_8103338022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12405 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12405, term12405.getClass(), "pattern", null);
        setField(term12405, term12405.getClass(), "method", null);
        setBooleanField(term12405, term12405.getClass(), "cached", true);
        setBooleanField(term12405, term12405.getClass(), "async", true);
        setField(term12405, term12405.getClass(), "keyLookupType", null);
        setField(term12405, term12405.getClass(), "keyLookupHeaders", null);
        setField(term12405, term12405.getClass(), "keyLookupClass", null);
        Object term12408 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12408, term12408.getClass(), "pattern", null);
        setField(term12408, term12408.getClass(), "method", null);
        setBooleanField(term12408, term12408.getClass(), "cached", false);
        setBooleanField(term12408, term12408.getClass(), "async", false);
        setField(term12408, term12408.getClass(), "keyLookupType", null);
        setField(term12408, term12408.getClass(), "keyLookupHeaders", null);
        setField(term12408, term12408.getClass(), "keyLookupClass", null);
        Object term12411 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12411, term12411.getClass(), "pattern", null);
        setField(term12411, term12411.getClass(), "method", null);
        setBooleanField(term12411, term12411.getClass(), "cached", true);
        setBooleanField(term12411, term12411.getClass(), "async", false);
        setField(term12411, term12411.getClass(), "keyLookupType", null);
        setField(term12411, term12411.getClass(), "keyLookupHeaders", null);
        setField(term12411, term12411.getClass(), "keyLookupClass", null);
        Object term12414 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12414, term12414.getClass(), "pattern", null);
        setField(term12414, term12414.getClass(), "method", null);
        setBooleanField(term12414, term12414.getClass(), "cached", true);
        setBooleanField(term12414, term12414.getClass(), "async", true);
        setField(term12414, term12414.getClass(), "keyLookupType", null);
        setField(term12414, term12414.getClass(), "keyLookupHeaders", null);
        setField(term12414, term12414.getClass(), "keyLookupClass", null);
        ArrayList term12403 = new ArrayList();
        ((ArrayList) term12403).add(term12405);
        ((ArrayList) term12403).add(term12408);
        ((ArrayList) term12403).add(term12411);
        ((ArrayList) term12403).add(term12414);
        Object term12421 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term12421, term12421.getClass(), "id", null);
        setField(term12421, term12421.getClass(), "host", null);
        setField(term12421, term12421.getClass(), "port", null);
        setField(term12421, term12421.getClass(), "health", null);
        setField(term12421, term12421.getClass(), "scheme", null);
        setIntField(term12421, term12421.getClass(), "priority", 683666002);
        setBooleanField(term12421, term12421.getClass(), "isActive", true);
        setField(term12421, term12421.getClass(), "type", null);
        setField(term12421, term12421.getClass(), "groupId", null);
        setFloatField(term12421, term12421.getClass(), "loadFactor", 0.15917838F);
        setBooleanField(term12421, term12421.getClass(), "isReachable", true);
        Object term12426 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term12426, term12426.getClass(), "id", null);
        setField(term12426, term12426.getClass(), "host", null);
        setField(term12426, term12426.getClass(), "port", null);
        setField(term12426, term12426.getClass(), "health", null);
        setField(term12426, term12426.getClass(), "scheme", null);
        setIntField(term12426, term12426.getClass(), "priority", 1596213415);
        setBooleanField(term12426, term12426.getClass(), "isActive", true);
        setField(term12426, term12426.getClass(), "type", null);
        setField(term12426, term12426.getClass(), "groupId", null);
        setFloatField(term12426, term12426.getClass(), "loadFactor", 0.37164736F);
        setBooleanField(term12426, term12426.getClass(), "isReachable", true);
        Object term12431 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term12431, term12431.getClass(), "id", null);
        setField(term12431, term12431.getClass(), "host", null);
        setField(term12431, term12431.getClass(), "port", null);
        setField(term12431, term12431.getClass(), "health", null);
        setField(term12431, term12431.getClass(), "scheme", null);
        setIntField(term12431, term12431.getClass(), "priority", -268815336);
        setBooleanField(term12431, term12431.getClass(), "isActive", true);
        setField(term12431, term12431.getClass(), "type", null);
        setField(term12431, term12431.getClass(), "groupId", null);
        setFloatField(term12431, term12431.getClass(), "loadFactor", 0.93741155F);
        setBooleanField(term12431, term12431.getClass(), "isReachable", true);
        Object term12436 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term12436, term12436.getClass(), "id", null);
        setField(term12436, term12436.getClass(), "host", null);
        setField(term12436, term12436.getClass(), "port", null);
        setField(term12436, term12436.getClass(), "health", null);
        setField(term12436, term12436.getClass(), "scheme", null);
        setIntField(term12436, term12436.getClass(), "priority", -1210583429);
        setBooleanField(term12436, term12436.getClass(), "isActive", true);
        setField(term12436, term12436.getClass(), "type", null);
        setField(term12436, term12436.getClass(), "groupId", null);
        setFloatField(term12436, term12436.getClass(), "loadFactor", 0.71813905F);
        setBooleanField(term12436, term12436.getClass(), "isReachable", true);
        ArrayList term12419 = new ArrayList();
        ((ArrayList) term12419).add(term12421);
        ((ArrayList) term12419).add(term12426);
        ((ArrayList) term12419).add(term12431);
        ((ArrayList) term12419).add(term12436);
        HashMap term12539 = new HashMap();
        HashMap term12544 = new HashMap();
        HashMap term12562 = new HashMap();
        term12242 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term12402 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term12242, term12242.getClass(), "host", "SJLRFsNagf");
        setBooleanField(term12242, term12242.getClass(), "tunnel", false);
        setField(term12242, term12242.getClass(), "port", "UsCZaSgXzI");
        setField(term12242, term12242.getClass(), "scheme", "IXZCeVwvBM");
        setField(term12242, term12242.getClass(), "basePath", "ElTdyUVQYi");
        setField(term12242, term12242.getClass(), "id", "KkgJnxXxVl");
        setField(term12242, term12242.getClass(), "name", "TGnzPlGFMb");
        setField(term12242, term12242.getClass(), "groupId", "yEvLMSpdHy");
        setField(term12242, term12242.getClass(), "target", "qdErlZeTVv");
        setBooleanField(term12242, term12242.getClass(), "async", true);
        setField(term12242, term12242.getClass(), "asyncEngine", "OCCDQbndDE");
        setField(term12242, term12242.getClass(), "callbackId", "NMANMKfctU");
        setField(term12242, term12242.getClass(), "jwtKeylookup", "mQsaqUltLU");
        setField(term12242, term12242.getClass(), "certificateId", "jwENwZiGlR");
        setField(term12242, term12242.getClass(), "secappid", "rfFHGPcfpz");
        setBooleanField(term12242, term12242.getClass(), "autoProcure", true);
        setField(term12402, term12402.getClass(), "cachedResources", term12403);
        setField(term12402, term12402.getClass(), "hostGroups", term12419);
        setField(term12402, term12402.getClass(), "host", "XlNXxsYNss");
        setField(term12402, term12402.getClass(), "port", "jheRZWjuaB");
        setField(term12402, term12402.getClass(), "hostGroupId", "IERziToRSQ");
        setField(term12402, term12402.getClass(), "scheme", "mDTRMwjBpc");
        setField(term12402, term12402.getClass(), "basePath", "sCLAuKoiVL");
        setField(term12402, term12402.getClass(), "id", "pFWiDEnVnU");
        setField(term12402, term12402.getClass(), "name", "NeEetzFhTt");
        setField(term12402, term12402.getClass(), "groupId", "UgvuvUxKed");
        setField(term12402, term12402.getClass(), "includeHeaders", term12539);
        setField(term12402, term12402.getClass(), "excludeHeaders", term12544);
        setBooleanField(term12402, term12402.getClass(), "enableCache", true);
        setField(term12242, term12242.getClass(), "targetSystem", term12402);
        setField(term12242, term12242.getClass(), "headerLookup", "ljBBMsQpaM");
        setField(term12242, term12242.getClass(), "keyLookupMap", term12562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hHNIOlOzJc";
        callMethod(klass, "setPort", argTypes, term12242, args);
    }

};


