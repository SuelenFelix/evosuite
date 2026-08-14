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

public class SourceSystem_setGroupId_36181693532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17824;

    public SourceSystem_setGroupId_36181693532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17987 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term17987, term17987.getClass(), "pattern", null);
        setField(term17987, term17987.getClass(), "method", null);
        setBooleanField(term17987, term17987.getClass(), "cached", true);
        setBooleanField(term17987, term17987.getClass(), "async", true);
        setField(term17987, term17987.getClass(), "keyLookupType", null);
        setField(term17987, term17987.getClass(), "keyLookupHeaders", null);
        setField(term17987, term17987.getClass(), "keyLookupClass", null);
        Object term17990 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term17990, term17990.getClass(), "pattern", null);
        setField(term17990, term17990.getClass(), "method", null);
        setBooleanField(term17990, term17990.getClass(), "cached", false);
        setBooleanField(term17990, term17990.getClass(), "async", false);
        setField(term17990, term17990.getClass(), "keyLookupType", null);
        setField(term17990, term17990.getClass(), "keyLookupHeaders", null);
        setField(term17990, term17990.getClass(), "keyLookupClass", null);
        ArrayList term17985 = new ArrayList();
        ((ArrayList) term17985).add(term17987);
        ((ArrayList) term17985).add(term17990);
        Object term17997 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term17997, term17997.getClass(), "id", null);
        setField(term17997, term17997.getClass(), "host", null);
        setField(term17997, term17997.getClass(), "port", null);
        setField(term17997, term17997.getClass(), "health", null);
        setField(term17997, term17997.getClass(), "scheme", null);
        setIntField(term17997, term17997.getClass(), "priority", 9726679);
        setBooleanField(term17997, term17997.getClass(), "isActive", true);
        setField(term17997, term17997.getClass(), "type", null);
        setField(term17997, term17997.getClass(), "groupId", null);
        setFloatField(term17997, term17997.getClass(), "loadFactor", 0.0022646189F);
        setBooleanField(term17997, term17997.getClass(), "isReachable", true);
        Object term18002 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18002, term18002.getClass(), "id", null);
        setField(term18002, term18002.getClass(), "host", null);
        setField(term18002, term18002.getClass(), "port", null);
        setField(term18002, term18002.getClass(), "health", null);
        setField(term18002, term18002.getClass(), "scheme", null);
        setIntField(term18002, term18002.getClass(), "priority", -25637976);
        setBooleanField(term18002, term18002.getClass(), "isActive", true);
        setField(term18002, term18002.getClass(), "type", null);
        setField(term18002, term18002.getClass(), "groupId", null);
        setFloatField(term18002, term18002.getClass(), "loadFactor", 0.99403065F);
        setBooleanField(term18002, term18002.getClass(), "isReachable", true);
        Object term18007 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18007, term18007.getClass(), "id", null);
        setField(term18007, term18007.getClass(), "host", null);
        setField(term18007, term18007.getClass(), "port", null);
        setField(term18007, term18007.getClass(), "health", null);
        setField(term18007, term18007.getClass(), "scheme", null);
        setIntField(term18007, term18007.getClass(), "priority", 1555897383);
        setBooleanField(term18007, term18007.getClass(), "isActive", true);
        setField(term18007, term18007.getClass(), "type", null);
        setField(term18007, term18007.getClass(), "groupId", null);
        setFloatField(term18007, term18007.getClass(), "loadFactor", 0.36226058F);
        setBooleanField(term18007, term18007.getClass(), "isReachable", true);
        Object term18012 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18012, term18012.getClass(), "id", null);
        setField(term18012, term18012.getClass(), "host", null);
        setField(term18012, term18012.getClass(), "port", null);
        setField(term18012, term18012.getClass(), "health", null);
        setField(term18012, term18012.getClass(), "scheme", null);
        setIntField(term18012, term18012.getClass(), "priority", 202001407);
        setBooleanField(term18012, term18012.getClass(), "isActive", true);
        setField(term18012, term18012.getClass(), "type", null);
        setField(term18012, term18012.getClass(), "groupId", null);
        setFloatField(term18012, term18012.getClass(), "loadFactor", 0.04703206F);
        setBooleanField(term18012, term18012.getClass(), "isReachable", true);
        Object term18017 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18017, term18017.getClass(), "id", null);
        setField(term18017, term18017.getClass(), "host", null);
        setField(term18017, term18017.getClass(), "port", null);
        setField(term18017, term18017.getClass(), "health", null);
        setField(term18017, term18017.getClass(), "scheme", null);
        setIntField(term18017, term18017.getClass(), "priority", 158873461);
        setBooleanField(term18017, term18017.getClass(), "isActive", true);
        setField(term18017, term18017.getClass(), "type", null);
        setField(term18017, term18017.getClass(), "groupId", null);
        setFloatField(term18017, term18017.getClass(), "loadFactor", 0.036990583F);
        setBooleanField(term18017, term18017.getClass(), "isReachable", true);
        ArrayList term17995 = new ArrayList();
        ((ArrayList) term17995).add(term17997);
        ((ArrayList) term17995).add(term18002);
        ((ArrayList) term17995).add(term18007);
        ((ArrayList) term17995).add(term18012);
        ((ArrayList) term17995).add(term18017);
        HashMap term18120 = new HashMap();
        HashMap term18125 = new HashMap();
        HashMap term18143 = new HashMap();
        term17824 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term17984 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term17824, term17824.getClass(), "host", "opXkGeBDoI");
        setBooleanField(term17824, term17824.getClass(), "tunnel", false);
        setField(term17824, term17824.getClass(), "port", "UHxidCtatV");
        setField(term17824, term17824.getClass(), "scheme", "LRzADDSjVT");
        setField(term17824, term17824.getClass(), "basePath", "lpFCMaAYxj");
        setField(term17824, term17824.getClass(), "id", "fzHVMNSLii");
        setField(term17824, term17824.getClass(), "name", "TxymnVINZF");
        setField(term17824, term17824.getClass(), "groupId", "fkBfmixBEh");
        setField(term17824, term17824.getClass(), "target", "SWbairdDKL");
        setBooleanField(term17824, term17824.getClass(), "async", true);
        setField(term17824, term17824.getClass(), "asyncEngine", "AibUFEALwF");
        setField(term17824, term17824.getClass(), "callbackId", "eXOUrXTrdW");
        setField(term17824, term17824.getClass(), "jwtKeylookup", "aomDEETHep");
        setField(term17824, term17824.getClass(), "certificateId", "GTMrlIYfIM");
        setField(term17824, term17824.getClass(), "secappid", "eiDqCOWbLE");
        setBooleanField(term17824, term17824.getClass(), "autoProcure", false);
        setField(term17984, term17984.getClass(), "cachedResources", term17985);
        setField(term17984, term17984.getClass(), "hostGroups", term17995);
        setField(term17984, term17984.getClass(), "host", "BJJuVqxXjT");
        setField(term17984, term17984.getClass(), "port", "IvxbsFCczM");
        setField(term17984, term17984.getClass(), "hostGroupId", "GkAaLUoaoL");
        setField(term17984, term17984.getClass(), "scheme", "VSmPzUiFzd");
        setField(term17984, term17984.getClass(), "basePath", "bLpZNCaWDB");
        setField(term17984, term17984.getClass(), "id", "knmwCEeMTY");
        setField(term17984, term17984.getClass(), "name", "qTiIgMQXbW");
        setField(term17984, term17984.getClass(), "groupId", "rARmHDyRHE");
        setField(term17984, term17984.getClass(), "includeHeaders", term18120);
        setField(term17984, term17984.getClass(), "excludeHeaders", term18125);
        setBooleanField(term17984, term17984.getClass(), "enableCache", false);
        setField(term17824, term17824.getClass(), "targetSystem", term17984);
        setField(term17824, term17824.getClass(), "headerLookup", "bvybTJUNMY");
        setField(term17824, term17824.getClass(), "keyLookupMap", term18143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MoGyMoOkMi";
        callMethod(klass, "setGroupId", argTypes, term17824, args);
    }

};


