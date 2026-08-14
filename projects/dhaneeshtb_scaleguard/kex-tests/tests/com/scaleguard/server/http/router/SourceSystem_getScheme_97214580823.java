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

public class SourceSystem_getScheme_97214580823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12809;

    public SourceSystem_getScheme_97214580823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12972 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12972, term12972.getClass(), "pattern", null);
        setField(term12972, term12972.getClass(), "method", null);
        setBooleanField(term12972, term12972.getClass(), "cached", true);
        setBooleanField(term12972, term12972.getClass(), "async", true);
        setField(term12972, term12972.getClass(), "keyLookupType", null);
        setField(term12972, term12972.getClass(), "keyLookupHeaders", null);
        setField(term12972, term12972.getClass(), "keyLookupClass", null);
        Object term12975 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12975, term12975.getClass(), "pattern", null);
        setField(term12975, term12975.getClass(), "method", null);
        setBooleanField(term12975, term12975.getClass(), "cached", true);
        setBooleanField(term12975, term12975.getClass(), "async", false);
        setField(term12975, term12975.getClass(), "keyLookupType", null);
        setField(term12975, term12975.getClass(), "keyLookupHeaders", null);
        setField(term12975, term12975.getClass(), "keyLookupClass", null);
        Object term12978 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12978, term12978.getClass(), "pattern", null);
        setField(term12978, term12978.getClass(), "method", null);
        setBooleanField(term12978, term12978.getClass(), "cached", false);
        setBooleanField(term12978, term12978.getClass(), "async", true);
        setField(term12978, term12978.getClass(), "keyLookupType", null);
        setField(term12978, term12978.getClass(), "keyLookupHeaders", null);
        setField(term12978, term12978.getClass(), "keyLookupClass", null);
        Object term12981 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12981, term12981.getClass(), "pattern", null);
        setField(term12981, term12981.getClass(), "method", null);
        setBooleanField(term12981, term12981.getClass(), "cached", false);
        setBooleanField(term12981, term12981.getClass(), "async", false);
        setField(term12981, term12981.getClass(), "keyLookupType", null);
        setField(term12981, term12981.getClass(), "keyLookupHeaders", null);
        setField(term12981, term12981.getClass(), "keyLookupClass", null);
        Object term12984 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term12984, term12984.getClass(), "pattern", null);
        setField(term12984, term12984.getClass(), "method", null);
        setBooleanField(term12984, term12984.getClass(), "cached", true);
        setBooleanField(term12984, term12984.getClass(), "async", false);
        setField(term12984, term12984.getClass(), "keyLookupType", null);
        setField(term12984, term12984.getClass(), "keyLookupHeaders", null);
        setField(term12984, term12984.getClass(), "keyLookupClass", null);
        ArrayList term12970 = new ArrayList();
        ((ArrayList) term12970).add(term12972);
        ((ArrayList) term12970).add(term12975);
        ((ArrayList) term12970).add(term12978);
        ((ArrayList) term12970).add(term12981);
        ((ArrayList) term12970).add(term12984);
        ArrayList term12989 = new ArrayList();
        HashMap term13089 = new HashMap();
        HashMap term13094 = new HashMap();
        HashMap term13112 = new HashMap();
        term12809 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term12969 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term12809, term12809.getClass(), "host", "ALRSeULyWV");
        setBooleanField(term12809, term12809.getClass(), "tunnel", false);
        setField(term12809, term12809.getClass(), "port", "WVhzXHdyFF");
        setField(term12809, term12809.getClass(), "scheme", "GLAWYoxkyw");
        setField(term12809, term12809.getClass(), "basePath", "cfpPTNNVnW");
        setField(term12809, term12809.getClass(), "id", "VPkEFShMUB");
        setField(term12809, term12809.getClass(), "name", "ZIgHysIFcL");
        setField(term12809, term12809.getClass(), "groupId", "ofSfQtWBjp");
        setField(term12809, term12809.getClass(), "target", "vkbIpZOlcY");
        setBooleanField(term12809, term12809.getClass(), "async", true);
        setField(term12809, term12809.getClass(), "asyncEngine", "XbAeosZekH");
        setField(term12809, term12809.getClass(), "callbackId", "EvGPvjswTz");
        setField(term12809, term12809.getClass(), "jwtKeylookup", "lbnnCkEZgE");
        setField(term12809, term12809.getClass(), "certificateId", "YaWdTQZkTw");
        setField(term12809, term12809.getClass(), "secappid", "QqsjlsXtmm");
        setBooleanField(term12809, term12809.getClass(), "autoProcure", true);
        setField(term12969, term12969.getClass(), "cachedResources", term12970);
        setField(term12969, term12969.getClass(), "hostGroups", term12989);
        setField(term12969, term12969.getClass(), "host", "KHPDZjrXQp");
        setField(term12969, term12969.getClass(), "port", "fpyUFzdCwQ");
        setField(term12969, term12969.getClass(), "hostGroupId", "OQqBkSGDem");
        setField(term12969, term12969.getClass(), "scheme", "vZzZOvsIYn");
        setField(term12969, term12969.getClass(), "basePath", "pAIBwhAbDu");
        setField(term12969, term12969.getClass(), "id", "iqhNUjVbRG");
        setField(term12969, term12969.getClass(), "name", "SSqIrPwJXd");
        setField(term12969, term12969.getClass(), "groupId", "jAxYagPvcV");
        setField(term12969, term12969.getClass(), "includeHeaders", term13089);
        setField(term12969, term12969.getClass(), "excludeHeaders", term13094);
        setBooleanField(term12969, term12969.getClass(), "enableCache", false);
        setField(term12809, term12809.getClass(), "targetSystem", term12969);
        setField(term12809, term12809.getClass(), "headerLookup", "ZXLgGUqgyW");
        setField(term12809, term12809.getClass(), "keyLookupMap", term13112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScheme", argTypes, term12809, args);
    }

};


