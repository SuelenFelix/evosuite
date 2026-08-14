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

public class SourceSystem_getGroupId_44966408931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17276;

    public SourceSystem_getGroupId_44966408931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17437 = new ArrayList();
        Object term17443 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term17443, term17443.getClass(), "id", null);
        setField(term17443, term17443.getClass(), "host", null);
        setField(term17443, term17443.getClass(), "port", null);
        setField(term17443, term17443.getClass(), "health", null);
        setField(term17443, term17443.getClass(), "scheme", null);
        setIntField(term17443, term17443.getClass(), "priority", 1202361360);
        setBooleanField(term17443, term17443.getClass(), "isActive", true);
        setField(term17443, term17443.getClass(), "type", null);
        setField(term17443, term17443.getClass(), "groupId", null);
        setFloatField(term17443, term17443.getClass(), "loadFactor", 0.27994657F);
        setBooleanField(term17443, term17443.getClass(), "isReachable", true);
        Object term17448 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term17448, term17448.getClass(), "id", null);
        setField(term17448, term17448.getClass(), "host", null);
        setField(term17448, term17448.getClass(), "port", null);
        setField(term17448, term17448.getClass(), "health", null);
        setField(term17448, term17448.getClass(), "scheme", null);
        setIntField(term17448, term17448.getClass(), "priority", -2015048153);
        setBooleanField(term17448, term17448.getClass(), "isActive", true);
        setField(term17448, term17448.getClass(), "type", null);
        setField(term17448, term17448.getClass(), "groupId", null);
        setFloatField(term17448, term17448.getClass(), "loadFactor", 0.53083503F);
        setBooleanField(term17448, term17448.getClass(), "isReachable", true);
        Object term17453 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term17453, term17453.getClass(), "id", null);
        setField(term17453, term17453.getClass(), "host", null);
        setField(term17453, term17453.getClass(), "port", null);
        setField(term17453, term17453.getClass(), "health", null);
        setField(term17453, term17453.getClass(), "scheme", null);
        setIntField(term17453, term17453.getClass(), "priority", -2063457669);
        setBooleanField(term17453, term17453.getClass(), "isActive", true);
        setField(term17453, term17453.getClass(), "type", null);
        setField(term17453, term17453.getClass(), "groupId", null);
        setFloatField(term17453, term17453.getClass(), "loadFactor", 0.5195638F);
        setBooleanField(term17453, term17453.getClass(), "isReachable", true);
        Object term17458 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term17458, term17458.getClass(), "id", null);
        setField(term17458, term17458.getClass(), "host", null);
        setField(term17458, term17458.getClass(), "port", null);
        setField(term17458, term17458.getClass(), "health", null);
        setField(term17458, term17458.getClass(), "scheme", null);
        setIntField(term17458, term17458.getClass(), "priority", -1222006000);
        setBooleanField(term17458, term17458.getClass(), "isActive", true);
        setField(term17458, term17458.getClass(), "type", null);
        setField(term17458, term17458.getClass(), "groupId", null);
        setFloatField(term17458, term17458.getClass(), "loadFactor", 0.71547955F);
        setBooleanField(term17458, term17458.getClass(), "isReachable", true);
        Object term17463 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term17463, term17463.getClass(), "id", null);
        setField(term17463, term17463.getClass(), "host", null);
        setField(term17463, term17463.getClass(), "port", null);
        setField(term17463, term17463.getClass(), "health", null);
        setField(term17463, term17463.getClass(), "scheme", null);
        setIntField(term17463, term17463.getClass(), "priority", 2095798786);
        setBooleanField(term17463, term17463.getClass(), "isActive", true);
        setField(term17463, term17463.getClass(), "type", null);
        setField(term17463, term17463.getClass(), "groupId", null);
        setFloatField(term17463, term17463.getClass(), "loadFactor", 0.48796618F);
        setBooleanField(term17463, term17463.getClass(), "isReachable", true);
        Object term17468 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term17468, term17468.getClass(), "id", null);
        setField(term17468, term17468.getClass(), "host", null);
        setField(term17468, term17468.getClass(), "port", null);
        setField(term17468, term17468.getClass(), "health", null);
        setField(term17468, term17468.getClass(), "scheme", null);
        setIntField(term17468, term17468.getClass(), "priority", -1565502840);
        setBooleanField(term17468, term17468.getClass(), "isActive", true);
        setField(term17468, term17468.getClass(), "type", null);
        setField(term17468, term17468.getClass(), "groupId", null);
        setFloatField(term17468, term17468.getClass(), "loadFactor", 0.63550293F);
        setBooleanField(term17468, term17468.getClass(), "isReachable", true);
        Object term17473 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term17473, term17473.getClass(), "id", null);
        setField(term17473, term17473.getClass(), "host", null);
        setField(term17473, term17473.getClass(), "port", null);
        setField(term17473, term17473.getClass(), "health", null);
        setField(term17473, term17473.getClass(), "scheme", null);
        setIntField(term17473, term17473.getClass(), "priority", 344323424);
        setBooleanField(term17473, term17473.getClass(), "isActive", true);
        setField(term17473, term17473.getClass(), "type", null);
        setField(term17473, term17473.getClass(), "groupId", null);
        setFloatField(term17473, term17473.getClass(), "loadFactor", 0.08016902F);
        setBooleanField(term17473, term17473.getClass(), "isReachable", true);
        ArrayList term17441 = new ArrayList();
        ((ArrayList) term17441).add(term17443);
        ((ArrayList) term17441).add(term17448);
        ((ArrayList) term17441).add(term17453);
        ((ArrayList) term17441).add(term17458);
        ((ArrayList) term17441).add(term17463);
        ((ArrayList) term17441).add(term17468);
        ((ArrayList) term17441).add(term17473);
        HashMap term17576 = new HashMap();
        HashMap term17581 = new HashMap();
        HashMap term17599 = new HashMap();
        term17276 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term17436 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term17276, term17276.getClass(), "host", "MuJvYyPzjX");
        setBooleanField(term17276, term17276.getClass(), "tunnel", false);
        setField(term17276, term17276.getClass(), "port", "pEZeQhLjKN");
        setField(term17276, term17276.getClass(), "scheme", "saKRDpPnGD");
        setField(term17276, term17276.getClass(), "basePath", "UesGweYSco");
        setField(term17276, term17276.getClass(), "id", "uVnPUUZHSY");
        setField(term17276, term17276.getClass(), "name", "LaWPqdDqyl");
        setField(term17276, term17276.getClass(), "groupId", "BGDjrSZTJY");
        setField(term17276, term17276.getClass(), "target", "VUVCEVItic");
        setBooleanField(term17276, term17276.getClass(), "async", true);
        setField(term17276, term17276.getClass(), "asyncEngine", "tloEDDASGy");
        setField(term17276, term17276.getClass(), "callbackId", "CQMdMBIICe");
        setField(term17276, term17276.getClass(), "jwtKeylookup", "rbJaIkrSnM");
        setField(term17276, term17276.getClass(), "certificateId", "EAKcPFEKbX");
        setField(term17276, term17276.getClass(), "secappid", "uPdAMNFhdG");
        setBooleanField(term17276, term17276.getClass(), "autoProcure", true);
        setField(term17436, term17436.getClass(), "cachedResources", term17437);
        setField(term17436, term17436.getClass(), "hostGroups", term17441);
        setField(term17436, term17436.getClass(), "host", "jieMNXAAbL");
        setField(term17436, term17436.getClass(), "port", "NbmTxmqOjh");
        setField(term17436, term17436.getClass(), "hostGroupId", "rLDmBbcLaC");
        setField(term17436, term17436.getClass(), "scheme", "tUKcXglBlG");
        setField(term17436, term17436.getClass(), "basePath", "ZGptycjjRq");
        setField(term17436, term17436.getClass(), "id", "kXJaxapFer");
        setField(term17436, term17436.getClass(), "name", "OEeAVwVwuj");
        setField(term17436, term17436.getClass(), "groupId", "WEgFuDZsxi");
        setField(term17436, term17436.getClass(), "includeHeaders", term17576);
        setField(term17436, term17436.getClass(), "excludeHeaders", term17581);
        setBooleanField(term17436, term17436.getClass(), "enableCache", true);
        setField(term17276, term17276.getClass(), "targetSystem", term17436);
        setField(term17276, term17276.getClass(), "headerLookup", "kvcaSGNTHd");
        setField(term17276, term17276.getClass(), "keyLookupMap", term17599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroupId", argTypes, term17276, args);
    }

};


