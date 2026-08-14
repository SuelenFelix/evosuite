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

public class DynamicRegistrar_unRegister_16900512801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public DynamicRegistrar_unRegister_16900512801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term79, term79.getClass(), "id", "jJCZpVmanW");
        setField(term79, term79.getClass(), "host", "EGtDIRbSSb");
        setField(term79, term79.getClass(), "port", "SzjVpOQTyS");
        setField(term79, term79.getClass(), "health", "MjGYSRKTNF");
        setField(term79, term79.getClass(), "scheme", "hRNSzYYIrc");
        setIntField(term79, term79.getClass(), "priority", 568599855);
        setBooleanField(term79, term79.getClass(), "isActive", true);
        setField(term79, term79.getClass(), "type", "RMFIsYGgne");
        setField(term79, term79.getClass(), "groupId", "NRdvgJlhkX");
        setFloatField(term79, term79.getClass(), "loadFactor", 0.13238746F);
        setBooleanField(term79, term79.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.registration.DynamicRegistrar");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Object[] args = new Object[2];
        args[0] = "xxtlPwDYFs";
        args[1] = term79;
        callMethod(klass, "unRegister", argTypes, null, args);
    }

};


