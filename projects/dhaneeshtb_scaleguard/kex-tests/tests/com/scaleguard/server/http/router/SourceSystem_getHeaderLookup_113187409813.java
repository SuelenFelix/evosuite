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

public class SourceSystem_getHeaderLookup_113187409813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7208;

    public SourceSystem_getHeaderLookup_113187409813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7369 = new ArrayList();
        Object term7375 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7375, term7375.getClass(), "id", null);
        setField(term7375, term7375.getClass(), "host", null);
        setField(term7375, term7375.getClass(), "port", null);
        setField(term7375, term7375.getClass(), "health", null);
        setField(term7375, term7375.getClass(), "scheme", null);
        setIntField(term7375, term7375.getClass(), "priority", 1328271830);
        setBooleanField(term7375, term7375.getClass(), "isActive", true);
        setField(term7375, term7375.getClass(), "type", null);
        setField(term7375, term7375.getClass(), "groupId", null);
        setFloatField(term7375, term7375.getClass(), "loadFactor", 0.30926234F);
        setBooleanField(term7375, term7375.getClass(), "isReachable", true);
        Object term7380 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term7380, term7380.getClass(), "id", null);
        setField(term7380, term7380.getClass(), "host", null);
        setField(term7380, term7380.getClass(), "port", null);
        setField(term7380, term7380.getClass(), "health", null);
        setField(term7380, term7380.getClass(), "scheme", null);
        setIntField(term7380, term7380.getClass(), "priority", 1596070772);
        setBooleanField(term7380, term7380.getClass(), "isActive", true);
        setField(term7380, term7380.getClass(), "type", null);
        setField(term7380, term7380.getClass(), "groupId", null);
        setFloatField(term7380, term7380.getClass(), "loadFactor", 0.37161416F);
        setBooleanField(term7380, term7380.getClass(), "isReachable", true);
        ArrayList term7373 = new ArrayList();
        ((ArrayList) term7373).add(term7375);
        ((ArrayList) term7373).add(term7380);
        HashMap term7483 = new HashMap();
        HashMap term7488 = new HashMap();
        HashMap term7506 = new HashMap();
        term7208 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term7368 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term7208, term7208.getClass(), "host", "MrUPJzBTEn");
        setBooleanField(term7208, term7208.getClass(), "tunnel", false);
        setField(term7208, term7208.getClass(), "port", "IaSymdfFGa");
        setField(term7208, term7208.getClass(), "scheme", "FxSvJCIpul");
        setField(term7208, term7208.getClass(), "basePath", "HCjKwpexJj");
        setField(term7208, term7208.getClass(), "id", "sCpIHVPdfl");
        setField(term7208, term7208.getClass(), "name", "lMUBBGRjfY");
        setField(term7208, term7208.getClass(), "groupId", "olYpqbolWL");
        setField(term7208, term7208.getClass(), "target", "MCMCjxXzjw");
        setBooleanField(term7208, term7208.getClass(), "async", false);
        setField(term7208, term7208.getClass(), "asyncEngine", "pZbbwCURge");
        setField(term7208, term7208.getClass(), "callbackId", "RsOfgdMCMv");
        setField(term7208, term7208.getClass(), "jwtKeylookup", "nsofCJqJOR");
        setField(term7208, term7208.getClass(), "certificateId", "CitJiZwsjF");
        setField(term7208, term7208.getClass(), "secappid", "ZiyMvLArWJ");
        setBooleanField(term7208, term7208.getClass(), "autoProcure", true);
        setField(term7368, term7368.getClass(), "cachedResources", term7369);
        setField(term7368, term7368.getClass(), "hostGroups", term7373);
        setField(term7368, term7368.getClass(), "host", "TbYrjEyFPc");
        setField(term7368, term7368.getClass(), "port", "muefchpJiZ");
        setField(term7368, term7368.getClass(), "hostGroupId", "tuYaAqvYrh");
        setField(term7368, term7368.getClass(), "scheme", "CIbhheukbR");
        setField(term7368, term7368.getClass(), "basePath", "VOHPpErtan");
        setField(term7368, term7368.getClass(), "id", "GDMUlolTNs");
        setField(term7368, term7368.getClass(), "name", "xpLvWisjzN");
        setField(term7368, term7368.getClass(), "groupId", "IKfozyyKEj");
        setField(term7368, term7368.getClass(), "includeHeaders", term7483);
        setField(term7368, term7368.getClass(), "excludeHeaders", term7488);
        setBooleanField(term7368, term7368.getClass(), "enableCache", false);
        setField(term7208, term7208.getClass(), "targetSystem", term7368);
        setField(term7208, term7208.getClass(), "headerLookup", "thCjwQjRBL");
        setField(term7208, term7208.getClass(), "keyLookupMap", term7506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeaderLookup", argTypes, term7208, args);
    }

};


