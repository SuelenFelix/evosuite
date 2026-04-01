package org.openRealmOfStars.ambient;

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
import static org.openRealmOfStars.ambient.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ServiceDiscovery_discoverBridge_19871681463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329;

    public ServiceDiscovery_discoverBridge_19871681463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329 = newInstance(Class.forName("org.openRealmOfStars.ambient.ServiceDiscovery"));
        Object term330 = newInstance(Class.forName("java.net.MulticastSocket"));
        Object term332 = newInstance(Class.forName("java.lang.Object"));
        Object term333 = newInstance(Class.forName("java.lang.Object"));
        Object term337 = newInstance(Class.forName("java.lang.Object"));
        Object term338 = newInstance(Class.forName("java.net.PlainDatagramSocketImpl"));
        Object term344 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term349 = newInstance(Class.forName("java.net.SocketCleanable"));
        Object term356 = newInstance(Class.forName("java.net.Inet4Address"));
        Object term357 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        setBooleanField(term330, term330.getClass(), "interfaceSet", false);
        setField(term330, term330.getClass(), "ttlLock", term332);
        setField(term330, term330.getClass(), "infLock", term333);
        setField(term330, term330.getClass(), "infAddress", null);
        setBooleanField(term330, term330.getClass(), "created", true);
        setBooleanField(term330, term330.getClass(), "bound", true);
        setBooleanField(term330, term330.getClass(), "closed", false);
        setField(term330, term330.getClass(), "closeLock", term337);
        setIntField(term338, term338.getClass(), "timeout", 500);
        setBooleanField(term338, term338.getClass(), "connected", false);
        setIntField(term338, term338.getClass(), "trafficClass", 0);
        setField(term338, term338.getClass(), "connectedAddress", null);
        setIntField(term338, term338.getClass(), "connectedPort", -1);
        setIntField(term338, term338.getClass(), "localPort", 46019);
        setIntField(term344, term344.getClass(), "fd", 31);
        setLongField(term344, term344.getClass(), "handle", -1L);
        setField(term344, term344.getClass(), "parent", null);
        setField(term344, term344.getClass(), "otherParents", null);
        setBooleanField(term344, term344.getClass(), "closed", false);
        setBooleanField(term344, term344.getClass(), "append", false);
        setIntField(term349, term349.getClass(), "fd", 31);
        setField(term349, term349.getClass(), "prev", null);
        setField(term349, term349.getClass(), "next", null);
        setField(term349, term349.getClass(), "list", null);
        setField(term349, term349.getClass(), "referent", term344);
        setField(term349, term349.getClass(), "queue", null);
        setField(term349, term349.getClass(), "next", null);
        setField(term349, term349.getClass(), "discovered", null);
        setField(term344, term344.getClass(), "cleanup", term349);
        setField(term338, term338.getClass(), "fd", term344);
        setField(term338, term338.getClass(), "socket", term330);
        setField(term330, term330.getClass(), "impl", term338);
        setBooleanField(term330, term330.getClass(), "oldImpl", false);
        setBooleanField(term330, term330.getClass(), "explicitFilter", false);
        setIntField(term330, term330.getClass(), "bytesLeftToFilter", 0);
        setIntField(term330, term330.getClass(), "connectState", 0);
        setField(term330, term330.getClass(), "connectedAddress", null);
        setIntField(term330, term330.getClass(), "connectedPort", -1);
        setField(term329, term329.getClass(), "socket", term330);
        setField(term357, term357.getClass(), "originalHostName", null);
        setField(term357, term357.getClass(), "hostName", null);
        setIntField(term357, term357.getClass(), "address", -268435462);
        setIntField(term357, term357.getClass(), "family", 1);
        setField(term356, term356.getClass(), "holder", term357);
        setField(term356, term356.getClass(), "canonicalHostName", null);
        setField(term329, term329.getClass(), "address", term356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.ServiceDiscovery");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "discoverBridge", argTypes, term329, args);
    }

};


