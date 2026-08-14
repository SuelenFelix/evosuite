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

public class HostGroup_getHealth_9544674203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22400;

    public HostGroup_getHealth_9544674203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22400 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term22400, term22400.getClass(), "id", "WtgzEUhZIl");
        setField(term22400, term22400.getClass(), "host", "tzigWGaijF");
        setField(term22400, term22400.getClass(), "port", "VWFNUuzpse");
        setField(term22400, term22400.getClass(), "health", "XdnUnODLtI");
        setField(term22400, term22400.getClass(), "scheme", "blbqUBWvWn");
        setIntField(term22400, term22400.getClass(), "priority", 1358829571);
        setBooleanField(term22400, term22400.getClass(), "isActive", true);
        setField(term22400, term22400.getClass(), "type", "GqITHNYwXE");
        setField(term22400, term22400.getClass(), "groupId", "UZgYyXlvna");
        setFloatField(term22400, term22400.getClass(), "loadFactor", 0.36261773F);
        setBooleanField(term22400, term22400.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHealth", argTypes, term22400, args);
    }

};


