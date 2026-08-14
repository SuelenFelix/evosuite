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

public class SourceSystem_getCallbackId_139823009135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19504;

    public SourceSystem_getCallbackId_139823009135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19667 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19667, term19667.getClass(), "pattern", null);
        setField(term19667, term19667.getClass(), "method", null);
        setBooleanField(term19667, term19667.getClass(), "cached", true);
        setBooleanField(term19667, term19667.getClass(), "async", false);
        setField(term19667, term19667.getClass(), "keyLookupType", null);
        setField(term19667, term19667.getClass(), "keyLookupHeaders", null);
        setField(term19667, term19667.getClass(), "keyLookupClass", null);
        Object term19670 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19670, term19670.getClass(), "pattern", null);
        setField(term19670, term19670.getClass(), "method", null);
        setBooleanField(term19670, term19670.getClass(), "cached", false);
        setBooleanField(term19670, term19670.getClass(), "async", true);
        setField(term19670, term19670.getClass(), "keyLookupType", null);
        setField(term19670, term19670.getClass(), "keyLookupHeaders", null);
        setField(term19670, term19670.getClass(), "keyLookupClass", null);
        Object term19673 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19673, term19673.getClass(), "pattern", null);
        setField(term19673, term19673.getClass(), "method", null);
        setBooleanField(term19673, term19673.getClass(), "cached", true);
        setBooleanField(term19673, term19673.getClass(), "async", true);
        setField(term19673, term19673.getClass(), "keyLookupType", null);
        setField(term19673, term19673.getClass(), "keyLookupHeaders", null);
        setField(term19673, term19673.getClass(), "keyLookupClass", null);
        Object term19676 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19676, term19676.getClass(), "pattern", null);
        setField(term19676, term19676.getClass(), "method", null);
        setBooleanField(term19676, term19676.getClass(), "cached", false);
        setBooleanField(term19676, term19676.getClass(), "async", true);
        setField(term19676, term19676.getClass(), "keyLookupType", null);
        setField(term19676, term19676.getClass(), "keyLookupHeaders", null);
        setField(term19676, term19676.getClass(), "keyLookupClass", null);
        Object term19679 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19679, term19679.getClass(), "pattern", null);
        setField(term19679, term19679.getClass(), "method", null);
        setBooleanField(term19679, term19679.getClass(), "cached", true);
        setBooleanField(term19679, term19679.getClass(), "async", true);
        setField(term19679, term19679.getClass(), "keyLookupType", null);
        setField(term19679, term19679.getClass(), "keyLookupHeaders", null);
        setField(term19679, term19679.getClass(), "keyLookupClass", null);
        Object term19682 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19682, term19682.getClass(), "pattern", null);
        setField(term19682, term19682.getClass(), "method", null);
        setBooleanField(term19682, term19682.getClass(), "cached", false);
        setBooleanField(term19682, term19682.getClass(), "async", false);
        setField(term19682, term19682.getClass(), "keyLookupType", null);
        setField(term19682, term19682.getClass(), "keyLookupHeaders", null);
        setField(term19682, term19682.getClass(), "keyLookupClass", null);
        Object term19685 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19685, term19685.getClass(), "pattern", null);
        setField(term19685, term19685.getClass(), "method", null);
        setBooleanField(term19685, term19685.getClass(), "cached", true);
        setBooleanField(term19685, term19685.getClass(), "async", false);
        setField(term19685, term19685.getClass(), "keyLookupType", null);
        setField(term19685, term19685.getClass(), "keyLookupHeaders", null);
        setField(term19685, term19685.getClass(), "keyLookupClass", null);
        Object term19688 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19688, term19688.getClass(), "pattern", null);
        setField(term19688, term19688.getClass(), "method", null);
        setBooleanField(term19688, term19688.getClass(), "cached", false);
        setBooleanField(term19688, term19688.getClass(), "async", false);
        setField(term19688, term19688.getClass(), "keyLookupType", null);
        setField(term19688, term19688.getClass(), "keyLookupHeaders", null);
        setField(term19688, term19688.getClass(), "keyLookupClass", null);
        Object term19691 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        setField(term19691, term19691.getClass(), "pattern", null);
        setField(term19691, term19691.getClass(), "method", null);
        setBooleanField(term19691, term19691.getClass(), "cached", false);
        setBooleanField(term19691, term19691.getClass(), "async", true);
        setField(term19691, term19691.getClass(), "keyLookupType", null);
        setField(term19691, term19691.getClass(), "keyLookupHeaders", null);
        setField(term19691, term19691.getClass(), "keyLookupClass", null);
        ArrayList term19665 = new ArrayList();
        ((ArrayList) term19665).add(term19667);
        ((ArrayList) term19665).add(term19670);
        ((ArrayList) term19665).add(term19673);
        ((ArrayList) term19665).add(term19676);
        ((ArrayList) term19665).add(term19679);
        ((ArrayList) term19665).add(term19682);
        ((ArrayList) term19665).add(term19685);
        ((ArrayList) term19665).add(term19688);
        ((ArrayList) term19665).add(term19691);
        Object term19698 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19698, term19698.getClass(), "id", null);
        setField(term19698, term19698.getClass(), "host", null);
        setField(term19698, term19698.getClass(), "port", null);
        setField(term19698, term19698.getClass(), "health", null);
        setField(term19698, term19698.getClass(), "scheme", null);
        setIntField(term19698, term19698.getClass(), "priority", -243422082);
        setBooleanField(term19698, term19698.getClass(), "isActive", true);
        setField(term19698, term19698.getClass(), "type", null);
        setField(term19698, term19698.getClass(), "groupId", null);
        setFloatField(term19698, term19698.getClass(), "loadFactor", 0.94332385F);
        setBooleanField(term19698, term19698.getClass(), "isReachable", true);
        Object term19703 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19703, term19703.getClass(), "id", null);
        setField(term19703, term19703.getClass(), "host", null);
        setField(term19703, term19703.getClass(), "port", null);
        setField(term19703, term19703.getClass(), "health", null);
        setField(term19703, term19703.getClass(), "scheme", null);
        setIntField(term19703, term19703.getClass(), "priority", 1384592638);
        setBooleanField(term19703, term19703.getClass(), "isActive", true);
        setField(term19703, term19703.getClass(), "type", null);
        setField(term19703, term19703.getClass(), "groupId", null);
        setFloatField(term19703, term19703.getClass(), "loadFactor", 0.32237554F);
        setBooleanField(term19703, term19703.getClass(), "isReachable", true);
        Object term19708 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term19708, term19708.getClass(), "id", null);
        setField(term19708, term19708.getClass(), "host", null);
        setField(term19708, term19708.getClass(), "port", null);
        setField(term19708, term19708.getClass(), "health", null);
        setField(term19708, term19708.getClass(), "scheme", null);
        setIntField(term19708, term19708.getClass(), "priority", -1002370457);
        setBooleanField(term19708, term19708.getClass(), "isActive", true);
        setField(term19708, term19708.getClass(), "type", null);
        setField(term19708, term19708.getClass(), "groupId", null);
        setFloatField(term19708, term19708.getClass(), "loadFactor", 0.7666174F);
        setBooleanField(term19708, term19708.getClass(), "isReachable", true);
        ArrayList term19696 = new ArrayList();
        ((ArrayList) term19696).add(term19698);
        ((ArrayList) term19696).add(term19703);
        ((ArrayList) term19696).add(term19708);
        HashMap term19811 = new HashMap();
        HashMap term19816 = new HashMap();
        HashMap term19834 = new HashMap();
        term19504 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term19664 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term19504, term19504.getClass(), "host", "OdbuOWCJTS");
        setBooleanField(term19504, term19504.getClass(), "tunnel", true);
        setField(term19504, term19504.getClass(), "port", "ksvfEdmpqg");
        setField(term19504, term19504.getClass(), "scheme", "mNzFmmNjDi");
        setField(term19504, term19504.getClass(), "basePath", "UxkbStdccR");
        setField(term19504, term19504.getClass(), "id", "kizVhsjIpC");
        setField(term19504, term19504.getClass(), "name", "uDuPkYdemJ");
        setField(term19504, term19504.getClass(), "groupId", "FfynoMXicS");
        setField(term19504, term19504.getClass(), "target", "mbofhtwtHb");
        setBooleanField(term19504, term19504.getClass(), "async", false);
        setField(term19504, term19504.getClass(), "asyncEngine", "goCKhChLTQ");
        setField(term19504, term19504.getClass(), "callbackId", "VkjCLLOwvZ");
        setField(term19504, term19504.getClass(), "jwtKeylookup", "YQaoPDOhWH");
        setField(term19504, term19504.getClass(), "certificateId", "SJPzCePrEj");
        setField(term19504, term19504.getClass(), "secappid", "tYasEQgFbL");
        setBooleanField(term19504, term19504.getClass(), "autoProcure", false);
        setField(term19664, term19664.getClass(), "cachedResources", term19665);
        setField(term19664, term19664.getClass(), "hostGroups", term19696);
        setField(term19664, term19664.getClass(), "host", "DGNjGJtXwQ");
        setField(term19664, term19664.getClass(), "port", "BIFQrvbqSd");
        setField(term19664, term19664.getClass(), "hostGroupId", "wcVhMnVVMH");
        setField(term19664, term19664.getClass(), "scheme", "EUWyNZxbWR");
        setField(term19664, term19664.getClass(), "basePath", "TaoriKlxVP");
        setField(term19664, term19664.getClass(), "id", "CDKCMwdzTR");
        setField(term19664, term19664.getClass(), "name", "ehviwWrUip");
        setField(term19664, term19664.getClass(), "groupId", "LNsNBvvYgQ");
        setField(term19664, term19664.getClass(), "includeHeaders", term19811);
        setField(term19664, term19664.getClass(), "excludeHeaders", term19816);
        setBooleanField(term19664, term19664.getClass(), "enableCache", true);
        setField(term19504, term19504.getClass(), "targetSystem", term19664);
        setField(term19504, term19504.getClass(), "headerLookup", "VGKsvldNNB");
        setField(term19504, term19504.getClass(), "keyLookupMap", term19834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCallbackId", argTypes, term19504, args);
    }

};


