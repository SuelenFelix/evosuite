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

public class HostGroup_setHost_27947348037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25787;

    public HostGroup_setHost_27947348037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25787 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25787, term25787.getClass(), "id", null);
        setField(term25787, term25787.getClass(), "host", null);
        setField(term25787, term25787.getClass(), "port", null);
        setField(term25787, term25787.getClass(), "health", null);
        setField(term25787, term25787.getClass(), "scheme", null);
        setIntField(term25787, term25787.getClass(), "priority", 0);
        setBooleanField(term25787, term25787.getClass(), "isActive", false);
        setField(term25787, term25787.getClass(), "type", null);
        setField(term25787, term25787.getClass(), "groupId", null);
        setFloatField(term25787, term25787.getClass(), "loadFactor", 0.0F);
        setBooleanField(term25787, term25787.getClass(), "isReachable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHost", argTypes, term25787, args);
    }

};


