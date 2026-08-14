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

public class SourceSystem_getTargetSystem_210204545111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5772;

    public SourceSystem_getTargetSystem_210204545111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5935 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term5935, term5935.getClass(), "pattern", null);
        setField(term5935, term5935.getClass(), "method", null);
        setBooleanField(term5935, term5935.getClass(), "cached", false);
        setBooleanField(term5935, term5935.getClass(), "async", true);
        setField(term5935, term5935.getClass(), "keyLookupType", null);
        setField(term5935, term5935.getClass(), "keyLookupHeaders", null);
        setField(term5935, term5935.getClass(), "keyLookupClass", null);
        ArrayList term5933 = new ArrayList();
        ((ArrayList) term5933).add(term5935);
        Object term5942 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5942, term5942.getClass(), "id", null);
        setField(term5942, term5942.getClass(), "host", null);
        setField(term5942, term5942.getClass(), "port", null);
        setField(term5942, term5942.getClass(), "health", null);
        setField(term5942, term5942.getClass(), "scheme", null);
        setIntField(term5942, term5942.getClass(), "priority", -157887805);
        setBooleanField(term5942, term5942.getClass(), "isActive", true);
        setField(term5942, term5942.getClass(), "type", null);
        setField(term5942, term5942.getClass(), "groupId", null);
        setFloatField(term5942, term5942.getClass(), "loadFactor", 0.96323884F);
        setBooleanField(term5942, term5942.getClass(), "isReachable", true);
        Object term5947 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5947, term5947.getClass(), "id", null);
        setField(term5947, term5947.getClass(), "host", null);
        setField(term5947, term5947.getClass(), "port", null);
        setField(term5947, term5947.getClass(), "health", null);
        setField(term5947, term5947.getClass(), "scheme", null);
        setIntField(term5947, term5947.getClass(), "priority", 1876565163);
        setBooleanField(term5947, term5947.getClass(), "isActive", true);
        setField(term5947, term5947.getClass(), "type", null);
        setField(term5947, term5947.getClass(), "groupId", null);
        setFloatField(term5947, term5947.getClass(), "loadFactor", 0.43692183F);
        setBooleanField(term5947, term5947.getClass(), "isReachable", true);
        Object term5952 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5952, term5952.getClass(), "id", null);
        setField(term5952, term5952.getClass(), "host", null);
        setField(term5952, term5952.getClass(), "port", null);
        setField(term5952, term5952.getClass(), "health", null);
        setField(term5952, term5952.getClass(), "scheme", null);
        setIntField(term5952, term5952.getClass(), "priority", -817164822);
        setBooleanField(term5952, term5952.getClass(), "isActive", true);
        setField(term5952, term5952.getClass(), "type", null);
        setField(term5952, term5952.getClass(), "groupId", null);
        setFloatField(term5952, term5952.getClass(), "loadFactor", 0.80973893F);
        setBooleanField(term5952, term5952.getClass(), "isReachable", true);
        Object term5957 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5957, term5957.getClass(), "id", null);
        setField(term5957, term5957.getClass(), "host", null);
        setField(term5957, term5957.getClass(), "port", null);
        setField(term5957, term5957.getClass(), "health", null);
        setField(term5957, term5957.getClass(), "scheme", null);
        setIntField(term5957, term5957.getClass(), "priority", -1016503459);
        setBooleanField(term5957, term5957.getClass(), "isActive", true);
        setField(term5957, term5957.getClass(), "type", null);
        setField(term5957, term5957.getClass(), "groupId", null);
        setFloatField(term5957, term5957.getClass(), "loadFactor", 0.7633268F);
        setBooleanField(term5957, term5957.getClass(), "isReachable", true);
        Object term5962 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5962, term5962.getClass(), "id", null);
        setField(term5962, term5962.getClass(), "host", null);
        setField(term5962, term5962.getClass(), "port", null);
        setField(term5962, term5962.getClass(), "health", null);
        setField(term5962, term5962.getClass(), "scheme", null);
        setIntField(term5962, term5962.getClass(), "priority", -1968847291);
        setBooleanField(term5962, term5962.getClass(), "isActive", true);
        setField(term5962, term5962.getClass(), "type", null);
        setField(term5962, term5962.getClass(), "groupId", null);
        setFloatField(term5962, term5962.getClass(), "loadFactor", 0.541592F);
        setBooleanField(term5962, term5962.getClass(), "isReachable", true);
        Object term5967 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5967, term5967.getClass(), "id", null);
        setField(term5967, term5967.getClass(), "host", null);
        setField(term5967, term5967.getClass(), "port", null);
        setField(term5967, term5967.getClass(), "health", null);
        setField(term5967, term5967.getClass(), "scheme", null);
        setIntField(term5967, term5967.getClass(), "priority", 579005622);
        setBooleanField(term5967, term5967.getClass(), "isActive", true);
        setField(term5967, term5967.getClass(), "type", null);
        setField(term5967, term5967.getClass(), "groupId", null);
        setFloatField(term5967, term5967.getClass(), "loadFactor", 0.13481021F);
        setBooleanField(term5967, term5967.getClass(), "isReachable", true);
        Object term5972 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5972, term5972.getClass(), "id", null);
        setField(term5972, term5972.getClass(), "host", null);
        setField(term5972, term5972.getClass(), "port", null);
        setField(term5972, term5972.getClass(), "health", null);
        setField(term5972, term5972.getClass(), "scheme", null);
        setIntField(term5972, term5972.getClass(), "priority", -14890619);
        setBooleanField(term5972, term5972.getClass(), "isActive", true);
        setField(term5972, term5972.getClass(), "type", null);
        setField(term5972, term5972.getClass(), "groupId", null);
        setFloatField(term5972, term5972.getClass(), "loadFactor", 0.996533F);
        setBooleanField(term5972, term5972.getClass(), "isReachable", true);
        ArrayList term5940 = new ArrayList();
        ((ArrayList) term5940).add(term5942);
        ((ArrayList) term5940).add(term5947);
        ((ArrayList) term5940).add(term5952);
        ((ArrayList) term5940).add(term5957);
        ((ArrayList) term5940).add(term5962);
        ((ArrayList) term5940).add(term5967);
        ((ArrayList) term5940).add(term5972);
        HashMap term6075 = new HashMap();
        HashMap term6080 = new HashMap();
        HashMap term6098 = new HashMap();
        term5772 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term5932 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term5772, term5772.getClass(), "host", "QUymMnsCIj");
        setBooleanField(term5772, term5772.getClass(), "tunnel", true);
        setField(term5772, term5772.getClass(), "port", "ikTtOgdVYS");
        setField(term5772, term5772.getClass(), "scheme", "JptuwlirlS");
        setField(term5772, term5772.getClass(), "basePath", "TKOMaGswbU");
        setField(term5772, term5772.getClass(), "id", "YcTbglHiUq");
        setField(term5772, term5772.getClass(), "name", "TiUqHrjoEU");
        setField(term5772, term5772.getClass(), "groupId", "eoEvZbdLjL");
        setField(term5772, term5772.getClass(), "target", "BkIxsyPkGy");
        setBooleanField(term5772, term5772.getClass(), "async", true);
        setField(term5772, term5772.getClass(), "asyncEngine", "mrMGwoRgVY");
        setField(term5772, term5772.getClass(), "callbackId", "mxVLTgCwki");
        setField(term5772, term5772.getClass(), "jwtKeylookup", "wCurppnDSA");
        setField(term5772, term5772.getClass(), "certificateId", "JydxSNTMYt");
        setField(term5772, term5772.getClass(), "secappid", "KpurAcrHYT");
        setBooleanField(term5772, term5772.getClass(), "autoProcure", false);
        setField(term5932, term5932.getClass(), "cachedResources", term5933);
        setField(term5932, term5932.getClass(), "hostGroups", term5940);
        setField(term5932, term5932.getClass(), "host", "zAkgWQVCpM");
        setField(term5932, term5932.getClass(), "port", "yQUDyOroXU");
        setField(term5932, term5932.getClass(), "hostGroupId", "xweqkPdyJH");
        setField(term5932, term5932.getClass(), "scheme", "kwteHWzwcc");
        setField(term5932, term5932.getClass(), "basePath", "uMsWXqNhln");
        setField(term5932, term5932.getClass(), "id", "MAnhIPOtHL");
        setField(term5932, term5932.getClass(), "name", "dikKjYjmRO");
        setField(term5932, term5932.getClass(), "groupId", "GJnnMDVnEP");
        setField(term5932, term5932.getClass(), "includeHeaders", term6075);
        setField(term5932, term5932.getClass(), "excludeHeaders", term6080);
        setBooleanField(term5932, term5932.getClass(), "enableCache", true);
        setField(term5772, term5772.getClass(), "targetSystem", term5932);
        setField(term5772, term5772.getClass(), "headerLookup", "zSMVllDpfk");
        setField(term5772, term5772.getClass(), "keyLookupMap", term6098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetSystem", argTypes, term5772, args);
    }

};


