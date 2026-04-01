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

public class ServiceDiscovery_discoverBridges_21457888362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term298;

    public ServiceDiscovery_discoverBridges_21457888362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term298 = newInstance(Class.forName("org.openRealmOfStars.ambient.ServiceDiscovery"));
        Object term299 = newInstance(Class.forName("java.net.MulticastSocket"));
        Object term301 = newInstance(Class.forName("java.lang.Object"));
        Object term302 = newInstance(Class.forName("java.lang.Object"));
        Object term306 = newInstance(Class.forName("java.lang.Object"));
        Object term307 = newInstance(Class.forName("java.net.PlainDatagramSocketImpl"));
        Object term313 = newInstance(Class.forName("java.io.FileDescriptor"));
        Object term318 = newInstance(Class.forName("java.net.SocketCleanable"));
        Object term325 = newInstance(Class.forName("java.net.Inet4Address"));
        Object term326 = newInstance(Class.forName("java.net.InetAddress$InetAddressHolder"));
        setBooleanField(term299, term299.getClass(), "interfaceSet", false);
        setField(term299, term299.getClass(), "ttlLock", term301);
        setField(term299, term299.getClass(), "infLock", term302);
        setField(term299, term299.getClass(), "infAddress", null);
        setBooleanField(term299, term299.getClass(), "created", true);
        setBooleanField(term299, term299.getClass(), "bound", true);
        setBooleanField(term299, term299.getClass(), "closed", false);
        setField(term299, term299.getClass(), "closeLock", term306);
        setIntField(term307, term307.getClass(), "timeout", 500);
        setBooleanField(term307, term307.getClass(), "connected", false);
        setIntField(term307, term307.getClass(), "trafficClass", 0);
        setField(term307, term307.getClass(), "connectedAddress", null);
        setIntField(term307, term307.getClass(), "connectedPort", -1);
        setIntField(term307, term307.getClass(), "localPort", 44111);
        setIntField(term313, term313.getClass(), "fd", 25);
        setLongField(term313, term313.getClass(), "handle", -1L);
        setField(term313, term313.getClass(), "parent", null);
        setField(term313, term313.getClass(), "otherParents", null);
        setBooleanField(term313, term313.getClass(), "closed", false);
        setBooleanField(term313, term313.getClass(), "append", false);
        setIntField(term318, term318.getClass(), "fd", 25);
        setField(term318, term318.getClass(), "prev", null);
        setField(term318, term318.getClass(), "next", null);
        setField(term318, term318.getClass(), "list", null);
        setField(term318, term318.getClass(), "referent", term313);
        setField(term318, term318.getClass(), "queue", null);
        setField(term318, term318.getClass(), "next", null);
        setField(term318, term318.getClass(), "discovered", null);
        setField(term313, term313.getClass(), "cleanup", term318);
        setField(term307, term307.getClass(), "fd", term313);
        setField(term307, term307.getClass(), "socket", term299);
        setField(term299, term299.getClass(), "impl", term307);
        setBooleanField(term299, term299.getClass(), "oldImpl", false);
        setBooleanField(term299, term299.getClass(), "explicitFilter", false);
        setIntField(term299, term299.getClass(), "bytesLeftToFilter", 0);
        setIntField(term299, term299.getClass(), "connectState", 0);
        setField(term299, term299.getClass(), "connectedAddress", null);
        setIntField(term299, term299.getClass(), "connectedPort", -1);
        setField(term298, term298.getClass(), "socket", term299);
        setField(term326, term326.getClass(), "originalHostName", null);
        setField(term326, term326.getClass(), "hostName", null);
        setIntField(term326, term326.getClass(), "address", -268435462);
        setIntField(term326, term326.getClass(), "family", 1);
        setField(term325, term325.getClass(), "holder", term326);
        setField(term325, term325.getClass(), "canonicalHostName", null);
        setField(term298, term298.getClass(), "address", term325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ambient.ServiceDiscovery");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "discoverBridges", argTypes, term298, args);
    }

};


