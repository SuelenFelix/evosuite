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

public class HostGroup_setGroupId_6562658212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23899;

    public HostGroup_setGroupId_6562658212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23899 = newInstance(Class.forName("com.scaleguard.server.http.router.HostGroup"));
        setField(term23899, term23899.getClass(), "id", "RYptfEmCie");
        setField(term23899, term23899.getClass(), "host", "roQkSUEGom");
        setField(term23899, term23899.getClass(), "port", "sKmuUYuuTa");
        setField(term23899, term23899.getClass(), "health", "KxdfNdyjGO");
        setField(term23899, term23899.getClass(), "scheme", "vPinPzceBb");
        setIntField(term23899, term23899.getClass(), "priority", 584893196);
        setBooleanField(term23899, term23899.getClass(), "isActive", true);
        setField(term23899, term23899.getClass(), "type", "jPhUwTVUvX");
        setField(term23899, term23899.getClass(), "groupId", "GIBMEPcBjc");
        setFloatField(term23899, term23899.getClass(), "loadFactor", 0.026718378F);
        setBooleanField(term23899, term23899.getClass(), "isReachable", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.http.router.HostGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "noofsnMNpz";
        callMethod(klass, "setGroupId", argTypes, term23899, args);
    }

};


