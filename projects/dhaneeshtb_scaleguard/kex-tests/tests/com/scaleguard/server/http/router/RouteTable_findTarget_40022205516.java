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

public class RouteTable_findTarget_40022205516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39503;

    public RouteTable_findTarget_40022205516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39664 = new ArrayList();
        Object term39670 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39670, term39670.getClass(), "id", null);
        setField(term39670, term39670.getClass(), "host", null);
        setField(term39670, term39670.getClass(), "port", null);
        setField(term39670, term39670.getClass(), "health", null);
        setField(term39670, term39670.getClass(), "scheme", null);
        setIntField(term39670, term39670.getClass(), "priority", 1820784228);
        setBooleanField(term39670, term39670.getClass(), "isActive", true);
        setField(term39670, term39670.getClass(), "type", null);
        setField(term39670, term39670.getClass(), "groupId", null);
        setFloatField(term39670, term39670.getClass(), "loadFactor", 0.17890882F);
        setBooleanField(term39670, term39670.getClass(), "isReachable", true);
        Object term39675 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39675, term39675.getClass(), "id", null);
        setField(term39675, term39675.getClass(), "host", null);
        setField(term39675, term39675.getClass(), "port", null);
        setField(term39675, term39675.getClass(), "health", null);
        setField(term39675, term39675.getClass(), "scheme", null);
        setIntField(term39675, term39675.getClass(), "priority", 1390820006);
        setBooleanField(term39675, term39675.getClass(), "isActive", true);
        setField(term39675, term39675.getClass(), "type", null);
        setField(term39675, term39675.getClass(), "groupId", null);
        setFloatField(term39675, term39675.getClass(), "loadFactor", 0.9184034F);
        setBooleanField(term39675, term39675.getClass(), "isReachable", true);
        Object term39680 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39680, term39680.getClass(), "id", null);
        setField(term39680, term39680.getClass(), "host", null);
        setField(term39680, term39680.getClass(), "port", null);
        setField(term39680, term39680.getClass(), "health", null);
        setField(term39680, term39680.getClass(), "scheme", null);
        setIntField(term39680, term39680.getClass(), "priority", -828982065);
        setBooleanField(term39680, term39680.getClass(), "isActive", true);
        setField(term39680, term39680.getClass(), "type", null);
        setField(term39680, term39680.getClass(), "groupId", null);
        setFloatField(term39680, term39680.getClass(), "loadFactor", 0.7326771F);
        setBooleanField(term39680, term39680.getClass(), "isReachable", true);
        Object term39685 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39685, term39685.getClass(), "id", null);
        setField(term39685, term39685.getClass(), "host", null);
        setField(term39685, term39685.getClass(), "port", null);
        setField(term39685, term39685.getClass(), "health", null);
        setField(term39685, term39685.getClass(), "scheme", null);
        setIntField(term39685, term39685.getClass(), "priority", 1221443226);
        setBooleanField(term39685, term39685.getClass(), "isActive", true);
        setField(term39685, term39685.getClass(), "type", null);
        setField(term39685, term39685.getClass(), "groupId", null);
        setFloatField(term39685, term39685.getClass(), "loadFactor", 0.9457448F);
        setBooleanField(term39685, term39685.getClass(), "isReachable", true);
        Object term39690 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39690, term39690.getClass(), "id", null);
        setField(term39690, term39690.getClass(), "host", null);
        setField(term39690, term39690.getClass(), "port", null);
        setField(term39690, term39690.getClass(), "health", null);
        setField(term39690, term39690.getClass(), "scheme", null);
        setIntField(term39690, term39690.getClass(), "priority", 908108726);
        setBooleanField(term39690, term39690.getClass(), "isActive", true);
        setField(term39690, term39690.getClass(), "type", null);
        setField(term39690, term39690.getClass(), "groupId", null);
        setFloatField(term39690, term39690.getClass(), "loadFactor", 0.42393434F);
        setBooleanField(term39690, term39690.getClass(), "isReachable", true);
        ArrayList term39668 = new ArrayList();
        ((ArrayList) term39668).add(term39670);
        ((ArrayList) term39668).add(term39675);
        ((ArrayList) term39668).add(term39680);
        ((ArrayList) term39668).add(term39685);
        ((ArrayList) term39668).add(term39690);
        HashMap term39793 = new HashMap();
        HashMap term39798 = new HashMap();
        HashMap term39816 = new HashMap();
        term39503 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term39663 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term39503, term39503.getClass(), "host", "LRKdNCNmMV");
        setBooleanField(term39503, term39503.getClass(), "tunnel", false);
        setField(term39503, term39503.getClass(), "port", "thQPqqRGQK");
        setField(term39503, term39503.getClass(), "scheme", "KQIDeMauIM");
        setField(term39503, term39503.getClass(), "basePath", "NgKByYqhhT");
        setField(term39503, term39503.getClass(), "id", "yLsafyiJlf");
        setField(term39503, term39503.getClass(), "name", "NawBhAzbKl");
        setField(term39503, term39503.getClass(), "groupId", "ShkfzZambR");
        setField(term39503, term39503.getClass(), "target", "IwyNKjdOyh");
        setBooleanField(term39503, term39503.getClass(), "async", false);
        setField(term39503, term39503.getClass(), "asyncEngine", "PSpaEkziKZ");
        setField(term39503, term39503.getClass(), "callbackId", "aiShGYDMDb");
        setField(term39503, term39503.getClass(), "jwtKeylookup", "GAKArYpkPT");
        setField(term39503, term39503.getClass(), "certificateId", "zIHDwkFWvV");
        setField(term39503, term39503.getClass(), "secappid", "KdiIcRqDFX");
        setBooleanField(term39503, term39503.getClass(), "autoProcure", false);
        setField(term39663, term39663.getClass(), "cachedResources", term39664);
        setField(term39663, term39663.getClass(), "hostGroups", term39668);
        setField(term39663, term39663.getClass(), "host", "dqaCYPfqWF");
        setField(term39663, term39663.getClass(), "port", "vGGvtGbfze");
        setField(term39663, term39663.getClass(), "hostGroupId", "jWmpFQNuJp");
        setField(term39663, term39663.getClass(), "scheme", "dQGTDrUjmt");
        setField(term39663, term39663.getClass(), "basePath", "ITLIaODlGc");
        setField(term39663, term39663.getClass(), "id", "kZiqgxcCTP");
        setField(term39663, term39663.getClass(), "name", "LoJRQPNqoD");
        setField(term39663, term39663.getClass(), "groupId", "gXdFddXyRw");
        setField(term39663, term39663.getClass(), "includeHeaders", term39793);
        setField(term39663, term39663.getClass(), "excludeHeaders", term39798);
        setBooleanField(term39663, term39663.getClass(), "enableCache", true);
        setField(term39503, term39503.getClass(), "targetSystem", term39663);
        setField(term39503, term39503.getClass(), "headerLookup", "AmYGzDcymG");
        setField(term39503, term39503.getClass(), "keyLookupMap", term39816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Object[] args = new Object[1];
        args[0] = term39503;
        callMethod(klass, "findTarget", argTypes, null, args);
    }

};


