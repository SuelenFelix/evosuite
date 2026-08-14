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

public class SourceSystem_getPort_163884318821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11704;

    public SourceSystem_getPort_163884318821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11865 = new ArrayList();
        Object term11871 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term11871, term11871.getClass(), "id", null);
        setField(term11871, term11871.getClass(), "host", null);
        setField(term11871, term11871.getClass(), "port", null);
        setField(term11871, term11871.getClass(), "health", null);
        setField(term11871, term11871.getClass(), "scheme", null);
        setIntField(term11871, term11871.getClass(), "priority", -1263114719);
        setBooleanField(term11871, term11871.getClass(), "isActive", true);
        setField(term11871, term11871.getClass(), "type", null);
        setField(term11871, term11871.getClass(), "groupId", null);
        setFloatField(term11871, term11871.getClass(), "loadFactor", 0.7059082F);
        setBooleanField(term11871, term11871.getClass(), "isReachable", true);
        Object term11876 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term11876, term11876.getClass(), "id", null);
        setField(term11876, term11876.getClass(), "host", null);
        setField(term11876, term11876.getClass(), "port", null);
        setField(term11876, term11876.getClass(), "health", null);
        setField(term11876, term11876.getClass(), "scheme", null);
        setIntField(term11876, term11876.getClass(), "priority", -894662986);
        setBooleanField(term11876, term11876.getClass(), "isActive", true);
        setField(term11876, term11876.getClass(), "type", null);
        setField(term11876, term11876.getClass(), "groupId", null);
        setFloatField(term11876, term11876.getClass(), "loadFactor", 0.791695F);
        setBooleanField(term11876, term11876.getClass(), "isReachable", true);
        Object term11881 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term11881, term11881.getClass(), "id", null);
        setField(term11881, term11881.getClass(), "host", null);
        setField(term11881, term11881.getClass(), "port", null);
        setField(term11881, term11881.getClass(), "health", null);
        setField(term11881, term11881.getClass(), "scheme", null);
        setIntField(term11881, term11881.getClass(), "priority", 304775596);
        setBooleanField(term11881, term11881.getClass(), "isActive", true);
        setField(term11881, term11881.getClass(), "type", null);
        setField(term11881, term11881.getClass(), "groupId", null);
        setFloatField(term11881, term11881.getClass(), "loadFactor", 0.07096106F);
        setBooleanField(term11881, term11881.getClass(), "isReachable", true);
        Object term11886 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term11886, term11886.getClass(), "id", null);
        setField(term11886, term11886.getClass(), "host", null);
        setField(term11886, term11886.getClass(), "port", null);
        setField(term11886, term11886.getClass(), "health", null);
        setField(term11886, term11886.getClass(), "scheme", null);
        setIntField(term11886, term11886.getClass(), "priority", -1347665717);
        setBooleanField(term11886, term11886.getClass(), "isActive", true);
        setField(term11886, term11886.getClass(), "type", null);
        setField(term11886, term11886.getClass(), "groupId", null);
        setFloatField(term11886, term11886.getClass(), "loadFactor", 0.6862221F);
        setBooleanField(term11886, term11886.getClass(), "isReachable", true);
        Object term11891 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term11891, term11891.getClass(), "id", null);
        setField(term11891, term11891.getClass(), "host", null);
        setField(term11891, term11891.getClass(), "port", null);
        setField(term11891, term11891.getClass(), "health", null);
        setField(term11891, term11891.getClass(), "scheme", null);
        setIntField(term11891, term11891.getClass(), "priority", -1888585309);
        setBooleanField(term11891, term11891.getClass(), "isActive", true);
        setField(term11891, term11891.getClass(), "type", null);
        setField(term11891, term11891.getClass(), "groupId", null);
        setFloatField(term11891, term11891.getClass(), "loadFactor", 0.5602794F);
        setBooleanField(term11891, term11891.getClass(), "isReachable", true);
        ArrayList term11869 = new ArrayList();
        ((ArrayList) term11869).add(term11871);
        ((ArrayList) term11869).add(term11876);
        ((ArrayList) term11869).add(term11881);
        ((ArrayList) term11869).add(term11886);
        ((ArrayList) term11869).add(term11891);
        HashMap term11994 = new HashMap();
        HashMap term11999 = new HashMap();
        HashMap term12017 = new HashMap();
        term11704 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term11864 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term11704, term11704.getClass(), "host", "LQTIjJLkXH");
        setBooleanField(term11704, term11704.getClass(), "tunnel", true);
        setField(term11704, term11704.getClass(), "port", "RvkBwedFKx");
        setField(term11704, term11704.getClass(), "scheme", "DYzWJljbaE");
        setField(term11704, term11704.getClass(), "basePath", "idwbHVHUcz");
        setField(term11704, term11704.getClass(), "id", "sWJHIWZMuX");
        setField(term11704, term11704.getClass(), "name", "PwMdJRwzDW");
        setField(term11704, term11704.getClass(), "groupId", "sMiHxgXUuN");
        setField(term11704, term11704.getClass(), "target", "oVChCWWDag");
        setBooleanField(term11704, term11704.getClass(), "async", false);
        setField(term11704, term11704.getClass(), "asyncEngine", "EteTxkDxin");
        setField(term11704, term11704.getClass(), "callbackId", "mKgLwPdYbY");
        setField(term11704, term11704.getClass(), "jwtKeylookup", "zqykonsLIo");
        setField(term11704, term11704.getClass(), "certificateId", "KoPzTuvIeK");
        setField(term11704, term11704.getClass(), "secappid", "SMoWUILIhn");
        setBooleanField(term11704, term11704.getClass(), "autoProcure", false);
        setField(term11864, term11864.getClass(), "cachedResources", term11865);
        setField(term11864, term11864.getClass(), "hostGroups", term11869);
        setField(term11864, term11864.getClass(), "host", "uEQbnHbyAn");
        setField(term11864, term11864.getClass(), "port", "JpFIuyNEKW");
        setField(term11864, term11864.getClass(), "hostGroupId", "NksHsgcqDx");
        setField(term11864, term11864.getClass(), "scheme", "RjSNvOEvcT");
        setField(term11864, term11864.getClass(), "basePath", "HLzuMxigqS");
        setField(term11864, term11864.getClass(), "id", "wiBOoDCyzd");
        setField(term11864, term11864.getClass(), "name", "TIaFKUJELS");
        setField(term11864, term11864.getClass(), "groupId", "IPmndzGjtG");
        setField(term11864, term11864.getClass(), "includeHeaders", term11994);
        setField(term11864, term11864.getClass(), "excludeHeaders", term11999);
        setBooleanField(term11864, term11864.getClass(), "enableCache", false);
        setField(term11704, term11704.getClass(), "targetSystem", term11864);
        setField(term11704, term11704.getClass(), "headerLookup", "pkQiBgYrkQ");
        setField(term11704, term11704.getClass(), "keyLookupMap", term12017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPort", argTypes, term11704, args);
    }

};


