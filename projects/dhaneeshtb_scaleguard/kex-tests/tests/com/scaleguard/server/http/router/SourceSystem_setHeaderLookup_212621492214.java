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

public class SourceSystem_setHeaderLookup_212621492214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7731;

    public SourceSystem_setHeaderLookup_212621492214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7894 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term7894, term7894.getClass(), "pattern", null);
        setField(term7894, term7894.getClass(), "method", null);
        setBooleanField(term7894, term7894.getClass(), "cached", true);
        setBooleanField(term7894, term7894.getClass(), "async", true);
        setField(term7894, term7894.getClass(), "keyLookupType", null);
        setField(term7894, term7894.getClass(), "keyLookupHeaders", null);
        setField(term7894, term7894.getClass(), "keyLookupClass", null);
        Object term7897 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term7897, term7897.getClass(), "pattern", null);
        setField(term7897, term7897.getClass(), "method", null);
        setBooleanField(term7897, term7897.getClass(), "cached", true);
        setBooleanField(term7897, term7897.getClass(), "async", false);
        setField(term7897, term7897.getClass(), "keyLookupType", null);
        setField(term7897, term7897.getClass(), "keyLookupHeaders", null);
        setField(term7897, term7897.getClass(), "keyLookupClass", null);
        ArrayList term7892 = new ArrayList();
        ((ArrayList) term7892).add(term7894);
        ((ArrayList) term7892).add(term7897);
        Object term7904 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7904, term7904.getClass(), "id", null);
        setField(term7904, term7904.getClass(), "host", null);
        setField(term7904, term7904.getClass(), "port", null);
        setField(term7904, term7904.getClass(), "health", null);
        setField(term7904, term7904.getClass(), "scheme", null);
        setIntField(term7904, term7904.getClass(), "priority", 97029295);
        setBooleanField(term7904, term7904.getClass(), "isActive", true);
        setField(term7904, term7904.getClass(), "type", null);
        setField(term7904, term7904.getClass(), "groupId", null);
        setFloatField(term7904, term7904.getClass(), "loadFactor", 0.022591352F);
        setBooleanField(term7904, term7904.getClass(), "isReachable", true);
        Object term7909 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7909, term7909.getClass(), "id", null);
        setField(term7909, term7909.getClass(), "host", null);
        setField(term7909, term7909.getClass(), "port", null);
        setField(term7909, term7909.getClass(), "health", null);
        setField(term7909, term7909.getClass(), "scheme", null);
        setIntField(term7909, term7909.getClass(), "priority", -1371869594);
        setBooleanField(term7909, term7909.getClass(), "isActive", true);
        setField(term7909, term7909.getClass(), "type", null);
        setField(term7909, term7909.getClass(), "groupId", null);
        setFloatField(term7909, term7909.getClass(), "loadFactor", 0.6805867F);
        setBooleanField(term7909, term7909.getClass(), "isReachable", true);
        Object term7914 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7914, term7914.getClass(), "id", null);
        setField(term7914, term7914.getClass(), "host", null);
        setField(term7914, term7914.getClass(), "port", null);
        setField(term7914, term7914.getClass(), "health", null);
        setField(term7914, term7914.getClass(), "scheme", null);
        setIntField(term7914, term7914.getClass(), "priority", -2095575670);
        setBooleanField(term7914, term7914.getClass(), "isActive", true);
        setField(term7914, term7914.getClass(), "type", null);
        setField(term7914, term7914.getClass(), "groupId", null);
        setFloatField(term7914, term7914.getClass(), "loadFactor", 0.51208574F);
        setBooleanField(term7914, term7914.getClass(), "isReachable", true);
        Object term7919 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7919, term7919.getClass(), "id", null);
        setField(term7919, term7919.getClass(), "host", null);
        setField(term7919, term7919.getClass(), "port", null);
        setField(term7919, term7919.getClass(), "health", null);
        setField(term7919, term7919.getClass(), "scheme", null);
        setIntField(term7919, term7919.getClass(), "priority", 1225272962);
        setBooleanField(term7919, term7919.getClass(), "isActive", true);
        setField(term7919, term7919.getClass(), "type", null);
        setField(term7919, term7919.getClass(), "groupId", null);
        setFloatField(term7919, term7919.getClass(), "loadFactor", 0.28528106F);
        setBooleanField(term7919, term7919.getClass(), "isReachable", true);
        Object term7924 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7924, term7924.getClass(), "id", null);
        setField(term7924, term7924.getClass(), "host", null);
        setField(term7924, term7924.getClass(), "port", null);
        setField(term7924, term7924.getClass(), "health", null);
        setField(term7924, term7924.getClass(), "scheme", null);
        setIntField(term7924, term7924.getClass(), "priority", 1324040357);
        setBooleanField(term7924, term7924.getClass(), "isActive", true);
        setField(term7924, term7924.getClass(), "type", null);
        setField(term7924, term7924.getClass(), "groupId", null);
        setFloatField(term7924, term7924.getClass(), "loadFactor", 0.30827713F);
        setBooleanField(term7924, term7924.getClass(), "isReachable", true);
        Object term7929 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7929, term7929.getClass(), "id", null);
        setField(term7929, term7929.getClass(), "host", null);
        setField(term7929, term7929.getClass(), "port", null);
        setField(term7929, term7929.getClass(), "health", null);
        setField(term7929, term7929.getClass(), "scheme", null);
        setIntField(term7929, term7929.getClass(), "priority", -1588772968);
        setBooleanField(term7929, term7929.getClass(), "isActive", true);
        setField(term7929, term7929.getClass(), "type", null);
        setField(term7929, term7929.getClass(), "groupId", null);
        setFloatField(term7929, term7929.getClass(), "loadFactor", 0.63008493F);
        setBooleanField(term7929, term7929.getClass(), "isReachable", true);
        Object term7934 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7934, term7934.getClass(), "id", null);
        setField(term7934, term7934.getClass(), "host", null);
        setField(term7934, term7934.getClass(), "port", null);
        setField(term7934, term7934.getClass(), "health", null);
        setField(term7934, term7934.getClass(), "scheme", null);
        setIntField(term7934, term7934.getClass(), "priority", -93135961);
        setBooleanField(term7934, term7934.getClass(), "isActive", true);
        setField(term7934, term7934.getClass(), "type", null);
        setField(term7934, term7934.getClass(), "groupId", null);
        setFloatField(term7934, term7934.getClass(), "loadFactor", 0.97831506F);
        setBooleanField(term7934, term7934.getClass(), "isReachable", true);
        ArrayList term7902 = new ArrayList();
        ((ArrayList) term7902).add(term7904);
        ((ArrayList) term7902).add(term7909);
        ((ArrayList) term7902).add(term7914);
        ((ArrayList) term7902).add(term7919);
        ((ArrayList) term7902).add(term7924);
        ((ArrayList) term7902).add(term7929);
        ((ArrayList) term7902).add(term7934);
        HashMap term8037 = new HashMap();
        HashMap term8042 = new HashMap();
        HashMap term8060 = new HashMap();
        term7731 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term7891 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term7731, term7731.getClass(), "host", "ojLrjltndD");
        setBooleanField(term7731, term7731.getClass(), "tunnel", true);
        setField(term7731, term7731.getClass(), "port", "VJtFSexKat");
        setField(term7731, term7731.getClass(), "scheme", "xPVddlPSQR");
        setField(term7731, term7731.getClass(), "basePath", "MxrhCLTMTH");
        setField(term7731, term7731.getClass(), "id", "kEehLMZcOU");
        setField(term7731, term7731.getClass(), "name", "RhLliqMiOF");
        setField(term7731, term7731.getClass(), "groupId", "jlhonEGrJH");
        setField(term7731, term7731.getClass(), "target", "RKcKwlEYZb");
        setBooleanField(term7731, term7731.getClass(), "async", false);
        setField(term7731, term7731.getClass(), "asyncEngine", "acPRDlpsid");
        setField(term7731, term7731.getClass(), "callbackId", "YyojIzvxLZ");
        setField(term7731, term7731.getClass(), "jwtKeylookup", "fxapaYlZea");
        setField(term7731, term7731.getClass(), "certificateId", "VJgREHwfRM");
        setField(term7731, term7731.getClass(), "secappid", "kXnpLIZTAr");
        setBooleanField(term7731, term7731.getClass(), "autoProcure", false);
        setField(term7891, term7891.getClass(), "cachedResources", term7892);
        setField(term7891, term7891.getClass(), "hostGroups", term7902);
        setField(term7891, term7891.getClass(), "host", "raNzcEorkV");
        setField(term7891, term7891.getClass(), "port", "nEgozCeoUr");
        setField(term7891, term7891.getClass(), "hostGroupId", "EWGMzlcOnW");
        setField(term7891, term7891.getClass(), "scheme", "XeSDJYKMBf");
        setField(term7891, term7891.getClass(), "basePath", "tIsFcOGTUX");
        setField(term7891, term7891.getClass(), "id", "XUVRcnELFP");
        setField(term7891, term7891.getClass(), "name", "xIeSbezmkD");
        setField(term7891, term7891.getClass(), "groupId", "txUWLZRkSv");
        setField(term7891, term7891.getClass(), "includeHeaders", term8037);
        setField(term7891, term7891.getClass(), "excludeHeaders", term8042);
        setBooleanField(term7891, term7891.getClass(), "enableCache", true);
        setField(term7731, term7731.getClass(), "targetSystem", term7891);
        setField(term7731, term7731.getClass(), "headerLookup", "gHRMJRsBGm");
        setField(term7731, term7731.getClass(), "keyLookupMap", term8060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rZyrfnMvHa";
        callMethod(klass, "setHeaderLookup", argTypes, term7731, args);
    }

};


