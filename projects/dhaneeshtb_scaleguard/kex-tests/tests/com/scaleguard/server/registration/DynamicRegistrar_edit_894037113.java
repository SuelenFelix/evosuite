package com.scaleguard.server.registration;

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
import static com.scaleguard.server.registration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DynamicRegistrar_edit_894037113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431;
     Object term520;

    public DynamicRegistrar_edit_894037113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term431, term431.getClass(), "id", "pCTimMblYc");
        setField(term431, term431.getClass(), "host", "hNxWaHcfhY");
        setField(term431, term431.getClass(), "port", "RkybSrpybU");
        setField(term431, term431.getClass(), "health", "xOEqzGAmDU");
        setField(term431, term431.getClass(), "scheme", "eZFUvlxvGV");
        setIntField(term431, term431.getClass(), "priority", 1484323161);
        setBooleanField(term431, term431.getClass(), "isActive", true);
        setField(term431, term431.getClass(), "type", "BYqFIqCKAV");
        setField(term431, term431.getClass(), "groupId", "vrQLuWIDJX");
        setFloatField(term431, term431.getClass(), "loadFactor", 0.3455959F);
        setBooleanField(term431, term431.getClass(), "isReachable", true);
        term520 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term520, term520.getClass(), "id", "flxyYxBRtu");
        setField(term520, term520.getClass(), "host", "OclPbYPkcH");
        setField(term520, term520.getClass(), "port", "IoAlmYsBwc");
        setField(term520, term520.getClass(), "health", "TEParAifyi");
        setField(term520, term520.getClass(), "scheme", "OWDIEULEFu");
        setIntField(term520, term520.getClass(), "priority", 391863371);
        setBooleanField(term520, term520.getClass(), "isActive", true);
        setField(term520, term520.getClass(), "type", "dWRymuLBtr");
        setField(term520, term520.getClass(), "groupId", "AijpHYOFuy");
        setFloatField(term520, term520.getClass(), "loadFactor", 0.09123778F);
        setBooleanField(term520, term520.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.registration.DynamicRegistrar");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.scaleguard.server.http.router.HostGroup");
        argTypes[1] = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Object[] args = new Object[2];
        args[0] = term431;
        args[1] = term520;
        callMethod(klass, "edit", argTypes, null, args);
    }

};


