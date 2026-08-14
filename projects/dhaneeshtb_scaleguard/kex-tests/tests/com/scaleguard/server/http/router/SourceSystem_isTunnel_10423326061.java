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

public class SourceSystem_isTunnel_10423326061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275;

    public SourceSystem_isTunnel_10423326061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term436 = new ArrayList();
        Object term442 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term442, term442.getClass(), "id", null);
        setField(term442, term442.getClass(), "host", null);
        setField(term442, term442.getClass(), "port", null);
        setField(term442, term442.getClass(), "health", null);
        setField(term442, term442.getClass(), "scheme", null);
        setIntField(term442, term442.getClass(), "priority", 1162663216);
        setBooleanField(term442, term442.getClass(), "isActive", true);
        setField(term442, term442.getClass(), "type", null);
        setField(term442, term442.getClass(), "groupId", null);
        setFloatField(term442, term442.getClass(), "loadFactor", 0.2707036F);
        setBooleanField(term442, term442.getClass(), "isReachable", true);
        Object term447 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term447, term447.getClass(), "id", null);
        setField(term447, term447.getClass(), "host", null);
        setField(term447, term447.getClass(), "port", null);
        setField(term447, term447.getClass(), "health", null);
        setField(term447, term447.getClass(), "scheme", null);
        setIntField(term447, term447.getClass(), "priority", 1484323161);
        setBooleanField(term447, term447.getClass(), "isActive", true);
        setField(term447, term447.getClass(), "type", null);
        setField(term447, term447.getClass(), "groupId", null);
        setFloatField(term447, term447.getClass(), "loadFactor", 0.3455959F);
        setBooleanField(term447, term447.getClass(), "isReachable", true);
        Object term452 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term452, term452.getClass(), "id", null);
        setField(term452, term452.getClass(), "host", null);
        setField(term452, term452.getClass(), "port", null);
        setField(term452, term452.getClass(), "health", null);
        setField(term452, term452.getClass(), "scheme", null);
        setIntField(term452, term452.getClass(), "priority", 391863371);
        setBooleanField(term452, term452.getClass(), "isActive", true);
        setField(term452, term452.getClass(), "type", null);
        setField(term452, term452.getClass(), "groupId", null);
        setFloatField(term452, term452.getClass(), "loadFactor", 0.09123778F);
        setBooleanField(term452, term452.getClass(), "isReachable", true);
        Object term457 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term457, term457.getClass(), "id", null);
        setField(term457, term457.getClass(), "host", null);
        setField(term457, term457.getClass(), "port", null);
        setField(term457, term457.getClass(), "health", null);
        setField(term457, term457.getClass(), "scheme", null);
        setIntField(term457, term457.getClass(), "priority", -1922583790);
        setBooleanField(term457, term457.getClass(), "isActive", true);
        setField(term457, term457.getClass(), "type", null);
        setField(term457, term457.getClass(), "groupId", null);
        setFloatField(term457, term457.getClass(), "loadFactor", 0.5523636F);
        setBooleanField(term457, term457.getClass(), "isReachable", true);
        ArrayList term440 = new ArrayList();
        ((ArrayList) term440).add(term442);
        ((ArrayList) term440).add(term447);
        ((ArrayList) term440).add(term452);
        ((ArrayList) term440).add(term457);
        HashMap term560 = new HashMap();
        HashMap term565 = new HashMap();
        HashMap term583 = new HashMap();
        term275 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term435 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term275, term275.getClass(), "host", "MxlszYVzRf");
        setBooleanField(term275, term275.getClass(), "tunnel", false);
        setField(term275, term275.getClass(), "port", "LQFpaHEwXR");
        setField(term275, term275.getClass(), "scheme", "oVcInYnLWB");
        setField(term275, term275.getClass(), "basePath", "aJlieCFVtF");
        setField(term275, term275.getClass(), "id", "ZiaGIbnzTs");
        setField(term275, term275.getClass(), "name", "tbcdzjIfER");
        setField(term275, term275.getClass(), "groupId", "HyxfbSQYBe");
        setField(term275, term275.getClass(), "target", "pCTimMblYc");
        setBooleanField(term275, term275.getClass(), "async", false);
        setField(term275, term275.getClass(), "asyncEngine", "hNxWaHcfhY");
        setField(term275, term275.getClass(), "callbackId", "RkybSrpybU");
        setField(term275, term275.getClass(), "jwtKeylookup", "xOEqzGAmDU");
        setField(term275, term275.getClass(), "certificateId", "eZFUvlxvGV");
        setField(term275, term275.getClass(), "secappid", "BYqFIqCKAV");
        setBooleanField(term275, term275.getClass(), "autoProcure", false);
        setField(term435, term435.getClass(), "cachedResources", term436);
        setField(term435, term435.getClass(), "hostGroups", term440);
        setField(term435, term435.getClass(), "host", "JDswTTCZHV");
        setField(term435, term435.getClass(), "port", "onpbIeEKoi");
        setField(term435, term435.getClass(), "hostGroupId", "YRHGsAkhxb");
        setField(term435, term435.getClass(), "scheme", "ffYhPOzlUs");
        setField(term435, term435.getClass(), "basePath", "MLqYREekMl");
        setField(term435, term435.getClass(), "id", "ytSBIKXogI");
        setField(term435, term435.getClass(), "name", "nHXjMycHlU");
        setField(term435, term435.getClass(), "groupId", "ieCtQFdkii");
        setField(term435, term435.getClass(), "includeHeaders", term560);
        setField(term435, term435.getClass(), "excludeHeaders", term565);
        setBooleanField(term435, term435.getClass(), "enableCache", false);
        setField(term275, term275.getClass(), "targetSystem", term435);
        setField(term275, term275.getClass(), "headerLookup", "dEnhdmILtU");
        setField(term275, term275.getClass(), "keyLookupMap", term583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTunnel", argTypes, term275, args);
    }

};


