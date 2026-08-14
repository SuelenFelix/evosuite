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

public class HostGroup_getScheme_54470229128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25740;

    public HostGroup_getScheme_54470229128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25740 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25740, term25740.getClass(), "id", null);
        setField(term25740, term25740.getClass(), "host", null);
        setField(term25740, term25740.getClass(), "port", null);
        setField(term25740, term25740.getClass(), "health", null);
        setField(term25740, term25740.getClass(), "scheme", null);
        setIntField(term25740, term25740.getClass(), "priority", 0);
        setBooleanField(term25740, term25740.getClass(), "isActive", false);
        setField(term25740, term25740.getClass(), "type", null);
        setField(term25740, term25740.getClass(), "groupId", null);
        setFloatField(term25740, term25740.getClass(), "loadFactor", 0.0F);
        setBooleanField(term25740, term25740.getClass(), "isReachable", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScheme", argTypes, term25740, args);
    }

};


