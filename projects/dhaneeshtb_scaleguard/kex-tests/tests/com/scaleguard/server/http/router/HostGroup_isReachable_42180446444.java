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

public class HostGroup_isReachable_42180446444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25826;

    public HostGroup_isReachable_42180446444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25826 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25826, term25826.getClass(), "id", null);
        setField(term25826, term25826.getClass(), "host", null);
        setField(term25826, term25826.getClass(), "port", null);
        setField(term25826, term25826.getClass(), "health", null);
        setField(term25826, term25826.getClass(), "scheme", null);
        setIntField(term25826, term25826.getClass(), "priority", 0);
        setBooleanField(term25826, term25826.getClass(), "isActive", false);
        setField(term25826, term25826.getClass(), "type", null);
        setField(term25826, term25826.getClass(), "groupId", null);
        setFloatField(term25826, term25826.getClass(), "loadFactor", 0.0F);
        setBooleanField(term25826, term25826.getClass(), "isReachable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReachable", argTypes, term25826, args);
    }

};


