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

public class HostGroup_getPriority_83880461517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24760;

    public HostGroup_getPriority_83880461517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24760 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term24760, term24760.getClass(), "id", "eZUuWCoERR");
        setField(term24760, term24760.getClass(), "host", "AMeLarREbk");
        setField(term24760, term24760.getClass(), "port", "LQHAihGqFG");
        setField(term24760, term24760.getClass(), "health", "XNHngduAPd");
        setField(term24760, term24760.getClass(), "scheme", "ewowfKAPBz");
        setIntField(term24760, term24760.getClass(), "priority", 389427431);
        setBooleanField(term24760, term24760.getClass(), "isActive", true);
        setField(term24760, term24760.getClass(), "type", "yOYHYOdvNm");
        setField(term24760, term24760.getClass(), "groupId", "RsOIgNcrMD");
        setFloatField(term24760, term24760.getClass(), "loadFactor", 0.5617009F);
        setBooleanField(term24760, term24760.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPriority", argTypes, term24760, args);
    }

};


