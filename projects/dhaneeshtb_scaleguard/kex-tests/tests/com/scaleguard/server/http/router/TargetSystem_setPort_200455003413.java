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

public class TargetSystem_setPort_200455003413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30752;

    public TargetSystem_setPort_200455003413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30755 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30761 = (Object[]) newArray("java.lang.String", 2);
        setField(term30755, term30755.getClass(), "pattern", "");
        setField(term30755, term30755.getClass(), "method", "");
        setBooleanField(term30755, term30755.getClass(), "cached", true);
        setBooleanField(term30755, term30755.getClass(), "async", false);
        setField(term30755, term30755.getClass(), "keyLookupType", "");
        setField(term30755, term30755.getClass(), "keyLookupHeaders", term30761);
        setField(term30755, term30755.getClass(), "keyLookupClass", "");
        Object term30763 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30769 = (Object[]) newArray("java.lang.String", 6);
        setField(term30763, term30763.getClass(), "pattern", "");
        setField(term30763, term30763.getClass(), "method", "");
        setBooleanField(term30763, term30763.getClass(), "cached", false);
        setBooleanField(term30763, term30763.getClass(), "async", false);
        setField(term30763, term30763.getClass(), "keyLookupType", "");
        setField(term30763, term30763.getClass(), "keyLookupHeaders", term30769);
        setField(term30763, term30763.getClass(), "keyLookupClass", "");
        Object term30771 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30777 = (Object[]) newArray("java.lang.String", 4);
        setField(term30771, term30771.getClass(), "pattern", "");
        setField(term30771, term30771.getClass(), "method", "");
        setBooleanField(term30771, term30771.getClass(), "cached", false);
        setBooleanField(term30771, term30771.getClass(), "async", false);
        setField(term30771, term30771.getClass(), "keyLookupType", "");
        setField(term30771, term30771.getClass(), "keyLookupHeaders", term30777);
        setField(term30771, term30771.getClass(), "keyLookupClass", "");
        Object term30779 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term30785 = (Object[]) newArray("java.lang.String", 0);
        setField(term30779, term30779.getClass(), "pattern", "");
        setField(term30779, term30779.getClass(), "method", "");
        setBooleanField(term30779, term30779.getClass(), "cached", true);
        setBooleanField(term30779, term30779.getClass(), "async", false);
        setField(term30779, term30779.getClass(), "keyLookupType", "");
        setField(term30779, term30779.getClass(), "keyLookupHeaders", term30785);
        setField(term30779, term30779.getClass(), "keyLookupClass", "");
        ArrayList term30753 = new ArrayList();
        ((ArrayList) term30753).add(term30755);
        ((ArrayList) term30753).add(term30763);
        ((ArrayList) term30753).add(term30771);
        ((ArrayList) term30753).add(term30779);
        Object term30791 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30791, term30791.getClass(), "id", "");
        setField(term30791, term30791.getClass(), "host", "");
        setField(term30791, term30791.getClass(), "port", "");
        setField(term30791, term30791.getClass(), "health", "");
        setField(term30791, term30791.getClass(), "scheme", "");
        setIntField(term30791, term30791.getClass(), "priority", -129547140);
        setBooleanField(term30791, term30791.getClass(), "isActive", true);
        setField(term30791, term30791.getClass(), "type", "");
        setField(term30791, term30791.getClass(), "groupId", "");
        setFloatField(term30791, term30791.getClass(), "loadFactor", 0.119950235F);
        setBooleanField(term30791, term30791.getClass(), "isReachable", true);
        Object term30803 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30803, term30803.getClass(), "id", "");
        setField(term30803, term30803.getClass(), "host", "");
        setField(term30803, term30803.getClass(), "port", "");
        setField(term30803, term30803.getClass(), "health", "");
        setField(term30803, term30803.getClass(), "scheme", "");
        setIntField(term30803, term30803.getClass(), "priority", 199287428);
        setBooleanField(term30803, term30803.getClass(), "isActive", true);
        setField(term30803, term30803.getClass(), "type", "");
        setField(term30803, term30803.getClass(), "groupId", "");
        setFloatField(term30803, term30803.getClass(), "loadFactor", 0.78186196F);
        setBooleanField(term30803, term30803.getClass(), "isReachable", true);
        Object term30815 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term30815, term30815.getClass(), "id", "");
        setField(term30815, term30815.getClass(), "host", "");
        setField(term30815, term30815.getClass(), "port", "");
        setField(term30815, term30815.getClass(), "health", "");
        setField(term30815, term30815.getClass(), "scheme", "");
        setIntField(term30815, term30815.getClass(), "priority", -1195339592);
        setBooleanField(term30815, term30815.getClass(), "isActive", true);
        setField(term30815, term30815.getClass(), "type", "");
        setField(term30815, term30815.getClass(), "groupId", "");
        setFloatField(term30815, term30815.getClass(), "loadFactor", 0.9698374F);
        setBooleanField(term30815, term30815.getClass(), "isReachable", true);
        ArrayList term30789 = new ArrayList();
        ((ArrayList) term30789).add(term30791);
        ((ArrayList) term30789).add(term30803);
        ((ArrayList) term30789).add(term30815);
        HashMap term30925 = new HashMap();
        HashMap term30930 = new HashMap();
        term30752 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term30752, term30752.getClass(), "cachedResources", term30753);
        setField(term30752, term30752.getClass(), "hostGroups", term30789);
        setField(term30752, term30752.getClass(), "host", "uXFGrCmsoj");
        setField(term30752, term30752.getClass(), "port", "neFbgoRFth");
        setField(term30752, term30752.getClass(), "hostGroupId", "rMAeMXcVLg");
        setField(term30752, term30752.getClass(), "scheme", "rwfffztPZR");
        setField(term30752, term30752.getClass(), "basePath", "gdOOqYLTIa");
        setField(term30752, term30752.getClass(), "id", "laVtzInYkB");
        setField(term30752, term30752.getClass(), "name", "QlMgZrPWFc");
        setField(term30752, term30752.getClass(), "groupId", "RBFdhcXDVw");
        setField(term30752, term30752.getClass(), "includeHeaders", term30925);
        setField(term30752, term30752.getClass(), "excludeHeaders", term30930);
        setBooleanField(term30752, term30752.getClass(), "enableCache", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xVeXohNyns";
        callMethod(klass, "setPort", argTypes, term30752, args);
    }

};


