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
import java.lang.Float;

public class HostGroup_setLoadFactor_107239110643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25819;
     Object term25824;

    public HostGroup_setLoadFactor_107239110643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25819 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term25819, term25819.getClass(), "id", null);
        setField(term25819, term25819.getClass(), "host", null);
        setField(term25819, term25819.getClass(), "port", null);
        setField(term25819, term25819.getClass(), "health", null);
        setField(term25819, term25819.getClass(), "scheme", null);
        setIntField(term25819, term25819.getClass(), "priority", 0);
        setBooleanField(term25819, term25819.getClass(), "isActive", false);
        setField(term25819, term25819.getClass(), "type", null);
        setField(term25819, term25819.getClass(), "groupId", null);
        setFloatField(term25819, term25819.getClass(), "loadFactor", 0.0F);
        setBooleanField(term25819, term25819.getClass(), "isReachable", false);
        term25824 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term25824;
        callMethod(klass, "setLoadFactor", argTypes, term25819, args);
    }

};


