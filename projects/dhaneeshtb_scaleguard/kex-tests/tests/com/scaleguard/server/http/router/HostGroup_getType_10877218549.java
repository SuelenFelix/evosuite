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

public class HostGroup_getType_10877218549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23400;

    public HostGroup_getType_10877218549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23400 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term23400, term23400.getClass(), "id", "CZAqWlBJTT");
        setField(term23400, term23400.getClass(), "host", "WPMnhxMKAm");
        setField(term23400, term23400.getClass(), "port", "tTGimFVzYt");
        setField(term23400, term23400.getClass(), "health", "bkFWSyioMj");
        setField(term23400, term23400.getClass(), "scheme", "XBzdZXeLDL");
        setIntField(term23400, term23400.getClass(), "priority", 729658803);
        setBooleanField(term23400, term23400.getClass(), "isActive", true);
        setField(term23400, term23400.getClass(), "type", "eTycxkowtY");
        setField(term23400, term23400.getClass(), "groupId", "ozlrFdNXle");
        setFloatField(term23400, term23400.getClass(), "loadFactor", 0.5412182F);
        setBooleanField(term23400, term23400.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term23400, args);
    }

};


