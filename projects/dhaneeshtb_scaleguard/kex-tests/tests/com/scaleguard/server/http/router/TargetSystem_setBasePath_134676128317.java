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

public class TargetSystem_setBasePath_134676128317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31836;

    public TargetSystem_setBasePath_134676128317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31839 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31845 = (Object[]) newArray("java.lang.String", 2);
        setField(term31839, term31839.getClass(), "pattern", "");
        setField(term31839, term31839.getClass(), "method", "");
        setBooleanField(term31839, term31839.getClass(), "cached", true);
        setBooleanField(term31839, term31839.getClass(), "async", true);
        setField(term31839, term31839.getClass(), "keyLookupType", "");
        setField(term31839, term31839.getClass(), "keyLookupHeaders", term31845);
        setField(term31839, term31839.getClass(), "keyLookupClass", "");
        Object term31847 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31853 = (Object[]) newArray("java.lang.String", 8);
        setField(term31847, term31847.getClass(), "pattern", "");
        setField(term31847, term31847.getClass(), "method", "");
        setBooleanField(term31847, term31847.getClass(), "cached", true);
        setBooleanField(term31847, term31847.getClass(), "async", true);
        setField(term31847, term31847.getClass(), "keyLookupType", "");
        setField(term31847, term31847.getClass(), "keyLookupHeaders", term31853);
        setField(term31847, term31847.getClass(), "keyLookupClass", "");
        Object term31855 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31861 = (Object[]) newArray("java.lang.String", 7);
        setField(term31855, term31855.getClass(), "pattern", "");
        setField(term31855, term31855.getClass(), "method", "");
        setBooleanField(term31855, term31855.getClass(), "cached", true);
        setBooleanField(term31855, term31855.getClass(), "async", true);
        setField(term31855, term31855.getClass(), "keyLookupType", "");
        setField(term31855, term31855.getClass(), "keyLookupHeaders", term31861);
        setField(term31855, term31855.getClass(), "keyLookupClass", "");
        Object term31863 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31869 = (Object[]) newArray("java.lang.String", 3);
        setField(term31863, term31863.getClass(), "pattern", "");
        setField(term31863, term31863.getClass(), "method", "");
        setBooleanField(term31863, term31863.getClass(), "cached", true);
        setBooleanField(term31863, term31863.getClass(), "async", true);
        setField(term31863, term31863.getClass(), "keyLookupType", "");
        setField(term31863, term31863.getClass(), "keyLookupHeaders", term31869);
        setField(term31863, term31863.getClass(), "keyLookupClass", "");
        Object term31871 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31877 = (Object[]) newArray("java.lang.String", 7);
        setField(term31871, term31871.getClass(), "pattern", "");
        setField(term31871, term31871.getClass(), "method", "");
        setBooleanField(term31871, term31871.getClass(), "cached", true);
        setBooleanField(term31871, term31871.getClass(), "async", false);
        setField(term31871, term31871.getClass(), "keyLookupType", "");
        setField(term31871, term31871.getClass(), "keyLookupHeaders", term31877);
        setField(term31871, term31871.getClass(), "keyLookupClass", "");
        Object term31879 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term31885 = (Object[]) newArray("java.lang.String", 8);
        setField(term31879, term31879.getClass(), "pattern", "");
        setField(term31879, term31879.getClass(), "method", "");
        setBooleanField(term31879, term31879.getClass(), "cached", true);
        setBooleanField(term31879, term31879.getClass(), "async", false);
        setField(term31879, term31879.getClass(), "keyLookupType", "");
        setField(term31879, term31879.getClass(), "keyLookupHeaders", term31885);
        setField(term31879, term31879.getClass(), "keyLookupClass", "");
        ArrayList term31837 = new ArrayList();
        ((ArrayList) term31837).add(term31839);
        ((ArrayList) term31837).add(term31847);
        ((ArrayList) term31837).add(term31855);
        ((ArrayList) term31837).add(term31863);
        ((ArrayList) term31837).add(term31871);
        ((ArrayList) term31837).add(term31879);
        Object term31891 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31891, term31891.getClass(), "id", "");
        setField(term31891, term31891.getClass(), "host", "");
        setField(term31891, term31891.getClass(), "port", "");
        setField(term31891, term31891.getClass(), "health", "");
        setField(term31891, term31891.getClass(), "scheme", "");
        setIntField(term31891, term31891.getClass(), "priority", -916335264);
        setBooleanField(term31891, term31891.getClass(), "isActive", true);
        setField(term31891, term31891.getClass(), "type", "");
        setField(term31891, term31891.getClass(), "groupId", "");
        setFloatField(term31891, term31891.getClass(), "loadFactor", 0.8789557F);
        setBooleanField(term31891, term31891.getClass(), "isReachable", true);
        Object term31903 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31903, term31903.getClass(), "id", "");
        setField(term31903, term31903.getClass(), "host", "");
        setField(term31903, term31903.getClass(), "port", "");
        setField(term31903, term31903.getClass(), "health", "");
        setField(term31903, term31903.getClass(), "scheme", "");
        setIntField(term31903, term31903.getClass(), "priority", -919416536);
        setBooleanField(term31903, term31903.getClass(), "isActive", true);
        setField(term31903, term31903.getClass(), "type", "");
        setField(term31903, term31903.getClass(), "groupId", "");
        setFloatField(term31903, term31903.getClass(), "loadFactor", 0.8414608F);
        setBooleanField(term31903, term31903.getClass(), "isReachable", true);
        Object term31915 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31915, term31915.getClass(), "id", "");
        setField(term31915, term31915.getClass(), "host", "");
        setField(term31915, term31915.getClass(), "port", "");
        setField(term31915, term31915.getClass(), "health", "");
        setField(term31915, term31915.getClass(), "scheme", "");
        setIntField(term31915, term31915.getClass(), "priority", -43417861);
        setBooleanField(term31915, term31915.getClass(), "isActive", true);
        setField(term31915, term31915.getClass(), "type", "");
        setField(term31915, term31915.getClass(), "groupId", "");
        setFloatField(term31915, term31915.getClass(), "loadFactor", 0.78664905F);
        setBooleanField(term31915, term31915.getClass(), "isReachable", true);
        Object term31927 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31927, term31927.getClass(), "id", "");
        setField(term31927, term31927.getClass(), "host", "");
        setField(term31927, term31927.getClass(), "port", "");
        setField(term31927, term31927.getClass(), "health", "");
        setField(term31927, term31927.getClass(), "scheme", "");
        setIntField(term31927, term31927.getClass(), "priority", -1533843432);
        setBooleanField(term31927, term31927.getClass(), "isActive", true);
        setField(term31927, term31927.getClass(), "type", "");
        setField(term31927, term31927.getClass(), "groupId", "");
        setFloatField(term31927, term31927.getClass(), "loadFactor", 0.78593165F);
        setBooleanField(term31927, term31927.getClass(), "isReachable", true);
        ArrayList term31889 = new ArrayList();
        ((ArrayList) term31889).add(term31891);
        ((ArrayList) term31889).add(term31903);
        ((ArrayList) term31889).add(term31915);
        ((ArrayList) term31889).add(term31927);
        HashMap term32037 = new HashMap();
        HashMap term32042 = new HashMap();
        term31836 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term31836, term31836.getClass(), "cachedResources", term31837);
        setField(term31836, term31836.getClass(), "hostGroups", term31889);
        setField(term31836, term31836.getClass(), "host", "zEsjjlIKrF");
        setField(term31836, term31836.getClass(), "port", "XeoSSCwSfl");
        setField(term31836, term31836.getClass(), "hostGroupId", "adcoGovSer");
        setField(term31836, term31836.getClass(), "scheme", "DZqXfiKqtE");
        setField(term31836, term31836.getClass(), "basePath", "YOsqpIMuey");
        setField(term31836, term31836.getClass(), "id", "dfJffzsKZe");
        setField(term31836, term31836.getClass(), "name", "dTgyMBkwWX");
        setField(term31836, term31836.getClass(), "groupId", "mhIqZywfDK");
        setField(term31836, term31836.getClass(), "includeHeaders", term32037);
        setField(term31836, term31836.getClass(), "excludeHeaders", term32042);
        setBooleanField(term31836, term31836.getClass(), "enableCache", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MXPBuilyzu";
        callMethod(klass, "setBasePath", argTypes, term31836, args);
    }

};


