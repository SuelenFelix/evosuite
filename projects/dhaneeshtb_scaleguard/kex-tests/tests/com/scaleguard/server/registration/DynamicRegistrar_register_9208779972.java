package com.scaleguard.server.registration;

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
import static com.scaleguard.server.registration.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class DynamicRegistrar_register_9208779972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;
     Object term349;

    public DynamicRegistrar_register_9208779972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term260, term260.getClass(), "id", "MxlszYVzRf");
        setField(term260, term260.getClass(), "host", "LQFpaHEwXR");
        setField(term260, term260.getClass(), "port", "oVcInYnLWB");
        setField(term260, term260.getClass(), "health", "aJlieCFVtF");
        setField(term260, term260.getClass(), "scheme", "ZiaGIbnzTs");
        setIntField(term260, term260.getClass(), "priority", 1162663216);
        setBooleanField(term260, term260.getClass(), "isActive", true);
        setField(term260, term260.getClass(), "type", "tbcdzjIfER");
        setField(term260, term260.getClass(), "groupId", "HyxfbSQYBe");
        setFloatField(term260, term260.getClass(), "loadFactor", 0.2707036F);
        setBooleanField(term260, term260.getClass(), "isReachable", true);
        term349 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.registration.DynamicRegistrar");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.scaleguard.server.http.router.HostGroup");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = "uuaPigETmJ";
        args[1] = term260;
        args[2] = term349;
        callMethod(klass, "register", argTypes, null, args);
    }

};


