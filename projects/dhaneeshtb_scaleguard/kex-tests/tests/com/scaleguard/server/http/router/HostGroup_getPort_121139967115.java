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

public class HostGroup_getPort_121139967115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24420;

    public HostGroup_getPort_121139967115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24420 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term24420, term24420.getClass(), "id", "KMFbAPDgQN");
        setField(term24420, term24420.getClass(), "host", "pOXTylvole");
        setField(term24420, term24420.getClass(), "port", "kfguTpQAqI");
        setField(term24420, term24420.getClass(), "health", "YcPukufpJs");
        setField(term24420, term24420.getClass(), "scheme", "vvGshYKSpj");
        setIntField(term24420, term24420.getClass(), "priority", -1882480155);
        setBooleanField(term24420, term24420.getClass(), "isActive", true);
        setField(term24420, term24420.getClass(), "type", "haqqYHJKqP");
        setField(term24420, term24420.getClass(), "groupId", "pehbaguHxu");
        setFloatField(term24420, term24420.getClass(), "loadFactor", 0.11577946F);
        setBooleanField(term24420, term24420.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPort", argTypes, term24420, args);
    }

};


