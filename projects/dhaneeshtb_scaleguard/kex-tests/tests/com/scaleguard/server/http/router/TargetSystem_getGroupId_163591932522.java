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

public class TargetSystem_getGroupId_163591932522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33514;

    public TargetSystem_getGroupId_163591932522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33517 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33523 = (Object[]) newArray("java.lang.String", 8);
        setField(term33517, term33517.getClass(), "pattern", "");
        setField(term33517, term33517.getClass(), "method", "");
        setBooleanField(term33517, term33517.getClass(), "cached", true);
        setBooleanField(term33517, term33517.getClass(), "async", true);
        setField(term33517, term33517.getClass(), "keyLookupType", "");
        setField(term33517, term33517.getClass(), "keyLookupHeaders", term33523);
        setField(term33517, term33517.getClass(), "keyLookupClass", "");
        Object term33525 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33531 = (Object[]) newArray("java.lang.String", 1);
        setField(term33525, term33525.getClass(), "pattern", "");
        setField(term33525, term33525.getClass(), "method", "");
        setBooleanField(term33525, term33525.getClass(), "cached", false);
        setBooleanField(term33525, term33525.getClass(), "async", true);
        setField(term33525, term33525.getClass(), "keyLookupType", "");
        setField(term33525, term33525.getClass(), "keyLookupHeaders", term33531);
        setField(term33525, term33525.getClass(), "keyLookupClass", "");
        Object term33533 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33539 = (Object[]) newArray("java.lang.String", 1);
        setField(term33533, term33533.getClass(), "pattern", "");
        setField(term33533, term33533.getClass(), "method", "");
        setBooleanField(term33533, term33533.getClass(), "cached", true);
        setBooleanField(term33533, term33533.getClass(), "async", false);
        setField(term33533, term33533.getClass(), "keyLookupType", "");
        setField(term33533, term33533.getClass(), "keyLookupHeaders", term33539);
        setField(term33533, term33533.getClass(), "keyLookupClass", "");
        Object term33541 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33547 = (Object[]) newArray("java.lang.String", 9);
        setField(term33541, term33541.getClass(), "pattern", "");
        setField(term33541, term33541.getClass(), "method", "");
        setBooleanField(term33541, term33541.getClass(), "cached", false);
        setBooleanField(term33541, term33541.getClass(), "async", true);
        setField(term33541, term33541.getClass(), "keyLookupType", "");
        setField(term33541, term33541.getClass(), "keyLookupHeaders", term33547);
        setField(term33541, term33541.getClass(), "keyLookupClass", "");
        Object term33549 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33555 = (Object[]) newArray("java.lang.String", 1);
        setField(term33549, term33549.getClass(), "pattern", "");
        setField(term33549, term33549.getClass(), "method", "");
        setBooleanField(term33549, term33549.getClass(), "cached", true);
        setBooleanField(term33549, term33549.getClass(), "async", true);
        setField(term33549, term33549.getClass(), "keyLookupType", "");
        setField(term33549, term33549.getClass(), "keyLookupHeaders", term33555);
        setField(term33549, term33549.getClass(), "keyLookupClass", "");
        Object term33557 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33563 = (Object[]) newArray("java.lang.String", 4);
        setField(term33557, term33557.getClass(), "pattern", "");
        setField(term33557, term33557.getClass(), "method", "");
        setBooleanField(term33557, term33557.getClass(), "cached", false);
        setBooleanField(term33557, term33557.getClass(), "async", true);
        setField(term33557, term33557.getClass(), "keyLookupType", "");
        setField(term33557, term33557.getClass(), "keyLookupHeaders", term33563);
        setField(term33557, term33557.getClass(), "keyLookupClass", "");
        Object term33565 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33571 = (Object[]) newArray("java.lang.String", 0);
        setField(term33565, term33565.getClass(), "pattern", "");
        setField(term33565, term33565.getClass(), "method", "");
        setBooleanField(term33565, term33565.getClass(), "cached", true);
        setBooleanField(term33565, term33565.getClass(), "async", true);
        setField(term33565, term33565.getClass(), "keyLookupType", "");
        setField(term33565, term33565.getClass(), "keyLookupHeaders", term33571);
        setField(term33565, term33565.getClass(), "keyLookupClass", "");
        Object term33573 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33579 = (Object[]) newArray("java.lang.String", 2);
        setField(term33573, term33573.getClass(), "pattern", "");
        setField(term33573, term33573.getClass(), "method", "");
        setBooleanField(term33573, term33573.getClass(), "cached", false);
        setBooleanField(term33573, term33573.getClass(), "async", true);
        setField(term33573, term33573.getClass(), "keyLookupType", "");
        setField(term33573, term33573.getClass(), "keyLookupHeaders", term33579);
        setField(term33573, term33573.getClass(), "keyLookupClass", "");
        ArrayList term33515 = new ArrayList();
        ((ArrayList) term33515).add(term33517);
        ((ArrayList) term33515).add(term33525);
        ((ArrayList) term33515).add(term33533);
        ((ArrayList) term33515).add(term33541);
        ((ArrayList) term33515).add(term33549);
        ((ArrayList) term33515).add(term33557);
        ((ArrayList) term33515).add(term33565);
        ((ArrayList) term33515).add(term33573);
        Object term33585 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term33585, term33585.getClass(), "id", "");
        setField(term33585, term33585.getClass(), "host", "");
        setField(term33585, term33585.getClass(), "port", "");
        setField(term33585, term33585.getClass(), "health", "");
        setField(term33585, term33585.getClass(), "scheme", "");
        setIntField(term33585, term33585.getClass(), "priority", 1466373988);
        setBooleanField(term33585, term33585.getClass(), "isActive", true);
        setField(term33585, term33585.getClass(), "type", "");
        setField(term33585, term33585.getClass(), "groupId", "");
        setFloatField(term33585, term33585.getClass(), "loadFactor", 0.13481039F);
        setBooleanField(term33585, term33585.getClass(), "isReachable", true);
        ArrayList term33583 = new ArrayList();
        ((ArrayList) term33583).add(term33585);
        HashMap term33695 = new HashMap();
        HashMap term33700 = new HashMap();
        term33514 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term33514, term33514.getClass(), "cachedResources", term33515);
        setField(term33514, term33514.getClass(), "hostGroups", term33583);
        setField(term33514, term33514.getClass(), "host", "FVvtvTPEiD");
        setField(term33514, term33514.getClass(), "port", "paedcGulXI");
        setField(term33514, term33514.getClass(), "hostGroupId", "voVkXMJSsx");
        setField(term33514, term33514.getClass(), "scheme", "tOqDchKApH");
        setField(term33514, term33514.getClass(), "basePath", "iqeVuiibgM");
        setField(term33514, term33514.getClass(), "id", "LCPfALdqnP");
        setField(term33514, term33514.getClass(), "name", "YRvjJByBZa");
        setField(term33514, term33514.getClass(), "groupId", "yWPHiAqZcQ");
        setField(term33514, term33514.getClass(), "includeHeaders", term33695);
        setField(term33514, term33514.getClass(), "excludeHeaders", term33700);
        setBooleanField(term33514, term33514.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term33514, args);
    }

};


