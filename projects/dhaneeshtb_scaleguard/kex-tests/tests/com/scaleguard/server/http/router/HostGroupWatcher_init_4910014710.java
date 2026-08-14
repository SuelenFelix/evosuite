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
import java.util.LinkedList;
import java.lang.Object;

public class HostGroupWatcher_init_4910014710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40996;

    public HostGroupWatcher_init_4910014710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40999 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term40999, term40999.getClass(), "id", "SfdVypszRN");
        setField(term40999, term40999.getClass(), "host", "qtLTYGkIKy");
        setField(term40999, term40999.getClass(), "port", "okeTzncAkm");
        setField(term40999, term40999.getClass(), "health", "uJZdhmQqly");
        setField(term40999, term40999.getClass(), "scheme", "SlaEVblljq");
        setIntField(term40999, term40999.getClass(), "priority", -544382127);
        setBooleanField(term40999, term40999.getClass(), "isActive", true);
        setField(term40999, term40999.getClass(), "type", "vWOXFteDkq");
        setField(term40999, term40999.getClass(), "groupId", "IsffVLAFSj");
        setFloatField(term40999, term40999.getClass(), "loadFactor", 0.26487374F);
        setBooleanField(term40999, term40999.getClass(), "isReachable", true);
        Object term41089 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41089, term41089.getClass(), "id", "");
        setField(term41089, term41089.getClass(), "host", "");
        setField(term41089, term41089.getClass(), "port", "");
        setField(term41089, term41089.getClass(), "health", "");
        setField(term41089, term41089.getClass(), "scheme", "");
        setIntField(term41089, term41089.getClass(), "priority", -1830198043);
        setBooleanField(term41089, term41089.getClass(), "isActive", true);
        setField(term41089, term41089.getClass(), "type", "");
        setField(term41089, term41089.getClass(), "groupId", "");
        setFloatField(term41089, term41089.getClass(), "loadFactor", 0.22767627F);
        setBooleanField(term41089, term41089.getClass(), "isReachable", true);
        Object term41102 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term41102, term41102.getClass(), "id", null);
        setField(term41102, term41102.getClass(), "host", null);
        setField(term41102, term41102.getClass(), "port", null);
        setField(term41102, term41102.getClass(), "health", null);
        setField(term41102, term41102.getClass(), "scheme", null);
        setIntField(term41102, term41102.getClass(), "priority", -439048495);
        setBooleanField(term41102, term41102.getClass(), "isActive", true);
        setField(term41102, term41102.getClass(), "type", null);
        setField(term41102, term41102.getClass(), "groupId", null);
        setFloatField(term41102, term41102.getClass(), "loadFactor", 0.07017553F);
        setBooleanField(term41102, term41102.getClass(), "isReachable", true);
        term40996 = new LinkedList();
        ((LinkedList) term40996).add(term40999);
        ((LinkedList) term40996).add(term41089);
        ((LinkedList) term40996).add(term41102);
        ((LinkedList) term40996).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroupWatcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term40996;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


