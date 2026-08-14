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
import java.util.LinkedList;

public class TargetSystem_setHostGroups_6597298087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28858;
     Object term29026;

    public TargetSystem_setHostGroups_6597298087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28861 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term28867 = (Object[]) newArray("java.lang.String", 1);
        setField(term28861, term28861.getClass(), "pattern", "");
        setField(term28861, term28861.getClass(), "method", "");
        setBooleanField(term28861, term28861.getClass(), "cached", true);
        setBooleanField(term28861, term28861.getClass(), "async", true);
        setField(term28861, term28861.getClass(), "keyLookupType", "");
        setField(term28861, term28861.getClass(), "keyLookupHeaders", term28867);
        setField(term28861, term28861.getClass(), "keyLookupClass", "");
        Object term28869 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term28875 = (Object[]) newArray("java.lang.String", 7);
        setField(term28869, term28869.getClass(), "pattern", "");
        setField(term28869, term28869.getClass(), "method", "");
        setBooleanField(term28869, term28869.getClass(), "cached", false);
        setBooleanField(term28869, term28869.getClass(), "async", true);
        setField(term28869, term28869.getClass(), "keyLookupType", "");
        setField(term28869, term28869.getClass(), "keyLookupHeaders", term28875);
        setField(term28869, term28869.getClass(), "keyLookupClass", "");
        ArrayList term28859 = new ArrayList();
        ((ArrayList) term28859).add(term28861);
        ((ArrayList) term28859).add(term28869);
        Object term28881 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term28881, term28881.getClass(), "id", "");
        setField(term28881, term28881.getClass(), "host", "");
        setField(term28881, term28881.getClass(), "port", "");
        setField(term28881, term28881.getClass(), "health", "");
        setField(term28881, term28881.getClass(), "scheme", "");
        setIntField(term28881, term28881.getClass(), "priority", 1959097203);
        setBooleanField(term28881, term28881.getClass(), "isActive", true);
        setField(term28881, term28881.getClass(), "type", "");
        setField(term28881, term28881.getClass(), "groupId", "");
        setFloatField(term28881, term28881.getClass(), "loadFactor", 0.9695807F);
        setBooleanField(term28881, term28881.getClass(), "isReachable", true);
        Object term28893 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term28893, term28893.getClass(), "id", "");
        setField(term28893, term28893.getClass(), "host", "");
        setField(term28893, term28893.getClass(), "port", "");
        setField(term28893, term28893.getClass(), "health", "");
        setField(term28893, term28893.getClass(), "scheme", "");
        setIntField(term28893, term28893.getClass(), "priority", -209654048);
        setBooleanField(term28893, term28893.getClass(), "isActive", true);
        setField(term28893, term28893.getClass(), "type", "");
        setField(term28893, term28893.getClass(), "groupId", "");
        setFloatField(term28893, term28893.getClass(), "loadFactor", 0.124525845F);
        setBooleanField(term28893, term28893.getClass(), "isReachable", true);
        Object term28905 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term28905, term28905.getClass(), "id", "");
        setField(term28905, term28905.getClass(), "host", "");
        setField(term28905, term28905.getClass(), "port", "");
        setField(term28905, term28905.getClass(), "health", "");
        setField(term28905, term28905.getClass(), "scheme", "");
        setIntField(term28905, term28905.getClass(), "priority", 477625804);
        setBooleanField(term28905, term28905.getClass(), "isActive", true);
        setField(term28905, term28905.getClass(), "type", "");
        setField(term28905, term28905.getClass(), "groupId", "");
        setFloatField(term28905, term28905.getClass(), "loadFactor", 0.45613784F);
        setBooleanField(term28905, term28905.getClass(), "isReachable", true);
        ArrayList term28879 = new ArrayList();
        ((ArrayList) term28879).add(term28881);
        ((ArrayList) term28879).add(term28893);
        ((ArrayList) term28879).add(term28905);
        HashMap term29015 = new HashMap();
        HashMap term29020 = new HashMap();
        term28858 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term28858, term28858.getClass(), "cachedResources", term28859);
        setField(term28858, term28858.getClass(), "hostGroups", term28879);
        setField(term28858, term28858.getClass(), "host", "nyZemBzxeX");
        setField(term28858, term28858.getClass(), "port", "mYUsMDfwJF");
        setField(term28858, term28858.getClass(), "hostGroupId", "IYNumeLuJm");
        setField(term28858, term28858.getClass(), "scheme", "baWqGUwddd");
        setField(term28858, term28858.getClass(), "basePath", "ytUYpWefdA");
        setField(term28858, term28858.getClass(), "id", "fdBtFIcFIQ");
        setField(term28858, term28858.getClass(), "name", "XixxNbivtN");
        setField(term28858, term28858.getClass(), "groupId", "wOXNBqWiix");
        setField(term28858, term28858.getClass(), "includeHeaders", term29015);
        setField(term28858, term28858.getClass(), "excludeHeaders", term29020);
        setBooleanField(term28858, term28858.getClass(), "enableCache", false);
        Object term29029 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29029, term29029.getClass(), "id", "inGpCNlqqu");
        setField(term29029, term29029.getClass(), "host", "PzAzTtIUoU");
        setField(term29029, term29029.getClass(), "port", "pltGCOzvHY");
        setField(term29029, term29029.getClass(), "health", "snpbZcNTTs");
        setField(term29029, term29029.getClass(), "scheme", "SXATqDKVMx");
        setIntField(term29029, term29029.getClass(), "priority", 252575029);
        setBooleanField(term29029, term29029.getClass(), "isActive", true);
        setField(term29029, term29029.getClass(), "type", "WmLDnzSUcH");
        setField(term29029, term29029.getClass(), "groupId", "jzYgniVftZ");
        setFloatField(term29029, term29029.getClass(), "loadFactor", 0.95118606F);
        setBooleanField(term29029, term29029.getClass(), "isReachable", true);
        Object term29119 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29119, term29119.getClass(), "id", "");
        setField(term29119, term29119.getClass(), "host", "");
        setField(term29119, term29119.getClass(), "port", "");
        setField(term29119, term29119.getClass(), "health", "");
        setField(term29119, term29119.getClass(), "scheme", "");
        setIntField(term29119, term29119.getClass(), "priority", 57189932);
        setBooleanField(term29119, term29119.getClass(), "isActive", true);
        setField(term29119, term29119.getClass(), "type", "");
        setField(term29119, term29119.getClass(), "groupId", "");
        setFloatField(term29119, term29119.getClass(), "loadFactor", 0.111205876F);
        setBooleanField(term29119, term29119.getClass(), "isReachable", true);
        Object term29132 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term29132, term29132.getClass(), "id", null);
        setField(term29132, term29132.getClass(), "host", null);
        setField(term29132, term29132.getClass(), "port", null);
        setField(term29132, term29132.getClass(), "health", null);
        setField(term29132, term29132.getClass(), "scheme", null);
        setIntField(term29132, term29132.getClass(), "priority", 1460722225);
        setBooleanField(term29132, term29132.getClass(), "isActive", true);
        setField(term29132, term29132.getClass(), "type", null);
        setField(term29132, term29132.getClass(), "groupId", null);
        setFloatField(term29132, term29132.getClass(), "loadFactor", 0.058807194F);
        setBooleanField(term29132, term29132.getClass(), "isReachable", true);
        term29026 = new LinkedList();
        ((LinkedList) term29026).add(term29029);
        ((LinkedList) term29026).add(term29119);
        ((LinkedList) term29026).add(term29132);
        ((LinkedList) term29026).add((Object)null);
        ((LinkedList) term29026).add((Object)null);
        ((LinkedList) term29026).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term29026;
        callMethod(klass, "setHostGroups", argTypes, term28858, args);
    }

};


