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

public class SourceSystem_getId_186713507827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15040;

    public SourceSystem_getId_186713507827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term15203 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term15203, term15203.getClass(), "pattern", null);
        setField(term15203, term15203.getClass(), "method", null);
        setBooleanField(term15203, term15203.getClass(), "cached", false);
        setBooleanField(term15203, term15203.getClass(), "async", false);
        setField(term15203, term15203.getClass(), "keyLookupType", null);
        setField(term15203, term15203.getClass(), "keyLookupHeaders", null);
        setField(term15203, term15203.getClass(), "keyLookupClass", null);
        Object term15206 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term15206, term15206.getClass(), "pattern", null);
        setField(term15206, term15206.getClass(), "method", null);
        setBooleanField(term15206, term15206.getClass(), "cached", true);
        setBooleanField(term15206, term15206.getClass(), "async", true);
        setField(term15206, term15206.getClass(), "keyLookupType", null);
        setField(term15206, term15206.getClass(), "keyLookupHeaders", null);
        setField(term15206, term15206.getClass(), "keyLookupClass", null);
        ArrayList term15201 = new ArrayList();
        ((ArrayList) term15201).add(term15203);
        ((ArrayList) term15201).add(term15206);
        Object term15213 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term15213, term15213.getClass(), "id", null);
        setField(term15213, term15213.getClass(), "host", null);
        setField(term15213, term15213.getClass(), "port", null);
        setField(term15213, term15213.getClass(), "health", null);
        setField(term15213, term15213.getClass(), "scheme", null);
        setIntField(term15213, term15213.getClass(), "priority", 1072005683);
        setBooleanField(term15213, term15213.getClass(), "isActive", true);
        setField(term15213, term15213.getClass(), "type", null);
        setField(term15213, term15213.getClass(), "groupId", null);
        setFloatField(term15213, term15213.getClass(), "loadFactor", 0.24959576F);
        setBooleanField(term15213, term15213.getClass(), "isReachable", true);
        Object term15218 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term15218, term15218.getClass(), "id", null);
        setField(term15218, term15218.getClass(), "host", null);
        setField(term15218, term15218.getClass(), "port", null);
        setField(term15218, term15218.getClass(), "health", null);
        setField(term15218, term15218.getClass(), "scheme", null);
        setIntField(term15218, term15218.getClass(), "priority", 1861318859);
        setBooleanField(term15218, term15218.getClass(), "isActive", true);
        setField(term15218, term15218.getClass(), "type", null);
        setField(term15218, term15218.getClass(), "groupId", null);
        setFloatField(term15218, term15218.getClass(), "loadFactor", 0.43337202F);
        setBooleanField(term15218, term15218.getClass(), "isReachable", true);
        Object term15223 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term15223, term15223.getClass(), "id", null);
        setField(term15223, term15223.getClass(), "host", null);
        setField(term15223, term15223.getClass(), "port", null);
        setField(term15223, term15223.getClass(), "health", null);
        setField(term15223, term15223.getClass(), "scheme", null);
        setIntField(term15223, term15223.getClass(), "priority", 1474524152);
        setBooleanField(term15223, term15223.getClass(), "isActive", true);
        setField(term15223, term15223.getClass(), "type", null);
        setField(term15223, term15223.getClass(), "groupId", null);
        setFloatField(term15223, term15223.getClass(), "loadFactor", 0.34331435F);
        setBooleanField(term15223, term15223.getClass(), "isReachable", true);
        Object term15228 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term15228, term15228.getClass(), "id", null);
        setField(term15228, term15228.getClass(), "host", null);
        setField(term15228, term15228.getClass(), "port", null);
        setField(term15228, term15228.getClass(), "health", null);
        setField(term15228, term15228.getClass(), "scheme", null);
        setIntField(term15228, term15228.getClass(), "priority", 568954359);
        setBooleanField(term15228, term15228.getClass(), "isActive", true);
        setField(term15228, term15228.getClass(), "type", null);
        setField(term15228, term15228.getClass(), "groupId", null);
        setFloatField(term15228, term15228.getClass(), "loadFactor", 0.13246995F);
        setBooleanField(term15228, term15228.getClass(), "isReachable", true);
        Object term15233 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term15233, term15233.getClass(), "id", null);
        setField(term15233, term15233.getClass(), "host", null);
        setField(term15233, term15233.getClass(), "port", null);
        setField(term15233, term15233.getClass(), "health", null);
        setField(term15233, term15233.getClass(), "scheme", null);
        setIntField(term15233, term15233.getClass(), "priority", 53410913);
        setBooleanField(term15233, term15233.getClass(), "isActive", true);
        setField(term15233, term15233.getClass(), "type", null);
        setField(term15233, term15233.getClass(), "groupId", null);
        setFloatField(term15233, term15233.getClass(), "loadFactor", 0.012435675F);
        setBooleanField(term15233, term15233.getClass(), "isReachable", true);
        Object term15238 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term15238, term15238.getClass(), "id", null);
        setField(term15238, term15238.getClass(), "host", null);
        setField(term15238, term15238.getClass(), "port", null);
        setField(term15238, term15238.getClass(), "health", null);
        setField(term15238, term15238.getClass(), "scheme", null);
        setIntField(term15238, term15238.getClass(), "priority", -375014958);
        setBooleanField(term15238, term15238.getClass(), "isActive", true);
        setField(term15238, term15238.getClass(), "type", null);
        setField(term15238, term15238.getClass(), "groupId", null);
        setFloatField(term15238, term15238.getClass(), "loadFactor", 0.912685F);
        setBooleanField(term15238, term15238.getClass(), "isReachable", true);
        ArrayList term15211 = new ArrayList();
        ((ArrayList) term15211).add(term15213);
        ((ArrayList) term15211).add(term15218);
        ((ArrayList) term15211).add(term15223);
        ((ArrayList) term15211).add(term15228);
        ((ArrayList) term15211).add(term15233);
        ((ArrayList) term15211).add(term15238);
        HashMap term15341 = new HashMap();
        HashMap term15346 = new HashMap();
        HashMap term15364 = new HashMap();
        term15040 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term15200 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term15040, term15040.getClass(), "host", "UPVTXSXUNh");
        setBooleanField(term15040, term15040.getClass(), "tunnel", true);
        setField(term15040, term15040.getClass(), "port", "cjCXbXuiFn");
        setField(term15040, term15040.getClass(), "scheme", "fhdhDeWdoi");
        setField(term15040, term15040.getClass(), "basePath", "FqrcltWSUd");
        setField(term15040, term15040.getClass(), "id", "kAbILlhsZw");
        setField(term15040, term15040.getClass(), "name", "QsIOCSpRow");
        setField(term15040, term15040.getClass(), "groupId", "gcFzvYOUch");
        setField(term15040, term15040.getClass(), "target", "NnFSMXLOUA");
        setBooleanField(term15040, term15040.getClass(), "async", true);
        setField(term15040, term15040.getClass(), "asyncEngine", "bacruLIvDW");
        setField(term15040, term15040.getClass(), "callbackId", "ydbVEuslYx");
        setField(term15040, term15040.getClass(), "jwtKeylookup", "DKWEhukBpG");
        setField(term15040, term15040.getClass(), "certificateId", "YaowqyqxBH");
        setField(term15040, term15040.getClass(), "secappid", "dbxhsKyZWZ");
        setBooleanField(term15040, term15040.getClass(), "autoProcure", false);
        setField(term15200, term15200.getClass(), "cachedResources", term15201);
        setField(term15200, term15200.getClass(), "hostGroups", term15211);
        setField(term15200, term15200.getClass(), "host", "skVZETaBKX");
        setField(term15200, term15200.getClass(), "port", "jcJNIBACPb");
        setField(term15200, term15200.getClass(), "hostGroupId", "mPQmjoknqi");
        setField(term15200, term15200.getClass(), "scheme", "gLgvePQRQT");
        setField(term15200, term15200.getClass(), "basePath", "SCmsfHIEPK");
        setField(term15200, term15200.getClass(), "id", "dFOuezLNWb");
        setField(term15200, term15200.getClass(), "name", "PUWJnLuyiR");
        setField(term15200, term15200.getClass(), "groupId", "ADhJCRgHaS");
        setField(term15200, term15200.getClass(), "includeHeaders", term15341);
        setField(term15200, term15200.getClass(), "excludeHeaders", term15346);
        setBooleanField(term15200, term15200.getClass(), "enableCache", false);
        setField(term15040, term15040.getClass(), "targetSystem", term15200);
        setField(term15040, term15040.getClass(), "headerLookup", "qociGUMzem");
        setField(term15040, term15040.getClass(), "keyLookupMap", term15364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term15040, args);
    }

};


