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

public class HostGroup_getScheme_5447022915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22740;

    public HostGroup_getScheme_5447022915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22740 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term22740, term22740.getClass(), "id", "lOnziohwRj");
        setField(term22740, term22740.getClass(), "host", "FcuzXnxIut");
        setField(term22740, term22740.getClass(), "port", "fyepabvKPu");
        setField(term22740, term22740.getClass(), "health", "igjhLhfUDg");
        setField(term22740, term22740.getClass(), "scheme", "aphCSNJgJZ");
        setIntField(term22740, term22740.getClass(), "priority", -506958186);
        setBooleanField(term22740, term22740.getClass(), "isActive", true);
        setField(term22740, term22740.getClass(), "type", "JtamsBczow");
        setField(term22740, term22740.getClass(), "groupId", "ckScPlFqWx");
        setFloatField(term22740, term22740.getClass(), "loadFactor", 0.31637716F);
        setBooleanField(term22740, term22740.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScheme", argTypes, term22740, args);
    }

};


