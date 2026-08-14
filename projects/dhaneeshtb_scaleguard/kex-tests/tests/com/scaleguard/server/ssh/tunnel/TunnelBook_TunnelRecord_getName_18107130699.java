package com.scaleguard.server.ssh.tunnel;

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
import static com.scaleguard.server.ssh.tunnel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TunnelBook_TunnelRecord_getName_18107130699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1333;

    public TunnelBook_TunnelRecord_getName_18107130699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1333 = newInstance(Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord"));
        setField(term1333, term1333.getClass(), "name", "nHXjMycHlU");
        setIntField(term1333, term1333.getClass(), "port", 1135664017);
        setField(term1333, term1333.getClass(), "localIp", "ieCtQFdkii");
        setField(term1333, term1333.getClass(), "username", "dEnhdmILtU");
        setField(term1333, term1333.getClass(), "password", "hoicvmsovO");
        setIntField(term1333, term1333.getClass(), "systemPort", 590364439);
        setIntField(term1333, term1333.getClass(), "ttl", 865208305);
        setField(term1333, term1333.getClass(), "fqdn", "eqJfYWRaEL");
        setField(term1333, term1333.getClass(), "edgefqdn", "fhkbdRViHi");
        setField(term1333, term1333.getClass(), "lfqdn", "uWHnvSvaPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.ssh.tunnel.TunnelBook$TunnelRecord");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1333, args);
    }

};


