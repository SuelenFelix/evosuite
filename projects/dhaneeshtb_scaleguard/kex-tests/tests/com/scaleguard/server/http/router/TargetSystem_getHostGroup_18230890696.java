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

public class TargetSystem_getHostGroup_18230890696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28578;

    public TargetSystem_getHostGroup_18230890696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28581 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term28587 = (Object[]) newArray("java.lang.String", 7);
        setField(term28581, term28581.getClass(), "pattern", "");
        setField(term28581, term28581.getClass(), "method", "");
        setBooleanField(term28581, term28581.getClass(), "cached", true);
        setBooleanField(term28581, term28581.getClass(), "async", false);
        setField(term28581, term28581.getClass(), "keyLookupType", "");
        setField(term28581, term28581.getClass(), "keyLookupHeaders", term28587);
        setField(term28581, term28581.getClass(), "keyLookupClass", "");
        Object term28589 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term28595 = (Object[]) newArray("java.lang.String", 4);
        setField(term28589, term28589.getClass(), "pattern", "");
        setField(term28589, term28589.getClass(), "method", "");
        setBooleanField(term28589, term28589.getClass(), "cached", false);
        setBooleanField(term28589, term28589.getClass(), "async", true);
        setField(term28589, term28589.getClass(), "keyLookupType", "");
        setField(term28589, term28589.getClass(), "keyLookupHeaders", term28595);
        setField(term28589, term28589.getClass(), "keyLookupClass", "");
        Object term28597 = newInstance(Class.forName("com.scaleguard.server.http.cache.CachedResource"));
        Object[] term28603 = (Object[]) newArray("java.lang.String", 6);
        setField(term28597, term28597.getClass(), "pattern", "");
        setField(term28597, term28597.getClass(), "method", "");
        setBooleanField(term28597, term28597.getClass(), "cached", true);
        setBooleanField(term28597, term28597.getClass(), "async", false);
        setField(term28597, term28597.getClass(), "keyLookupType", "");
        setField(term28597, term28597.getClass(), "keyLookupHeaders", term28603);
        setField(term28597, term28597.getClass(), "keyLookupClass", "");
        ArrayList term28579 = new ArrayList();
        ((ArrayList) term28579).add(term28581);
        ((ArrayList) term28579).add(term28589);
        ((ArrayList) term28579).add(term28597);
        Object term28609 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term28609, term28609.getClass(), "id", "");
        setField(term28609, term28609.getClass(), "host", "");
        setField(term28609, term28609.getClass(), "port", "");
        setField(term28609, term28609.getClass(), "health", "");
        setField(term28609, term28609.getClass(), "scheme", "");
        setIntField(term28609, term28609.getClass(), "priority", -1692331299);
        setBooleanField(term28609, term28609.getClass(), "isActive", true);
        setField(term28609, term28609.getClass(), "type", "");
        setField(term28609, term28609.getClass(), "groupId", "");
        setFloatField(term28609, term28609.getClass(), "loadFactor", 0.7080134F);
        setBooleanField(term28609, term28609.getClass(), "isReachable", true);
        Object term28621 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term28621, term28621.getClass(), "id", "");
        setField(term28621, term28621.getClass(), "host", "");
        setField(term28621, term28621.getClass(), "port", "");
        setField(term28621, term28621.getClass(), "health", "");
        setField(term28621, term28621.getClass(), "scheme", "");
        setIntField(term28621, term28621.getClass(), "priority", 479531250);
        setBooleanField(term28621, term28621.getClass(), "isActive", true);
        setField(term28621, term28621.getClass(), "type", "");
        setField(term28621, term28621.getClass(), "groupId", "");
        setFloatField(term28621, term28621.getClass(), "loadFactor", 0.74126697F);
        setBooleanField(term28621, term28621.getClass(), "isReachable", true);
        Object term28633 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term28633, term28633.getClass(), "id", "");
        setField(term28633, term28633.getClass(), "host", "");
        setField(term28633, term28633.getClass(), "port", "");
        setField(term28633, term28633.getClass(), "health", "");
        setField(term28633, term28633.getClass(), "scheme", "");
        setIntField(term28633, term28633.getClass(), "priority", 1320570890);
        setBooleanField(term28633, term28633.getClass(), "isActive", true);
        setField(term28633, term28633.getClass(), "type", "");
        setField(term28633, term28633.getClass(), "groupId", "");
        setFloatField(term28633, term28633.getClass(), "loadFactor", 0.60597336F);
        setBooleanField(term28633, term28633.getClass(), "isReachable", true);
        Object term28645 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term28645, term28645.getClass(), "id", "");
        setField(term28645, term28645.getClass(), "host", "");
        setField(term28645, term28645.getClass(), "port", "");
        setField(term28645, term28645.getClass(), "health", "");
        setField(term28645, term28645.getClass(), "scheme", "");
        setIntField(term28645, term28645.getClass(), "priority", -130649791);
        setBooleanField(term28645, term28645.getClass(), "isActive", true);
        setField(term28645, term28645.getClass(), "type", "");
        setField(term28645, term28645.getClass(), "groupId", "");
        setFloatField(term28645, term28645.getClass(), "loadFactor", 0.11164951F);
        setBooleanField(term28645, term28645.getClass(), "isReachable", true);
        Object term28657 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term28657, term28657.getClass(), "id", "");
        setField(term28657, term28657.getClass(), "host", "");
        setField(term28657, term28657.getClass(), "port", "");
        setField(term28657, term28657.getClass(), "health", "");
        setField(term28657, term28657.getClass(), "scheme", "");
        setIntField(term28657, term28657.getClass(), "priority", 534834644);
        setBooleanField(term28657, term28657.getClass(), "isActive", true);
        setField(term28657, term28657.getClass(), "type", "");
        setField(term28657, term28657.getClass(), "groupId", "");
        setFloatField(term28657, term28657.getClass(), "loadFactor", 0.30746937F);
        setBooleanField(term28657, term28657.getClass(), "isReachable", true);
        ArrayList term28607 = new ArrayList();
        ((ArrayList) term28607).add(term28609);
        ((ArrayList) term28607).add(term28621);
        ((ArrayList) term28607).add(term28633);
        ((ArrayList) term28607).add(term28645);
        ((ArrayList) term28607).add(term28657);
        HashMap term28767 = new HashMap();
        HashMap term28772 = new HashMap();
        term28578 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term28578, term28578.getClass(), "cachedResources", term28579);
        setField(term28578, term28578.getClass(), "hostGroups", term28607);
        setField(term28578, term28578.getClass(), "host", "EuhpauGeVe");
        setField(term28578, term28578.getClass(), "port", "kgFJtzMrPn");
        setField(term28578, term28578.getClass(), "hostGroupId", "NIkocNvjmy");
        setField(term28578, term28578.getClass(), "scheme", "slAGCmeSHy");
        setField(term28578, term28578.getClass(), "basePath", "DRgskGEoHQ");
        setField(term28578, term28578.getClass(), "id", "EnWOFmweOs");
        setField(term28578, term28578.getClass(), "name", "kBoIUinjBw");
        setField(term28578, term28578.getClass(), "groupId", "DrCWSqTYSn");
        setField(term28578, term28578.getClass(), "includeHeaders", term28767);
        setField(term28578, term28578.getClass(), "excludeHeaders", term28772);
        setBooleanField(term28578, term28578.getClass(), "enableCache", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHostGroup", argTypes, term28578, args);
    }

};


