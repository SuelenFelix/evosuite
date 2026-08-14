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

public class TargetSystem_getName_50018972820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32868;

    public TargetSystem_getName_50018972820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32871 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term32877 = (Object[]) newArray("java.lang.String", 5);
        setField(term32871, term32871.getClass(), "pattern", "");
        setField(term32871, term32871.getClass(), "method", "");
        setBooleanField(term32871, term32871.getClass(), "cached", true);
        setBooleanField(term32871, term32871.getClass(), "async", true);
        setField(term32871, term32871.getClass(), "keyLookupType", "");
        setField(term32871, term32871.getClass(), "keyLookupHeaders", term32877);
        setField(term32871, term32871.getClass(), "keyLookupClass", "");
        Object term32879 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term32885 = (Object[]) newArray("java.lang.String", 7);
        setField(term32879, term32879.getClass(), "pattern", "");
        setField(term32879, term32879.getClass(), "method", "");
        setBooleanField(term32879, term32879.getClass(), "cached", false);
        setBooleanField(term32879, term32879.getClass(), "async", false);
        setField(term32879, term32879.getClass(), "keyLookupType", "");
        setField(term32879, term32879.getClass(), "keyLookupHeaders", term32885);
        setField(term32879, term32879.getClass(), "keyLookupClass", "");
        ArrayList term32869 = new ArrayList();
        ((ArrayList) term32869).add(term32871);
        ((ArrayList) term32869).add(term32879);
        Object term32891 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term32891, term32891.getClass(), "id", "");
        setField(term32891, term32891.getClass(), "host", "");
        setField(term32891, term32891.getClass(), "port", "");
        setField(term32891, term32891.getClass(), "health", "");
        setField(term32891, term32891.getClass(), "scheme", "");
        setIntField(term32891, term32891.getClass(), "priority", -49052672);
        setBooleanField(term32891, term32891.getClass(), "isActive", true);
        setField(term32891, term32891.getClass(), "type", "");
        setField(term32891, term32891.getClass(), "groupId", "");
        setFloatField(term32891, term32891.getClass(), "loadFactor", 0.8521579F);
        setBooleanField(term32891, term32891.getClass(), "isReachable", true);
        Object term32903 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term32903, term32903.getClass(), "id", "");
        setField(term32903, term32903.getClass(), "host", "");
        setField(term32903, term32903.getClass(), "port", "");
        setField(term32903, term32903.getClass(), "health", "");
        setField(term32903, term32903.getClass(), "scheme", "");
        setIntField(term32903, term32903.getClass(), "priority", 339372704);
        setBooleanField(term32903, term32903.getClass(), "isActive", true);
        setField(term32903, term32903.getClass(), "type", "");
        setField(term32903, term32903.getClass(), "groupId", "");
        setFloatField(term32903, term32903.getClass(), "loadFactor", 0.76361305F);
        setBooleanField(term32903, term32903.getClass(), "isReachable", true);
        Object term32915 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term32915, term32915.getClass(), "id", "");
        setField(term32915, term32915.getClass(), "host", "");
        setField(term32915, term32915.getClass(), "port", "");
        setField(term32915, term32915.getClass(), "health", "");
        setField(term32915, term32915.getClass(), "scheme", "");
        setIntField(term32915, term32915.getClass(), "priority", -851097944);
        setBooleanField(term32915, term32915.getClass(), "isActive", true);
        setField(term32915, term32915.getClass(), "type", "");
        setField(term32915, term32915.getClass(), "groupId", "");
        setFloatField(term32915, term32915.getClass(), "loadFactor", 0.98857903F);
        setBooleanField(term32915, term32915.getClass(), "isReachable", true);
        ArrayList term32889 = new ArrayList();
        ((ArrayList) term32889).add(term32891);
        ((ArrayList) term32889).add(term32903);
        ((ArrayList) term32889).add(term32915);
        HashMap term33025 = new HashMap();
        HashMap term33030 = new HashMap();
        term32868 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term32868, term32868.getClass(), "cachedResources", term32869);
        setField(term32868, term32868.getClass(), "hostGroups", term32889);
        setField(term32868, term32868.getClass(), "host", "UrMOWCrQMH");
        setField(term32868, term32868.getClass(), "port", "WvuyCTtUTF");
        setField(term32868, term32868.getClass(), "hostGroupId", "mSDLNUwhJE");
        setField(term32868, term32868.getClass(), "scheme", "kydwcBIblz");
        setField(term32868, term32868.getClass(), "basePath", "uALaoojxvW");
        setField(term32868, term32868.getClass(), "id", "FrsBgmvjej");
        setField(term32868, term32868.getClass(), "name", "OmLoZDdbMy");
        setField(term32868, term32868.getClass(), "groupId", "mbNJbZsitQ");
        setField(term32868, term32868.getClass(), "includeHeaders", term33025);
        setField(term32868, term32868.getClass(), "excludeHeaders", term33030);
        setBooleanField(term32868, term32868.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term32868, args);
    }

};


