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

public class HostGroup_setId_199421452325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25725;

    public HostGroup_setId_199421452325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25725 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25725, term25725.getClass(), "id", null);
        setField(term25725, term25725.getClass(), "host", null);
        setField(term25725, term25725.getClass(), "port", null);
        setField(term25725, term25725.getClass(), "health", null);
        setField(term25725, term25725.getClass(), "scheme", null);
        setIntField(term25725, term25725.getClass(), "priority", 0);
        setBooleanField(term25725, term25725.getClass(), "isActive", false);
        setField(term25725, term25725.getClass(), "type", null);
        setField(term25725, term25725.getClass(), "groupId", null);
        setFloatField(term25725, term25725.getClass(), "loadFactor", 0.0F);
        setBooleanField(term25725, term25725.getClass(), "isReachable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term25725, args);
    }

};


