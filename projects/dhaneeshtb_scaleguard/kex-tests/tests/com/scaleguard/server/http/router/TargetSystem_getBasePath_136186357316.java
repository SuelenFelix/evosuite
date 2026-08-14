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

public class TargetSystem_getBasePath_136186357316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31616;

    public TargetSystem_getBasePath_136186357316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31617 = new ArrayList();
        Object term31623 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31623, term31623.getClass(), "id", "");
        setField(term31623, term31623.getClass(), "host", "");
        setField(term31623, term31623.getClass(), "port", "");
        setField(term31623, term31623.getClass(), "health", "");
        setField(term31623, term31623.getClass(), "scheme", "");
        setIntField(term31623, term31623.getClass(), "priority", -519881101);
        setBooleanField(term31623, term31623.getClass(), "isActive", true);
        setField(term31623, term31623.getClass(), "type", "");
        setField(term31623, term31623.getClass(), "groupId", "");
        setFloatField(term31623, term31623.getClass(), "loadFactor", 0.94188213F);
        setBooleanField(term31623, term31623.getClass(), "isReachable", true);
        Object term31635 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term31635, term31635.getClass(), "id", "");
        setField(term31635, term31635.getClass(), "host", "");
        setField(term31635, term31635.getClass(), "port", "");
        setField(term31635, term31635.getClass(), "health", "");
        setField(term31635, term31635.getClass(), "scheme", "");
        setIntField(term31635, term31635.getClass(), "priority", -680920524);
        setBooleanField(term31635, term31635.getClass(), "isActive", true);
        setField(term31635, term31635.getClass(), "type", "");
        setField(term31635, term31635.getClass(), "groupId", "");
        setFloatField(term31635, term31635.getClass(), "loadFactor", 0.43556267F);
        setBooleanField(term31635, term31635.getClass(), "isReachable", true);
        ArrayList term31621 = new ArrayList();
        ((ArrayList) term31621).add(term31623);
        ((ArrayList) term31621).add(term31635);
        HashMap term31745 = new HashMap();
        HashMap term31750 = new HashMap();
        term31616 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term31616, term31616.getClass(), "cachedResources", term31617);
        setField(term31616, term31616.getClass(), "hostGroups", term31621);
        setField(term31616, term31616.getClass(), "host", "BpLdpzfuoW");
        setField(term31616, term31616.getClass(), "port", "rkzpRpPNtv");
        setField(term31616, term31616.getClass(), "hostGroupId", "xWbVCwRARi");
        setField(term31616, term31616.getClass(), "scheme", "WNZjPUZVwT");
        setField(term31616, term31616.getClass(), "basePath", "RrHlTUwGAK");
        setField(term31616, term31616.getClass(), "id", "HnGWMIfZqD");
        setField(term31616, term31616.getClass(), "name", "wzcInEwTXc");
        setField(term31616, term31616.getClass(), "groupId", "GpvNlGeEJB");
        setField(term31616, term31616.getClass(), "includeHeaders", term31745);
        setField(term31616, term31616.getClass(), "excludeHeaders", term31750);
        setBooleanField(term31616, term31616.getClass(), "enableCache", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.TargetSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBasePath", argTypes, term31616, args);
    }

};


