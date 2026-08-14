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

public class SourceSystem_isAsync_154801727833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18390;

    public SourceSystem_isAsync_154801727833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18553 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term18553, term18553.getClass(), "pattern", null);
        setField(term18553, term18553.getClass(), "method", null);
        setBooleanField(term18553, term18553.getClass(), "cached", false);
        setBooleanField(term18553, term18553.getClass(), "async", true);
        setField(term18553, term18553.getClass(), "keyLookupType", null);
        setField(term18553, term18553.getClass(), "keyLookupHeaders", null);
        setField(term18553, term18553.getClass(), "keyLookupClass", null);
        ArrayList term18551 = new ArrayList();
        ((ArrayList) term18551).add(term18553);
        Object term18560 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18560, term18560.getClass(), "id", null);
        setField(term18560, term18560.getClass(), "host", null);
        setField(term18560, term18560.getClass(), "port", null);
        setField(term18560, term18560.getClass(), "health", null);
        setField(term18560, term18560.getClass(), "scheme", null);
        setIntField(term18560, term18560.getClass(), "priority", -430151637);
        setBooleanField(term18560, term18560.getClass(), "isActive", true);
        setField(term18560, term18560.getClass(), "type", null);
        setField(term18560, term18560.getClass(), "groupId", null);
        setFloatField(term18560, term18560.getClass(), "loadFactor", 0.8998475F);
        setBooleanField(term18560, term18560.getClass(), "isReachable", true);
        Object term18565 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18565, term18565.getClass(), "id", null);
        setField(term18565, term18565.getClass(), "host", null);
        setField(term18565, term18565.getClass(), "port", null);
        setField(term18565, term18565.getClass(), "health", null);
        setField(term18565, term18565.getClass(), "scheme", null);
        setIntField(term18565, term18565.getClass(), "priority", -1697741339);
        setBooleanField(term18565, term18565.getClass(), "isActive", true);
        setField(term18565, term18565.getClass(), "type", null);
        setField(term18565, term18565.getClass(), "groupId", null);
        setFloatField(term18565, term18565.getClass(), "loadFactor", 0.60471374F);
        setBooleanField(term18565, term18565.getClass(), "isReachable", true);
        Object term18570 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18570, term18570.getClass(), "id", null);
        setField(term18570, term18570.getClass(), "host", null);
        setField(term18570, term18570.getClass(), "port", null);
        setField(term18570, term18570.getClass(), "health", null);
        setField(term18570, term18570.getClass(), "scheme", null);
        setIntField(term18570, term18570.getClass(), "priority", 98922530);
        setBooleanField(term18570, term18570.getClass(), "isActive", true);
        setField(term18570, term18570.getClass(), "type", null);
        setField(term18570, term18570.getClass(), "groupId", null);
        setFloatField(term18570, term18570.getClass(), "loadFactor", 0.023032188F);
        setBooleanField(term18570, term18570.getClass(), "isReachable", true);
        Object term18575 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18575, term18575.getClass(), "id", null);
        setField(term18575, term18575.getClass(), "host", null);
        setField(term18575, term18575.getClass(), "port", null);
        setField(term18575, term18575.getClass(), "health", null);
        setField(term18575, term18575.getClass(), "scheme", null);
        setIntField(term18575, term18575.getClass(), "priority", -1388471422);
        setBooleanField(term18575, term18575.getClass(), "isActive", true);
        setField(term18575, term18575.getClass(), "type", null);
        setField(term18575, term18575.getClass(), "groupId", null);
        setFloatField(term18575, term18575.getClass(), "loadFactor", 0.6767213F);
        setBooleanField(term18575, term18575.getClass(), "isReachable", true);
        Object term18580 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18580, term18580.getClass(), "id", null);
        setField(term18580, term18580.getClass(), "host", null);
        setField(term18580, term18580.getClass(), "port", null);
        setField(term18580, term18580.getClass(), "health", null);
        setField(term18580, term18580.getClass(), "scheme", null);
        setIntField(term18580, term18580.getClass(), "priority", -1498296052);
        setBooleanField(term18580, term18580.getClass(), "isActive", true);
        setField(term18580, term18580.getClass(), "type", null);
        setField(term18580, term18580.getClass(), "groupId", null);
        setFloatField(term18580, term18580.getClass(), "loadFactor", 0.65115076F);
        setBooleanField(term18580, term18580.getClass(), "isReachable", true);
        Object term18585 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18585, term18585.getClass(), "id", null);
        setField(term18585, term18585.getClass(), "host", null);
        setField(term18585, term18585.getClass(), "port", null);
        setField(term18585, term18585.getClass(), "health", null);
        setField(term18585, term18585.getClass(), "scheme", null);
        setIntField(term18585, term18585.getClass(), "priority", 2098647989);
        setBooleanField(term18585, term18585.getClass(), "isActive", true);
        setField(term18585, term18585.getClass(), "type", null);
        setField(term18585, term18585.getClass(), "groupId", null);
        setFloatField(term18585, term18585.getClass(), "loadFactor", 0.48862952F);
        setBooleanField(term18585, term18585.getClass(), "isReachable", true);
        Object term18590 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18590, term18590.getClass(), "id", null);
        setField(term18590, term18590.getClass(), "host", null);
        setField(term18590, term18590.getClass(), "port", null);
        setField(term18590, term18590.getClass(), "health", null);
        setField(term18590, term18590.getClass(), "scheme", null);
        setIntField(term18590, term18590.getClass(), "priority", 1598895173);
        setBooleanField(term18590, term18590.getClass(), "isActive", true);
        setField(term18590, term18590.getClass(), "type", null);
        setField(term18590, term18590.getClass(), "groupId", null);
        setFloatField(term18590, term18590.getClass(), "loadFactor", 0.37227178F);
        setBooleanField(term18590, term18590.getClass(), "isReachable", true);
        Object term18595 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term18595, term18595.getClass(), "id", null);
        setField(term18595, term18595.getClass(), "host", null);
        setField(term18595, term18595.getClass(), "port", null);
        setField(term18595, term18595.getClass(), "health", null);
        setField(term18595, term18595.getClass(), "scheme", null);
        setIntField(term18595, term18595.getClass(), "priority", 1830648570);
        setBooleanField(term18595, term18595.getClass(), "isActive", true);
        setField(term18595, term18595.getClass(), "type", null);
        setField(term18595, term18595.getClass(), "groupId", null);
        setFloatField(term18595, term18595.getClass(), "loadFactor", 0.42623103F);
        setBooleanField(term18595, term18595.getClass(), "isReachable", true);
        ArrayList term18558 = new ArrayList();
        ((ArrayList) term18558).add(term18560);
        ((ArrayList) term18558).add(term18565);
        ((ArrayList) term18558).add(term18570);
        ((ArrayList) term18558).add(term18575);
        ((ArrayList) term18558).add(term18580);
        ((ArrayList) term18558).add(term18585);
        ((ArrayList) term18558).add(term18590);
        ((ArrayList) term18558).add(term18595);
        HashMap term18698 = new HashMap();
        HashMap term18703 = new HashMap();
        HashMap term18721 = new HashMap();
        term18390 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term18550 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term18390, term18390.getClass(), "host", "qDEvNqJeGg");
        setBooleanField(term18390, term18390.getClass(), "tunnel", false);
        setField(term18390, term18390.getClass(), "port", "fUxWNxirZc");
        setField(term18390, term18390.getClass(), "scheme", "vHkrNjGRyv");
        setField(term18390, term18390.getClass(), "basePath", "PxGAOnzJzj");
        setField(term18390, term18390.getClass(), "id", "fQVSHtJlDS");
        setField(term18390, term18390.getClass(), "name", "CGdXCWNTxp");
        setField(term18390, term18390.getClass(), "groupId", "TUBgEnrcjn");
        setField(term18390, term18390.getClass(), "target", "eUhEGNLBOk");
        setBooleanField(term18390, term18390.getClass(), "async", true);
        setField(term18390, term18390.getClass(), "asyncEngine", "UrLisdyvVs");
        setField(term18390, term18390.getClass(), "callbackId", "VckRXyiShh");
        setField(term18390, term18390.getClass(), "jwtKeylookup", "ZKwDTklKHb");
        setField(term18390, term18390.getClass(), "certificateId", "tQMlnMStsQ");
        setField(term18390, term18390.getClass(), "secappid", "OYJvKAMFEk");
        setBooleanField(term18390, term18390.getClass(), "autoProcure", true);
        setField(term18550, term18550.getClass(), "cachedResources", term18551);
        setField(term18550, term18550.getClass(), "hostGroups", term18558);
        setField(term18550, term18550.getClass(), "host", "QybezBkmJu");
        setField(term18550, term18550.getClass(), "port", "uWIrREgpjs");
        setField(term18550, term18550.getClass(), "hostGroupId", "TmEdDFXkTZ");
        setField(term18550, term18550.getClass(), "scheme", "DjjdYbIhNY");
        setField(term18550, term18550.getClass(), "basePath", "AGaeaoutjJ");
        setField(term18550, term18550.getClass(), "id", "oHWSUbpGiK");
        setField(term18550, term18550.getClass(), "name", "RreVzKmtxf");
        setField(term18550, term18550.getClass(), "groupId", "xHBCsghEAi");
        setField(term18550, term18550.getClass(), "includeHeaders", term18698);
        setField(term18550, term18550.getClass(), "excludeHeaders", term18703);
        setBooleanField(term18550, term18550.getClass(), "enableCache", true);
        setField(term18390, term18390.getClass(), "targetSystem", term18550);
        setField(term18390, term18390.getClass(), "headerLookup", "BVlqqUSYbB");
        setField(term18390, term18390.getClass(), "keyLookupMap", term18721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAsync", argTypes, term18390, args);
    }

};


