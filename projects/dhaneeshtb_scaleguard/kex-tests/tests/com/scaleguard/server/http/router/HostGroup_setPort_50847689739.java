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

public class HostGroup_setPort_50847689739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25797;

    public HostGroup_setPort_50847689739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25797 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25797, term25797.getClass(), "id", null);
        setField(term25797, term25797.getClass(), "host", null);
        setField(term25797, term25797.getClass(), "port", null);
        setField(term25797, term25797.getClass(), "health", null);
        setField(term25797, term25797.getClass(), "scheme", null);
        setIntField(term25797, term25797.getClass(), "priority", 0);
        setBooleanField(term25797, term25797.getClass(), "isActive", false);
        setField(term25797, term25797.getClass(), "type", null);
        setField(term25797, term25797.getClass(), "groupId", null);
        setFloatField(term25797, term25797.getClass(), "loadFactor", 0.0F);
        setBooleanField(term25797, term25797.getClass(), "isReachable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPort", argTypes, term25797, args);
    }

};


