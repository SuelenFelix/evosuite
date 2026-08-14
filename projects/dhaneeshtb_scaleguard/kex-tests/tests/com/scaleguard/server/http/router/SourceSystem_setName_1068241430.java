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

public class SourceSystem_setName_1068241430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16719;

    public SourceSystem_setName_1068241430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16882 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16882, term16882.getClass(), "pattern", null);
        setField(term16882, term16882.getClass(), "method", null);
        setBooleanField(term16882, term16882.getClass(), "cached", true);
        setBooleanField(term16882, term16882.getClass(), "async", true);
        setField(term16882, term16882.getClass(), "keyLookupType", null);
        setField(term16882, term16882.getClass(), "keyLookupHeaders", null);
        setField(term16882, term16882.getClass(), "keyLookupClass", null);
        Object term16885 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16885, term16885.getClass(), "pattern", null);
        setField(term16885, term16885.getClass(), "method", null);
        setBooleanField(term16885, term16885.getClass(), "cached", false);
        setBooleanField(term16885, term16885.getClass(), "async", true);
        setField(term16885, term16885.getClass(), "keyLookupType", null);
        setField(term16885, term16885.getClass(), "keyLookupHeaders", null);
        setField(term16885, term16885.getClass(), "keyLookupClass", null);
        Object term16888 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16888, term16888.getClass(), "pattern", null);
        setField(term16888, term16888.getClass(), "method", null);
        setBooleanField(term16888, term16888.getClass(), "cached", false);
        setBooleanField(term16888, term16888.getClass(), "async", false);
        setField(term16888, term16888.getClass(), "keyLookupType", null);
        setField(term16888, term16888.getClass(), "keyLookupHeaders", null);
        setField(term16888, term16888.getClass(), "keyLookupClass", null);
        Object term16891 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term16891, term16891.getClass(), "pattern", null);
        setField(term16891, term16891.getClass(), "method", null);
        setBooleanField(term16891, term16891.getClass(), "cached", false);
        setBooleanField(term16891, term16891.getClass(), "async", true);
        setField(term16891, term16891.getClass(), "keyLookupType", null);
        setField(term16891, term16891.getClass(), "keyLookupHeaders", null);
        setField(term16891, term16891.getClass(), "keyLookupClass", null);
        ArrayList term16880 = new ArrayList();
        ((ArrayList) term16880).add(term16882);
        ((ArrayList) term16880).add(term16885);
        ((ArrayList) term16880).add(term16888);
        ((ArrayList) term16880).add(term16891);
        Object term16898 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term16898, term16898.getClass(), "id", null);
        setField(term16898, term16898.getClass(), "host", null);
        setField(term16898, term16898.getClass(), "port", null);
        setField(term16898, term16898.getClass(), "health", null);
        setField(term16898, term16898.getClass(), "scheme", null);
        setIntField(term16898, term16898.getClass(), "priority", -1963464809);
        setBooleanField(term16898, term16898.getClass(), "isActive", true);
        setField(term16898, term16898.getClass(), "type", null);
        setField(term16898, term16898.getClass(), "groupId", null);
        setFloatField(term16898, term16898.getClass(), "loadFactor", 0.5428452F);
        setBooleanField(term16898, term16898.getClass(), "isReachable", true);
        Object term16903 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term16903, term16903.getClass(), "id", null);
        setField(term16903, term16903.getClass(), "host", null);
        setField(term16903, term16903.getClass(), "port", null);
        setField(term16903, term16903.getClass(), "health", null);
        setField(term16903, term16903.getClass(), "scheme", null);
        setIntField(term16903, term16903.getClass(), "priority", 71190297);
        setBooleanField(term16903, term16903.getClass(), "isActive", true);
        setField(term16903, term16903.getClass(), "type", null);
        setField(term16903, term16903.getClass(), "groupId", null);
        setFloatField(term16903, term16903.getClass(), "loadFactor", 0.016575277F);
        setBooleanField(term16903, term16903.getClass(), "isReachable", true);
        ArrayList term16896 = new ArrayList();
        ((ArrayList) term16896).add(term16898);
        ((ArrayList) term16896).add(term16903);
        HashMap term17006 = new HashMap();
        HashMap term17011 = new HashMap();
        HashMap term17029 = new HashMap();
        term16719 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term16879 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term16719, term16719.getClass(), "host", "XZmoxlxcKh");
        setBooleanField(term16719, term16719.getClass(), "tunnel", false);
        setField(term16719, term16719.getClass(), "port", "aHNGawFCfD");
        setField(term16719, term16719.getClass(), "scheme", "cHjhnXKTVF");
        setField(term16719, term16719.getClass(), "basePath", "NVsXpTZPoM");
        setField(term16719, term16719.getClass(), "id", "OlbhHDRGng");
        setField(term16719, term16719.getClass(), "name", "kbxuaUHTXf");
        setField(term16719, term16719.getClass(), "groupId", "CwmyQhyiUR");
        setField(term16719, term16719.getClass(), "target", "PxwyuZAkGy");
        setBooleanField(term16719, term16719.getClass(), "async", true);
        setField(term16719, term16719.getClass(), "asyncEngine", "ODhSWAnZWd");
        setField(term16719, term16719.getClass(), "callbackId", "NQkFXmkuYK");
        setField(term16719, term16719.getClass(), "jwtKeylookup", "kHzsJWDHsz");
        setField(term16719, term16719.getClass(), "certificateId", "jIfbtgnHqt");
        setField(term16719, term16719.getClass(), "secappid", "vNvzjymLXH");
        setBooleanField(term16719, term16719.getClass(), "autoProcure", false);
        setField(term16879, term16879.getClass(), "cachedResources", term16880);
        setField(term16879, term16879.getClass(), "hostGroups", term16896);
        setField(term16879, term16879.getClass(), "host", "Clkrygzvpw");
        setField(term16879, term16879.getClass(), "port", "TPzGOBNENK");
        setField(term16879, term16879.getClass(), "hostGroupId", "ADhlvQDtuh");
        setField(term16879, term16879.getClass(), "scheme", "rvUfMhtNrD");
        setField(term16879, term16879.getClass(), "basePath", "tVJNKfGPYg");
        setField(term16879, term16879.getClass(), "id", "AlAUNSOTmH");
        setField(term16879, term16879.getClass(), "name", "IeuSZGvhvH");
        setField(term16879, term16879.getClass(), "groupId", "zCejWZdaIc");
        setField(term16879, term16879.getClass(), "includeHeaders", term17006);
        setField(term16879, term16879.getClass(), "excludeHeaders", term17011);
        setBooleanField(term16879, term16879.getClass(), "enableCache", true);
        setField(term16719, term16719.getClass(), "targetSystem", term16879);
        setField(term16719, term16719.getClass(), "headerLookup", "aCfzlsgXhB");
        setField(term16719, term16719.getClass(), "keyLookupMap", term17029);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HmhoMiUgEv";
        callMethod(klass, "setName", argTypes, term16719, args);
    }

};


