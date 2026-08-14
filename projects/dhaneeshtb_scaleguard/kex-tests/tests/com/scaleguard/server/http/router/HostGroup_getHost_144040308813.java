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

public class HostGroup_getHost_144040308813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24080;

    public HostGroup_getHost_144040308813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24080 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term24080, term24080.getClass(), "id", "zorMRlODHM");
        setField(term24080, term24080.getClass(), "host", "xLZEtHhKOn");
        setField(term24080, term24080.getClass(), "port", "wfqnUhLFCy");
        setField(term24080, term24080.getClass(), "health", "UKRJIjNXmC");
        setField(term24080, term24080.getClass(), "scheme", "CJBElYMXZF");
        setIntField(term24080, term24080.getClass(), "priority", 497269071);
        setBooleanField(term24080, term24080.getClass(), "isActive", true);
        setField(term24080, term24080.getClass(), "type", "uZOAWgAORh");
        setField(term24080, term24080.getClass(), "groupId", "fmFvklptLM");
        setFloatField(term24080, term24080.getClass(), "loadFactor", 0.39286935F);
        setBooleanField(term24080, term24080.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHost", argTypes, term24080, args);
    }

};


