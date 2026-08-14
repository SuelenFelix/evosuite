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

public class RouteTable_find_120864747214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38926;

    public RouteTable_find_120864747214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39087 = new ArrayList();
        Object term39093 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39093, term39093.getClass(), "id", null);
        setField(term39093, term39093.getClass(), "host", null);
        setField(term39093, term39093.getClass(), "port", null);
        setField(term39093, term39093.getClass(), "health", null);
        setField(term39093, term39093.getClass(), "scheme", null);
        setIntField(term39093, term39093.getClass(), "priority", 1559605714);
        setBooleanField(term39093, term39093.getClass(), "isActive", true);
        setField(term39093, term39093.getClass(), "type", null);
        setField(term39093, term39093.getClass(), "groupId", null);
        setFloatField(term39093, term39093.getClass(), "loadFactor", 0.3034814F);
        setBooleanField(term39093, term39093.getClass(), "isReachable", true);
        Object term39098 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39098, term39098.getClass(), "id", null);
        setField(term39098, term39098.getClass(), "host", null);
        setField(term39098, term39098.getClass(), "port", null);
        setField(term39098, term39098.getClass(), "health", null);
        setField(term39098, term39098.getClass(), "scheme", null);
        setIntField(term39098, term39098.getClass(), "priority", 1146601902);
        setBooleanField(term39098, term39098.getClass(), "isActive", true);
        setField(term39098, term39098.getClass(), "type", null);
        setField(term39098, term39098.getClass(), "groupId", null);
        setFloatField(term39098, term39098.getClass(), "loadFactor", 0.18499982F);
        setBooleanField(term39098, term39098.getClass(), "isReachable", true);
        Object term39103 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39103, term39103.getClass(), "id", null);
        setField(term39103, term39103.getClass(), "host", null);
        setField(term39103, term39103.getClass(), "port", null);
        setField(term39103, term39103.getClass(), "health", null);
        setField(term39103, term39103.getClass(), "scheme", null);
        setIntField(term39103, term39103.getClass(), "priority", -1938881385);
        setBooleanField(term39103, term39103.getClass(), "isActive", true);
        setField(term39103, term39103.getClass(), "type", null);
        setField(term39103, term39103.getClass(), "groupId", null);
        setFloatField(term39103, term39103.getClass(), "loadFactor", 0.8988424F);
        setBooleanField(term39103, term39103.getClass(), "isReachable", true);
        Object term39108 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39108, term39108.getClass(), "id", null);
        setField(term39108, term39108.getClass(), "host", null);
        setField(term39108, term39108.getClass(), "port", null);
        setField(term39108, term39108.getClass(), "health", null);
        setField(term39108, term39108.getClass(), "scheme", null);
        setIntField(term39108, term39108.getClass(), "priority", -1629418973);
        setBooleanField(term39108, term39108.getClass(), "isActive", true);
        setField(term39108, term39108.getClass(), "type", null);
        setField(term39108, term39108.getClass(), "groupId", null);
        setFloatField(term39108, term39108.getClass(), "loadFactor", 0.36312395F);
        setBooleanField(term39108, term39108.getClass(), "isReachable", true);
        Object term39113 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39113, term39113.getClass(), "id", null);
        setField(term39113, term39113.getClass(), "host", null);
        setField(term39113, term39113.getClass(), "port", null);
        setField(term39113, term39113.getClass(), "health", null);
        setField(term39113, term39113.getClass(), "scheme", null);
        setIntField(term39113, term39113.getClass(), "priority", -100825168);
        setBooleanField(term39113, term39113.getClass(), "isActive", true);
        setField(term39113, term39113.getClass(), "type", null);
        setField(term39113, term39113.getClass(), "groupId", null);
        setFloatField(term39113, term39113.getClass(), "loadFactor", 0.26696402F);
        setBooleanField(term39113, term39113.getClass(), "isReachable", true);
        Object term39118 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39118, term39118.getClass(), "id", null);
        setField(term39118, term39118.getClass(), "host", null);
        setField(term39118, term39118.getClass(), "port", null);
        setField(term39118, term39118.getClass(), "health", null);
        setField(term39118, term39118.getClass(), "scheme", null);
        setIntField(term39118, term39118.getClass(), "priority", 768407648);
        setBooleanField(term39118, term39118.getClass(), "isActive", true);
        setField(term39118, term39118.getClass(), "type", null);
        setField(term39118, term39118.getClass(), "groupId", null);
        setFloatField(term39118, term39118.getClass(), "loadFactor", 0.54856896F);
        setBooleanField(term39118, term39118.getClass(), "isReachable", true);
        Object term39123 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39123, term39123.getClass(), "id", null);
        setField(term39123, term39123.getClass(), "host", null);
        setField(term39123, term39123.getClass(), "port", null);
        setField(term39123, term39123.getClass(), "health", null);
        setField(term39123, term39123.getClass(), "scheme", null);
        setIntField(term39123, term39123.getClass(), "priority", -350454594);
        setBooleanField(term39123, term39123.getClass(), "isActive", true);
        setField(term39123, term39123.getClass(), "type", null);
        setField(term39123, term39123.getClass(), "groupId", null);
        setFloatField(term39123, term39123.getClass(), "loadFactor", 0.6206213F);
        setBooleanField(term39123, term39123.getClass(), "isReachable", true);
        Object term39128 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term39128, term39128.getClass(), "id", null);
        setField(term39128, term39128.getClass(), "host", null);
        setField(term39128, term39128.getClass(), "port", null);
        setField(term39128, term39128.getClass(), "health", null);
        setField(term39128, term39128.getClass(), "scheme", null);
        setIntField(term39128, term39128.getClass(), "priority", -1148142995);
        setBooleanField(term39128, term39128.getClass(), "isActive", true);
        setField(term39128, term39128.getClass(), "type", null);
        setField(term39128, term39128.getClass(), "groupId", null);
        setFloatField(term39128, term39128.getClass(), "loadFactor", 0.9765248F);
        setBooleanField(term39128, term39128.getClass(), "isReachable", true);
        ArrayList term39091 = new ArrayList();
        ((ArrayList) term39091).add(term39093);
        ((ArrayList) term39091).add(term39098);
        ((ArrayList) term39091).add(term39103);
        ((ArrayList) term39091).add(term39108);
        ((ArrayList) term39091).add(term39113);
        ((ArrayList) term39091).add(term39118);
        ((ArrayList) term39091).add(term39123);
        ((ArrayList) term39091).add(term39128);
        HashMap term39231 = new HashMap();
        HashMap term39236 = new HashMap();
        HashMap term39254 = new HashMap();
        term38926 = newInstance(Class.forName("com.scaleguard.server.http.router.SourceSystem"));
        Object term39086 = newInstance(Class.forName("com.scaleguard.server.http.router.TargetSystem"));
        setField(term38926, term38926.getClass(), "host", "OVIRthBBTP");
        setBooleanField(term38926, term38926.getClass(), "tunnel", true);
        setField(term38926, term38926.getClass(), "port", "PMNZjFOSxe");
        setField(term38926, term38926.getClass(), "scheme", "RunVMgFFZo");
        setField(term38926, term38926.getClass(), "basePath", "WFOAbiqZtY");
        setField(term38926, term38926.getClass(), "id", "fDdzXpgVRo");
        setField(term38926, term38926.getClass(), "name", "FHYonZSkfn");
        setField(term38926, term38926.getClass(), "groupId", "PiMqofRFQi");
        setField(term38926, term38926.getClass(), "target", "pwXMPDqzoA");
        setBooleanField(term38926, term38926.getClass(), "async", true);
        setField(term38926, term38926.getClass(), "asyncEngine", "HQLQWUnXEf");
        setField(term38926, term38926.getClass(), "callbackId", "YyEhHzEtEI");
        setField(term38926, term38926.getClass(), "jwtKeylookup", "HGPHBeXqrv");
        setField(term38926, term38926.getClass(), "certificateId", "IZRGLXWScu");
        setField(term38926, term38926.getClass(), "secappid", "IBINtqJpGT");
        setBooleanField(term38926, term38926.getClass(), "autoProcure", true);
        setField(term39086, term39086.getClass(), "cachedResources", term39087);
        setField(term39086, term39086.getClass(), "hostGroups", term39091);
        setField(term39086, term39086.getClass(), "host", "TpnkYWqNUj");
        setField(term39086, term39086.getClass(), "port", "eNNbxsHrdX");
        setField(term39086, term39086.getClass(), "hostGroupId", "PHeLqVCgUF");
        setField(term39086, term39086.getClass(), "scheme", "pNwyRKGjjM");
        setField(term39086, term39086.getClass(), "basePath", "MSUEuvzuwP");
        setField(term39086, term39086.getClass(), "id", "kxHgqohAOx");
        setField(term39086, term39086.getClass(), "name", "FsCSDmxBwU");
        setField(term39086, term39086.getClass(), "groupId", "YRfCNvIQfM");
        setField(term39086, term39086.getClass(), "includeHeaders", term39231);
        setField(term39086, term39086.getClass(), "excludeHeaders", term39236);
        setBooleanField(term39086, term39086.getClass(), "enableCache", false);
        setField(term38926, term38926.getClass(), "targetSystem", term39086);
        setField(term38926, term38926.getClass(), "headerLookup", "aUnLleyfFN");
        setField(term38926, term38926.getClass(), "keyLookupMap", term39254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.RouteTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.SourceSystem");
        Object[] args = new Object[1];
        args[0] = term38926;
        callMethod(klass, "find", argTypes, null, args);
    }

};


