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

public class SourceSystem_setCertificateId_87914363110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5195;

    public SourceSystem_setCertificateId_87914363110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5358 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term5358, term5358.getClass(), "pattern", null);
        setField(term5358, term5358.getClass(), "method", null);
        setBooleanField(term5358, term5358.getClass(), "cached", true);
        setBooleanField(term5358, term5358.getClass(), "async", true);
        setField(term5358, term5358.getClass(), "keyLookupType", null);
        setField(term5358, term5358.getClass(), "keyLookupHeaders", null);
        setField(term5358, term5358.getClass(), "keyLookupClass", null);
        Object term5361 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term5361, term5361.getClass(), "pattern", null);
        setField(term5361, term5361.getClass(), "method", null);
        setBooleanField(term5361, term5361.getClass(), "cached", true);
        setBooleanField(term5361, term5361.getClass(), "async", false);
        setField(term5361, term5361.getClass(), "keyLookupType", null);
        setField(term5361, term5361.getClass(), "keyLookupHeaders", null);
        setField(term5361, term5361.getClass(), "keyLookupClass", null);
        Object term5364 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term5364, term5364.getClass(), "pattern", null);
        setField(term5364, term5364.getClass(), "method", null);
        setBooleanField(term5364, term5364.getClass(), "cached", false);
        setBooleanField(term5364, term5364.getClass(), "async", true);
        setField(term5364, term5364.getClass(), "keyLookupType", null);
        setField(term5364, term5364.getClass(), "keyLookupHeaders", null);
        setField(term5364, term5364.getClass(), "keyLookupClass", null);
        Object term5367 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term5367, term5367.getClass(), "pattern", null);
        setField(term5367, term5367.getClass(), "method", null);
        setBooleanField(term5367, term5367.getClass(), "cached", true);
        setBooleanField(term5367, term5367.getClass(), "async", true);
        setField(term5367, term5367.getClass(), "keyLookupType", null);
        setField(term5367, term5367.getClass(), "keyLookupHeaders", null);
        setField(term5367, term5367.getClass(), "keyLookupClass", null);
        ArrayList term5356 = new ArrayList();
        ((ArrayList) term5356).add(term5358);
        ((ArrayList) term5356).add(term5361);
        ((ArrayList) term5356).add(term5364);
        ((ArrayList) term5356).add(term5367);
        Object term5374 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5374, term5374.getClass(), "id", null);
        setField(term5374, term5374.getClass(), "host", null);
        setField(term5374, term5374.getClass(), "port", null);
        setField(term5374, term5374.getClass(), "health", null);
        setField(term5374, term5374.getClass(), "scheme", null);
        setIntField(term5374, term5374.getClass(), "priority", -469968304);
        setBooleanField(term5374, term5374.getClass(), "isActive", true);
        setField(term5374, term5374.getClass(), "type", null);
        setField(term5374, term5374.getClass(), "groupId", null);
        setFloatField(term5374, term5374.getClass(), "loadFactor", 0.89057696F);
        setBooleanField(term5374, term5374.getClass(), "isReachable", true);
        Object term5379 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5379, term5379.getClass(), "id", null);
        setField(term5379, term5379.getClass(), "host", null);
        setField(term5379, term5379.getClass(), "port", null);
        setField(term5379, term5379.getClass(), "health", null);
        setField(term5379, term5379.getClass(), "scheme", null);
        setIntField(term5379, term5379.getClass(), "priority", -1145578966);
        setBooleanField(term5379, term5379.getClass(), "isActive", true);
        setField(term5379, term5379.getClass(), "type", null);
        setField(term5379, term5379.getClass(), "groupId", null);
        setFloatField(term5379, term5379.getClass(), "loadFactor", 0.7332741F);
        setBooleanField(term5379, term5379.getClass(), "isReachable", true);
        Object term5384 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5384, term5384.getClass(), "id", null);
        setField(term5384, term5384.getClass(), "host", null);
        setField(term5384, term5384.getClass(), "port", null);
        setField(term5384, term5384.getClass(), "health", null);
        setField(term5384, term5384.getClass(), "scheme", null);
        setIntField(term5384, term5384.getClass(), "priority", 679763016);
        setBooleanField(term5384, term5384.getClass(), "isActive", true);
        setField(term5384, term5384.getClass(), "type", null);
        setField(term5384, term5384.getClass(), "groupId", null);
        setFloatField(term5384, term5384.getClass(), "loadFactor", 0.15826964F);
        setBooleanField(term5384, term5384.getClass(), "isReachable", true);
        Object term5389 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5389, term5389.getClass(), "id", null);
        setField(term5389, term5389.getClass(), "host", null);
        setField(term5389, term5389.getClass(), "port", null);
        setField(term5389, term5389.getClass(), "health", null);
        setField(term5389, term5389.getClass(), "scheme", null);
        setIntField(term5389, term5389.getClass(), "priority", 1962444399);
        setBooleanField(term5389, term5389.getClass(), "isActive", true);
        setField(term5389, term5389.getClass(), "type", null);
        setField(term5389, term5389.getClass(), "groupId", null);
        setFloatField(term5389, term5389.getClass(), "loadFactor", 0.45691717F);
        setBooleanField(term5389, term5389.getClass(), "isReachable", true);
        Object term5394 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5394, term5394.getClass(), "id", null);
        setField(term5394, term5394.getClass(), "host", null);
        setField(term5394, term5394.getClass(), "port", null);
        setField(term5394, term5394.getClass(), "health", null);
        setField(term5394, term5394.getClass(), "scheme", null);
        setIntField(term5394, term5394.getClass(), "priority", 767834723);
        setBooleanField(term5394, term5394.getClass(), "isActive", true);
        setField(term5394, term5394.getClass(), "type", null);
        setField(term5394, term5394.getClass(), "groupId", null);
        setFloatField(term5394, term5394.getClass(), "loadFactor", 0.17877543F);
        setBooleanField(term5394, term5394.getClass(), "isReachable", true);
        Object term5399 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term5399, term5399.getClass(), "id", null);
        setField(term5399, term5399.getClass(), "host", null);
        setField(term5399, term5399.getClass(), "port", null);
        setField(term5399, term5399.getClass(), "health", null);
        setField(term5399, term5399.getClass(), "scheme", null);
        setIntField(term5399, term5399.getClass(), "priority", -602026508);
        setBooleanField(term5399, term5399.getClass(), "isActive", true);
        setField(term5399, term5399.getClass(), "type", null);
        setField(term5399, term5399.getClass(), "groupId", null);
        setFloatField(term5399, term5399.getClass(), "loadFactor", 0.8598297F);
        setBooleanField(term5399, term5399.getClass(), "isReachable", true);
        ArrayList term5372 = new ArrayList();
        ((ArrayList) term5372).add(term5374);
        ((ArrayList) term5372).add(term5379);
        ((ArrayList) term5372).add(term5384);
        ((ArrayList) term5372).add(term5389);
        ((ArrayList) term5372).add(term5394);
        ((ArrayList) term5372).add(term5399);
        HashMap term5502 = new HashMap();
        HashMap term5507 = new HashMap();
        HashMap term5525 = new HashMap();
        term5195 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term5355 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term5195, term5195.getClass(), "host", "dDHcmzPAmP");
        setBooleanField(term5195, term5195.getClass(), "tunnel", false);
        setField(term5195, term5195.getClass(), "port", "HEaTkWYBgv");
        setField(term5195, term5195.getClass(), "scheme", "MpJsPKLTIU");
        setField(term5195, term5195.getClass(), "basePath", "IiNCZfdouL");
        setField(term5195, term5195.getClass(), "id", "AhOHzCsHKW");
        setField(term5195, term5195.getClass(), "name", "UqgLPaaAHi");
        setField(term5195, term5195.getClass(), "groupId", "xypryEkUPF");
        setField(term5195, term5195.getClass(), "target", "zyZTzHNjQr");
        setBooleanField(term5195, term5195.getClass(), "async", true);
        setField(term5195, term5195.getClass(), "asyncEngine", "YSrFKQQwXE");
        setField(term5195, term5195.getClass(), "callbackId", "qxhOsmyyjm");
        setField(term5195, term5195.getClass(), "jwtKeylookup", "DuKcNfVVYR");
        setField(term5195, term5195.getClass(), "certificateId", "fRujHWvXjJ");
        setField(term5195, term5195.getClass(), "secappid", "EAIAAStlTz");
        setBooleanField(term5195, term5195.getClass(), "autoProcure", true);
        setField(term5355, term5355.getClass(), "cachedResources", term5356);
        setField(term5355, term5355.getClass(), "hostGroups", term5372);
        setField(term5355, term5355.getClass(), "host", "PNzNzzjSXM");
        setField(term5355, term5355.getClass(), "port", "ktKcSZiuGM");
        setField(term5355, term5355.getClass(), "hostGroupId", "PSOttyUeqv");
        setField(term5355, term5355.getClass(), "scheme", "HmEvTlmzXo");
        setField(term5355, term5355.getClass(), "basePath", "BMMonTIZgJ");
        setField(term5355, term5355.getClass(), "id", "QXyFXBjFde");
        setField(term5355, term5355.getClass(), "name", "xVFgeyYxZS");
        setField(term5355, term5355.getClass(), "groupId", "iQiGTulJiH");
        setField(term5355, term5355.getClass(), "includeHeaders", term5502);
        setField(term5355, term5355.getClass(), "excludeHeaders", term5507);
        setBooleanField(term5355, term5355.getClass(), "enableCache", false);
        setField(term5195, term5195.getClass(), "targetSystem", term5355);
        setField(term5195, term5195.getClass(), "headerLookup", "utCuuVCKqE");
        setField(term5195, term5195.getClass(), "keyLookupMap", term5525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zSfoqzJbPT";
        callMethod(klass, "setCertificateId", argTypes, term5195, args);
    }

};


