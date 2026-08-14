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

public class TargetSystem_setGroupId_184756694723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33786;

    public TargetSystem_setGroupId_184756694723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33789 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term33795 = (Object[]) newArray("java.lang.String", 8);
        setField(term33789, term33789.getClass(), "pattern", "");
        setField(term33789, term33789.getClass(), "method", "");
        setBooleanField(term33789, term33789.getClass(), "cached", true);
        setBooleanField(term33789, term33789.getClass(), "async", false);
        setField(term33789, term33789.getClass(), "keyLookupType", "");
        setField(term33789, term33789.getClass(), "keyLookupHeaders", term33795);
        setField(term33789, term33789.getClass(), "keyLookupClass", "");
        ArrayList term33787 = new ArrayList();
        ((ArrayList) term33787).add(term33789);
        Object term33801 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term33801, term33801.getClass(), "id", "");
        setField(term33801, term33801.getClass(), "host", "");
        setField(term33801, term33801.getClass(), "port", "");
        setField(term33801, term33801.getClass(), "health", "");
        setField(term33801, term33801.getClass(), "scheme", "");
        setIntField(term33801, term33801.getClass(), "priority", -358526505);
        setBooleanField(term33801, term33801.getClass(), "isActive", true);
        setField(term33801, term33801.getClass(), "type", "");
        setField(term33801, term33801.getClass(), "groupId", "");
        setFloatField(term33801, term33801.getClass(), "loadFactor", 0.6054109F);
        setBooleanField(term33801, term33801.getClass(), "isReachable", true);
        Object term33813 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term33813, term33813.getClass(), "id", "");
        setField(term33813, term33813.getClass(), "host", "");
        setField(term33813, term33813.getClass(), "port", "");
        setField(term33813, term33813.getClass(), "health", "");
        setField(term33813, term33813.getClass(), "scheme", "");
        setIntField(term33813, term33813.getClass(), "priority", 1843268026);
        setBooleanField(term33813, term33813.getClass(), "isActive", true);
        setField(term33813, term33813.getClass(), "type", "");
        setField(term33813, term33813.getClass(), "groupId", "");
        setFloatField(term33813, term33813.getClass(), "loadFactor", 0.34141678F);
        setBooleanField(term33813, term33813.getClass(), "isReachable", true);
        Object term33825 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term33825, term33825.getClass(), "id", "");
        setField(term33825, term33825.getClass(), "host", "");
        setField(term33825, term33825.getClass(), "port", "");
        setField(term33825, term33825.getClass(), "health", "");
        setField(term33825, term33825.getClass(), "scheme", "");
        setIntField(term33825, term33825.getClass(), "priority", 954660603);
        setBooleanField(term33825, term33825.getClass(), "isActive", true);
        setField(term33825, term33825.getClass(), "type", "");
        setField(term33825, term33825.getClass(), "groupId", "");
        setFloatField(term33825, term33825.getClass(), "loadFactor", 0.916524F);
        setBooleanField(term33825, term33825.getClass(), "isReachable", true);
        Object term33837 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term33837, term33837.getClass(), "id", "");
        setField(term33837, term33837.getClass(), "host", "");
        setField(term33837, term33837.getClass(), "port", "");
        setField(term33837, term33837.getClass(), "health", "");
        setField(term33837, term33837.getClass(), "scheme", "");
        setIntField(term33837, term33837.getClass(), "priority", -1351605385);
        setBooleanField(term33837, term33837.getClass(), "isActive", true);
        setField(term33837, term33837.getClass(), "type", "");
        setField(term33837, term33837.getClass(), "groupId", "");
        setFloatField(term33837, term33837.getClass(), "loadFactor", 0.42916924F);
        setBooleanField(term33837, term33837.getClass(), "isReachable", true);
        Object term33849 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term33849, term33849.getClass(), "id", "");
        setField(term33849, term33849.getClass(), "host", "");
        setField(term33849, term33849.getClass(), "port", "");
        setField(term33849, term33849.getClass(), "health", "");
        setField(term33849, term33849.getClass(), "scheme", "");
        setIntField(term33849, term33849.getClass(), "priority", 278355793);
        setBooleanField(term33849, term33849.getClass(), "isActive", true);
        setField(term33849, term33849.getClass(), "type", "");
        setField(term33849, term33849.getClass(), "groupId", "");
        setFloatField(term33849, term33849.getClass(), "loadFactor", 0.22227418F);
        setBooleanField(term33849, term33849.getClass(), "isReachable", true);
        ArrayList term33799 = new ArrayList();
        ((ArrayList) term33799).add(term33801);
        ((ArrayList) term33799).add(term33813);
        ((ArrayList) term33799).add(term33825);
        ((ArrayList) term33799).add(term33837);
        ((ArrayList) term33799).add(term33849);
        HashMap term33959 = new HashMap();
        HashMap term33964 = new HashMap();
        term33786 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term33786, term33786.getClass(), "cachedResources", term33787);
        setField(term33786, term33786.getClass(), "hostGroups", term33799);
        setField(term33786, term33786.getClass(), "host", "QHwFfYSCNm");
        setField(term33786, term33786.getClass(), "port", "TDpWaJHRZc");
        setField(term33786, term33786.getClass(), "hostGroupId", "nsydNohggs");
        setField(term33786, term33786.getClass(), "scheme", "NwQXMulIlF");
        setField(term33786, term33786.getClass(), "basePath", "lEtoSVazWN");
        setField(term33786, term33786.getClass(), "id", "ddDDOEjMuN");
        setField(term33786, term33786.getClass(), "name", "tHBufRenNj");
        setField(term33786, term33786.getClass(), "groupId", "wtWSSbxhjb");
        setField(term33786, term33786.getClass(), "includeHeaders", term33959);
        setField(term33786, term33786.getClass(), "excludeHeaders", term33964);
        setBooleanField(term33786, term33786.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ibhIEMBJkC";
        callMethod(klass, "setGroupId", argTypes, term33786, args);
    }

};


