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

public class HostGroup_getLoadFactor_61759354819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25080;

    public HostGroup_getLoadFactor_61759354819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25080 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25080, term25080.getClass(), "id", "fIMpTnCtOM");
        setField(term25080, term25080.getClass(), "host", "zsVQmqfyvx");
        setField(term25080, term25080.getClass(), "port", "DKFEMZUVhd");
        setField(term25080, term25080.getClass(), "health", "xhjqWwsjmc");
        setField(term25080, term25080.getClass(), "scheme", "GmFORCKDuz");
        setIntField(term25080, term25080.getClass(), "priority", -1667990367);
        setBooleanField(term25080, term25080.getClass(), "isActive", true);
        setField(term25080, term25080.getClass(), "type", "uiZFXEVOdS");
        setField(term25080, term25080.getClass(), "groupId", "kLUzmGfJsV");
        setFloatField(term25080, term25080.getClass(), "loadFactor", 0.090670586F);
        setBooleanField(term25080, term25080.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLoadFactor", argTypes, term25080, args);
    }

};


